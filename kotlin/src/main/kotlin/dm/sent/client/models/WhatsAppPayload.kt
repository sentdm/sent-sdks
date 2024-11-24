/**
 *
 * Please note:
 * This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dm.sent.client.models


import com.squareup.moshi.Json

/**
 * WhatsApp contact information including profile and verification details
 *
 * @param id Unique identifier for the phone number record
 * @param sentId Sent platform identifier
 * @param phoneNumber Phone number in E.164 format
 * @param whatsappId Unique WhatsApp identifier for the contact
 * @param countryCode ISO country code of the phone number
 * @param numberType Type of phone number (MOBILE, LANDLINE, etc)
 * @param profilePicture URL to the contact's WhatsApp profile picture
 * @param isBusiness Indicates if the number belongs to a WhatsApp Business account
 * @param invalidRecord Indicates if the WhatsApp account is invalid or deactivated
 */

data class WhatsAppPayload (

    /* Unique identifier for the phone number record */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    /* Sent platform identifier */
    @Json(name = "sentId")
    val sentId: java.util.UUID? = null,

    /* Phone number in E.164 format */
    @Json(name = "phoneNumber")
    val phoneNumber: kotlin.String? = null,

    /* Unique WhatsApp identifier for the contact */
    @Json(name = "whatsappId")
    val whatsappId: kotlin.String? = null,

    /* ISO country code of the phone number */
    @Json(name = "countryCode")
    val countryCode: kotlin.String? = null,

    /* Type of phone number (MOBILE, LANDLINE, etc) */
    @Json(name = "numberType")
    val numberType: WhatsAppPayload.NumberType? = null,

    /* URL to the contact's WhatsApp profile picture */
    @Json(name = "profilePicture")
    val profilePicture: kotlin.String? = null,

    /* Indicates if the number belongs to a WhatsApp Business account */
    @Json(name = "isBusiness")
    val isBusiness: kotlin.Boolean? = null,

    /* Indicates if the WhatsApp account is invalid or deactivated */
    @Json(name = "invalidRecord")
    val invalidRecord: kotlin.Boolean? = null

) {

    /**
     * Type of phone number (MOBILE, LANDLINE, etc)
     *
     * Values: mOBILE,lANDLINE,vOIP,uNKNOWN
     */
    enum class NumberType(val value: kotlin.String) {
        @Json(name = "MOBILE") mOBILE("MOBILE"),
        @Json(name = "LANDLINE") lANDLINE("LANDLINE"),
        @Json(name = "VOIP") vOIP("VOIP"),
        @Json(name = "UNKNOWN") uNKNOWN("UNKNOWN");
    }
}
