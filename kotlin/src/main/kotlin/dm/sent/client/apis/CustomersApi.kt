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

import dm.sent.client.models.Customer
import dm.sent.client.models.CustomersUpdateCustomerRequest

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

class CustomersApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Create a new customer account
     * Creates a new customer account in the Sent platform. This endpoint initializes a new customer profile with basic information and returns the created customer details including generated IDs and credentials for various messaging channels.
     * @param body Customer name to create the account
     * @return Customer
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createCustomer(body: kotlin.String) : Customer {
        val localVarResponse = createCustomerWithHttpInfo(body = body)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Customer
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
     * Create a new customer account
     * Creates a new customer account in the Sent platform. This endpoint initializes a new customer profile with basic information and returns the created customer details including generated IDs and credentials for various messaging channels.
     * @param body Customer name to create the account
     * @return ApiResponse<Customer?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createCustomerWithHttpInfo(body: kotlin.String) : ApiResponse<Customer?> {
        val localVariableConfig = createCustomerRequestConfig(body = body)

        return request<kotlin.String, Customer>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createCustomer
     *
     * @param body Customer name to create the account
     * @return RequestConfig
     */
    fun createCustomerRequestConfig(body: kotlin.String) : RequestConfig<kotlin.String> {
        val localVariableBody = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/customers",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete a customer
     * Permanently deletes a customer and all associated data. This action cannot be undone. All active services for this customer will be terminated.
     * @param id Unique identifier of the customer to delete
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteCustomer(id: java.util.UUID) : Unit {
        val localVarResponse = deleteCustomerWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Delete a customer
     * Permanently deletes a customer and all associated data. This action cannot be undone. All active services for this customer will be terminated.
     * @param id Unique identifier of the customer to delete
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteCustomerWithHttpInfo(id: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = deleteCustomerRequestConfig(id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteCustomer
     *
     * @param id Unique identifier of the customer to delete
     * @return RequestConfig
     */
    fun deleteCustomerRequestConfig(id: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/customers/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve all customers with pagination
     * Returns a paginated list of all customers. Use page and pageSize parameters to control the number of results returned. Results are sorted by creation date in descending order.
     * @param page Page number to retrieve (starts from 1)
     * @param pageSize Number of items to return per page
     * @return kotlin.collections.List<Customer>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAllCustomers(page: kotlin.Int, pageSize: kotlin.Int) : kotlin.collections.List<Customer> {
        val localVarResponse = getAllCustomersWithHttpInfo(page = page, pageSize = pageSize)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<Customer>
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
     * Retrieve all customers with pagination
     * Returns a paginated list of all customers. Use page and pageSize parameters to control the number of results returned. Results are sorted by creation date in descending order.
     * @param page Page number to retrieve (starts from 1)
     * @param pageSize Number of items to return per page
     * @return ApiResponse<kotlin.collections.List<Customer>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAllCustomersWithHttpInfo(page: kotlin.Int, pageSize: kotlin.Int) : ApiResponse<kotlin.collections.List<Customer>?> {
        val localVariableConfig = getAllCustomersRequestConfig(page = page, pageSize = pageSize)

        return request<Unit, kotlin.collections.List<Customer>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAllCustomers
     *
     * @param page Page number to retrieve (starts from 1)
     * @param pageSize Number of items to return per page
     * @return RequestConfig
     */
    fun getAllCustomersRequestConfig(page: kotlin.Int, pageSize: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("page", listOf(page.toString()))
                put("pageSize", listOf(pageSize.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/customers",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve a customer by ID
     * Returns detailed information about a specific customer including their messaging channel configurations and credentials.
     * @param id Unique identifier of the customer
     * @return Customer
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCustomerById(id: java.util.UUID) : Customer {
        val localVarResponse = getCustomerByIdWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Customer
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
     * Retrieve a customer by ID
     * Returns detailed information about a specific customer including their messaging channel configurations and credentials.
     * @param id Unique identifier of the customer
     * @return ApiResponse<Customer?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getCustomerByIdWithHttpInfo(id: java.util.UUID) : ApiResponse<Customer?> {
        val localVariableConfig = getCustomerByIdRequestConfig(id = id)

        return request<Unit, Customer>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getCustomerById
     *
     * @param id Unique identifier of the customer
     * @return RequestConfig
     */
    fun getCustomerByIdRequestConfig(id: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/customers/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Update customer information
     * Updates an existing customer&#39;s information including messaging channel configurations. All fields in the request body will override existing values.
     * @param id Unique identifier of the customer to update
     * @param customersUpdateCustomerRequest Updated customer information
     * @return Customer
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateCustomer(id: java.util.UUID, customersUpdateCustomerRequest: CustomersUpdateCustomerRequest) : Customer {
        val localVarResponse = updateCustomerWithHttpInfo(id = id, customersUpdateCustomerRequest = customersUpdateCustomerRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Customer
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
     * Update customer information
     * Updates an existing customer&#39;s information including messaging channel configurations. All fields in the request body will override existing values.
     * @param id Unique identifier of the customer to update
     * @param customersUpdateCustomerRequest Updated customer information
     * @return ApiResponse<Customer?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateCustomerWithHttpInfo(id: java.util.UUID, customersUpdateCustomerRequest: CustomersUpdateCustomerRequest) : ApiResponse<Customer?> {
        val localVariableConfig = updateCustomerRequestConfig(id = id, customersUpdateCustomerRequest = customersUpdateCustomerRequest)

        return request<CustomersUpdateCustomerRequest, Customer>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateCustomer
     *
     * @param id Unique identifier of the customer to update
     * @param customersUpdateCustomerRequest Updated customer information
     * @return RequestConfig
     */
    fun updateCustomerRequestConfig(id: java.util.UUID, customersUpdateCustomerRequest: CustomersUpdateCustomerRequest) : RequestConfig<CustomersUpdateCustomerRequest> {
        val localVariableBody = customersUpdateCustomerRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/customers/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
