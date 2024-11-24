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


class RequiredSmsGetContactInfoResponse(TypedDict):
    pass

class OptionalSmsGetContactInfoResponse(TypedDict, total=False):
    error: str

class SmsGetContactInfoResponse(RequiredSmsGetContactInfoResponse, OptionalSmsGetContactInfoResponse):
    pass
