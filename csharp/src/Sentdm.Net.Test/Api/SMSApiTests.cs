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
    ///  Class for testing SMSApi
    /// </summary>
    public class SMSApiTests : IDisposable
    {
        private Sentdm client;

        public SMSApiTests()
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
        /// Test GetContactInfo
        /// </summary>
        [Fact]
        public void GetContactInfoTest()
        {
            var phoneNumber = "+14155552671"; // Target phone number in E.164 format (e.g., +1234567890)
            var retrieveIfDoesNotExists = true; // When true, creates a new SMS contact if one doesn't exist
            var sentId = "sentId_example"; // Optional Sent platform identifier for existing contacts (optional) 
            
            try
            {
                // Retrieve SMS contact information and capabilities
                SMSPayload result = client.SMS.GetContactInfo(phoneNumber, retrieveIfDoesNotExists, sentId);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling SMSApi.GetContactInfo: " + e.Message);
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