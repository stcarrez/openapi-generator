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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.SingleRefType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AllOfWithSingleRef
 */
@JsonPropertyOrder({
  AllOfWithSingleRef.JSON_PROPERTY_USERNAME,
  AllOfWithSingleRef.JSON_PROPERTY_SINGLE_REF_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class AllOfWithSingleRef {
  public static final String JSON_PROPERTY_USERNAME = "username";
  @javax.annotation.Nullable
  private String username;

  public static final String JSON_PROPERTY_SINGLE_REF_TYPE = "SingleRefType";
  @javax.annotation.Nullable
  private SingleRefType singleRefType;

  public AllOfWithSingleRef() {
  }

  public AllOfWithSingleRef username(@javax.annotation.Nullable String username) {
    
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }

  public AllOfWithSingleRef singleRefType(@javax.annotation.Nullable SingleRefType singleRefType) {
    
    this.singleRefType = singleRefType;
    return this;
  }

  /**
   * Get singleRefType
   * @return singleRefType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SINGLE_REF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SingleRefType getSingleRefType() {
    return singleRefType;
  }


  @JsonProperty(JSON_PROPERTY_SINGLE_REF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSingleRefType(@javax.annotation.Nullable SingleRefType singleRefType) {
    this.singleRefType = singleRefType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfWithSingleRef allOfWithSingleRef = (AllOfWithSingleRef) o;
    return Objects.equals(this.username, allOfWithSingleRef.username) &&
        Objects.equals(this.singleRefType, allOfWithSingleRef.singleRefType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, singleRefType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfWithSingleRef {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    singleRefType: ").append(toIndentedString(singleRefType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `username` to the URL query string
    if (getUsername() != null) {
      try {
        joiner.add(String.format("%susername%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsername()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `SingleRefType` to the URL query string
    if (getSingleRefType() != null) {
      try {
        joiner.add(String.format("%sSingleRefType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSingleRefType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

