/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.10.0-SNAPSHOT).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class StoreApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        onException(Exception.class)
            .log(LoggingLevel.ERROR, "${exception.message}: ${exception.stacktrace}")
            .handled(true)
            .process("validationErrorProcessor");
        

        /**
        DELETE /store/order/{orderId} : Delete purchase order by ID
        **/
        rest()
            .delete("/store/order/{orderId}")
                .description("Delete purchase order by ID")
                .id("deleteOrderApi")
                .param()
                    .name("orderId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("ID of the order that needs to be deleted")
                .endParam()
                .to("direct:validate-deleteOrder");
        

        /**
        GET /store/inventory : Returns pet inventories by status
        **/
        rest()
            .securityDefinitions()
                .apiKey("api_key")
                    .withHeader("api_key")
                
            .endSecurityDefinition()
            .get("/store/inventory")
                .description("Returns pet inventories by status")
                .id("getInventoryApi")
                .produces("application/json")
                .to("direct:validate-getInventory");
        

        /**
        GET /store/order/{orderId} : Find purchase order by ID
        **/
        rest()
            .get("/store/order/{orderId}")
                .description("Find purchase order by ID")
                .id("getOrderByIdApi")
                .produces("application/xml, application/json")
                .outType(Order.class)
                .param()
                    .name("orderId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("ID of pet that needs to be fetched")
                .endParam()
                .to("direct:validate-getOrderById");
        

        /**
        POST /store/order : Place an order for a pet
        **/
        rest()
            .post("/store/order")
                .description("Place an order for a pet")
                .id("placeOrderApi")
                .produces("application/xml, application/json")
                .outType(Order.class)
                .consumes("application/json")
                .type(Order.class)
                
                .param()
                    .name("order")
                    .type(RestParamType.body)
                    .required(true)
                    .description("order placed for purchasing the pet")
                .endParam()
                .to("direct:validate-placeOrder");
        
    }
}
