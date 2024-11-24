import typing_extensions

from sentdm.paths import PathValues
from sentdm.apis.paths.contact_customer_id_id_id import ContactCustomerIdIdId
from sentdm.apis.paths.contact_customer_id_phone_phone_number import ContactCustomerIdPhonePhoneNumber
from sentdm.apis.paths.messages import Messages
from sentdm.apis.paths.messages_phone_number import MessagesPhoneNumber
from sentdm.apis.paths.templates import Templates
from sentdm.apis.paths.customers import Customers
from sentdm.apis.paths.customers_id import CustomersId
from sentdm.apis.paths.sms import Sms
from sentdm.apis.paths.whatsapp import Whatsapp

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.CONTACT_CUSTOMER_ID_ID_ID: ContactCustomerIdIdId,
        PathValues.CONTACT_CUSTOMER_ID_PHONE_PHONE_NUMBER: ContactCustomerIdPhonePhoneNumber,
        PathValues.MESSAGES: Messages,
        PathValues.MESSAGES_PHONENUMBER: MessagesPhoneNumber,
        PathValues.TEMPLATES: Templates,
        PathValues.CUSTOMERS: Customers,
        PathValues.CUSTOMERS_ID: CustomersId,
        PathValues.SMS: Sms,
        PathValues.WHATSAPP: Whatsapp,
    }
)

path_to_api = PathToApi(
    {
        PathValues.CONTACT_CUSTOMER_ID_ID_ID: ContactCustomerIdIdId,
        PathValues.CONTACT_CUSTOMER_ID_PHONE_PHONE_NUMBER: ContactCustomerIdPhonePhoneNumber,
        PathValues.MESSAGES: Messages,
        PathValues.MESSAGES_PHONENUMBER: MessagesPhoneNumber,
        PathValues.TEMPLATES: Templates,
        PathValues.CUSTOMERS: Customers,
        PathValues.CUSTOMERS_ID: CustomersId,
        PathValues.SMS: Sms,
        PathValues.WHATSAPP: Whatsapp,
    }
)
