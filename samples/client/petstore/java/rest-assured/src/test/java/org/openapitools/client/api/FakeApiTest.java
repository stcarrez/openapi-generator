/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.User;
import org.openapitools.client.model.XmlItem;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.FakeApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.GsonObjectMapper.gson;

/**
 * API tests for FakeApi
 */
@Ignore
public class FakeApiTest {

    private FakeApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://petstore.swagger.io:80/v2"))).fake();
    }

    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterCreateXmlItem() {
        XmlItem xmlItem = null;
        api.createXmlItem()
                .body(xmlItem).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Output boolean
     */
    @Test
    public void shouldSee200AfterFakeOuterBooleanSerialize() {
        Boolean body = null;
        api.fakeOuterBooleanSerialize().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Output composite
     */
    @Test
    public void shouldSee200AfterFakeOuterCompositeSerialize() {
        OuterComposite body = null;
        api.fakeOuterCompositeSerialize().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Output number
     */
    @Test
    public void shouldSee200AfterFakeOuterNumberSerialize() {
        BigDecimal body = null;
        api.fakeOuterNumberSerialize().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Output string
     */
    @Test
    public void shouldSee200AfterFakeOuterStringSerialize() {
        String body = null;
        api.fakeOuterStringSerialize().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Success
     */
    @Test
    public void shouldSee200AfterTestBodyWithFileSchema() {
        FileSchemaTestClass body = null;
        api.testBodyWithFileSchema()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Success
     */
    @Test
    public void shouldSee200AfterTestBodyWithQueryParams() {
        String query = null;
        User body = null;
        api.testBodyWithQueryParams()
                .queryQuery(query)
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterTestClientModel() {
        Client body = null;
        api.testClientModel()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid username supplied
     */
    @Test
    public void shouldSee400AfterTestEndpointParameters() {
        BigDecimal number = null;
        Double _double = null;
        String patternWithoutDelimiter = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        String string = null;
        File binary = null;
        LocalDate date = null;
        OffsetDateTime dateTime = null;
        String password = null;
        String paramCallback = null;
        api.testEndpointParameters()
                .numberForm(number)
                ._doubleForm(_double)
                .patternWithoutDelimiterForm(patternWithoutDelimiter)
                ._byteForm(_byte).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * User not found
     */
    @Test
    public void shouldSee404AfterTestEndpointParameters() {
        BigDecimal number = null;
        Double _double = null;
        String patternWithoutDelimiter = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        String string = null;
        File binary = null;
        LocalDate date = null;
        OffsetDateTime dateTime = null;
        String password = null;
        String paramCallback = null;
        api.testEndpointParameters()
                .numberForm(number)
                ._doubleForm(_double)
                .patternWithoutDelimiterForm(patternWithoutDelimiter)
                ._byteForm(_byte).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid request
     */
    @Test
    public void shouldSee400AfterTestEnumParameters() {
        String enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        Double enumQueryDouble = null;
        List<String> enumFormStringArray = null;
        String enumFormString = null;
        api.testEnumParameters().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Not found
     */
    @Test
    public void shouldSee404AfterTestEnumParameters() {
        String enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        Double enumQueryDouble = null;
        List<String> enumFormStringArray = null;
        String enumFormString = null;
        api.testEnumParameters().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Something wrong
     */
    @Test
    public void shouldSee400AfterTestGroupParameters() {
        Integer requiredStringGroup = null;
        String requiredBooleanGroup = null;
        Long requiredInt64Group = null;
        Integer stringGroup = null;
        String booleanGroup = null;
        Long int64Group = null;
        api.testGroupParameters()
                .requiredStringGroupQuery(requiredStringGroup)
                .requiredBooleanGroupHeader(requiredBooleanGroup)
                .requiredInt64GroupQuery(requiredInt64Group).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterTestInlineAdditionalProperties() {
        Map<String, String> param = null;
        api.testInlineAdditionalProperties()
                .body(param).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterTestJsonFormData() {
        String param = null;
        String param2 = null;
        api.testJsonFormData()
                .paramForm(param)
                .param2Form(param2).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Success
     */
    @Test
    public void shouldSee200AfterTestQueryParameterCollectionFormat() {
        List<String> pipe = null;
        List<String> ioutil = null;
        List<String> http = null;
        List<String> url = null;
        List<String> context = null;
        api.testQueryParameterCollectionFormat()
                .pipeQuery(pipe)
                .ioutilQuery(ioutil)
                .httpQuery(http)
                .urlQuery(url)
                .contextQuery(context).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}