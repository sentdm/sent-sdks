# coding: utf-8

# flake8: noqa

"""
    Sent.dm Core API

    Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

    The version of the OpenAPI document: 1.1.0
    Contact: developers@sent.dm
    Created by: https://www.sent.dm/
"""

__version__ = "1.0.0"

# import ApiClient
from sentdm.api_client import ApiClient

# import Configuration
from sentdm.configuration import Configuration

# import exceptions
from sentdm.exceptions import OpenApiException
from sentdm.exceptions import ApiAttributeError
from sentdm.exceptions import ApiTypeError
from sentdm.exceptions import ApiValueError
from sentdm.exceptions import ApiKeyError
from sentdm.exceptions import ApiException

from sentdm.client import Sentdm
