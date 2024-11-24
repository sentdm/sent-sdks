/*
Sent.dm Core API

Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

The version of the OpenAPI document: 1.1.0
Contact: developers@sent.dm

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"


/**
 * 
 * @export
 * @interface SMSPayloadAllOf
 */
export interface SMSPayloadAllOf {
    /**
     * ISO country code for the phone number
     * @type {string}
     * @memberof SMSPayloadAllOf
     */
    'countryCode'?: string;
    /**
     * Indicates if the phone number is valid for SMS delivery
     * @type {boolean}
     * @memberof SMSPayloadAllOf
     */
    'validNumber'?: boolean;
    /**
     * Locally formatted version of the phone number
     * @type {string}
     * @memberof SMSPayloadAllOf
     */
    'nationalFormat'?: string;
    /**
     * Additional payload information in JSON format
     * @type {string}
     * @memberof SMSPayloadAllOf
     */
    'payload'?: string;
}
