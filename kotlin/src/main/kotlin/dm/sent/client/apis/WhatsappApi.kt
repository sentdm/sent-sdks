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

import dm.sent.client.models.WhatsAppPayload
import dm.sent.client.models.WhatsappGetWhatsappContactResponse

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

class WhatsappApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Retrieve WhatsApp contact information
     * Fetches or creates WhatsApp contact information for a given phone number. This endpoint validates WhatsApp availability and returns detailed contact metadata including business account status and profile information.
     * @param phoneNumber Phone number in international format (E.164)
     * @param retrieveIfDoesNotExists Whether to create a new contact if one doesn&#39;t exist (default to false)
     * @param sentId Optional Sent platform identifier for tracking (optional)
     * @return WhatsAppPayload
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getWhatsappContact(phoneNumber: kotlin.String, retrieveIfDoesNotExists: kotlin.Boolean = false, sentId: java.util.UUID? = null) : WhatsAppPayload {
        val localVarResponse = getWhatsappContactWithHttpInfo(phoneNumber = phoneNumber, retrieveIfDoesNotExists = retrieveIfDoesNotExists, sentId = sentId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as WhatsAppPayload
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
     * Retrieve WhatsApp contact information
     * Fetches or creates WhatsApp contact information for a given phone number. This endpoint validates WhatsApp availability and returns detailed contact metadata including business account status and profile information.
     * @param phoneNumber Phone number in international format (E.164)
     * @param retrieveIfDoesNotExists Whether to create a new contact if one doesn&#39;t exist (default to false)
     * @param sentId Optional Sent platform identifier for tracking (optional)
     * @return ApiResponse<WhatsAppPayload?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getWhatsappContactWithHttpInfo(phoneNumber: kotlin.String, retrieveIfDoesNotExists: kotlin.Boolean, sentId: java.util.UUID?) : ApiResponse<WhatsAppPayload?> {
        val localVariableConfig = getWhatsappContactRequestConfig(phoneNumber = phoneNumber, retrieveIfDoesNotExists = retrieveIfDoesNotExists, sentId = sentId)

        return request<Unit, WhatsAppPayload>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getWhatsappContact
     *
     * @param phoneNumber Phone number in international format (E.164)
     * @param retrieveIfDoesNotExists Whether to create a new contact if one doesn&#39;t exist (default to false)
     * @param sentId Optional Sent platform identifier for tracking (optional)
     * @return RequestConfig
     */
    fun getWhatsappContactRequestConfig(phoneNumber: kotlin.String, retrieveIfDoesNotExists: kotlin.Boolean, sentId: java.util.UUID?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("phoneNumber", listOf(phoneNumber.toString()))
                put("retrieveIfDoesNotExists", listOf(retrieveIfDoesNotExists.toString()))
                if (sentId != null) {
                    put("sentId", listOf(sentId.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/whatsapp",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}