/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import java.time.OffsetDateTime
import org.openapitools.client.model.User
import org.openapitools.client.core.JsonSupport._
import sttp.client4._
import sttp.model.Method

object UserApi {
  def apply(baseUrl: String = "http://petstore.swagger.io/v2") = new UserApi(baseUrl)
}

class UserApi(baseUrl: String) {

  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   * 
   * @param user Created user object
   */
  def createUser(apiKey: String)(user: User): Request[Either[ResponseException[String, Exception], Unit]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/user")
      .contentType("application/json")
      .header("api_key", apiKey)
      .body(user)
      .response(asString.mapWithMetadata(ResponseAs.deserializeRightWithError(_ => Right(()))))

  /**
   * 
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   * 
   * @param user List of user object
   */
  def createUsersWithArrayInput(apiKey: String)(user: Seq[User]): Request[Either[ResponseException[String, Exception], Unit]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/user/createWithArray")
      .contentType("application/json")
      .header("api_key", apiKey)
      .body(user)
      .response(asString.mapWithMetadata(ResponseAs.deserializeRightWithError(_ => Right(()))))

  /**
   * 
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   * 
   * @param user List of user object
   */
  def createUsersWithListInput(apiKey: String)(user: Seq[User]): Request[Either[ResponseException[String, Exception], Unit]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/user/createWithList")
      .contentType("application/json")
      .header("api_key", apiKey)
      .body(user)
      .response(asString.mapWithMetadata(ResponseAs.deserializeRightWithError(_ => Right(()))))

  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 400 :  (Invalid username supplied)
   *   code 404 :  (User not found)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   * 
   * @param username The name that needs to be deleted
   */
  def deleteUser(apiKey: String)(username: String): Request[Either[ResponseException[String, Exception], Unit]] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/user/${username}")
      .contentType("application/json")
      .header("api_key", apiKey)
      .response(asString.mapWithMetadata(ResponseAs.deserializeRightWithError(_ => Right(()))))

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : User (successful operation)
   *   code 400 :  (Invalid username supplied)
   *   code 404 :  (User not found)
   * 
   * @param username The name that needs to be fetched. Use user1 for testing.
   */
  def getUserByName(username: String): Request[Either[ResponseException[String, Exception], User]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/user/${username}")
      .contentType("application/json")
      .response(asJson[User])

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : String (successful operation)
   *              Headers :
   *                Set-Cookie - Cookie authentication key for use with the `api_key` apiKey authentication.
   *                X-Rate-Limit - calls per hour allowed by the user
   *                X-Expires-After - date in UTC when token expires
   *   code 400 :  (Invalid username/password supplied)
   * 
   * @param username The user name for login
   * @param password The password for login in clear text
   */
  def loginUser(username: String, password: String): Request[Either[ResponseException[String, Exception], String]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/user/login?username=${ username }&password=${ password }")
      .contentType("application/json")
      .response(asJson[String])

  /**
   * 
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   */
  def logoutUser(apiKey: String)(): Request[Either[ResponseException[String, Exception], Unit]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/user/logout")
      .contentType("application/json")
      .header("api_key", apiKey)
      .response(asString.mapWithMetadata(ResponseAs.deserializeRightWithError(_ => Right(()))))

  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 400 :  (Invalid user supplied)
   *   code 404 :  (User not found)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   * 
   * @param username name that need to be deleted
   * @param user Updated user object
   */
  def updateUser(apiKey: String)(username: String, user: User): Request[Either[ResponseException[String, Exception], Unit]] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/user/${username}")
      .contentType("application/json")
      .header("api_key", apiKey)
      .body(user)
      .response(asString.mapWithMetadata(ResponseAs.deserializeRightWithError(_ => Right(()))))

}
