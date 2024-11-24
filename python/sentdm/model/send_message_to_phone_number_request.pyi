# coding: utf-8

"""
    Sent.dm Core API

    Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

    The version of the OpenAPI document: 1.1.0
    Contact: developers@sent.dm
    Created by: https://www.sent.dm/
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from sentdm import schemas  # noqa: F401


class SendMessageToPhoneNumberRequest(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Request model for sending a message to a phone number using a template
    """


    class MetaOapg:
        required = {
            "phoneNumber",
            "customerId",
            "templateId",
        }
        
        class properties:
            customerId = schemas.UUIDSchema
            phoneNumber = schemas.StrSchema
            templateId = schemas.UUIDSchema
            __annotations__ = {
                "customerId": customerId,
                "phoneNumber": phoneNumber,
                "templateId": templateId,
            }
    
    phoneNumber: MetaOapg.properties.phoneNumber
    customerId: MetaOapg.properties.customerId
    templateId: MetaOapg.properties.templateId
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["customerId"]) -> MetaOapg.properties.customerId: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["phoneNumber"]) -> MetaOapg.properties.phoneNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["templateId"]) -> MetaOapg.properties.templateId: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["customerId", "phoneNumber", "templateId", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["customerId"]) -> MetaOapg.properties.customerId: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["phoneNumber"]) -> MetaOapg.properties.phoneNumber: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["templateId"]) -> MetaOapg.properties.templateId: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["customerId", "phoneNumber", "templateId", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        phoneNumber: typing.Union[MetaOapg.properties.phoneNumber, str, ],
        customerId: typing.Union[MetaOapg.properties.customerId, str, uuid.UUID, ],
        templateId: typing.Union[MetaOapg.properties.templateId, str, uuid.UUID, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'SendMessageToPhoneNumberRequest':
        return super().__new__(
            cls,
            *args,
            phoneNumber=phoneNumber,
            customerId=customerId,
            templateId=templateId,
            _configuration=_configuration,
            **kwargs,
        )
