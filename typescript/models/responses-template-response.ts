/*
Sent.dm Core API

Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

The version of the OpenAPI document: 1.1.0
Contact: developers@sent.dm

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"


/**
 * Response model containing template details
 * @export
 * @interface ResponsesTemplateResponse
 */
export interface ResponsesTemplateResponse {
    /**
     * Unique identifier of the template
     * @type {string}
     * @memberof ResponsesTemplateResponse
     */
    'id'?: string;
    /**
     * Customer ID associated with the template
     * @type {string}
     * @memberof ResponsesTemplateResponse
     */
    'customerId'?: string;
    /**
     * Template name
     * @type {string}
     * @memberof ResponsesTemplateResponse
     */
    'name'?: string;
    /**
     * Category of the template (e.g., transactional, marketing)
     * @type {string}
     * @memberof ResponsesTemplateResponse
     */
    'category'?: ResponsesTemplateResponseCategoryEnum;
    /**
     * Template content with variable placeholders
     * @type {string}
     * @memberof ResponsesTemplateResponse
     */
    'rawBody'?: string;
    /**
     * Associated WhatsApp template name if applicable
     * @type {string}
     * @memberof ResponsesTemplateResponse
     */
    'whatsappTemplateName'?: string;
    /**
     * Approval status of WhatsApp template
     * @type {string}
     * @memberof ResponsesTemplateResponse
     */
    'whatsappTemplateStatus'?: ResponsesTemplateResponseWhatsappTemplateStatusEnum;
    /**
     * Template creation timestamp
     * @type {string}
     * @memberof ResponsesTemplateResponse
     */
    'createdAt'?: string;
    /**
     * Last template update timestamp
     * @type {string}
     * @memberof ResponsesTemplateResponse
     */
    'updatedAt'?: string;
}

type ResponsesTemplateResponseCategoryEnum = 'transactional' | 'marketing' | 'alert'
type ResponsesTemplateResponseWhatsappTemplateStatusEnum = 'pending' | 'approved' | 'rejected'


