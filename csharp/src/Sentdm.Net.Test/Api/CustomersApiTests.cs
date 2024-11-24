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
    ///  Class for testing CustomersApi
    /// </summary>
    public class CustomersApiTests : IDisposable
    {
        private Sentdm client;

        public CustomersApiTests()
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
        /// Test CreateCustomer
        /// </summary>
        [Fact]
        public void CreateCustomerTest()
        {
            var body = Acme Corp; // Customer name to create the account
            
            try
            {
                // Create a new customer account
                Customer result = client.Customers.CreateCustomer(body);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling CustomersApi.CreateCustomer: " + e.Message);
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
        /// Test DeleteCustomer
        /// </summary>
        [Fact]
        public void DeleteCustomerTest()
        {
            var id = "id_example"; // Unique identifier of the customer to delete
            
            try
            {
                // Delete a customer
                client.Customers.DeleteCustomer(id);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling CustomersApi.DeleteCustomer: " + e.Message);
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
        /// Test GetAllCustomers
        /// </summary>
        [Fact]
        public void GetAllCustomersTest()
        {
            var page = 1; // Page number to retrieve (starts from 1)
            var pageSize = 20; // Number of items to return per page
            
            try
            {
                // Retrieve all customers with pagination
                List<Customer> result = client.Customers.GetAllCustomers(page, pageSize);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling CustomersApi.GetAllCustomers: " + e.Message);
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
        /// Test GetCustomerById
        /// </summary>
        [Fact]
        public void GetCustomerByIdTest()
        {
            var id = "id_example"; // Unique identifier of the customer
            
            try
            {
                // Retrieve a customer by ID
                Customer result = client.Customers.GetCustomerById(id);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling CustomersApi.GetCustomerById: " + e.Message);
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
        /// Test UpdateCustomer
        /// </summary>
        [Fact]
        public void UpdateCustomerTest()
        {
            var id = "id_example"; // Unique identifier of the customer to update
            var name = "name_example"; // Updated name of the customer organization
            var sendingPhoneNumber = "sendingPhoneNumber_example"; // Updated primary phone number for sending messages
            var smsMessagingProfileId = "smsMessagingProfileId_example"; // Updated SMS messaging profile identifier
            var smsBearerToken = "smsBearerToken_example"; // Updated bearer token for SMS authentication
            
            // Updated customer information
            var customersUpdateCustomerRequest = new CustomersUpdateCustomerRequest(
                name,
                sendingPhoneNumber,
                smsMessagingProfileId,
                smsBearerToken
            );
            
            try
            {
                // Update customer information
                Customer result = client.Customers.UpdateCustomer(id, customersUpdateCustomerRequest);
                Console.WriteLine(result);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling CustomersApi.UpdateCustomer: " + e.Message);
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
