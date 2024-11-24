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
 * WhatsApp contact information including profile and verification details
 */
@ApiModel(description = "WhatsApp contact information including profile and verification details")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WhatsAppPayload {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_SENT_ID = "sentId";
  @SerializedName(SERIALIZED_NAME_SENT_ID)
  private UUID sentId;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_WHATSAPP_ID = "whatsappId";
  @SerializedName(SERIALIZED_NAME_WHATSAPP_ID)
  private String whatsappId;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  /**
   * Type of phone number (MOBILE, LANDLINE, etc)
   */
  @JsonAdapter(NumberTypeEnum.Adapter.class)
 public enum NumberTypeEnum {
    MOBILE("MOBILE"),
    
    LANDLINE("LANDLINE"),
    
    VOIP("VOIP"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    NumberTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NumberTypeEnum fromValue(String value) {
      for (NumberTypeEnum b : NumberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NumberTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NumberTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NumberTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NumberTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NUMBER_TYPE = "numberType";
  @SerializedName(SERIALIZED_NAME_NUMBER_TYPE)
  private NumberTypeEnum numberType;

  public static final String SERIALIZED_NAME_PROFILE_PICTURE = "profilePicture";
  @SerializedName(SERIALIZED_NAME_PROFILE_PICTURE)
  private String profilePicture;

  public static final String SERIALIZED_NAME_IS_BUSINESS = "isBusiness";
  @SerializedName(SERIALIZED_NAME_IS_BUSINESS)
  private Boolean isBusiness;

  public static final String SERIALIZED_NAME_INVALID_RECORD = "invalidRecord";
  @SerializedName(SERIALIZED_NAME_INVALID_RECORD)
  private Boolean invalidRecord;

  public WhatsAppPayload() {
  }

  public WhatsAppPayload id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the phone number record
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the phone number record")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public WhatsAppPayload sentId(UUID sentId) {
    
    
    
    
    this.sentId = sentId;
    return this;
  }

   /**
   * Sent platform identifier
   * @return sentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sent platform identifier")

  public UUID getSentId() {
    return sentId;
  }


  public void setSentId(UUID sentId) {
    
    
    
    this.sentId = sentId;
  }


  public WhatsAppPayload phoneNumber(String phoneNumber) {
    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number in E.164 format
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number in E.164 format")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    
    
    
    this.phoneNumber = phoneNumber;
  }


  public WhatsAppPayload whatsappId(String whatsappId) {
    
    
    
    
    this.whatsappId = whatsappId;
    return this;
  }

   /**
   * Unique WhatsApp identifier for the contact
   * @return whatsappId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique WhatsApp identifier for the contact")

  public String getWhatsappId() {
    return whatsappId;
  }


  public void setWhatsappId(String whatsappId) {
    
    
    
    this.whatsappId = whatsappId;
  }


  public WhatsAppPayload countryCode(String countryCode) {
    
    
    
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO country code of the phone number
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO country code of the phone number")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    
    
    
    this.countryCode = countryCode;
  }


  public WhatsAppPayload numberType(NumberTypeEnum numberType) {
    
    
    
    
    this.numberType = numberType;
    return this;
  }

   /**
   * Type of phone number (MOBILE, LANDLINE, etc)
   * @return numberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of phone number (MOBILE, LANDLINE, etc)")

  public NumberTypeEnum getNumberType() {
    return numberType;
  }


  public void setNumberType(NumberTypeEnum numberType) {
    
    
    
    this.numberType = numberType;
  }


  public WhatsAppPayload profilePicture(String profilePicture) {
    
    
    
    
    this.profilePicture = profilePicture;
    return this;
  }

   /**
   * URL to the contact&#39;s WhatsApp profile picture
   * @return profilePicture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the contact's WhatsApp profile picture")

  public String getProfilePicture() {
    return profilePicture;
  }


  public void setProfilePicture(String profilePicture) {
    
    
    
    this.profilePicture = profilePicture;
  }


  public WhatsAppPayload isBusiness(Boolean isBusiness) {
    
    
    
    
    this.isBusiness = isBusiness;
    return this;
  }

   /**
   * Indicates if the number belongs to a WhatsApp Business account
   * @return isBusiness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the number belongs to a WhatsApp Business account")

  public Boolean getIsBusiness() {
    return isBusiness;
  }


  public void setIsBusiness(Boolean isBusiness) {
    
    
    
    this.isBusiness = isBusiness;
  }


  public WhatsAppPayload invalidRecord(Boolean invalidRecord) {
    
    
    
    
    this.invalidRecord = invalidRecord;
    return this;
  }

   /**
   * Indicates if the WhatsApp account is invalid or deactivated
   * @return invalidRecord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the WhatsApp account is invalid or deactivated")

  public Boolean getInvalidRecord() {
    return invalidRecord;
  }


  public void setInvalidRecord(Boolean invalidRecord) {
    
    
    
    this.invalidRecord = invalidRecord;
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
   * @return the WhatsAppPayload instance itself
   */
  public WhatsAppPayload putAdditionalProperty(String key, Object value) {
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
    WhatsAppPayload whatsAppPayload = (WhatsAppPayload) o;
    return Objects.equals(this.id, whatsAppPayload.id) &&
        Objects.equals(this.sentId, whatsAppPayload.sentId) &&
        Objects.equals(this.phoneNumber, whatsAppPayload.phoneNumber) &&
        Objects.equals(this.whatsappId, whatsAppPayload.whatsappId) &&
        Objects.equals(this.countryCode, whatsAppPayload.countryCode) &&
        Objects.equals(this.numberType, whatsAppPayload.numberType) &&
        Objects.equals(this.profilePicture, whatsAppPayload.profilePicture) &&
        Objects.equals(this.isBusiness, whatsAppPayload.isBusiness) &&
        Objects.equals(this.invalidRecord, whatsAppPayload.invalidRecord)&&
        Objects.equals(this.additionalProperties, whatsAppPayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sentId, phoneNumber, whatsappId, countryCode, numberType, profilePicture, isBusiness, invalidRecord, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppPayload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sentId: ").append(toIndentedString(sentId)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    whatsappId: ").append(toIndentedString(whatsappId)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    numberType: ").append(toIndentedString(numberType)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    isBusiness: ").append(toIndentedString(isBusiness)).append("\n");
    sb.append("    invalidRecord: ").append(toIndentedString(invalidRecord)).append("\n");
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
    openapiFields.add("sentId");
    openapiFields.add("phoneNumber");
    openapiFields.add("whatsappId");
    openapiFields.add("countryCode");
    openapiFields.add("numberType");
    openapiFields.add("profilePicture");
    openapiFields.add("isBusiness");
    openapiFields.add("invalidRecord");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WhatsAppPayload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WhatsAppPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WhatsAppPayload is not found in the empty JSON string", WhatsAppPayload.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("sentId") != null && !jsonObj.get("sentId").isJsonNull()) && !jsonObj.get("sentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sentId").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("whatsappId") != null && !jsonObj.get("whatsappId").isJsonNull()) && !jsonObj.get("whatsappId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `whatsappId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("whatsappId").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("numberType") != null && !jsonObj.get("numberType").isJsonNull()) && !jsonObj.get("numberType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberType").toString()));
      }
      if ((jsonObj.get("profilePicture") != null && !jsonObj.get("profilePicture").isJsonNull()) && !jsonObj.get("profilePicture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profilePicture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profilePicture").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WhatsAppPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WhatsAppPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WhatsAppPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WhatsAppPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<WhatsAppPayload>() {
           @Override
           public void write(JsonWriter out, WhatsAppPayload value) throws IOException {
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
           public WhatsAppPayload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WhatsAppPayload instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WhatsAppPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WhatsAppPayload
  * @throws IOException if the JSON string is invalid with respect to WhatsAppPayload
  */
  public static WhatsAppPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WhatsAppPayload.class);
  }

 /**
  * Convert an instance of WhatsAppPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

