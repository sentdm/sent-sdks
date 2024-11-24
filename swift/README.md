# Swift API Client for Sentdm<a id="swift-api-client-for-sentdm"></a>

Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

## Table of Contents<a id="table-of-contents"></a>

<!-- toc -->

- [Installation](#installation)
  * [Swift Package Manager](#swift-package-manager)
  * [Carthage](#carthage)
  * [CocoaPods](#cocoapods)
- [Getting Started](#getting-started)
- [Reference](#reference)
  * [`sentdm.contact.getContactById`](#sentdmcontactgetcontactbyid)
  * [`sentdm.contact.getContactByPhone`](#sentdmcontactgetcontactbyphone)
  * [`sentdm.customers.createCustomer`](#sentdmcustomerscreatecustomer)
  * [`sentdm.customers.deleteCustomer`](#sentdmcustomersdeletecustomer)
  * [`sentdm.customers.getAllCustomers`](#sentdmcustomersgetallcustomers)
  * [`sentdm.customers.getCustomerById`](#sentdmcustomersgetcustomerbyid)
  * [`sentdm.customers.updateCustomer`](#sentdmcustomersupdatecustomer)
  * [`sentdm.messages.sendMessageToContact`](#sentdmmessagessendmessagetocontact)
  * [`sentdm.messages.sendMessageToPhoneNumber`](#sentdmmessagessendmessagetophonenumber)
  * [`sentdm.sMS.getContactInfo`](#sentdmsmsgetcontactinfo)
  * [`sentdm.templates.createTemplate`](#sentdmtemplatescreatetemplate)
  * [`sentdm.templates.getTemplatesForCustomer`](#sentdmtemplatesgettemplatesforcustomer)
  * [`sentdm.whatsapp.getWhatsappContact`](#sentdmwhatsappgetwhatsappcontact)

<!-- tocstop -->

## Installation<a id="installation"></a>


### Swift Package Manager<a id="swift-package-manager"></a>

1. In Xcode, select *File > Add Packages…* and enter `https://github.com/sentdm/sent-sdks/tree/main/swift` as the repository URL.
1. Select the latest version number from our [tags page](https://github.com/sentdm/sent-sdks/tree/main/swift/tags).
1. Add the *Sentdm* product to the [target of your app](https://developer.apple.com/documentation/swift_packages/adding_package_dependencies_to_your_app).

### Carthage<a id="carthage"></a>

1. Add this line to your `Cartfile`:
```shell
github "sentdm/sent-sdks/tree/main/swift"
```
2. Follow the [Carthage installation instructions](https://github.com/Carthage/Carthage#if-youre-building-for-ios-tvos-or-watchos).
3. In the future, to update to the latest version of the SDK, run the following command: `carthage update sent-sdks/tree/main/swift`

### CocoaPods<a id="cocoapods"></a>

1. Add `source 'https://github.com/CocoaPods/Specs.git'` to your `Podfile`
2. Add `pod 'Sentdm', '~> 1.0.0'` to your `Podfile`

Your `Podfile` should look like:
```ruby
# Podfile
source 'https://github.com/CocoaPods/Specs.git'

target 'Example' do
  pod 'Sentdm', '~> 1.0.0'
end
```
3. Run `pod install`

```shell
❯ pod install
Analyzing dependencies
Downloading dependencies
Installing Sentdm 1.0.0
Generating Pods project
Integrating client project
Pod installation complete! There is 1 dependency from the Podfile and 2 total pods installed.
```

4. In the future, to update to the latest version of the SDK, run: `pod update Sentdm`

## Getting Started<a id="getting-started"></a>

```swift
import Sentdm

let sentdm = SentdmClient(
    apiKey: "X_API_KEY",
    // Defining the base path is optional and defaults to http://localhost
    // basePath: "http://localhost"
)

let customerId = UUID().uuidString
let id = UUID().uuidString
let getContactByIdResponse = try await sentdm.contact.getContactById(
    customerId: customerId,
    id: id
)
```

## Reference<a id="reference"></a>


### `sentdm.contact.getContactById`<a id="sentdmcontactgetcontactbyid"></a>

Fetches detailed contact information including available messaging channels and verification status. Use this endpoint when you need to look up a specific contact using their unique identifier.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let customerId = UUID().uuidString
let id = UUID().uuidString
let getContactByIdResponse = try await sentdm.contact.getContactById(
    customerId: customerId,
    id: id
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### customerId: `String`<a id="customerid-string"></a>

Unique identifier of the customer account


##### id: `String`<a id="id-string"></a>

Unique identifier of the contact


#### 🔄 Return<a id="🔄-return"></a>

[Contact](./Sentdm/Models/Contact.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/contact/{customerId}/id/{id}` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.contact.getContactByPhone`<a id="sentdmcontactgetcontactbyphone"></a>

Looks up contact information using a phone number. This endpoint is useful when you need to find a contact's details but only have their phone number. It returns the same detailed information as the ID-based lookup.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let customerId = UUID().uuidString
let phoneNumber = "phoneNumber_example"
let getContactByPhoneResponse = try await sentdm.contact.getContactByPhone(
    customerId: customerId,
    phoneNumber: phoneNumber
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### customerId: `String`<a id="customerid-string"></a>

Unique identifier of the customer account


##### phoneNumber: `String`<a id="phonenumber-string"></a>

Phone number in E.164 format (e.g., +1234567890)


#### 🔄 Return<a id="🔄-return"></a>

[Contact](./Sentdm/Models/Contact.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/contact/{customerId}/phone/{phoneNumber}` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.customers.createCustomer`<a id="sentdmcustomerscreatecustomer"></a>

Creates a new customer account in the Sent platform. This endpoint initializes a new customer profile with basic information and returns the created customer details including generated IDs and credentials for various messaging channels.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let createCustomerResponse = try await sentdm.customers.createCustomer(
)
```

#### 🔄 Return<a id="🔄-return"></a>

[Customer](./Sentdm/Models/Customer.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/customers` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.customers.deleteCustomer`<a id="sentdmcustomersdeletecustomer"></a>

Permanently deletes a customer and all associated data. This action cannot be undone. All active services for this customer will be terminated.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let id = UUID().uuidString
let deleteCustomerResponse = try await sentdm.customers.deleteCustomer(
    id: id
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### id: `String`<a id="id-string"></a>

Unique identifier of the customer to delete


#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/customers/{id}` `DELETE`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.customers.getAllCustomers`<a id="sentdmcustomersgetallcustomers"></a>

Returns a paginated list of all customers. Use page and pageSize parameters to control the number of results returned. Results are sorted by creation date in descending order.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let page = 987
let pageSize = 987
let getAllCustomersResponse = try await sentdm.customers.getAllCustomers(
    page: page,
    pageSize: pageSize
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### page: `Int`<a id="page-int"></a>

Page number to retrieve (starts from 1)


##### pageSize: `Int`<a id="pagesize-int"></a>

Number of items to return per page


#### 🔄 Return<a id="🔄-return"></a>

[Customer](./Sentdm/Models/Customer.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/customers` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.customers.getCustomerById`<a id="sentdmcustomersgetcustomerbyid"></a>

Returns detailed information about a specific customer including their messaging channel configurations and credentials.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let id = UUID().uuidString
let getCustomerByIdResponse = try await sentdm.customers.getCustomerById(
    id: id
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### id: `String`<a id="id-string"></a>

Unique identifier of the customer


#### 🔄 Return<a id="🔄-return"></a>

[Customer](./Sentdm/Models/Customer.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/customers/{id}` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.customers.updateCustomer`<a id="sentdmcustomersupdatecustomer"></a>

Updates an existing customer's information including messaging channel configurations. All fields in the request body will override existing values.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let id = UUID().uuidString
let name = "name_example"
let sendingPhoneNumber = "sendingPhoneNumber_example"
let smsMessagingProfileId = "smsMessagingProfileId_example"
let smsBearerToken = "smsBearerToken_example"
let updateCustomerResponse = try await sentdm.customers.updateCustomer(
    id: id,
    name: name,
    sendingPhoneNumber: sendingPhoneNumber,
    smsMessagingProfileId: smsMessagingProfileId,
    smsBearerToken: smsBearerToken
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### id: `String`<a id="id-string"></a>

Unique identifier of the customer to update


##### name: `String`<a id="name-string"></a>

Updated name of the customer organization


##### sendingPhoneNumber: `String`<a id="sendingphonenumber-string"></a>

Updated primary phone number for sending messages


##### smsMessagingProfileId: `String`<a id="smsmessagingprofileid-string"></a>

Updated SMS messaging profile identifier


##### smsBearerToken: `String`<a id="smsbearertoken-string"></a>

Updated bearer token for SMS authentication


#### 🔄 Return<a id="🔄-return"></a>

[Customer](./Sentdm/Models/Customer.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/customers/{id}` `PUT`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.messages.sendMessageToContact`<a id="sentdmmessagessendmessagetocontact"></a>

Sends a templated message to a specific contact. The platform automatically determines the optimal channel (SMS or WhatsApp) based on the contact's preferences and availability. Messages are sent using pre-defined templates to ensure consistent formatting and compliance across channels.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let customerId = "customerId_example"
let contactId = "contactId_example"
let templateId = "templateId_example"
let sendMessageToContactResponse = try await sentdm.messages.sendMessageToContact(
    customerId: customerId,
    contactId: contactId,
    templateId: templateId
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### customerId: `String`<a id="customerid-string"></a>

Unique identifier of the customer


##### contactId: `String`<a id="contactid-string"></a>

Unique identifier of the contact


##### templateId: `String`<a id="templateid-string"></a>

Unique identifier of the message template


#### 🔄 Return<a id="🔄-return"></a>

[MessagesSendMessageToContactResponse](./Sentdm/Models/MessagesSendMessageToContactResponse.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/messages` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.messages.sendMessageToPhoneNumber`<a id="sentdmmessagessendmessagetophonenumber"></a>

Sends a templated message directly to a phone number without requiring a pre-existing contact. The system will attempt to determine the best channel for delivery and create a contact record if one doesn't exist.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let customerId = "customerId_example"
let phoneNumber = "phoneNumber_example"
let templateId = "templateId_example"
let sendMessageToPhoneNumberResponse = try await sentdm.messages.sendMessageToPhoneNumber(
    customerId: customerId,
    phoneNumber: phoneNumber,
    templateId: templateId
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### customerId: `String`<a id="customerid-string"></a>

Unique identifier of the customer


##### phoneNumber: `String`<a id="phonenumber-string"></a>

Phone number in E.164 format


##### templateId: `String`<a id="templateid-string"></a>

Unique identifier of the message template


#### 🔄 Return<a id="🔄-return"></a>

[MessagesSendMessageToPhoneNumberResponse](./Sentdm/Models/MessagesSendMessageToPhoneNumberResponse.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/messages/phone-number` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.sMS.getContactInfo`<a id="sentdmsmsgetcontactinfo"></a>

Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let phoneNumber = "phoneNumber_example"
let retrieveIfDoesNotExists = true
let sentId = UUID().uuidString
let getContactInfoResponse = try await sentdm.sMS.getContactInfo(
    phoneNumber: phoneNumber,
    retrieveIfDoesNotExists: retrieveIfDoesNotExists,
    sentId: sentId
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### phoneNumber: `String`<a id="phonenumber-string"></a>

Target phone number in E.164 format (e.g., +1234567890)


##### retrieveIfDoesNotExists: `Bool`<a id="retrieveifdoesnotexists-bool"></a>

When true, creates a new SMS contact if one doesn't exist


##### sentId: `String`<a id="sentid-string"></a>

Optional Sent platform identifier for existing contacts


#### 🔄 Return<a id="🔄-return"></a>

[SMSPayload](./Sentdm/Models/SMSPayload.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/sms` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.templates.createTemplate`<a id="sentdmtemplatescreatetemplate"></a>

Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let customerId = "customerId_example"
let name = "name_example"
let createTemplateResponse = try await sentdm.templates.createTemplate(
    customerId: customerId,
    name: name
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### customerId: `String`<a id="customerid-string"></a>

Unique identifier of the customer creating the template


##### name: `String`<a id="name-string"></a>

Name of the template for identification purposes


#### 🔄 Return<a id="🔄-return"></a>

[ResponsesTemplateResponse](./Sentdm/Models/ResponsesTemplateResponse.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/templates` `POST`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.templates.getTemplatesForCustomer`<a id="sentdmtemplatesgettemplatesforcustomer"></a>

Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let customerId = UUID().uuidString
let getTemplatesForCustomerResponse = try await sentdm.templates.getTemplatesForCustomer(
    customerId: customerId
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### customerId: `String`<a id="customerid-string"></a>

Unique identifier of the customer


#### 🔄 Return<a id="🔄-return"></a>

[ResponsesTemplateResponse](./Sentdm/Models/ResponsesTemplateResponse.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/templates` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---


### `sentdm.whatsapp.getWhatsappContact`<a id="sentdmwhatsappgetwhatsappcontact"></a>

Fetches or creates WhatsApp contact information for a given phone number. This endpoint validates WhatsApp availability and returns detailed contact metadata including business account status and profile information.

#### 🛠️ Usage<a id="🛠️-usage"></a>

```swift
let phoneNumber = "phoneNumber_example"
let retrieveIfDoesNotExists = false
let sentId = UUID().uuidString
let getWhatsappContactResponse = try await sentdm.whatsapp.getWhatsappContact(
    phoneNumber: phoneNumber,
    retrieveIfDoesNotExists: retrieveIfDoesNotExists,
    sentId: sentId
)
```

#### ⚙️ Parameters<a id="⚙️-parameters"></a>

##### phoneNumber: `String`<a id="phonenumber-string"></a>

Phone number in international format (E.164)


##### retrieveIfDoesNotExists: `Bool`<a id="retrieveifdoesnotexists-bool"></a>

Whether to create a new contact if one doesn't exist


##### sentId: `String`<a id="sentid-string"></a>

Optional Sent platform identifier for tracking


#### 🔄 Return<a id="🔄-return"></a>

[WhatsAppPayload](./Sentdm/Models/WhatsAppPayload.swift)

#### 🌐 Endpoint<a id="🌐-endpoint"></a>

`/whatsapp` `GET`

[🔙 **Back to Table of Contents**](#table-of-contents)

---



## Author<a id="author"></a>
This TypeScript package is automatically generated by [Konfig](https://konfigthis.com)
