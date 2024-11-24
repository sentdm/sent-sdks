//
// TemplatesAPI.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class TemplatesAPI {

    weak var client: SentdmClient?

    public init(client: SentdmClient) {
        self.client = client
    }

    /**
     Create a new message template
     
     - parameter templateCreateRequest: (body) Template creation details including customer ID and template name 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func createTemplateSync(templateCreateRequest: TemplateCreateRequest, apiResponseQueue: DispatchQueue = SentdmAPI.apiResponseQueue, completion: @escaping ((_ data: ResponsesTemplateResponse?, _ error: Error?) -> Void)) -> RequestTask {
        return createTemplateWithRequestBuilder(templateCreateRequest: templateCreateRequest).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Create a new message template
     
     - parameter templateCreateRequest: (body) Template creation details including customer ID and template name 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @available(iOS 13.0, macOS 10.15, tvOS 13.0, watchOS 6.0, *)
    private class func createTemplateAsyncMappedParams(templateCreateRequest: TemplateCreateRequest) async throws -> ResponsesTemplateResponse {
        return try await withCheckedThrowingContinuation { continuation in
            createTemplateWithRequestBuilder(templateCreateRequest: templateCreateRequest).execute { result in
                switch result {
                case let .success(response):
                    continuation.resume(returning: response.body)
                case let .failure(error):
                    continuation.resume(throwing: error)
                }
            }
        }
    }

    /**
     Create a new message template
     
     - parameter templateCreateRequest: (body) Template creation details including customer ID and template name 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @available(iOS 13.0, macOS 10.15, tvOS 13.0, watchOS 6.0, *)
    open class func createTemplate(
        customerId: String,
        name: String
    ) async throws -> ResponsesTemplateResponse {
        let templateCreateRequest = TemplateCreateRequest(
            customerId: customerId,
            name: name
        )
        return try await withCheckedThrowingContinuation { continuation in
            createTemplateWithRequestBuilder(templateCreateRequest: templateCreateRequest).execute { result in
                switch result {
                case let .success(response):
                    continuation.resume(returning: response.body)
                case let .failure(error):
                    continuation.resume(throwing: error)
                }
            }
        }
    }


    /**
     Create a new message template
     
     - parameter templateCreateRequest: (body) Template creation details including customer ID and template name 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @available(iOS 13.0, macOS 10.15, tvOS 13.0, watchOS 6.0, *)
    open func createTemplate(
        customerId: String,
        name: String
    ) async throws -> ResponsesTemplateResponse {
        let templateCreateRequest = TemplateCreateRequest(
            customerId: customerId,
            name: name
        )
        return try await withCheckedThrowingContinuation { continuation in
            createTemplateWithRequestBuilder(templateCreateRequest: templateCreateRequest).execute { result in
                switch result {
                case let .success(response):
                    continuation.resume(returning: response.body)
                case let .failure(error):
                    continuation.resume(throwing: error)
                }
            }
        }
    }



    /**
     Create a new message template
     - POST /templates
     - Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
     - API Key:
       - type: apiKey x-api-key 
       - name: ApiKey
     - BASIC:
       - type: http
       - name: BearerAuth
     - parameter templateCreateRequest: (body) Template creation details including customer ID and template name 
     - returns: RequestBuilder<ResponsesTemplateResponse> Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
     */
    open class func createTemplateWithRequestBuilder(
            templateCreateRequest: TemplateCreateRequest
    ) -> RequestBuilder<ResponsesTemplateResponse> {
        let basePath = SentdmAPI.basePath;
        let localVariablePath = "/templates"
        let localVariableURLString = basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: templateCreateRequest)

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        var localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        do {
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "header", name: "x-api-key", value: SentdmAPI.apiKey, prefix: nil)
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "", name: "", value: SentdmAPI.bearerAuth, prefix: nil)
            let localVariableRequestBuilder: RequestBuilder<ResponsesTemplateResponse>.Type = SentdmAPI.requestBuilderFactory.getBuilder()
            let URLString = localVariableUrlComponents?.string ?? localVariableURLString
            return localVariableRequestBuilder.init(method: "POST", URLString: URLString, parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
        } catch {
            print("Error: \(error)")
        }
        fatalError("Error: Unable to send request to POST /templates")
    }

    /**
     Create a new message template
     - POST /templates
     - Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
     - API Key:
       - type: apiKey x-api-key 
       - name: ApiKey
     - BASIC:
       - type: http
       - name: BearerAuth
     - parameter templateCreateRequest: (body) Template creation details including customer ID and template name 
     - returns: RequestBuilder<ResponsesTemplateResponse> Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
     */
    open func createTemplateWithRequestBuilder(
            templateCreateRequest: TemplateCreateRequest
    ) -> RequestBuilder<ResponsesTemplateResponse> {
        let basePath = self.client!.basePath;
        let localVariablePath = "/templates"
        let localVariableURLString = basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: templateCreateRequest)

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        var localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        do {
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "header", name: "x-api-key", value: self.client!.apiKey, prefix: nil)
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "", name: "", value: self.client!.bearerAuth, prefix: nil)
            let localVariableRequestBuilder: RequestBuilder<ResponsesTemplateResponse>.Type = SentdmAPI.requestBuilderFactory.getBuilder()
            let URLString = localVariableUrlComponents?.string ?? localVariableURLString
            return localVariableRequestBuilder.init(method: "POST", URLString: URLString, parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
        } catch {
            print("Error: \(error)")
        }
        fatalError("Error: Unable to send request to POST /templates")
    }


    /**
     Retrieve all templates for a customer
     
     - parameter customerId: (query) Unique identifier of the customer 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func getTemplatesForCustomerSync(customerId: String, apiResponseQueue: DispatchQueue = SentdmAPI.apiResponseQueue, completion: @escaping ((_ data: [ResponsesTemplateResponse]?, _ error: Error?) -> Void)) -> RequestTask {
        return getTemplatesForCustomerWithRequestBuilder(customerId: customerId).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Retrieve all templates for a customer
     
     - parameter customerId: (query) Unique identifier of the customer 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @available(iOS 13.0, macOS 10.15, tvOS 13.0, watchOS 6.0, *)
    private class func getTemplatesForCustomerAsyncMappedParams(customerId: String) async throws -> [ResponsesTemplateResponse] {
        return try await withCheckedThrowingContinuation { continuation in
            getTemplatesForCustomerWithRequestBuilder(customerId: customerId).execute { result in
                switch result {
                case let .success(response):
                    continuation.resume(returning: response.body)
                case let .failure(error):
                    continuation.resume(throwing: error)
                }
            }
        }
    }

    /**
     Retrieve all templates for a customer
     
     - parameter customerId: (query) Unique identifier of the customer 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @available(iOS 13.0, macOS 10.15, tvOS 13.0, watchOS 6.0, *)
    open class func getTemplatesForCustomer(
        customerId: String
    ) async throws -> [ResponsesTemplateResponse] {
        return try await withCheckedThrowingContinuation { continuation in
            getTemplatesForCustomerWithRequestBuilder(customerId: customerId).execute { result in
                switch result {
                case let .success(response):
                    continuation.resume(returning: response.body)
                case let .failure(error):
                    continuation.resume(throwing: error)
                }
            }
        }
    }


    /**
     Retrieve all templates for a customer
     
     - parameter customerId: (query) Unique identifier of the customer 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @available(iOS 13.0, macOS 10.15, tvOS 13.0, watchOS 6.0, *)
    open func getTemplatesForCustomer(
        customerId: String
    ) async throws -> [ResponsesTemplateResponse] {
        return try await withCheckedThrowingContinuation { continuation in
            getTemplatesForCustomerWithRequestBuilder(customerId: customerId).execute { result in
                switch result {
                case let .success(response):
                    continuation.resume(returning: response.body)
                case let .failure(error):
                    continuation.resume(throwing: error)
                }
            }
        }
    }



    /**
     Retrieve all templates for a customer
     - GET /templates
     - Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
     - API Key:
       - type: apiKey x-api-key 
       - name: ApiKey
     - BASIC:
       - type: http
       - name: BearerAuth
     - parameter customerId: (query) Unique identifier of the customer 
     - returns: RequestBuilder<[ResponsesTemplateResponse]> Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
     */
    open class func getTemplatesForCustomerWithRequestBuilder(
            customerId: String
    ) -> RequestBuilder<[ResponsesTemplateResponse]> {
        let basePath = SentdmAPI.basePath;
        let localVariablePath = "/templates"
        let localVariableURLString = basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil
        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "customerId": (wrappedValue: customerId.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        var localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        do {
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "header", name: "x-api-key", value: SentdmAPI.apiKey, prefix: nil)
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "", name: "", value: SentdmAPI.bearerAuth, prefix: nil)
            let localVariableRequestBuilder: RequestBuilder<[ResponsesTemplateResponse]>.Type = SentdmAPI.requestBuilderFactory.getBuilder()
            let URLString = localVariableUrlComponents?.string ?? localVariableURLString
            return localVariableRequestBuilder.init(method: "GET", URLString: URLString, parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
        } catch {
            print("Error: \(error)")
        }
        fatalError("Error: Unable to send request to GET /templates")
    }

    /**
     Retrieve all templates for a customer
     - GET /templates
     - Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
     - API Key:
       - type: apiKey x-api-key 
       - name: ApiKey
     - BASIC:
       - type: http
       - name: BearerAuth
     - parameter customerId: (query) Unique identifier of the customer 
     - returns: RequestBuilder<[ResponsesTemplateResponse]> Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
     */
    open func getTemplatesForCustomerWithRequestBuilder(
            customerId: String
    ) -> RequestBuilder<[ResponsesTemplateResponse]> {
        let basePath = self.client!.basePath;
        let localVariablePath = "/templates"
        let localVariableURLString = basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil
        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "customerId": (wrappedValue: customerId.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        var localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        do {
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "header", name: "x-api-key", value: self.client!.apiKey, prefix: nil)
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "", name: "", value: self.client!.bearerAuth, prefix: nil)
            let localVariableRequestBuilder: RequestBuilder<[ResponsesTemplateResponse]>.Type = SentdmAPI.requestBuilderFactory.getBuilder()
            let URLString = localVariableUrlComponents?.string ?? localVariableURLString
            return localVariableRequestBuilder.init(method: "GET", URLString: URLString, parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
        } catch {
            print("Error: \(error)")
        }
        fatalError("Error: Unable to send request to GET /templates")
    }

}