# coding: utf-8

"""
    Sent.dm Core API

    Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

    The version of the OpenAPI document: 1.1.0
    Contact: developers@sent.dm
    Created by: https://www.sent.dm/
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
from pydantic import RootModel
from sentdm.request_before_hook import request_before_hook
import json
from urllib3._collections import HTTPHeaderDict

from sentdm.api_response import AsyncGeneratorResponse
from sentdm import api_client, exceptions
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

from sentdm.model.customers_update_customer_request import CustomersUpdateCustomerRequest as CustomersUpdateCustomerRequestSchema
from sentdm.model.customer import Customer as CustomerSchema

from sentdm.type.customer import Customer
from sentdm.type.customers_update_customer_request import CustomersUpdateCustomerRequest

from ...api_client import Dictionary
from sentdm.pydantic.customer import Customer as CustomerPydantic
from sentdm.pydantic.customers_update_customer_request import CustomersUpdateCustomerRequest as CustomersUpdateCustomerRequestPydantic

# Path params
IdSchema = schemas.UUIDSchema
RequestRequiredPathParams = typing_extensions.TypedDict(
    'RequestRequiredPathParams',
    {
        'id': typing.Union[IdSchema, str, uuid.UUID, ],
    }
)
RequestOptionalPathParams = typing_extensions.TypedDict(
    'RequestOptionalPathParams',
    {
    },
    total=False
)


class RequestPathParams(RequestRequiredPathParams, RequestOptionalPathParams):
    pass


request_path_id = api_client.PathParameter(
    name="id",
    style=api_client.ParameterStyle.SIMPLE,
    schema=IdSchema,
    required=True,
)
# body param
SchemaForRequestBodyApplicationJson = CustomersUpdateCustomerRequestSchema


request_body_customers_update_customer_request = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=SchemaForRequestBodyApplicationJson),
    },
    required=True,
)
SchemaFor200ResponseBodyApplicationJson = CustomerSchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: Customer


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: Customer


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)


@dataclass
class ApiResponseFor401(api_client.ApiResponse):
    body: schemas.Unset = schemas.unset


@dataclass
class ApiResponseFor401Async(api_client.AsyncApiResponse):
    body: schemas.Unset = schemas.unset


_response_for_401 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor401,
    response_cls_async=ApiResponseFor401Async,
)


@dataclass
class ApiResponseFor404(api_client.ApiResponse):
    body: schemas.Unset = schemas.unset


@dataclass
class ApiResponseFor404Async(api_client.AsyncApiResponse):
    body: schemas.Unset = schemas.unset


_response_for_404 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor404,
    response_cls_async=ApiResponseFor404Async,
)
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):

    def _update_customer_mapped_args(
        self,
        id: str,
        name: typing.Optional[str] = None,
        sending_phone_number: typing.Optional[str] = None,
        sms_messaging_profile_id: typing.Optional[str] = None,
        sms_bearer_token: typing.Optional[str] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _path_params = {}
        _body = {}
        if name is not None:
            _body["name"] = name
        if sending_phone_number is not None:
            _body["sendingPhoneNumber"] = sending_phone_number
        if sms_messaging_profile_id is not None:
            _body["smsMessagingProfileId"] = sms_messaging_profile_id
        if sms_bearer_token is not None:
            _body["smsBearerToken"] = sms_bearer_token
        args.body = _body
        if id is not None:
            _path_params["id"] = id
        args.path = _path_params
        return args

    async def _aupdate_customer_oapg(
        self,
        body: typing.Any = None,
            path_params: typing.Optional[dict] = {},
        skip_deserialization: bool = True,
        timeout: typing.Optional[typing.Union[float, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json',
        stream: bool = False,
        **kwargs,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        """
        Update customer information
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestPathParams, path_params)
        used_path = path.value
    
        _path_params = {}
        for parameter in (
            request_path_id,
        ):
            parameter_data = path_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _path_params.update(serialized_data)
    
        for k, v in _path_params.items():
            used_path = used_path.replace('{%s}' % k, v)
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
        method = 'put'.upper()
        _headers.add('Content-Type', content_type)
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        request_before_hook(
            resource_path=used_path,
            method=method,
            configuration=self.api_client.configuration,
            path_template='/customers/{id}',
            body=body,
            auth_settings=_auth,
            headers=_headers,
        )
        serialized_data = request_body_customers_update_customer_request.serialize(body, content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']
    
        response = await self.api_client.async_call_api(
            resource_path=used_path,
            method=method,
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
            auth_settings=_auth,
            timeout=timeout,
            **kwargs
        )
    
        if stream:
            if not 200 <= response.http_response.status <= 299:
                body = (await response.http_response.content.read()).decode("utf-8")
                raise exceptions.ApiStreamingException(
                    status=response.http_response.status,
                    reason=response.http_response.reason,
                    body=body,
                )
    
            async def stream_iterator():
                """
                iterates over response.http_response.content and closes connection once iteration has finished
                """
                async for line in response.http_response.content:
                    if line == b'\r\n':
                        continue
                    yield line
                response.http_response.close()
                await response.session.close()
            return AsyncGeneratorResponse(
                content=stream_iterator(),
                headers=response.http_response.headers,
                status=response.http_response.status,
                response=response.http_response
            )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = await response_for_status.deserialize_async(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserializationAsync(
                body=await response.http_response.json() if is_json else await response.http_response.text(),
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        # cleanup session / response
        response.http_response.close()
        await response.session.close()
    
        return api_response


    def _update_customer_oapg(
        self,
        body: typing.Any = None,
            path_params: typing.Optional[dict] = {},
        skip_deserialization: bool = True,
        timeout: typing.Optional[typing.Union[float, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json',
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """
        Update customer information
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestPathParams, path_params)
        used_path = path.value
    
        _path_params = {}
        for parameter in (
            request_path_id,
        ):
            parameter_data = path_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _path_params.update(serialized_data)
    
        for k, v in _path_params.items():
            used_path = used_path.replace('{%s}' % k, v)
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
        method = 'put'.upper()
        _headers.add('Content-Type', content_type)
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        request_before_hook(
            resource_path=used_path,
            method=method,
            configuration=self.api_client.configuration,
            path_template='/customers/{id}',
            body=body,
            auth_settings=_auth,
            headers=_headers,
        )
        serialized_data = request_body_customers_update_customer_request.serialize(body, content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']
    
        response = self.api_client.call_api(
            resource_path=used_path,
            method=method,
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
            auth_settings=_auth,
            timeout=timeout,
        )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = response_for_status.deserialize(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserialization(
                body=json.loads(response.http_response.data) if is_json else response.http_response.data,
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        return api_response


class UpdateCustomerRaw(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def aupdate_customer(
        self,
        id: str,
        name: typing.Optional[str] = None,
        sending_phone_number: typing.Optional[str] = None,
        sms_messaging_profile_id: typing.Optional[str] = None,
        sms_bearer_token: typing.Optional[str] = None,
        **kwargs,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._update_customer_mapped_args(
            id=id,
            name=name,
            sending_phone_number=sending_phone_number,
            sms_messaging_profile_id=sms_messaging_profile_id,
            sms_bearer_token=sms_bearer_token,
        )
        return await self._aupdate_customer_oapg(
            body=args.body,
            path_params=args.path,
            **kwargs,
        )
    
    def update_customer(
        self,
        id: str,
        name: typing.Optional[str] = None,
        sending_phone_number: typing.Optional[str] = None,
        sms_messaging_profile_id: typing.Optional[str] = None,
        sms_bearer_token: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """ Updates an existing customer's information including messaging channel configurations. All fields in the request body will override existing values. """
        args = self._update_customer_mapped_args(
            id=id,
            name=name,
            sending_phone_number=sending_phone_number,
            sms_messaging_profile_id=sms_messaging_profile_id,
            sms_bearer_token=sms_bearer_token,
        )
        return self._update_customer_oapg(
            body=args.body,
            path_params=args.path,
        )

class UpdateCustomer(BaseApi):

    async def aupdate_customer(
        self,
        id: str,
        name: typing.Optional[str] = None,
        sending_phone_number: typing.Optional[str] = None,
        sms_messaging_profile_id: typing.Optional[str] = None,
        sms_bearer_token: typing.Optional[str] = None,
        validate: bool = False,
        **kwargs,
    ) -> CustomerPydantic:
        raw_response = await self.raw.aupdate_customer(
            id=id,
            name=name,
            sending_phone_number=sending_phone_number,
            sms_messaging_profile_id=sms_messaging_profile_id,
            sms_bearer_token=sms_bearer_token,
            **kwargs,
        )
        if validate:
            return CustomerPydantic(**raw_response.body)
        return api_client.construct_model_instance(CustomerPydantic, raw_response.body)
    
    
    def update_customer(
        self,
        id: str,
        name: typing.Optional[str] = None,
        sending_phone_number: typing.Optional[str] = None,
        sms_messaging_profile_id: typing.Optional[str] = None,
        sms_bearer_token: typing.Optional[str] = None,
        validate: bool = False,
    ) -> CustomerPydantic:
        raw_response = self.raw.update_customer(
            id=id,
            name=name,
            sending_phone_number=sending_phone_number,
            sms_messaging_profile_id=sms_messaging_profile_id,
            sms_bearer_token=sms_bearer_token,
        )
        if validate:
            return CustomerPydantic(**raw_response.body)
        return api_client.construct_model_instance(CustomerPydantic, raw_response.body)


class ApiForput(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def aput(
        self,
        id: str,
        name: typing.Optional[str] = None,
        sending_phone_number: typing.Optional[str] = None,
        sms_messaging_profile_id: typing.Optional[str] = None,
        sms_bearer_token: typing.Optional[str] = None,
        **kwargs,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._update_customer_mapped_args(
            id=id,
            name=name,
            sending_phone_number=sending_phone_number,
            sms_messaging_profile_id=sms_messaging_profile_id,
            sms_bearer_token=sms_bearer_token,
        )
        return await self._aupdate_customer_oapg(
            body=args.body,
            path_params=args.path,
            **kwargs,
        )
    
    def put(
        self,
        id: str,
        name: typing.Optional[str] = None,
        sending_phone_number: typing.Optional[str] = None,
        sms_messaging_profile_id: typing.Optional[str] = None,
        sms_bearer_token: typing.Optional[str] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """ Updates an existing customer's information including messaging channel configurations. All fields in the request body will override existing values. """
        args = self._update_customer_mapped_args(
            id=id,
            name=name,
            sending_phone_number=sending_phone_number,
            sms_messaging_profile_id=sms_messaging_profile_id,
            sms_bearer_token=sms_bearer_token,
        )
        return self._update_customer_oapg(
            body=args.body,
            path_params=args.path,
        )

