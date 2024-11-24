import typing_extensions

from sentdm.apis.tags import TagValues
from sentdm.apis.tags.customers_api import CustomersApi
from sentdm.apis.tags.contact_api import ContactApi
from sentdm.apis.tags.messages_api import MessagesApi
from sentdm.apis.tags.templates_api import TemplatesApi
from sentdm.apis.tags.sms_api import SMSApi
from sentdm.apis.tags.whatsapp_api import WhatsappApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.CUSTOMERS: CustomersApi,
        TagValues.CONTACT: ContactApi,
        TagValues.MESSAGES: MessagesApi,
        TagValues.TEMPLATES: TemplatesApi,
        TagValues.SMS: SMSApi,
        TagValues.WHATSAPP: WhatsappApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.CUSTOMERS: CustomersApi,
        TagValues.CONTACT: ContactApi,
        TagValues.MESSAGES: MessagesApi,
        TagValues.TEMPLATES: TemplatesApi,
        TagValues.SMS: SMSApi,
        TagValues.WHATSAPP: WhatsappApi,
    }
)
