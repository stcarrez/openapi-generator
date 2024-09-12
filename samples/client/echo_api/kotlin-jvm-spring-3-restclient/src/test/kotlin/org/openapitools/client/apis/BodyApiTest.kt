/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.BodyApi
import org.openapitools.client.models.Pet
import org.openapitools.client.models.Tag

class BodyApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BodyApi
        //val apiInstance = BodyApi()

        // to test testBinaryGif
        should("test testBinaryGif") {
            // uncomment below to test testBinaryGif
            //val result : java.io.File = apiInstance.testBinaryGif()
            //result shouldBe ("TODO")
        }

        // to test testBodyApplicationOctetstreamBinary
        should("test testBodyApplicationOctetstreamBinary") {
            // uncomment below to test testBodyApplicationOctetstreamBinary
            //val body : java.io.File = BINARY_DATA_HERE // java.io.File | 
            //val result : kotlin.String = apiInstance.testBodyApplicationOctetstreamBinary(body)
            //result shouldBe ("TODO")
        }

        // to test testBodyMultipartFormdataArrayOfBinary
        should("test testBodyMultipartFormdataArrayOfBinary") {
            // uncomment below to test testBodyMultipartFormdataArrayOfBinary
            //val files : kotlin.collections.List<java.io.File> = /path/to/file.txt // kotlin.collections.List<java.io.File> | 
            //val result : kotlin.String = apiInstance.testBodyMultipartFormdataArrayOfBinary(files)
            //result shouldBe ("TODO")
        }

        // to test testBodyMultipartFormdataSingleBinary
        should("test testBodyMultipartFormdataSingleBinary") {
            // uncomment below to test testBodyMultipartFormdataSingleBinary
            //val myFile : java.io.File = BINARY_DATA_HERE // java.io.File | 
            //val result : kotlin.String = apiInstance.testBodyMultipartFormdataSingleBinary(myFile)
            //result shouldBe ("TODO")
        }

        // to test testEchoBodyFreeFormObjectResponseString
        should("test testEchoBodyFreeFormObjectResponseString") {
            // uncomment below to test testEchoBodyFreeFormObjectResponseString
            //val body : kotlin.Any = Object // kotlin.Any | Free form object
            //val result : kotlin.String = apiInstance.testEchoBodyFreeFormObjectResponseString(body)
            //result shouldBe ("TODO")
        }

        // to test testEchoBodyPet
        should("test testEchoBodyPet") {
            // uncomment below to test testEchoBodyPet
            //val pet : Pet =  // Pet | Pet object that needs to be added to the store
            //val result : Pet = apiInstance.testEchoBodyPet(pet)
            //result shouldBe ("TODO")
        }

        // to test testEchoBodyPetResponseString
        should("test testEchoBodyPetResponseString") {
            // uncomment below to test testEchoBodyPetResponseString
            //val pet : Pet =  // Pet | Pet object that needs to be added to the store
            //val result : kotlin.String = apiInstance.testEchoBodyPetResponseString(pet)
            //result shouldBe ("TODO")
        }

        // to test testEchoBodyTagResponseString
        should("test testEchoBodyTagResponseString") {
            // uncomment below to test testEchoBodyTagResponseString
            //val tag : Tag =  // Tag | Tag object
            //val result : kotlin.String = apiInstance.testEchoBodyTagResponseString(tag)
            //result shouldBe ("TODO")
        }

    }
}
