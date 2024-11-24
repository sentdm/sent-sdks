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


class Contact(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Represents a contact in the Sent messaging platform with their communication preferences and channel availability
    """


    class MetaOapg:
        
        class properties:
            id = schemas.UUIDSchema
            phoneNumber = schemas.StrSchema
            countryCode = schemas.StrSchema
            nationalFormat = schemas.StrSchema
            availableChannels = schemas.StrSchema
            defaultChannel = schemas.StrSchema
            verified = schemas.BoolSchema
            createdAt = schemas.DateTimeSchema
            updatedAt = schemas.DateTimeSchema
            __annotations__ = {
                "id": id,
                "phoneNumber": phoneNumber,
                "countryCode": countryCode,
                "nationalFormat": nationalFormat,
                "availableChannels": availableChannels,
                "defaultChannel": defaultChannel,
                "verified": verified,
                "createdAt": createdAt,
                "updatedAt": updatedAt,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["phoneNumber"]) -> MetaOapg.properties.phoneNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["countryCode"]) -> MetaOapg.properties.countryCode: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["nationalFormat"]) -> MetaOapg.properties.nationalFormat: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["availableChannels"]) -> MetaOapg.properties.availableChannels: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["defaultChannel"]) -> MetaOapg.properties.defaultChannel: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["verified"]) -> MetaOapg.properties.verified: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["createdAt"]) -> MetaOapg.properties.createdAt: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["updatedAt"]) -> MetaOapg.properties.updatedAt: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "phoneNumber", "countryCode", "nationalFormat", "availableChannels", "defaultChannel", "verified", "createdAt", "updatedAt", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["phoneNumber"]) -> typing.Union[MetaOapg.properties.phoneNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["countryCode"]) -> typing.Union[MetaOapg.properties.countryCode, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["nationalFormat"]) -> typing.Union[MetaOapg.properties.nationalFormat, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["availableChannels"]) -> typing.Union[MetaOapg.properties.availableChannels, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["defaultChannel"]) -> typing.Union[MetaOapg.properties.defaultChannel, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["verified"]) -> typing.Union[MetaOapg.properties.verified, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["createdAt"]) -> typing.Union[MetaOapg.properties.createdAt, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["updatedAt"]) -> typing.Union[MetaOapg.properties.updatedAt, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "phoneNumber", "countryCode", "nationalFormat", "availableChannels", "defaultChannel", "verified", "createdAt", "updatedAt", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        phoneNumber: typing.Union[MetaOapg.properties.phoneNumber, str, schemas.Unset] = schemas.unset,
        countryCode: typing.Union[MetaOapg.properties.countryCode, str, schemas.Unset] = schemas.unset,
        nationalFormat: typing.Union[MetaOapg.properties.nationalFormat, str, schemas.Unset] = schemas.unset,
        availableChannels: typing.Union[MetaOapg.properties.availableChannels, str, schemas.Unset] = schemas.unset,
        defaultChannel: typing.Union[MetaOapg.properties.defaultChannel, str, schemas.Unset] = schemas.unset,
        verified: typing.Union[MetaOapg.properties.verified, bool, schemas.Unset] = schemas.unset,
        createdAt: typing.Union[MetaOapg.properties.createdAt, str, datetime, schemas.Unset] = schemas.unset,
        updatedAt: typing.Union[MetaOapg.properties.updatedAt, str, datetime, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Contact':
        return super().__new__(
            cls,
            *args,
            id=id,
            phoneNumber=phoneNumber,
            countryCode=countryCode,
            nationalFormat=nationalFormat,
            availableChannels=availableChannels,
            defaultChannel=defaultChannel,
            verified=verified,
            createdAt=createdAt,
            updatedAt=updatedAt,
            _configuration=_configuration,
            **kwargs,
        )
