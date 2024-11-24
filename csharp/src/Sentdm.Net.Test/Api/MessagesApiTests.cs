/*
 * Sent.dm Core API
 *
 * Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: developers@sent.dm
 * Generated by: https://konfigthis.com
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Sentdm.Net.Client;
using Sentdm.Net.Api;
using Sentdm.Net.Model;

namespace Sentdm.Net.Test.Api
{
    /// <summary>
    ///  Class for testing MessagesApi
    /// </summary>
    public class MessagesApiTests : IDisposable
    {
        private Sentdm client;

        public MessagesApiTests()
        {
            client = new Sentdm();
            client.SetBasePath("http://127.0.0.1:4010");
            // Configure API key authorization: ApiKey
            client.SetApiKey("YOUR_API_KEY");
            // Configure token for authorization
            client.SetAccessToken("YOUR_TOKEN");

        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test SendMessageToContact
        /// </summary>
        [Fact]
        public void SendMessageToContactTest()
        {
            var customerId = "customerId_example"; // Unique identifier of the customer
            var contactId = "contactId_example"; // Unique identifier of the contact
            var templateId = "templateId_example"; // Unique identifier of the message template
            
            // Message details including customer ID, contact ID, and template ID
            var sendMessageToContactRequest = new SendMessageToContactRequest(
                customerId,
                contactId,
                templateId
            );
            
            try
            {
                // Send a message to a contact using a template
                MessagesSendMessageToContactResponse result = client.Messages.SendMessageToContact(sendMessageToContactRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling MessagesApi.SendMessageToContact: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }

        /// <summary>
        /// Test SendMessageToPhoneNumber
        /// </summary>
        [Fact]
        public void SendMessageToPhoneNumberTest()
        {
            var customerId = "customerId_example"; // Unique identifier of the customer
            var phoneNumber = "phoneNumber_example"; // Phone number in E.164 format
            var templateId = "templateId_example"; // Unique identifier of the message template
            
            // Message details including customer ID, phone number, and template ID
            var sendMessageToPhoneNumberRequest = new SendMessageToPhoneNumberRequest(
                customerId,
                phoneNumber,
                templateId
            );
            
            try
            {
                // Send a message to a phone number using a template
                MessagesSendMessageToPhoneNumberResponse result = client.Messages.SendMessageToPhoneNumber(sendMessageToPhoneNumberRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling MessagesApi.SendMessageToPhoneNumber: " + e.Message);
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e.Response.StatusCode);
                Console.WriteLine(e.Response.RawContent);
                Console.WriteLine(e.InnerException);
            }
        }
    }
}
