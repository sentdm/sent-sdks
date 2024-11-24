//
// SMSAPI.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class SMSAPI {

    weak var client: SentdmClient?

    public init(client: SentdmClient) {
        self.client = client
    }

    /**
     Retrieve SMS contact information and capabilities
     
     - parameter phoneNumber: (query) Target phone number in E.164 format (e.g., +1234567890) 
     - parameter retrieveIfDoesNotExists: (query) When true, creates a new SMS contact if one doesn&#39;t exist 
     - parameter sentId: (query) Optional Sent platform identifier for existing contacts (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func getContactInfoSync(phoneNumber: String, retrieveIfDoesNotExists: Bool, sentId: String? = nil, apiResponseQueue: DispatchQueue = SentdmAPI.apiResponseQueue, completion: @escaping ((_ data: SMSPayload?, _ error: Error?) -> Void)) -> RequestTask {
        return getContactInfoWithRequestBuilder(phoneNumber: phoneNumber, retrieveIfDoesNotExists: retrieveIfDoesNotExists, sentId: sentId).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Retrieve SMS contact information and capabilities
     
     - parameter phoneNumber: (query) Target phone number in E.164 format (e.g., +1234567890) 
     - parameter retrieveIfDoesNotExists: (query) When true, creates a new SMS contact if one doesn&#39;t exist 
     - parameter sentId: (query) Optional Sent platform identifier for existing contacts (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @available(iOS 13.0, macOS 10.15, tvOS 13.0, watchOS 6.0, *)
    private class func getContactInfoAsyncMappedParams(phoneNumber: String, retrieveIfDoesNotExists: Bool, sentId: String? = nil) async throws -> SMSPayload {
        return try await withCheckedThrowingContinuation { continuation in
            getContactInfoWithRequestBuilder(phoneNumber: phoneNumber, retrieveIfDoesNotExists: retrieveIfDoesNotExists, sentId: sentId).execute { result in
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
     Retrieve SMS contact information and capabilities
     
     - parameter phoneNumber: (query) Target phone number in E.164 format (e.g., +1234567890) 
     - parameter retrieveIfDoesNotExists: (query) When true, creates a new SMS contact if one doesn&#39;t exist 
     - parameter sentId: (query) Optional Sent platform identifier for existing contacts (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @available(iOS 13.0, macOS 10.15, tvOS 13.0, watchOS 6.0, *)
    open class func getContactInfo(
        phoneNumber: String,
        retrieveIfDoesNotExists: Bool,
        sentId: String? = nil
    ) async throws -> SMSPayload {
        return try await withCheckedThrowingContinuation { continuation in
            getContactInfoWithRequestBuilder(phoneNumber: phoneNumber, retrieveIfDoesNotExists: retrieveIfDoesNotExists, sentId: sentId).execute { result in
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
     Retrieve SMS contact information and capabilities
     
     - parameter phoneNumber: (query) Target phone number in E.164 format (e.g., +1234567890) 
     - parameter retrieveIfDoesNotExists: (query) When true, creates a new SMS contact if one doesn&#39;t exist 
     - parameter sentId: (query) Optional Sent platform identifier for existing contacts (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @available(iOS 13.0, macOS 10.15, tvOS 13.0, watchOS 6.0, *)
    open func getContactInfo(
        phoneNumber: String,
        retrieveIfDoesNotExists: Bool,
        sentId: String? = nil
    ) async throws -> SMSPayload {
        return try await withCheckedThrowingContinuation { continuation in
            getContactInfoWithRequestBuilder(phoneNumber: phoneNumber, retrieveIfDoesNotExists: retrieveIfDoesNotExists, sentId: sentId).execute { result in
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
     Retrieve SMS contact information and capabilities
     - GET /sms
     - Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
     - API Key:
       - type: apiKey x-api-key 
       - name: ApiKey
     - BASIC:
       - type: http
       - name: BearerAuth
     - parameter phoneNumber: (query) Target phone number in E.164 format (e.g., +1234567890) 
     - parameter retrieveIfDoesNotExists: (query) When true, creates a new SMS contact if one doesn&#39;t exist 
     - parameter sentId: (query) Optional Sent platform identifier for existing contacts (optional)
     - returns: RequestBuilder<SMSPayload> Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
     */
    open class func getContactInfoWithRequestBuilder(
            phoneNumber: String,
            retrieveIfDoesNotExists: Bool,
            sentId: String? = nil
    ) -> RequestBuilder<SMSPayload> {
        let basePath = SentdmAPI.basePath;
        let localVariablePath = "/sms"
        let localVariableURLString = basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil
        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "phoneNumber": (wrappedValue: phoneNumber.encodeToJSON(), isExplode: true),
            "retrieveIfDoesNotExists": (wrappedValue: retrieveIfDoesNotExists.encodeToJSON(), isExplode: true),
            "sentId": (wrappedValue: sentId?.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        var localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        do {
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "header", name: "x-api-key", value: SentdmAPI.apiKey, prefix: nil)
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "", name: "", value: SentdmAPI.bearerAuth, prefix: nil)
            let localVariableRequestBuilder: RequestBuilder<SMSPayload>.Type = SentdmAPI.requestBuilderFactory.getBuilder()
            let URLString = localVariableUrlComponents?.string ?? localVariableURLString
            return localVariableRequestBuilder.init(method: "GET", URLString: URLString, parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
        } catch {
            print("Error: \(error)")
        }
        fatalError("Error: Unable to send request to GET /sms")
    }

    /**
     Retrieve SMS contact information and capabilities
     - GET /sms
     - Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
     - API Key:
       - type: apiKey x-api-key 
       - name: ApiKey
     - BASIC:
       - type: http
       - name: BearerAuth
     - parameter phoneNumber: (query) Target phone number in E.164 format (e.g., +1234567890) 
     - parameter retrieveIfDoesNotExists: (query) When true, creates a new SMS contact if one doesn&#39;t exist 
     - parameter sentId: (query) Optional Sent platform identifier for existing contacts (optional)
     - returns: RequestBuilder<SMSPayload> Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
     */
    open func getContactInfoWithRequestBuilder(
            phoneNumber: String,
            retrieveIfDoesNotExists: Bool,
            sentId: String? = nil
    ) -> RequestBuilder<SMSPayload> {
        let basePath = self.client!.basePath;
        let localVariablePath = "/sms"
        let localVariableURLString = basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil
        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "phoneNumber": (wrappedValue: phoneNumber.encodeToJSON(), isExplode: true),
            "retrieveIfDoesNotExists": (wrappedValue: retrieveIfDoesNotExists.encodeToJSON(), isExplode: true),
            "sentId": (wrappedValue: sentId?.encodeToJSON(), isExplode: true),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        var localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        do {
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "header", name: "x-api-key", value: self.client!.apiKey, prefix: nil)
            try Authentication.setAuthenticationParameters(headers: &localVariableHeaderParameters, url: &localVariableUrlComponents, in: "", name: "", value: self.client!.bearerAuth, prefix: nil)
            let localVariableRequestBuilder: RequestBuilder<SMSPayload>.Type = SentdmAPI.requestBuilderFactory.getBuilder()
            let URLString = localVariableUrlComponents?.string ?? localVariableURLString
            return localVariableRequestBuilder.init(method: "GET", URLString: URLString, parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
        } catch {
            print("Error: \(error)")
        }
        fatalError("Error: Unable to send request to GET /sms")
    }

}