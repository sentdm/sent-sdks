# coding: utf-8

"""
    Sent.dm Core API

    Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

    The version of the OpenAPI document: 1.1.0
    Contact: developers@sent.dm
    Created by: https://www.sent.dm/
"""

from datetime import datetime, date
import typing
from enum import Enum
from typing_extensions import TypedDict, Literal, TYPE_CHECKING


class RequiredResponsesTemplateResponse(TypedDict):
    pass

class OptionalResponsesTemplateResponse(TypedDict, total=False):
    # Unique identifier of the template
    id: str

    # Customer ID associated with the template
    customerId: str

    # Template name
    name: str

    # Category of the template (e.g., transactional, marketing)
    category: str

    # Template content with variable placeholders
    rawBody: str

    # Associated WhatsApp template name if applicable
    whatsappTemplateName: str

    # Approval status of WhatsApp template
    whatsappTemplateStatus: str

    # Template creation timestamp
    createdAt: datetime

    # Last template update timestamp
    updatedAt: datetime

class ResponsesTemplateResponse(RequiredResponsesTemplateResponse, OptionalResponsesTemplateResponse):
    pass
