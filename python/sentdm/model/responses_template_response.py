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


class ResponsesTemplateResponse(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Response model containing template details
    """


    class MetaOapg:
        
        class properties:
            id = schemas.UUIDSchema
            customerId = schemas.UUIDSchema
            name = schemas.StrSchema
            
            
            class category(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "transactional": "TRANSACTIONAL",
                        "marketing": "MARKETING",
                        "alert": "ALERT",
                    }
                
                @schemas.classproperty
                def TRANSACTIONAL(cls):
                    return cls("transactional")
                
                @schemas.classproperty
                def MARKETING(cls):
                    return cls("marketing")
                
                @schemas.classproperty
                def ALERT(cls):
                    return cls("alert")
            rawBody = schemas.StrSchema
            whatsappTemplateName = schemas.StrSchema
            
            
            class whatsappTemplateStatus(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "pending": "PENDING",
                        "approved": "APPROVED",
                        "rejected": "REJECTED",
                    }
                
                @schemas.classproperty
                def PENDING(cls):
                    return cls("pending")
                
                @schemas.classproperty
                def APPROVED(cls):
                    return cls("approved")
                
                @schemas.classproperty
                def REJECTED(cls):
                    return cls("rejected")
            createdAt = schemas.DateTimeSchema
            updatedAt = schemas.DateTimeSchema
            __annotations__ = {
                "id": id,
                "customerId": customerId,
                "name": name,
                "category": category,
                "rawBody": rawBody,
                "whatsappTemplateName": whatsappTemplateName,
                "whatsappTemplateStatus": whatsappTemplateStatus,
                "createdAt": createdAt,
                "updatedAt": updatedAt,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["customerId"]) -> MetaOapg.properties.customerId: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["category"]) -> MetaOapg.properties.category: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["rawBody"]) -> MetaOapg.properties.rawBody: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["whatsappTemplateName"]) -> MetaOapg.properties.whatsappTemplateName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["whatsappTemplateStatus"]) -> MetaOapg.properties.whatsappTemplateStatus: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["createdAt"]) -> MetaOapg.properties.createdAt: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["updatedAt"]) -> MetaOapg.properties.updatedAt: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "customerId", "name", "category", "rawBody", "whatsappTemplateName", "whatsappTemplateStatus", "createdAt", "updatedAt", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["customerId"]) -> typing.Union[MetaOapg.properties.customerId, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> typing.Union[MetaOapg.properties.name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["category"]) -> typing.Union[MetaOapg.properties.category, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["rawBody"]) -> typing.Union[MetaOapg.properties.rawBody, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["whatsappTemplateName"]) -> typing.Union[MetaOapg.properties.whatsappTemplateName, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["whatsappTemplateStatus"]) -> typing.Union[MetaOapg.properties.whatsappTemplateStatus, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["createdAt"]) -> typing.Union[MetaOapg.properties.createdAt, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["updatedAt"]) -> typing.Union[MetaOapg.properties.updatedAt, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "customerId", "name", "category", "rawBody", "whatsappTemplateName", "whatsappTemplateStatus", "createdAt", "updatedAt", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        customerId: typing.Union[MetaOapg.properties.customerId, str, uuid.UUID, schemas.Unset] = schemas.unset,
        name: typing.Union[MetaOapg.properties.name, str, schemas.Unset] = schemas.unset,
        category: typing.Union[MetaOapg.properties.category, str, schemas.Unset] = schemas.unset,
        rawBody: typing.Union[MetaOapg.properties.rawBody, str, schemas.Unset] = schemas.unset,
        whatsappTemplateName: typing.Union[MetaOapg.properties.whatsappTemplateName, str, schemas.Unset] = schemas.unset,
        whatsappTemplateStatus: typing.Union[MetaOapg.properties.whatsappTemplateStatus, str, schemas.Unset] = schemas.unset,
        createdAt: typing.Union[MetaOapg.properties.createdAt, str, datetime, schemas.Unset] = schemas.unset,
        updatedAt: typing.Union[MetaOapg.properties.updatedAt, str, datetime, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ResponsesTemplateResponse':
        return super().__new__(
            cls,
            *args,
            id=id,
            customerId=customerId,
            name=name,
            category=category,
            rawBody=rawBody,
            whatsappTemplateName=whatsappTemplateName,
            whatsappTemplateStatus=whatsappTemplateStatus,
            createdAt=createdAt,
            updatedAt=updatedAt,
            _configuration=_configuration,
            **kwargs,
        )
