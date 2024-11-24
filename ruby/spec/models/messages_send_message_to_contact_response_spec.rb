=begin
#Sent.dm Core API

#Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.

The version of the OpenAPI document: 1.1.0
Contact: developers@sent.dm
=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for Sentdm::MessagesSendMessageToContactResponse
describe Sentdm::MessagesSendMessageToContactResponse do
  let(:instance) { Sentdm::MessagesSendMessageToContactResponse.new }

  describe 'test an instance of MessagesSendMessageToContactResponse' do
    it 'should create an instance of MessagesSendMessageToContactResponse' do
      expect(instance).to be_instance_of(Sentdm::MessagesSendMessageToContactResponse)
    end
  end
  describe 'test attribute "message_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "status"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "channel"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end