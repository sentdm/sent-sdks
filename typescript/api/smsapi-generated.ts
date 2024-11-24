/* tslint:disable */
/* eslint-disable */
/*
Sent.dm Core API

Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

The version of the OpenAPI document: 1.1.0
Contact: developers@sent.dm

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/

import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction, isBrowser } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { SMSPayload } from '../models';
// @ts-ignore
import { SmsGetContactInfoResponse } from '../models';
import { paginate } from "../pagination/paginate";
import type * as buffer from "buffer"
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * SMSApi - axios parameter creator
 * @export
 */
export const SMSApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
         * @summary Retrieve SMS contact information and capabilities
         * @param {string} phoneNumber Target phone number in E.164 format (e.g., +1234567890)
         * @param {boolean} retrieveIfDoesNotExists When true, creates a new SMS contact if one doesn\&#39;t exist
         * @param {string} [sentId] Optional Sent platform identifier for existing contacts
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getContactInfo: async (phoneNumber: string, retrieveIfDoesNotExists: boolean, sentId?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'phoneNumber' is not null or undefined
            assertParamExists('getContactInfo', 'phoneNumber', phoneNumber)
            // verify required parameter 'retrieveIfDoesNotExists' is not null or undefined
            assertParamExists('getContactInfo', 'retrieveIfDoesNotExists', retrieveIfDoesNotExists)
            const localVarPath = `/sms`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication ApiKey required
            await setApiKeyToObject({ object: localVarHeaderParameter, key: "x-api-key", keyParamName: "apiKey", configuration })
            // authentication BearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)
            if (phoneNumber !== undefined) {
                localVarQueryParameter['phoneNumber'] = phoneNumber;
            }

            if (retrieveIfDoesNotExists !== undefined) {
                localVarQueryParameter['retrieveIfDoesNotExists'] = retrieveIfDoesNotExists;
            }

            if (sentId !== undefined) {
                localVarQueryParameter['sentId'] = sentId;
            }


    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration,
                pathTemplate: '/sms',
                httpMethod: 'GET'
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * SMSApi - functional programming interface
 * @export
 */
export const SMSApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = SMSApiAxiosParamCreator(configuration)
    return {
        /**
         * Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
         * @summary Retrieve SMS contact information and capabilities
         * @param {SMSApiGetContactInfoRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getContactInfo(requestParameters: SMSApiGetContactInfoRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<SMSPayload>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getContactInfo(requestParameters.phoneNumber, requestParameters.retrieveIfDoesNotExists, requestParameters.sentId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * SMSApi - factory interface
 * @export
 */
export const SMSApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = SMSApiFp(configuration)
    return {
        /**
         * Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
         * @summary Retrieve SMS contact information and capabilities
         * @param {SMSApiGetContactInfoRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getContactInfo(requestParameters: SMSApiGetContactInfoRequest, options?: AxiosRequestConfig): AxiosPromise<SMSPayload> {
            return localVarFp.getContactInfo(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for getContactInfo operation in SMSApi.
 * @export
 * @interface SMSApiGetContactInfoRequest
 */
export type SMSApiGetContactInfoRequest = {
    
    /**
    * Target phone number in E.164 format (e.g., +1234567890)
    * @type {string}
    * @memberof SMSApiGetContactInfo
    */
    readonly phoneNumber: string
    
    /**
    * When true, creates a new SMS contact if one doesn\'t exist
    * @type {boolean}
    * @memberof SMSApiGetContactInfo
    */
    readonly retrieveIfDoesNotExists: boolean
    
    /**
    * Optional Sent platform identifier for existing contacts
    * @type {string}
    * @memberof SMSApiGetContactInfo
    */
    readonly sentId?: string
    
}

/**
 * SMSApiGenerated - object-oriented interface
 * @export
 * @class SMSApiGenerated
 * @extends {BaseAPI}
 */
export class SMSApiGenerated extends BaseAPI {
    /**
     * Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
     * @summary Retrieve SMS contact information and capabilities
     * @param {SMSApiGetContactInfoRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof SMSApiGenerated
     */
    public getContactInfo(requestParameters: SMSApiGetContactInfoRequest, options?: AxiosRequestConfig) {
        return SMSApiFp(this.configuration).getContactInfo(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
