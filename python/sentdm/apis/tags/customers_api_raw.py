# coding: utf-8

"""
    Sent.dm Core API

    Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

    The version of the OpenAPI document: 1.1.0
    Contact: developers@sent.dm
    Created by: https://www.sent.dm/
"""

from sentdm.paths.customers.post import CreateCustomerRaw
from sentdm.paths.customers_id.delete import DeleteCustomerRaw
from sentdm.paths.customers.get import GetAllCustomersRaw
from sentdm.paths.customers_id.get import GetCustomerByIdRaw
from sentdm.paths.customers_id.put import UpdateCustomerRaw


class CustomersApiRaw(
    CreateCustomerRaw,
    DeleteCustomerRaw,
    GetAllCustomersRaw,
    GetCustomerByIdRaw,
    UpdateCustomerRaw,
):
    """NOTE:
    This class is auto generated by Konfig (https://konfigthis.com)
    """
    pass
