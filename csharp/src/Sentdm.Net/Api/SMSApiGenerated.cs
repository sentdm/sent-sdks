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
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using Sentdm.Net.Client;
using Sentdm.Net.Model;

namespace Sentdm.Net.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISMSApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Retrieve SMS contact information and capabilities
        /// </summary>
        /// <remarks>
        /// Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="phoneNumber">Target phone number in E.164 format (e.g., +1234567890)</param>
        /// <param name="retrieveIfDoesNotExists">When true, creates a new SMS contact if one doesn&#39;t exist</param>
        /// <param name="sentId">Optional Sent platform identifier for existing contacts (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>SMSPayload</returns>
        SMSPayload GetContactInfo(string phoneNumber, bool retrieveIfDoesNotExists, string sentId = default(string), int operationIndex = 0);

        /// <summary>
        /// Retrieve SMS contact information and capabilities
        /// </summary>
        /// <remarks>
        /// Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="phoneNumber">Target phone number in E.164 format (e.g., +1234567890)</param>
        /// <param name="retrieveIfDoesNotExists">When true, creates a new SMS contact if one doesn&#39;t exist</param>
        /// <param name="sentId">Optional Sent platform identifier for existing contacts (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of SMSPayload</returns>
        ApiResponse<SMSPayload> GetContactInfoWithHttpInfo(string phoneNumber, bool retrieveIfDoesNotExists, string sentId = default(string), int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISMSApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Retrieve SMS contact information and capabilities
        /// </summary>
        /// <remarks>
        /// Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="phoneNumber">Target phone number in E.164 format (e.g., +1234567890)</param>
        /// <param name="retrieveIfDoesNotExists">When true, creates a new SMS contact if one doesn&#39;t exist</param>
        /// <param name="sentId">Optional Sent platform identifier for existing contacts (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of SMSPayload</returns>
        System.Threading.Tasks.Task<SMSPayload> GetContactInfoAsync(string phoneNumber, bool retrieveIfDoesNotExists, string sentId = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Retrieve SMS contact information and capabilities
        /// </summary>
        /// <remarks>
        /// Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="phoneNumber">Target phone number in E.164 format (e.g., +1234567890)</param>
        /// <param name="retrieveIfDoesNotExists">When true, creates a new SMS contact if one doesn&#39;t exist</param>
        /// <param name="sentId">Optional Sent platform identifier for existing contacts (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (SMSPayload)</returns>
        System.Threading.Tasks.Task<ApiResponse<SMSPayload>> GetContactInfoWithHttpInfoAsync(string phoneNumber, bool retrieveIfDoesNotExists, string sentId = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISMSApi : ISMSApiSync, ISMSApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class SMSApiGenerated : ISMSApi
    {
        private Sentdm.Net.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="SMSApiGenerated"/> class.
        /// </summary>
        /// <returns></returns>
        public SMSApiGenerated() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SMSApiGenerated"/> class.
        /// </summary>
        /// <returns></returns>
        public SMSApiGenerated(string basePath)
        {
            this.Configuration = Sentdm.Net.Client.Configuration.MergeConfigurations(
                Sentdm.Net.Client.GlobalConfiguration.Instance,
                new Sentdm.Net.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Sentdm.Net.Client.ApiClient(this.Configuration);
            this.AsynchronousClient = new Sentdm.Net.Client.ApiClient(this.Configuration);
            this.ExceptionFactory = Sentdm.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SMSApiGenerated"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public SMSApiGenerated(Sentdm.Net.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Sentdm.Net.Client.Configuration.MergeConfigurations(
                Sentdm.Net.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Sentdm.Net.Client.ApiClient(this.Configuration);
            this.AsynchronousClient = new Sentdm.Net.Client.ApiClient(this.Configuration);
            this.ExceptionFactory = Sentdm.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SMSApiGenerated"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public SMSApiGenerated(Sentdm.Net.Client.ISynchronousClient client, Sentdm.Net.Client.IAsynchronousClient asyncClient, Sentdm.Net.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Sentdm.Net.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Sentdm.Net.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Sentdm.Net.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Sentdm.Net.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Sentdm.Net.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Retrieve SMS contact information and capabilities Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="phoneNumber">Target phone number in E.164 format (e.g., +1234567890)</param>
        /// <param name="retrieveIfDoesNotExists">When true, creates a new SMS contact if one doesn&#39;t exist</param>
        /// <param name="sentId">Optional Sent platform identifier for existing contacts (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>SMSPayload</returns>
        public SMSPayload GetContactInfo(string phoneNumber, bool retrieveIfDoesNotExists, string sentId = default(string), int operationIndex = 0)
        {
            Sentdm.Net.Client.ApiResponse<SMSPayload> localVarResponse = GetContactInfoWithHttpInfo(phoneNumber, retrieveIfDoesNotExists, sentId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve SMS contact information and capabilities Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="phoneNumber">Target phone number in E.164 format (e.g., +1234567890)</param>
        /// <param name="retrieveIfDoesNotExists">When true, creates a new SMS contact if one doesn&#39;t exist</param>
        /// <param name="sentId">Optional Sent platform identifier for existing contacts (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of SMSPayload</returns>
        public Sentdm.Net.Client.ApiResponse<SMSPayload> GetContactInfoWithHttpInfo(string phoneNumber, bool retrieveIfDoesNotExists, string sentId = default(string), int operationIndex = 0)
        {
            // verify the required parameter 'phoneNumber' is set
            if (phoneNumber == null)
            {
                throw new Sentdm.Net.Client.ApiException(400, "Missing required parameter 'phoneNumber' when calling SMSApi->GetContactInfo");
            }

            Sentdm.Net.Client.RequestOptions localVarRequestOptions = new Sentdm.Net.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Sentdm.Net.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Sentdm.Net.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(Sentdm.Net.Client.ClientUtils.ParameterToMultiMap("", "phoneNumber", phoneNumber, ""));
            localVarRequestOptions.QueryParameters.Add(Sentdm.Net.Client.ClientUtils.ParameterToMultiMap("", "retrieveIfDoesNotExists", retrieveIfDoesNotExists, ""));
            if (sentId != null)
            {
                localVarRequestOptions.QueryParameters.Add(Sentdm.Net.Client.ClientUtils.ParameterToMultiMap("", "sentId", sentId, ""));
            }

            localVarRequestOptions.Operation = "SMSApi.GetContactInfo";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (ApiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("x-api-key")))
            {
                localVarRequestOptions.HeaderParameters.Add("x-api-key", this.Configuration.GetApiKeyWithPrefix("x-api-key"));
            }
            // authentication (BearerAuth) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<SMSPayload>("/sms", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetContactInfo", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Retrieve SMS contact information and capabilities Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="phoneNumber">Target phone number in E.164 format (e.g., +1234567890)</param>
        /// <param name="retrieveIfDoesNotExists">When true, creates a new SMS contact if one doesn&#39;t exist</param>
        /// <param name="sentId">Optional Sent platform identifier for existing contacts (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of SMSPayload</returns>
        public async System.Threading.Tasks.Task<SMSPayload> GetContactInfoAsync(string phoneNumber, bool retrieveIfDoesNotExists, string sentId = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Sentdm.Net.Client.ApiResponse<SMSPayload> localVarResponse = await GetContactInfoWithHttpInfoAsync(phoneNumber, retrieveIfDoesNotExists, sentId, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve SMS contact information and capabilities Fetches or creates SMS contact information for a given phone number. This endpoint validates the phone number, determines SMS capabilities, and returns detailed formatting information needed for message delivery. Use this before sending messages to ensure proper SMS channel availability.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="phoneNumber">Target phone number in E.164 format (e.g., +1234567890)</param>
        /// <param name="retrieveIfDoesNotExists">When true, creates a new SMS contact if one doesn&#39;t exist</param>
        /// <param name="sentId">Optional Sent platform identifier for existing contacts (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (SMSPayload)</returns>
        public virtual async System.Threading.Tasks.Task<Sentdm.Net.Client.ApiResponse<SMSPayload>> GetContactInfoWithHttpInfoAsync(string phoneNumber, bool retrieveIfDoesNotExists, string sentId = default(string), int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'phoneNumber' is set
            if (phoneNumber == null)
            {
                throw new Sentdm.Net.Client.ApiException(400, "Missing required parameter 'phoneNumber' when calling SMSApi->GetContactInfo");
            }


            Sentdm.Net.Client.RequestOptions localVarRequestOptions = new Sentdm.Net.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Sentdm.Net.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Sentdm.Net.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(Sentdm.Net.Client.ClientUtils.ParameterToMultiMap("", "phoneNumber", phoneNumber, ""));
            localVarRequestOptions.QueryParameters.Add(Sentdm.Net.Client.ClientUtils.ParameterToMultiMap("", "retrieveIfDoesNotExists", retrieveIfDoesNotExists, ""));
            if (sentId != null)
            {
                localVarRequestOptions.QueryParameters.Add(Sentdm.Net.Client.ClientUtils.ParameterToMultiMap("", "sentId", sentId, ""));
            }

            localVarRequestOptions.Operation = "SMSApi.GetContactInfo";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (ApiKey) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("x-api-key")))
            {
                localVarRequestOptions.HeaderParameters.Add("x-api-key", this.Configuration.GetApiKeyWithPrefix("x-api-key"));
            }
            // authentication (BearerAuth) required
            // bearer authentication required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<SMSPayload>("/sms", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetContactInfo", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}