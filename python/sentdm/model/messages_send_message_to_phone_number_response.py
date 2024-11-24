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


class MessagesSendMessageToPhoneNumberResponse(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            messageId = schemas.UUIDSchema
            
            
            class status(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "queued": "QUEUED",
                        "sending": "SENDING",
                        "delivered": "DELIVERED",
                    }
                
                @schemas.classproperty
                def QUEUED(cls):
                    return cls("queued")
                
                @schemas.classproperty
                def SENDING(cls):
                    return cls("sending")
                
                @schemas.classproperty
                def DELIVERED(cls):
                    return cls("delivered")
            
            
            class channel(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "sms": "SMS",
                        "whatsapp": "WHATSAPP",
                    }
                
                @schemas.classproperty
                def SMS(cls):
                    return cls("sms")
                
                @schemas.classproperty
                def WHATSAPP(cls):
                    return cls("whatsapp")
            contactId = schemas.UUIDSchema
            __annotations__ = {
                "messageId": messageId,
                "status": status,
                "channel": channel,
                "contactId": contactId,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["messageId"]) -> MetaOapg.properties.messageId: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.properties.status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["channel"]) -> MetaOapg.properties.channel: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["contactId"]) -> MetaOapg.properties.contactId: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["messageId", "status", "channel", "contactId", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["messageId"]) -> typing.Union[MetaOapg.properties.messageId, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> typing.Union[MetaOapg.properties.status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["channel"]) -> typing.Union[MetaOapg.properties.channel, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["contactId"]) -> typing.Union[MetaOapg.properties.contactId, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["messageId", "status", "channel", "contactId", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        messageId: typing.Union[MetaOapg.properties.messageId, str, uuid.UUID, schemas.Unset] = schemas.unset,
        status: typing.Union[MetaOapg.properties.status, str, schemas.Unset] = schemas.unset,
        channel: typing.Union[MetaOapg.properties.channel, str, schemas.Unset] = schemas.unset,
        contactId: typing.Union[MetaOapg.properties.contactId, str, uuid.UUID, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'MessagesSendMessageToPhoneNumberResponse':
        return super().__new__(
            cls,
            *args,
            messageId=messageId,
            status=status,
            channel=channel,
            contactId=contactId,
            _configuration=_configuration,
            **kwargs,
        )
