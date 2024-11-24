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
import java.time.OffsetDateTime;
import java.util.UUID;

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
 * Represents a contact in the Sent messaging platform with their communication preferences and channel availability
 */
@ApiModel(description = "Represents a contact in the Sent messaging platform with their communication preferences and channel availability")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Contact {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_NATIONAL_FORMAT = "nationalFormat";
  @SerializedName(SERIALIZED_NAME_NATIONAL_FORMAT)
  private String nationalFormat;

  public static final String SERIALIZED_NAME_AVAILABLE_CHANNELS = "availableChannels";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_CHANNELS)
  private String availableChannels;

  public static final String SERIALIZED_NAME_DEFAULT_CHANNEL = "defaultChannel";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CHANNEL)
  private String defaultChannel;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Contact() {
  }

  public Contact id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the contact
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the contact")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public Contact phoneNumber(String phoneNumber) {
    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Contact&#39;s phone number in E.164 format
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact's phone number in E.164 format")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    
    
    
    this.phoneNumber = phoneNumber;
  }


  public Contact countryCode(String countryCode) {
    
    
    
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Two-letter ISO country code
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Two-letter ISO country code")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    
    
    
    this.countryCode = countryCode;
  }


  public Contact nationalFormat(String nationalFormat) {
    
    
    
    
    this.nationalFormat = nationalFormat;
    return this;
  }

   /**
   * Phone number formatted according to national standards
   * @return nationalFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number formatted according to national standards")

  public String getNationalFormat() {
    return nationalFormat;
  }


  public void setNationalFormat(String nationalFormat) {
    
    
    
    this.nationalFormat = nationalFormat;
  }


  public Contact availableChannels(String availableChannels) {
    
    
    
    
    this.availableChannels = availableChannels;
    return this;
  }

   /**
   * Comma-separated list of available messaging channels (SMS, WHATSAPP)
   * @return availableChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comma-separated list of available messaging channels (SMS, WHATSAPP)")

  public String getAvailableChannels() {
    return availableChannels;
  }


  public void setAvailableChannels(String availableChannels) {
    
    
    
    this.availableChannels = availableChannels;
  }


  public Contact defaultChannel(String defaultChannel) {
    
    
    
    
    this.defaultChannel = defaultChannel;
    return this;
  }

   /**
   * Preferred messaging channel for this contact
   * @return defaultChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Preferred messaging channel for this contact")

  public String getDefaultChannel() {
    return defaultChannel;
  }


  public void setDefaultChannel(String defaultChannel) {
    
    
    
    this.defaultChannel = defaultChannel;
  }


  public Contact verified(Boolean verified) {
    
    
    
    
    this.verified = verified;
    return this;
  }

   /**
   * Indicates if the contact&#39;s phone number has been verified
   * @return verified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the contact's phone number has been verified")

  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    
    
    
    this.verified = verified;
  }


  public Contact createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when the contact was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the contact was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public Contact updatedAt(OffsetDateTime updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp when the contact was last updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the contact was last updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
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
   * @return the Contact instance itself
   */
  public Contact putAdditionalProperty(String key, Object value) {
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
    Contact contact = (Contact) o;
    return Objects.equals(this.id, contact.id) &&
        Objects.equals(this.phoneNumber, contact.phoneNumber) &&
        Objects.equals(this.countryCode, contact.countryCode) &&
        Objects.equals(this.nationalFormat, contact.nationalFormat) &&
        Objects.equals(this.availableChannels, contact.availableChannels) &&
        Objects.equals(this.defaultChannel, contact.defaultChannel) &&
        Objects.equals(this.verified, contact.verified) &&
        Objects.equals(this.createdAt, contact.createdAt) &&
        Objects.equals(this.updatedAt, contact.updatedAt)&&
        Objects.equals(this.additionalProperties, contact.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, phoneNumber, countryCode, nationalFormat, availableChannels, defaultChannel, verified, createdAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    nationalFormat: ").append(toIndentedString(nationalFormat)).append("\n");
    sb.append("    availableChannels: ").append(toIndentedString(availableChannels)).append("\n");
    sb.append("    defaultChannel: ").append(toIndentedString(defaultChannel)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("phoneNumber");
    openapiFields.add("countryCode");
    openapiFields.add("nationalFormat");
    openapiFields.add("availableChannels");
    openapiFields.add("defaultChannel");
    openapiFields.add("verified");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Contact
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Contact.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Contact is not found in the empty JSON string", Contact.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("nationalFormat") != null && !jsonObj.get("nationalFormat").isJsonNull()) && !jsonObj.get("nationalFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationalFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationalFormat").toString()));
      }
      if ((jsonObj.get("availableChannels") != null && !jsonObj.get("availableChannels").isJsonNull()) && !jsonObj.get("availableChannels").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `availableChannels` to be a primitive type in the JSON string but got `%s`", jsonObj.get("availableChannels").toString()));
      }
      if ((jsonObj.get("defaultChannel") != null && !jsonObj.get("defaultChannel").isJsonNull()) && !jsonObj.get("defaultChannel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultChannel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultChannel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Contact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Contact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Contact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Contact.class));

       return (TypeAdapter<T>) new TypeAdapter<Contact>() {
           @Override
           public void write(JsonWriter out, Contact value) throws IOException {
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
           public Contact read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Contact instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Contact given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Contact
  * @throws IOException if the JSON string is invalid with respect to Contact
  */
  public static Contact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Contact.class);
  }

 /**
  * Convert an instance of Contact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

