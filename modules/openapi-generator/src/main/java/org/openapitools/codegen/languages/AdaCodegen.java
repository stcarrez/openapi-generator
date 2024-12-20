/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.languages;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;
import org.apache.commons.lang3.StringUtils;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.CodegenType;
import org.openapitools.codegen.SupportingFile;
import org.openapitools.codegen.meta.features.*;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.EnumSet;
import java.util.Locale;

public class AdaCodegen extends AbstractAdaCodegen implements CodegenConfig {

    public AdaCodegen() {
        super();

        modifyFeatureSet(features -> features
                .excludeDocumentationFeatures(DocumentationFeature.Readme)
                .wireFormatFeatures(EnumSet.of(WireFormatFeature.JSON, WireFormatFeature.XML))
                .securityFeatures(EnumSet.of(
                        SecurityFeature.OAuth2_Password,
                        SecurityFeature.OAuth2_AuthorizationCode,
                        SecurityFeature.OAuth2_ClientCredentials,
                        SecurityFeature.OAuth2_Implicit,
                        SecurityFeature.BearerToken
                ))
                .excludeGlobalFeatures(
                        GlobalFeature.XMLStructureDefinitions,
                        GlobalFeature.Callbacks,
                        GlobalFeature.LinkObjects,
                        GlobalFeature.ParameterStyling
                )
                .excludeSchemaSupportFeatures(
                        SchemaSupportFeature.Polymorphism
                )
                .excludeParameterFeatures(
                        ParameterFeature.Header,
                        ParameterFeature.Cookie
                )
                .includeClientModificationFeatures(ClientModificationFeature.BasePath)
        );
    }

    @Override
    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    @Override
    public String getName() {
        return "ada";
    }

    @Override
    public String getHelp() {
        return "Generates an Ada client implementation (beta).";
    }

    @Override
    public void processOpts() {
        super.processOpts();

        if (additionalProperties.containsKey(CodegenConstants.PACKAGE_NAME)) {
            packageName = (String) additionalProperties.get(CodegenConstants.PACKAGE_NAME);
        }
        if (StringUtils.isEmpty(packageName)) {
            packageName = modelPackage;
        }
        String srcDir = "src" + File.separator;
        String clientDir = srcDir + "client";
        String modelDir = srcDir + "model";
        String modelPrefix = toFilename(modelPackage);
        supportingFiles.add(new SupportingFile("model-spec.mustache", modelDir, modelPrefix + "-models.ads"));
        supportingFiles.add(new SupportingFile("model-body.mustache", modelDir, modelPrefix + "-models.adb"));
        supportingFiles.add(new SupportingFile("client-spec.mustache", clientDir, modelPrefix + "-clients.ads"));
        supportingFiles.add(new SupportingFile("client-body.mustache", clientDir, modelPrefix + "-clients.adb"));

        if (additionalProperties.containsKey(CodegenConstants.PROJECT_NAME)) {
            projectName = (String) additionalProperties.get(CodegenConstants.PROJECT_NAME);
        } else {
            // default: set project based on package name
            // e.g. petstore.api (package name) => petstore_api (project name)
            projectName = packageName.replaceAll("\\.", "_");
        }
        String configBaseName = modelPackage.toLowerCase(Locale.ROOT);
        String gprProjectName = toFilename(projectName);
        supportingFiles.add(new SupportingFile("gnat-project.mustache", "", gprProjectName + ".gpr"));
        // supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
        supportingFiles.add(new SupportingFile("config.mustache", "", gprProjectName + "_config.gpr"));

        /*
         * Additional Properties.  These values can be passed to the templates and
         * are available in models, apis, and supporting files
         */
        additionalProperties.put("package", this.modelPackage);
        additionalProperties.put("packageConfig", configBaseName);
        additionalProperties.put("packageDir", "client");
        additionalProperties.put("mainName", "client");
        additionalProperties.put("isServer", false);
        additionalProperties.put("httpClientPackageName", httpClientPackageName);
        additionalProperties.put("openApiPackageName", openApiPackageName);
        additionalProperties.put("openApiGprName", openApiPackageName.toLowerCase(Locale.ROOT));
        additionalProperties.put("httpClientGprName", httpClientPackageName.toLowerCase(Locale.ROOT));
        additionalProperties.put(CodegenConstants.PROJECT_NAME, projectName);

        String[] names = this.modelPackage.split("\\.");
        String pkgName = names[0];
        additionalProperties.put("packageLevel1", pkgName);
        supportingFiles.add(new SupportingFile("package-spec-level1.mustache", "src",
                toFilename(names[0]) + ".ads"));
        if (names.length > 1) {
            String fileName = toFilename(names[0]) + "-" + toFilename(names[1]) + ".ads";
            pkgName = names[0] + "." + names[1];
            additionalProperties.put("packageLevel2", pkgName);
            supportingFiles.add(new SupportingFile("package-spec-level2.mustache", "src", fileName));
        }
        pkgName = this.modelPackage;
        supportingFiles.add(new SupportingFile("client.mustache", "src",
                toFilename(pkgName) + "-client.adb"));
        additionalProperties.put("packageName", toFilename(pkgName));

        // add lambda for mustache templates
        additionalProperties.put("lambdaAdaComment", new Mustache.Lambda() {
            @Override
            public void execute(Template.Fragment fragment, Writer writer) throws IOException {
                String content = fragment.execute();
                content = content.trim().replaceAll("\n$", "");
                writer.write(content.replaceAll("\n", "\n   --  "));
            }
        });
    }

    @Override
    public String apiFileFolder() {
        return outputFolder + File.separator + apiPackage().replace('.', File.separatorChar);
    }

    @Override
    public String modelFileFolder() {
        return outputFolder + File.separator + "model" + File.separator + modelPackage().replace('.', File.separatorChar);
    }
}
