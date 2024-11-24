=begin
#Sent.dm Core API

#Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

The version of the OpenAPI document: 1.1.0
Contact: developers@sent.dm
=end

require 'forwardable'

# Common files
require 'sentdm/api_client'
require 'sentdm/api_error'
require 'sentdm/version'
require 'sentdm/configuration'

# Models
require 'sentdm/models/category'
require 'sentdm/models/channel'
require 'sentdm/models/contact'
require 'sentdm/models/customer'
require 'sentdm/models/customers_update_customer_request'
require 'sentdm/models/messages_send_message_to_contact400_response'
require 'sentdm/models/messages_send_message_to_contact_response'
require 'sentdm/models/messages_send_message_to_phone_number_response'
require 'sentdm/models/messages_send_message_to_phone_number_response_channel'
require 'sentdm/models/messages_send_message_to_phone_number_response_status'
require 'sentdm/models/number_type'
require 'sentdm/models/payload_phone_number'
require 'sentdm/models/responses_template_response'
require 'sentdm/models/sms_payload'
require 'sentdm/models/sms_payload_all_of'
require 'sentdm/models/send_message_to_contact_request'
require 'sentdm/models/send_message_to_phone_number_request'
require 'sentdm/models/sms_get_contact_info_response'
require 'sentdm/models/status'
require 'sentdm/models/template_create_request'
require 'sentdm/models/whats_app_payload'
require 'sentdm/models/whats_app_payload_all_of'
require 'sentdm/models/whatsapp_get_whatsapp_contact_response'
require 'sentdm/models/whatsapp_template_status'

# APIs
require 'sentdm/api/contact_api'
require 'sentdm/api/customers_api'
require 'sentdm/api/messages_api'
require 'sentdm/api/sms_api'
require 'sentdm/api/templates_api'
require 'sentdm/api/whatsapp_api'

module Sentdm
  @config = Configuration.default
  SENTINEL = Object.new
  class << self

    private def is_sentinel(value)
      value == SENTINEL
    end

    def host
      @config.host
    end

    def host=(value)
      @config.host = value
    end
    # api key from OpenAPI spec
    def api_key
      @config.api_key
    end

    def api_key=(value)
      @config.api_key = value
    end

    # Customize default settings for the SDK using block.
    #   Sentdm.configure do |config|
    #     config.host = "http://example.com"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end

  class Client
    attr_reader :contact
    attr_reader :customers
    attr_reader :messages
    attr_reader :sms
    attr_reader :templates
    attr_reader :whatsapp

    def initialize(config = Configuration.default)
      @api_client = ApiClient::new(config)
      @contact = Sentdm::ContactApi.new(@api_client)
      @customers = Sentdm::CustomersApi.new(@api_client)
      @messages = Sentdm::MessagesApi.new(@api_client)
      @sms = Sentdm::SMSApi.new(@api_client)
      @templates = Sentdm::TemplatesApi.new(@api_client)
      @whatsapp = Sentdm::WhatsappApi.new(@api_client)
    end
  end
end
