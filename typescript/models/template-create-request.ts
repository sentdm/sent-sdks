/*
Sent.dm Core API

Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

The version of the OpenAPI document: 1.1.0
Contact: developers@sent.dm

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"


/**
 * Request model for creating a new message template
 * @export
 * @interface TemplateCreateRequest
 */
export interface TemplateCreateRequest {
    /**
     * Unique identifier of the customer creating the template
     * @type {string}
     * @memberof TemplateCreateRequest
     */
    'customerId': string;
    /**
     * Name of the template for identification purposes
     * @type {string}
     * @memberof TemplateCreateRequest
     */
    'name': string;
}
