/*
Sent.dm Core API

Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

API version: 1.1.0
Contact: developers@sent.dm
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package sentdm

import (
	"encoding/json"
)

// SMSPayload Detailed SMS contact information including validation and formatting details
type SMSPayload struct {
	// Unique identifier for the phone number record
	Id *string `json:"id,omitempty"`
	// Sent platform identifier
	SentId *string `json:"sentId,omitempty"`
	// Phone number in E.164 format
	PhoneNumber *string `json:"phoneNumber,omitempty"`
	// ISO country code for the phone number
	CountryCode *string `json:"countryCode,omitempty"`
	// Indicates if the phone number is valid for SMS delivery
	ValidNumber *bool `json:"validNumber,omitempty"`
	// Locally formatted version of the phone number
	NationalFormat *string `json:"nationalFormat,omitempty"`
	// Additional payload information in JSON format
	Payload *string `json:"payload,omitempty"`
}

// NewSMSPayload instantiates a new SMSPayload object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSMSPayload() *SMSPayload {
	this := SMSPayload{}
	return &this
}

// NewSMSPayloadWithDefaults instantiates a new SMSPayload object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSMSPayloadWithDefaults() *SMSPayload {
	this := SMSPayload{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *SMSPayload) GetId() string {
	if o == nil || isNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SMSPayload) GetIdOk() (*string, bool) {
	if o == nil || isNil(o.Id) {
    return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *SMSPayload) HasId() bool {
	if o != nil && !isNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *SMSPayload) SetId(v string) {
	o.Id = &v
}

// GetSentId returns the SentId field value if set, zero value otherwise.
func (o *SMSPayload) GetSentId() string {
	if o == nil || isNil(o.SentId) {
		var ret string
		return ret
	}
	return *o.SentId
}

// GetSentIdOk returns a tuple with the SentId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SMSPayload) GetSentIdOk() (*string, bool) {
	if o == nil || isNil(o.SentId) {
    return nil, false
	}
	return o.SentId, true
}

// HasSentId returns a boolean if a field has been set.
func (o *SMSPayload) HasSentId() bool {
	if o != nil && !isNil(o.SentId) {
		return true
	}

	return false
}

// SetSentId gets a reference to the given string and assigns it to the SentId field.
func (o *SMSPayload) SetSentId(v string) {
	o.SentId = &v
}

// GetPhoneNumber returns the PhoneNumber field value if set, zero value otherwise.
func (o *SMSPayload) GetPhoneNumber() string {
	if o == nil || isNil(o.PhoneNumber) {
		var ret string
		return ret
	}
	return *o.PhoneNumber
}

// GetPhoneNumberOk returns a tuple with the PhoneNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SMSPayload) GetPhoneNumberOk() (*string, bool) {
	if o == nil || isNil(o.PhoneNumber) {
    return nil, false
	}
	return o.PhoneNumber, true
}

// HasPhoneNumber returns a boolean if a field has been set.
func (o *SMSPayload) HasPhoneNumber() bool {
	if o != nil && !isNil(o.PhoneNumber) {
		return true
	}

	return false
}

// SetPhoneNumber gets a reference to the given string and assigns it to the PhoneNumber field.
func (o *SMSPayload) SetPhoneNumber(v string) {
	o.PhoneNumber = &v
}

// GetCountryCode returns the CountryCode field value if set, zero value otherwise.
func (o *SMSPayload) GetCountryCode() string {
	if o == nil || isNil(o.CountryCode) {
		var ret string
		return ret
	}
	return *o.CountryCode
}

// GetCountryCodeOk returns a tuple with the CountryCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SMSPayload) GetCountryCodeOk() (*string, bool) {
	if o == nil || isNil(o.CountryCode) {
    return nil, false
	}
	return o.CountryCode, true
}

// HasCountryCode returns a boolean if a field has been set.
func (o *SMSPayload) HasCountryCode() bool {
	if o != nil && !isNil(o.CountryCode) {
		return true
	}

	return false
}

// SetCountryCode gets a reference to the given string and assigns it to the CountryCode field.
func (o *SMSPayload) SetCountryCode(v string) {
	o.CountryCode = &v
}

// GetValidNumber returns the ValidNumber field value if set, zero value otherwise.
func (o *SMSPayload) GetValidNumber() bool {
	if o == nil || isNil(o.ValidNumber) {
		var ret bool
		return ret
	}
	return *o.ValidNumber
}

// GetValidNumberOk returns a tuple with the ValidNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SMSPayload) GetValidNumberOk() (*bool, bool) {
	if o == nil || isNil(o.ValidNumber) {
    return nil, false
	}
	return o.ValidNumber, true
}

// HasValidNumber returns a boolean if a field has been set.
func (o *SMSPayload) HasValidNumber() bool {
	if o != nil && !isNil(o.ValidNumber) {
		return true
	}

	return false
}

// SetValidNumber gets a reference to the given bool and assigns it to the ValidNumber field.
func (o *SMSPayload) SetValidNumber(v bool) {
	o.ValidNumber = &v
}

// GetNationalFormat returns the NationalFormat field value if set, zero value otherwise.
func (o *SMSPayload) GetNationalFormat() string {
	if o == nil || isNil(o.NationalFormat) {
		var ret string
		return ret
	}
	return *o.NationalFormat
}

// GetNationalFormatOk returns a tuple with the NationalFormat field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SMSPayload) GetNationalFormatOk() (*string, bool) {
	if o == nil || isNil(o.NationalFormat) {
    return nil, false
	}
	return o.NationalFormat, true
}

// HasNationalFormat returns a boolean if a field has been set.
func (o *SMSPayload) HasNationalFormat() bool {
	if o != nil && !isNil(o.NationalFormat) {
		return true
	}

	return false
}

// SetNationalFormat gets a reference to the given string and assigns it to the NationalFormat field.
func (o *SMSPayload) SetNationalFormat(v string) {
	o.NationalFormat = &v
}

// GetPayload returns the Payload field value if set, zero value otherwise.
func (o *SMSPayload) GetPayload() string {
	if o == nil || isNil(o.Payload) {
		var ret string
		return ret
	}
	return *o.Payload
}

// GetPayloadOk returns a tuple with the Payload field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SMSPayload) GetPayloadOk() (*string, bool) {
	if o == nil || isNil(o.Payload) {
    return nil, false
	}
	return o.Payload, true
}

// HasPayload returns a boolean if a field has been set.
func (o *SMSPayload) HasPayload() bool {
	if o != nil && !isNil(o.Payload) {
		return true
	}

	return false
}

// SetPayload gets a reference to the given string and assigns it to the Payload field.
func (o *SMSPayload) SetPayload(v string) {
	o.Payload = &v
}

func (o SMSPayload) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !isNil(o.SentId) {
		toSerialize["sentId"] = o.SentId
	}
	if !isNil(o.PhoneNumber) {
		toSerialize["phoneNumber"] = o.PhoneNumber
	}
	if !isNil(o.CountryCode) {
		toSerialize["countryCode"] = o.CountryCode
	}
	if !isNil(o.ValidNumber) {
		toSerialize["validNumber"] = o.ValidNumber
	}
	if !isNil(o.NationalFormat) {
		toSerialize["nationalFormat"] = o.NationalFormat
	}
	if !isNil(o.Payload) {
		toSerialize["payload"] = o.Payload
	}
	return json.Marshal(toSerialize)
}

type NullableSMSPayload struct {
	value *SMSPayload
	isSet bool
}

func (v NullableSMSPayload) Get() *SMSPayload {
	return v.value
}

func (v *NullableSMSPayload) Set(val *SMSPayload) {
	v.value = val
	v.isSet = true
}

func (v NullableSMSPayload) IsSet() bool {
	return v.isSet
}

func (v *NullableSMSPayload) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSMSPayload(val *SMSPayload) *NullableSMSPayload {
	return &NullableSMSPayload{value: val, isSet: true}
}

func (v NullableSMSPayload) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSMSPayload) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

