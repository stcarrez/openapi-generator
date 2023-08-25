/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.FileSchemaTestClass;
import java.time.LocalDate;
import java.util.Map;
import org.openapitools.model.ModelApiResponse;
import java.time.OffsetDateTime;
import org.openapitools.model.OuterComposite;
import org.openapitools.model.ResponseObjectWithDifferentFieldNames;
import org.openapitools.model.User;
import org.openapitools.model.XmlItem;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "fake", description = "the fake API")
public interface FakeApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /fake/create_xml_item : creates an XmlItem
     * this route creates an XmlItem
     *
     * @param xmlItem XmlItem Body (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "creates an XmlItem",
        nickname = "createXmlItem",
        notes = "this route creates an XmlItem"
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/create_xml_item",
        consumes = { "application/xml", "application/xml; charset=utf-8", "application/xml; charset=utf-16", "text/xml", "text/xml; charset=utf-8", "text/xml; charset=utf-16" }
    )
    default ResponseEntity<Void> createXmlItem(
        @ApiParam(value = "XmlItem Body", required = true) @Valid @RequestBody XmlItem xmlItem
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/outer/boolean
     * Test serialization of outer boolean types
     *
     * @param body Input boolean as post body (optional)
     * @return Output boolean (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "",
        nickname = "fakeOuterBooleanSerialize",
        notes = "Test serialization of outer boolean types",
        response = Boolean.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "Output boolean", response = Boolean.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/outer/boolean",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Boolean> fakeOuterBooleanSerialize(
        @ApiParam(value = "Input boolean as post body") @Valid @RequestBody(required = false) Boolean body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/outer/composite
     * Test serialization of object with outer number type
     *
     * @param outerComposite Input composite as post body (optional)
     * @return Output composite (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "",
        nickname = "fakeOuterCompositeSerialize",
        notes = "Test serialization of object with outer number type",
        response = OuterComposite.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "Output composite", response = OuterComposite.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/outer/composite",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<OuterComposite> fakeOuterCompositeSerialize(
        @ApiParam(value = "Input composite as post body") @Valid @RequestBody(required = false) OuterComposite outerComposite
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"my_string\" : \"my_string\", \"my_number\" : 0.8008281904610115, \"my_boolean\" : true }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/outer/number
     * Test serialization of outer number types
     *
     * @param body Input number as post body (optional)
     * @return Output number (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "",
        nickname = "fakeOuterNumberSerialize",
        notes = "Test serialization of outer number types",
        response = BigDecimal.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "Output number", response = BigDecimal.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/outer/number",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<BigDecimal> fakeOuterNumberSerialize(
        @ApiParam(value = "Input number as post body") @Valid @RequestBody(required = false) BigDecimal body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/outer/string
     * Test serialization of outer string types
     *
     * @param body Input string as post body (optional)
     * @return Output string (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "",
        nickname = "fakeOuterStringSerialize",
        notes = "Test serialization of outer string types",
        response = String.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "Output string", response = String.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/outer/string",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> fakeOuterStringSerialize(
        @ApiParam(value = "Input string as post body") @Valid @RequestBody(required = false) String body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /fake/{petId}/response-object-different-names
     *
     * @param petId ID of pet to update (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "",
        nickname = "responseObjectDifferentNames",
        notes = "",
        response = ResponseObjectWithDifferentFieldNames.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = ResponseObjectWithDifferentFieldNames.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/fake/{petId}/response-object-different-names",
        produces = { "application/json" }
    )
    default ResponseEntity<ResponseObjectWithDifferentFieldNames> responseObjectDifferentNames(
        @ApiParam(value = "ID of pet to update", required = true) @PathVariable("petId") Long petId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"UPPER_CASE_PROPERTY_SNAKE\" : \"UPPER_CASE_PROPERTY_SNAKE\", \"lower-case-property-dashes\" : \"lower-case-property-dashes\", \"property name with spaces\" : \"property name with spaces\", \"normalPropertyName\" : \"normalPropertyName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /fake/body-with-file-schema
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     *
     * @param fileSchemaTestClass  (required)
     * @return Success (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "",
        nickname = "testBodyWithFileSchema",
        notes = "For this test, the body for this request much reference a schema named `File`."
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "Success")
    })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/fake/body-with-file-schema",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> testBodyWithFileSchema(
        @ApiParam(value = "", required = true) @Valid @RequestBody FileSchemaTestClass fileSchemaTestClass
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /fake/body-with-query-params
     *
     * @param query  (required)
     * @param user  (required)
     * @return Success (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "",
        nickname = "testBodyWithQueryParams",
        notes = ""
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "Success")
    })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/fake/body-with-query-params",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> testBodyWithQueryParams(
        @NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "query", required = true) String query,
        @ApiParam(value = "", required = true) @Valid @RequestBody User user
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /fake : To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     *
     * @param client client model (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "To test \"client\" model",
        nickname = "testClientModel",
        notes = "To test \"client\" model",
        response = Client.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = Client.class)
    })
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/fake",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Client> testClientModel(
        @ApiParam(value = "client model", required = true) @Valid @RequestBody Client client
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"client\" : \"client\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake : Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     *
     * @param number None (required)
     * @param _double None (required)
     * @param patternWithoutDelimiter None (required)
     * @param _byte None (required)
     * @param integer None (optional)
     * @param int32 None (optional)
     * @param int64 None (optional)
     * @param _float None (optional)
     * @param string None (optional)
     * @param binary None (optional)
     * @param date None (optional)
     * @param dateTime None (optional)
     * @param password None (optional)
     * @param paramCallback None (optional)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트",
        nickname = "testEndpointParameters",
        notes = "Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트",
        authorizations = {
            @Authorization(value = "http_basic_test")
         }
    )
    @ApiResponses({
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake",
        consumes = { "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Void> testEndpointParameters(
        @ApiParam(value = "None", required = true) @Valid @RequestParam(value = "number", required = true) BigDecimal number,
        @ApiParam(value = "None", required = true) @Valid @RequestParam(value = "double", required = true) Double _double,
        @ApiParam(value = "None", required = true) @Valid @RequestParam(value = "pattern_without_delimiter", required = true) String patternWithoutDelimiter,
        @ApiParam(value = "None", required = true) @Valid @RequestParam(value = "byte", required = true) byte[] _byte,
        @ApiParam(value = "None") @Valid @RequestParam(value = "integer", required = false) Integer integer,
        @ApiParam(value = "None") @Valid @RequestParam(value = "int32", required = false) Integer int32,
        @ApiParam(value = "None") @Valid @RequestParam(value = "int64", required = false) Long int64,
        @ApiParam(value = "None") @Valid @RequestParam(value = "float", required = false) Float _float,
        @ApiParam(value = "None") @Valid @RequestParam(value = "string", required = false) String string,
        @ApiParam(value = "None") @RequestPart(value = "binary", required = false) MultipartFile binary,
        @ApiParam(value = "None") @Valid @RequestParam(value = "date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
        @ApiParam(value = "None") @Valid @RequestParam(value = "dateTime", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime dateTime,
        @ApiParam(value = "None") @Valid @RequestParam(value = "password", required = false) String password,
        @ApiParam(value = "None") @Valid @RequestParam(value = "callback", required = false) String paramCallback
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /fake : To test enum parameters
     * To test enum parameters
     *
     * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
     * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
     * @param enumQueryStringArray Query parameter enum test (string array) (optional)
     * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
     * @param enumQueryInteger Query parameter enum test (double) (optional)
     * @param enumQueryDouble Query parameter enum test (double) (optional)
     * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
     * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
     * @return Invalid request (status code 400)
     *         or Not found (status code 404)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "To test enum parameters",
        nickname = "testEnumParameters",
        notes = "To test enum parameters"
    )
    @ApiResponses({
        @ApiResponse(code = 400, message = "Invalid request"),
        @ApiResponse(code = 404, message = "Not found")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/fake",
        consumes = { "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Void> testEnumParameters(
        @ApiParam(value = "Header parameter enum test (string array)", allowableValues = ">, $") @RequestHeader(value = "enum_header_string_array", required = false) List<String> enumHeaderStringArray,
        @ApiParam(value = "Header parameter enum test (string)", allowableValues = "_abc, -efg, (xyz)", defaultValue = "-efg") @RequestHeader(value = "enum_header_string", required = false, defaultValue = "-efg") String enumHeaderString,
        @ApiParam(value = "Query parameter enum test (string array)", allowableValues = ">, $") @Valid @RequestParam(value = "enum_query_string_array", required = false) List<String> enumQueryStringArray,
        @ApiParam(value = "Query parameter enum test (string)", allowableValues = "_abc, -efg, (xyz)", defaultValue = "-efg") @Valid @RequestParam(value = "enum_query_string", required = false, defaultValue = "-efg") String enumQueryString,
        @ApiParam(value = "Query parameter enum test (double)", allowableValues = "1, -2") @Valid @RequestParam(value = "enum_query_integer", required = false) Integer enumQueryInteger,
        @ApiParam(value = "Query parameter enum test (double)", allowableValues = "1.1, -1.2") @Valid @RequestParam(value = "enum_query_double", required = false) Double enumQueryDouble,
        @ApiParam(value = "Form parameter enum test (string array)", allowableValues = ">, $", defaultValue = "$") @Valid @RequestPart(value = "enum_form_string_array", required = false) List<String> enumFormStringArray,
        @ApiParam(value = "Form parameter enum test (string)", allowableValues = "_abc, -efg, (xyz)", defaultValue = "-efg") @Valid @RequestParam(value = "enum_form_string", required = false) String enumFormString
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /fake : Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     *
     * @param requiredStringGroup Required String in group parameters (required)
     * @param requiredBooleanGroup Required Boolean in group parameters (required)
     * @param requiredInt64Group Required Integer in group parameters (required)
     * @param stringGroup String in group parameters (optional)
     * @param booleanGroup Boolean in group parameters (optional)
     * @param int64Group Integer in group parameters (optional)
     * @return Something wrong (status code 400)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "Fake endpoint to test group parameters (optional)",
        nickname = "testGroupParameters",
        notes = "Fake endpoint to test group parameters (optional)"
    )
    @ApiResponses({
        @ApiResponse(code = 400, message = "Something wrong")
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/fake"
    )
    default ResponseEntity<Void> testGroupParameters(
        @NotNull @ApiParam(value = "Required String in group parameters", required = true) @Valid @RequestParam(value = "required_string_group", required = true) Integer requiredStringGroup,
        @NotNull @ApiParam(value = "Required Boolean in group parameters", required = true) @RequestHeader(value = "required_boolean_group", required = true) Boolean requiredBooleanGroup,
        @NotNull @ApiParam(value = "Required Integer in group parameters", required = true) @Valid @RequestParam(value = "required_int64_group", required = true) Long requiredInt64Group,
        @ApiParam(value = "String in group parameters") @Valid @RequestParam(value = "string_group", required = false) Integer stringGroup,
        @ApiParam(value = "Boolean in group parameters") @RequestHeader(value = "boolean_group", required = false) Boolean booleanGroup,
        @ApiParam(value = "Integer in group parameters") @Valid @RequestParam(value = "int64_group", required = false) Long int64Group
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/inline-additionalProperties : test inline additionalProperties
     * 
     *
     * @param requestBody request body (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "test inline additionalProperties",
        nickname = "testInlineAdditionalProperties",
        notes = ""
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/inline-additionalProperties",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> testInlineAdditionalProperties(
        @ApiParam(value = "request body", required = true) @Valid @RequestBody Map<String, String> requestBody
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /fake/jsonFormData : test json serialization of form data
     * 
     *
     * @param param field1 (required)
     * @param param2 field2 (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "test json serialization of form data",
        nickname = "testJsonFormData",
        notes = ""
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/fake/jsonFormData",
        consumes = { "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Void> testJsonFormData(
        @ApiParam(value = "field1", required = true) @Valid @RequestParam(value = "param", required = true) String param,
        @ApiParam(value = "field2", required = true) @Valid @RequestParam(value = "param2", required = true) String param2
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /fake/test-query-parameters
     * To test the collection format in query parameters
     *
     * @param pipe  (required)
     * @param http  (required)
     * @param url  (required)
     * @param context  (required)
     * @return Success (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "",
        nickname = "testQueryParameterCollectionFormat",
        notes = "To test the collection format in query parameters"
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "Success")
    })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/fake/test-query-parameters"
    )
    default ResponseEntity<Void> testQueryParameterCollectionFormat(
        @NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "pipe", required = true) List<String> pipe,
        @NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "http", required = true) List<String> http,
        @NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "url", required = true) List<String> url,
        @NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "context", required = true) List<String> context
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /fake/response-with-example
     * This endpoint defines an example value for its response schema.
     *
     * @return Success (status code 200)
     */
    @ApiOperation(
        tags = { "fake" },
        value = "",
        nickname = "testWithResultExample",
        notes = "This endpoint defines an example value for its response schema.",
        response = Integer.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "Success", response = Integer.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/fake/response-with-example",
        produces = { "application/json" }
    )
    default ResponseEntity<Integer> testWithResultExample(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "42";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fake/{petId}/uploadImageWithRequiredFile : uploads an image (required)
     * 
     *
     * @param petId ID of pet to update (required)
     * @param requiredFile file to upload (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @return successful operation (status code 200)
     */
    @ApiOperation(
        tags = { "pet" },
        value = "uploads an image (required)",
        nickname = "uploadFileWithRequiredFile",
        notes = "",
        response = ModelApiResponse.class,
        authorizations = {
            @Authorization(value = "petstore_auth", scopes = {
                @AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
                @AuthorizationScope(scope = "read:pets", description = "read your pets")
            })
         }
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/{petId}/uploadImageWithRequiredFile",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<ModelApiResponse> uploadFileWithRequiredFile(
        @ApiParam(value = "ID of pet to update", required = true) @PathVariable("petId") Long petId,
        @ApiParam(value = "file to upload", required = true) @RequestPart(value = "requiredFile", required = true) MultipartFile requiredFile,
        @ApiParam(value = "Additional data to pass to server") @Valid @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"type\" : \"type\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
