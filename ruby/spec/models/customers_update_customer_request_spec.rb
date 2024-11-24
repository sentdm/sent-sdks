=begin
#Sent.dm Core API

#Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

The version of the OpenAPI document: 1.1.0
Contact: developers@sent.dm
=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for Sentdm::CustomersUpdateCustomerRequest
describe Sentdm::CustomersUpdateCustomerRequest do
  let(:instance) { Sentdm::CustomersUpdateCustomerRequest.new }

  describe 'test an instance of CustomersUpdateCustomerRequest' do
    it 'should create an instance of CustomersUpdateCustomerRequest' do
      expect(instance).to be_instance_of(Sentdm::CustomersUpdateCustomerRequest)
    end
  end
  describe 'test attribute "name"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "sending_phone_number"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "sms_messaging_profile_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "sms_bearer_token"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
