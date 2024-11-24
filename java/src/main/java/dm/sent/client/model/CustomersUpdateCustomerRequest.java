/*
 * Sent.dm Core API
 * Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: developers@sent.dm
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package dm.sent.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import dm.sent.client.JSON;

/**
 * Request model for updating customer information
 */
@ApiModel(description = "Request model for updating customer information")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CustomersUpdateCustomerRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SENDING_PHONE_NUMBER = "sendingPhoneNumber";
  @SerializedName(SERIALIZED_NAME_SENDING_PHONE_NUMBER)
  private String sendingPhoneNumber;

  public static final String SERIALIZED_NAME_SMS_MESSAGING_PROFILE_ID = "smsMessagingProfileId";
  @SerializedName(SERIALIZED_NAME_SMS_MESSAGING_PROFILE_ID)
  private String smsMessagingProfileId;

  public static final String SERIALIZED_NAME_SMS_BEARER_TOKEN = "smsBearerToken";
  @SerializedName(SERIALIZED_NAME_SMS_BEARER_TOKEN)
  private String smsBearerToken;

  public CustomersUpdateCustomerRequest() {
  }

  public CustomersUpdateCustomerRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Updated name of the customer organization
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Updated name of the customer organization")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CustomersUpdateCustomerRequest sendingPhoneNumber(String sendingPhoneNumber) {
    
    
    
    
    this.sendingPhoneNumber = sendingPhoneNumber;
    return this;
  }

   /**
   * Updated primary phone number for sending messages
   * @return sendingPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Updated primary phone number for sending messages")

  public String getSendingPhoneNumber() {
    return sendingPhoneNumber;
  }


  public void setSendingPhoneNumber(String sendingPhoneNumber) {
    
    
    
    this.sendingPhoneNumber = sendingPhoneNumber;
  }


  public CustomersUpdateCustomerRequest smsMessagingProfileId(String smsMessagingProfileId) {
    
    
    
    
    this.smsMessagingProfileId = smsMessagingProfileId;
    return this;
  }

   /**
   * Updated SMS messaging profile identifier
   * @return smsMessagingProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Updated SMS messaging profile identifier")

  public String getSmsMessagingProfileId() {
    return smsMessagingProfileId;
  }


  public void setSmsMessagingProfileId(String smsMessagingProfileId) {
    
    
    
    this.smsMessagingProfileId = smsMessagingProfileId;
  }


  public CustomersUpdateCustomerRequest smsBearerToken(String smsBearerToken) {
    
    
    
    
    this.smsBearerToken = smsBearerToken;
    return this;
  }

   /**
   * Updated bearer token for SMS authentication
   * @return smsBearerToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Updated bearer token for SMS authentication")

  public String getSmsBearerToken() {
    return smsBearerToken;
  }


  public void setSmsBearerToken(String smsBearerToken) {
    
    
    
    this.smsBearerToken = smsBearerToken;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CustomersUpdateCustomerRequest instance itself
   */
  public CustomersUpdateCustomerRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomersUpdateCustomerRequest customersUpdateCustomerRequest = (CustomersUpdateCustomerRequest) o;
    return Objects.equals(this.name, customersUpdateCustomerRequest.name) &&
        Objects.equals(this.sendingPhoneNumber, customersUpdateCustomerRequest.sendingPhoneNumber) &&
        Objects.equals(this.smsMessagingProfileId, customersUpdateCustomerRequest.smsMessagingProfileId) &&
        Objects.equals(this.smsBearerToken, customersUpdateCustomerRequest.smsBearerToken)&&
        Objects.equals(this.additionalProperties, customersUpdateCustomerRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sendingPhoneNumber, smsMessagingProfileId, smsBearerToken, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersUpdateCustomerRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sendingPhoneNumber: ").append(toIndentedString(sendingPhoneNumber)).append("\n");
    sb.append("    smsMessagingProfileId: ").append(toIndentedString(smsMessagingProfileId)).append("\n");
    sb.append("    smsBearerToken: ").append(toIndentedString(smsBearerToken)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("sendingPhoneNumber");
    openapiFields.add("smsMessagingProfileId");
    openapiFields.add("smsBearerToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomersUpdateCustomerRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomersUpdateCustomerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomersUpdateCustomerRequest is not found in the empty JSON string", CustomersUpdateCustomerRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("sendingPhoneNumber") != null && !jsonObj.get("sendingPhoneNumber").isJsonNull()) && !jsonObj.get("sendingPhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sendingPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sendingPhoneNumber").toString()));
      }
      if ((jsonObj.get("smsMessagingProfileId") != null && !jsonObj.get("smsMessagingProfileId").isJsonNull()) && !jsonObj.get("smsMessagingProfileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smsMessagingProfileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smsMessagingProfileId").toString()));
      }
      if ((jsonObj.get("smsBearerToken") != null && !jsonObj.get("smsBearerToken").isJsonNull()) && !jsonObj.get("smsBearerToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smsBearerToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smsBearerToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomersUpdateCustomerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomersUpdateCustomerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomersUpdateCustomerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomersUpdateCustomerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomersUpdateCustomerRequest>() {
           @Override
           public void write(JsonWriter out, CustomersUpdateCustomerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else if (entry.getValue() == null) {
                   obj.addProperty(entry.getKey(), (String) null);
                 } else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomersUpdateCustomerRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomersUpdateCustomerRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomersUpdateCustomerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomersUpdateCustomerRequest
  * @throws IOException if the JSON string is invalid with respect to CustomersUpdateCustomerRequest
  */
  public static CustomersUpdateCustomerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomersUpdateCustomerRequest.class);
  }

 /**
  * Convert an instance of CustomersUpdateCustomerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
