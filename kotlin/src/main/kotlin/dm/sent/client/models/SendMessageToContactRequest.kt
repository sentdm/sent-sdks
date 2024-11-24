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
 * Request model for sending a message to a contact using a template
 *
 * @param customerId Unique identifier of the customer
 * @param contactId Unique identifier of the contact
 * @param templateId Unique identifier of the message template
 */

data class SendMessageToContactRequest (

    /* Unique identifier of the customer */
    @Json(name = "customerId")
    val customerId: java.util.UUID,

    /* Unique identifier of the contact */
    @Json(name = "contactId")
    val contactId: java.util.UUID,

    /* Unique identifier of the message template */
    @Json(name = "templateId")
    val templateId: java.util.UUID

)
