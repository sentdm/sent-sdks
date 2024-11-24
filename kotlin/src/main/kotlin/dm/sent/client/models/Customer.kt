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
 * Represents a customer account within the Sent platform, including messaging channel configurations and credentials
 *
 * @param id Unique identifier for the customer
 * @param name Name of the customer organization
 * @param sendingPhoneNumber Primary phone number used for sending messages
 * @param smsMessagingProfileId Identifier for the SMS messaging profile
 * @param smsBearerToken Bearer token for authenticating SMS requests
 * @param createdAt Timestamp when the customer account was created
 * @param updatedAt Timestamp when the customer account was last updated
 */

data class Customer (

    /* Unique identifier for the customer */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    /* Name of the customer organization */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Primary phone number used for sending messages */
    @Json(name = "sendingPhoneNumber")
    val sendingPhoneNumber: kotlin.String? = null,

    /* Identifier for the SMS messaging profile */
    @Json(name = "smsMessagingProfileId")
    val smsMessagingProfileId: kotlin.String? = null,

    /* Bearer token for authenticating SMS requests */
    @Json(name = "smsBearerToken")
    val smsBearerToken: kotlin.String? = null,

    /* Timestamp when the customer account was created */
    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime? = null,

    /* Timestamp when the customer account was last updated */
    @Json(name = "updatedAt")
    val updatedAt: java.time.OffsetDateTime? = null

)

