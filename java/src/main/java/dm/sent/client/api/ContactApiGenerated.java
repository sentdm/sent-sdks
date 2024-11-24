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


package dm.sent.client.api;

import dm.sent.client.ApiCallback;
import dm.sent.client.ApiClient;
import dm.sent.client.ApiException;
import dm.sent.client.ApiResponse;
import dm.sent.client.Configuration;
import dm.sent.client.Pair;
import dm.sent.client.ProgressRequestBody;
import dm.sent.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import dm.sent.client.model.Contact;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ContactApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ContactApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ContactApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getContactByIdCall(UUID customerId, UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/contact/{customerId}/id/{id}"
            .replace("{" + "customerId" + "}", localVarApiClient.escapeString(customerId.toString()))
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getContactByIdValidateBeforeCall(UUID customerId, UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getContactById(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getContactById(Async)");
        }

        return getContactByIdCall(customerId, id, _callback);

    }


    private ApiResponse<Contact> getContactByIdWithHttpInfo(UUID customerId, UUID id) throws ApiException {
        okhttp3.Call localVarCall = getContactByIdValidateBeforeCall(customerId, id, null);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getContactByIdAsync(UUID customerId, UUID id, final ApiCallback<Contact> _callback) throws ApiException {

        okhttp3.Call localVarCall = getContactByIdValidateBeforeCall(customerId, id, _callback);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public abstract class GetContactByIdRequestBuilderGenerated {
        final UUID customerId;
        final UUID id;

        public GetContactByIdRequestBuilderGenerated(UUID customerId, UUID id) {
            this.customerId = customerId;
            this.id = id;
        }

        /**
         * Build call for getContactById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Contact details successfully retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Contact not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getContactByIdCall(customerId, id, _callback);
        }


        /**
         * Execute getContactById request
         * @return Contact
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Contact details successfully retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Contact not found </td><td>  -  </td></tr>
         </table>
         */
        public Contact execute() throws ApiException {
            ApiResponse<Contact> localVarResp = getContactByIdWithHttpInfo(customerId, id);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getContactById request with HTTP info returned
         * @return ApiResponse&lt;Contact&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Contact details successfully retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Contact not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Contact> executeWithHttpInfo() throws ApiException {
            return getContactByIdWithHttpInfo(customerId, id);
        }

        /**
         * Execute getContactById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Contact details successfully retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Contact not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Contact> _callback) throws ApiException {
            return getContactByIdAsync(customerId, id, _callback);
        }
    }

    /**
     * Retrieve a contact by ID
     * Fetches detailed contact information including available messaging channels and verification status. Use this endpoint when you need to look up a specific contact using their unique identifier.
     * @param customerId Unique identifier of the customer account (required)
     * @param id Unique identifier of the contact (required)
     * @return GetContactByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contact details successfully retrieved </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Contact not found </td><td>  -  </td></tr>
     </table>
     */
    public ContactApi.GetContactByIdRequestBuilder getContactById(UUID customerId, UUID id) throws IllegalArgumentException {
        if (customerId == null) throw new IllegalArgumentException("\"customerId\" is required but got null");
            

        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return ((ContactApi) this).new GetContactByIdRequestBuilder(customerId, id);
    }
    private okhttp3.Call getContactByPhoneCall(UUID customerId, String phoneNumber, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/contact/{customerId}/phone/{phoneNumber}"
            .replace("{" + "customerId" + "}", localVarApiClient.escapeString(customerId.toString()))
            .replace("{" + "phoneNumber" + "}", localVarApiClient.escapeString(phoneNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getContactByPhoneValidateBeforeCall(UUID customerId, String phoneNumber, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getContactByPhone(Async)");
        }

        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException("Missing the required parameter 'phoneNumber' when calling getContactByPhone(Async)");
        }

        return getContactByPhoneCall(customerId, phoneNumber, _callback);

    }


    private ApiResponse<Contact> getContactByPhoneWithHttpInfo(UUID customerId, String phoneNumber) throws ApiException {
        okhttp3.Call localVarCall = getContactByPhoneValidateBeforeCall(customerId, phoneNumber, null);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getContactByPhoneAsync(UUID customerId, String phoneNumber, final ApiCallback<Contact> _callback) throws ApiException {

        okhttp3.Call localVarCall = getContactByPhoneValidateBeforeCall(customerId, phoneNumber, _callback);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public abstract class GetContactByPhoneRequestBuilderGenerated {
        final UUID customerId;
        final String phoneNumber;

        public GetContactByPhoneRequestBuilderGenerated(UUID customerId, String phoneNumber) {
            this.customerId = customerId;
            this.phoneNumber = phoneNumber;
        }

        /**
         * Build call for getContactByPhone
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Contact details successfully retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Contact not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getContactByPhoneCall(customerId, phoneNumber, _callback);
        }


        /**
         * Execute getContactByPhone request
         * @return Contact
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Contact details successfully retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Contact not found </td><td>  -  </td></tr>
         </table>
         */
        public Contact execute() throws ApiException {
            ApiResponse<Contact> localVarResp = getContactByPhoneWithHttpInfo(customerId, phoneNumber);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getContactByPhone request with HTTP info returned
         * @return ApiResponse&lt;Contact&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Contact details successfully retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Contact not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Contact> executeWithHttpInfo() throws ApiException {
            return getContactByPhoneWithHttpInfo(customerId, phoneNumber);
        }

        /**
         * Execute getContactByPhone request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Contact details successfully retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Contact not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Contact> _callback) throws ApiException {
            return getContactByPhoneAsync(customerId, phoneNumber, _callback);
        }
    }

    /**
     * Retrieve a contact by phone number
     * Looks up contact information using a phone number. This endpoint is useful when you need to find a contact&#39;s details but only have their phone number. It returns the same detailed information as the ID-based lookup.
     * @param customerId Unique identifier of the customer account (required)
     * @param phoneNumber Phone number in E.164 format (e.g., +1234567890) (required)
     * @return GetContactByPhoneRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contact details successfully retrieved </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Contact not found </td><td>  -  </td></tr>
     </table>
     */
    public ContactApi.GetContactByPhoneRequestBuilder getContactByPhone(UUID customerId, String phoneNumber) throws IllegalArgumentException {
        if (customerId == null) throw new IllegalArgumentException("\"customerId\" is required but got null");
            

        if (phoneNumber == null) throw new IllegalArgumentException("\"phoneNumber\" is required but got null");
            

        return ((ContactApi) this).new GetContactByPhoneRequestBuilder(customerId, phoneNumber);
    }
}
