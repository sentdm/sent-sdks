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
 * @interface WhatsAppPayloadAllOf
 */
export interface WhatsAppPayloadAllOf {
    /**
     * Unique WhatsApp identifier for the contact
     * @type {string}
     * @memberof WhatsAppPayloadAllOf
     */
    'whatsappId'?: string;
    /**
     * ISO country code of the phone number
     * @type {string}
     * @memberof WhatsAppPayloadAllOf
     */
    'countryCode'?: string;
    /**
     * Type of phone number (MOBILE, LANDLINE, etc)
     * @type {string}
     * @memberof WhatsAppPayloadAllOf
     */
    'numberType'?: WhatsAppPayloadAllOfNumberTypeEnum;
    /**
     * URL to the contact\'s WhatsApp profile picture
     * @type {string}
     * @memberof WhatsAppPayloadAllOf
     */
    'profilePicture'?: string;
    /**
     * Indicates if the number belongs to a WhatsApp Business account
     * @type {boolean}
     * @memberof WhatsAppPayloadAllOf
     */
    'isBusiness'?: boolean;
    /**
     * Indicates if the WhatsApp account is invalid or deactivated
     * @type {boolean}
     * @memberof WhatsAppPayloadAllOf
     */
    'invalidRecord'?: boolean;
}

type WhatsAppPayloadAllOfNumberTypeEnum = 'MOBILE' | 'LANDLINE' | 'VOIP' | 'UNKNOWN'


