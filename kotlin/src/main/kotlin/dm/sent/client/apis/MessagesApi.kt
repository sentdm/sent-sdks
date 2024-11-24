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

package dm.sent.client.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import dm.sent.client.models.MessagesSendMessageToContact400Response
import dm.sent.client.models.MessagesSendMessageToContactResponse
import dm.sent.client.models.MessagesSendMessageToPhoneNumberResponse
import dm.sent.client.models.SendMessageToContactRequest
import dm.sent.client.models.SendMessageToPhoneNumberRequest

import com.squareup.moshi.Json

import dm.sent.client.infrastructure.ApiClient
import dm.sent.client.infrastructure.ApiResponse
import dm.sent.client.infrastructure.ClientException
import dm.sent.client.infrastructure.ClientError
import dm.sent.client.infrastructure.ServerException
import dm.sent.client.infrastructure.ServerError
import dm.sent.client.infrastructure.MultiValueMap
import dm.sent.client.infrastructure.PartConfig
import dm.sent.client.infrastructure.RequestConfig
import dm.sent.client.infrastructure.RequestMethod
import dm.sent.client.infrastructure.ResponseType
import dm.sent.client.infrastructure.Success
import dm.sent.client.infrastructure.toMultiValue

class MessagesApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Send a message to a contact using a template
     * Sends a templated message to a specific contact. The platform automatically determines the optimal channel (SMS or WhatsApp) based on the contact&#39;s preferences and availability. Messages are sent using pre-defined templates to ensure consistent formatting and compliance across channels.
     * @param sendMessageToContactRequest Message details including customer ID, contact ID, and template ID
     * @return MessagesSendMessageToContactResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun sendMessageToContact(sendMessageToContactRequest: SendMessageToContactRequest) : MessagesSendMessageToContactResponse {
        val localVarResponse = sendMessageToContactWithHttpInfo(sendMessageToContactRequest = sendMessageToContactRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MessagesSendMessageToContactResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Send a message to a contact using a template
     * Sends a templated message to a specific contact. The platform automatically determines the optimal channel (SMS or WhatsApp) based on the contact&#39;s preferences and availability. Messages are sent using pre-defined templates to ensure consistent formatting and compliance across channels.
     * @param sendMessageToContactRequest Message details including customer ID, contact ID, and template ID
     * @return ApiResponse<MessagesSendMessageToContactResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun sendMessageToContactWithHttpInfo(sendMessageToContactRequest: SendMessageToContactRequest) : ApiResponse<MessagesSendMessageToContactResponse?> {
        val localVariableConfig = sendMessageToContactRequestConfig(sendMessageToContactRequest = sendMessageToContactRequest)

        return request<SendMessageToContactRequest, MessagesSendMessageToContactResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation sendMessageToContact
     *
     * @param sendMessageToContactRequest Message details including customer ID, contact ID, and template ID
     * @return RequestConfig
     */
    fun sendMessageToContactRequestConfig(sendMessageToContactRequest: SendMessageToContactRequest) : RequestConfig<SendMessageToContactRequest> {
        val localVariableBody = sendMessageToContactRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/messages",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Send a message to a phone number using a template
     * Sends a templated message directly to a phone number without requiring a pre-existing contact. The system will attempt to determine the best channel for delivery and create a contact record if one doesn&#39;t exist.
     * @param sendMessageToPhoneNumberRequest Message details including customer ID, phone number, and template ID
     * @return MessagesSendMessageToPhoneNumberResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun sendMessageToPhoneNumber(sendMessageToPhoneNumberRequest: SendMessageToPhoneNumberRequest) : MessagesSendMessageToPhoneNumberResponse {
        val localVarResponse = sendMessageToPhoneNumberWithHttpInfo(sendMessageToPhoneNumberRequest = sendMessageToPhoneNumberRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MessagesSendMessageToPhoneNumberResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Send a message to a phone number using a template
     * Sends a templated message directly to a phone number without requiring a pre-existing contact. The system will attempt to determine the best channel for delivery and create a contact record if one doesn&#39;t exist.
     * @param sendMessageToPhoneNumberRequest Message details including customer ID, phone number, and template ID
     * @return ApiResponse<MessagesSendMessageToPhoneNumberResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun sendMessageToPhoneNumberWithHttpInfo(sendMessageToPhoneNumberRequest: SendMessageToPhoneNumberRequest) : ApiResponse<MessagesSendMessageToPhoneNumberResponse?> {
        val localVariableConfig = sendMessageToPhoneNumberRequestConfig(sendMessageToPhoneNumberRequest = sendMessageToPhoneNumberRequest)

        return request<SendMessageToPhoneNumberRequest, MessagesSendMessageToPhoneNumberResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation sendMessageToPhoneNumber
     *
     * @param sendMessageToPhoneNumberRequest Message details including customer ID, phone number, and template ID
     * @return RequestConfig
     */
    fun sendMessageToPhoneNumberRequestConfig(sendMessageToPhoneNumberRequest: SendMessageToPhoneNumberRequest) : RequestConfig<SendMessageToPhoneNumberRequest> {
        val localVariableBody = sendMessageToPhoneNumberRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/messages/phone-number",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
