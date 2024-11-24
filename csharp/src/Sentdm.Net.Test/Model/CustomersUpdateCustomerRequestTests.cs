/*
 * Sent.dm Core API
 *
 * Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: developers@sent.dm
 * Generated by: https://konfigthis.com
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Sentdm.Net.Api;
using Sentdm.Net.Model;
using Sentdm.Net.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Sentdm.Net.Test.Model
{
    /// <summary>
    ///  Class for testing CustomersUpdateCustomerRequest
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class CustomersUpdateCustomerRequestTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for CustomersUpdateCustomerRequest
        //private CustomersUpdateCustomerRequest instance;

        public CustomersUpdateCustomerRequestTests()
        {
            // TODO uncomment below to create an instance of CustomersUpdateCustomerRequest
            //instance = new CustomersUpdateCustomerRequest();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of CustomersUpdateCustomerRequest
        /// </summary>
        [Fact]
        public void CustomersUpdateCustomerRequestInstanceTest()
        {
            // TODO uncomment below to test "IsType" CustomersUpdateCustomerRequest
            //Assert.IsType<CustomersUpdateCustomerRequest>(instance);
        }


        /// <summary>
        /// Test the property 'Name'
        /// </summary>
        [Fact]
        public void NameTest()
        {
            // TODO unit test for the property 'Name'
        }
        /// <summary>
        /// Test the property 'SendingPhoneNumber'
        /// </summary>
        [Fact]
        public void SendingPhoneNumberTest()
        {
            // TODO unit test for the property 'SendingPhoneNumber'
        }
        /// <summary>
        /// Test the property 'SmsMessagingProfileId'
        /// </summary>
        [Fact]
        public void SmsMessagingProfileIdTest()
        {
            // TODO unit test for the property 'SmsMessagingProfileId'
        }
        /// <summary>
        /// Test the property 'SmsBearerToken'
        /// </summary>
        [Fact]
        public void SmsBearerTokenTest()
        {
            // TODO unit test for the property 'SmsBearerToken'
        }

    }

}
