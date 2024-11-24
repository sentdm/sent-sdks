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


import dm.sent.client.model.ResponsesTemplateResponse;
import dm.sent.client.model.TemplateCreateRequest;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TemplatesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TemplatesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TemplatesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createTemplateCall(TemplateCreateRequest templateCreateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = templateCreateRequest;

        // create path and map variables
        String localVarPath = "/templates";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey", "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTemplateValidateBeforeCall(TemplateCreateRequest templateCreateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'templateCreateRequest' is set
        if (templateCreateRequest == null) {
            throw new ApiException("Missing the required parameter 'templateCreateRequest' when calling createTemplate(Async)");
        }

        return createTemplateCall(templateCreateRequest, _callback);

    }


    private ApiResponse<ResponsesTemplateResponse> createTemplateWithHttpInfo(TemplateCreateRequest templateCreateRequest) throws ApiException {
        okhttp3.Call localVarCall = createTemplateValidateBeforeCall(templateCreateRequest, null);
        Type localVarReturnType = new TypeToken<ResponsesTemplateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createTemplateAsync(TemplateCreateRequest templateCreateRequest, final ApiCallback<ResponsesTemplateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTemplateValidateBeforeCall(templateCreateRequest, _callback);
        Type localVarReturnType = new TypeToken<ResponsesTemplateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public abstract class CreateTemplateRequestBuilderGenerated {
        final UUID customerId;
        final String name;

        public CreateTemplateRequestBuilderGenerated(UUID customerId, String name) {
            this.customerId = customerId;
            this.name = name;
        }

        /**
         * Build call for createTemplate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Template created successfully </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            TemplateCreateRequest templateCreateRequest = buildBodyParams();
            return createTemplateCall(templateCreateRequest, _callback);
        }

        private TemplateCreateRequest buildBodyParams() {
            TemplateCreateRequest templateCreateRequest = new TemplateCreateRequest();
            templateCreateRequest.customerId(this.customerId);
            templateCreateRequest.name(this.name);
            return templateCreateRequest;
        }

        /**
         * Execute createTemplate request
         * @return ResponsesTemplateResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Template created successfully </td><td>  -  </td></tr>
         </table>
         */
        public ResponsesTemplateResponse execute() throws ApiException {
            TemplateCreateRequest templateCreateRequest = buildBodyParams();
            ApiResponse<ResponsesTemplateResponse> localVarResp = createTemplateWithHttpInfo(templateCreateRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createTemplate request with HTTP info returned
         * @return ApiResponse&lt;ResponsesTemplateResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Template created successfully </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResponsesTemplateResponse> executeWithHttpInfo() throws ApiException {
            TemplateCreateRequest templateCreateRequest = buildBodyParams();
            return createTemplateWithHttpInfo(templateCreateRequest);
        }

        /**
         * Execute createTemplate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Template created successfully </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResponsesTemplateResponse> _callback) throws ApiException {
            TemplateCreateRequest templateCreateRequest = buildBodyParams();
            return createTemplateAsync(templateCreateRequest, _callback);
        }
    }

    /**
     * Create a new message template
     * Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
     * @param templateCreateRequest Template creation details including customer ID and template name (required)
     * @return CreateTemplateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Template created successfully </td><td>  -  </td></tr>
     </table>
     */
    public TemplatesApi.CreateTemplateRequestBuilder createTemplate(UUID customerId, String name) throws IllegalArgumentException {
        if (customerId == null) throw new IllegalArgumentException("\"customerId\" is required but got null");
            

        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            if (name != null && name.length() < 1) {
              throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
            }

        return ((TemplatesApi) this).new CreateTemplateRequestBuilder(customerId, name);
    }
    private okhttp3.Call getTemplatesForCustomerCall(UUID customerId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/templates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (customerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("customerId", customerId));
        }

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
    private okhttp3.Call getTemplatesForCustomerValidateBeforeCall(UUID customerId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling getTemplatesForCustomer(Async)");
        }

        return getTemplatesForCustomerCall(customerId, _callback);

    }


    private ApiResponse<List<ResponsesTemplateResponse>> getTemplatesForCustomerWithHttpInfo(UUID customerId) throws ApiException {
        okhttp3.Call localVarCall = getTemplatesForCustomerValidateBeforeCall(customerId, null);
        Type localVarReturnType = new TypeToken<List<ResponsesTemplateResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getTemplatesForCustomerAsync(UUID customerId, final ApiCallback<List<ResponsesTemplateResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTemplatesForCustomerValidateBeforeCall(customerId, _callback);
        Type localVarReturnType = new TypeToken<List<ResponsesTemplateResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public abstract class GetTemplatesForCustomerRequestBuilderGenerated {
        final UUID customerId;

        public GetTemplatesForCustomerRequestBuilderGenerated(UUID customerId) {
            this.customerId = customerId;
        }

        /**
         * Build call for getTemplatesForCustomer
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of templates retrieved successfully </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getTemplatesForCustomerCall(customerId, _callback);
        }


        /**
         * Execute getTemplatesForCustomer request
         * @return List&lt;ResponsesTemplateResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of templates retrieved successfully </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
         </table>
         */
        public List<ResponsesTemplateResponse> execute() throws ApiException {
            ApiResponse<List<ResponsesTemplateResponse>> localVarResp = getTemplatesForCustomerWithHttpInfo(customerId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getTemplatesForCustomer request with HTTP info returned
         * @return ApiResponse&lt;List&lt;ResponsesTemplateResponse&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of templates retrieved successfully </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<ResponsesTemplateResponse>> executeWithHttpInfo() throws ApiException {
            return getTemplatesForCustomerWithHttpInfo(customerId);
        }

        /**
         * Execute getTemplatesForCustomer request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of templates retrieved successfully </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<ResponsesTemplateResponse>> _callback) throws ApiException {
            return getTemplatesForCustomerAsync(customerId, _callback);
        }
    }

    /**
     * Retrieve all templates for a customer
     * Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
     * @param customerId Unique identifier of the customer (required)
     * @return GetTemplatesForCustomerRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of templates retrieved successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication credentials are missing or invalid </td><td>  -  </td></tr>
     </table>
     */
    public TemplatesApi.GetTemplatesForCustomerRequestBuilder getTemplatesForCustomer(UUID customerId) throws IllegalArgumentException {
        if (customerId == null) throw new IllegalArgumentException("\"customerId\" is required but got null");
            

        return ((TemplatesApi) this).new GetTemplatesForCustomerRequestBuilder(customerId);
    }
}
