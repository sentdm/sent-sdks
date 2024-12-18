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
    public interface ITemplatesApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Create a new message template
        /// </summary>
        /// <remarks>
        /// Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="templateCreateRequest">Template creation details including customer ID and template name</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ResponsesTemplateResponse</returns>
        ResponsesTemplateResponse CreateTemplate(TemplateCreateRequest templateCreateRequest, int operationIndex = 0);

        /// <summary>
        /// Create a new message template
        /// </summary>
        /// <remarks>
        /// Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="templateCreateRequest">Template creation details including customer ID and template name</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of ResponsesTemplateResponse</returns>
        ApiResponse<ResponsesTemplateResponse> CreateTemplateWithHttpInfo(TemplateCreateRequest templateCreateRequest, int operationIndex = 0);
        /// <summary>
        /// Retrieve all templates for a customer
        /// </summary>
        /// <remarks>
        /// Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerId">Unique identifier of the customer</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>List&lt;ResponsesTemplateResponse&gt;</returns>
        List<ResponsesTemplateResponse> GetTemplatesForCustomer(string customerId, int operationIndex = 0);

        /// <summary>
        /// Retrieve all templates for a customer
        /// </summary>
        /// <remarks>
        /// Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerId">Unique identifier of the customer</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of List&lt;ResponsesTemplateResponse&gt;</returns>
        ApiResponse<List<ResponsesTemplateResponse>> GetTemplatesForCustomerWithHttpInfo(string customerId, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITemplatesApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Create a new message template
        /// </summary>
        /// <remarks>
        /// Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="templateCreateRequest">Template creation details including customer ID and template name</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ResponsesTemplateResponse</returns>
        System.Threading.Tasks.Task<ResponsesTemplateResponse> CreateTemplateAsync(TemplateCreateRequest templateCreateRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Create a new message template
        /// </summary>
        /// <remarks>
        /// Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="templateCreateRequest">Template creation details including customer ID and template name</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ResponsesTemplateResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<ResponsesTemplateResponse>> CreateTemplateWithHttpInfoAsync(TemplateCreateRequest templateCreateRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Retrieve all templates for a customer
        /// </summary>
        /// <remarks>
        /// Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerId">Unique identifier of the customer</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;ResponsesTemplateResponse&gt;</returns>
        System.Threading.Tasks.Task<List<ResponsesTemplateResponse>> GetTemplatesForCustomerAsync(string customerId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Retrieve all templates for a customer
        /// </summary>
        /// <remarks>
        /// Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
        /// </remarks>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerId">Unique identifier of the customer</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;ResponsesTemplateResponse&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<ResponsesTemplateResponse>>> GetTemplatesForCustomerWithHttpInfoAsync(string customerId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITemplatesApi : ITemplatesApiSync, ITemplatesApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class TemplatesApiGenerated : ITemplatesApi
    {
        private Sentdm.Net.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplatesApiGenerated"/> class.
        /// </summary>
        /// <returns></returns>
        public TemplatesApiGenerated() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplatesApiGenerated"/> class.
        /// </summary>
        /// <returns></returns>
        public TemplatesApiGenerated(string basePath)
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
        /// Initializes a new instance of the <see cref="TemplatesApiGenerated"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public TemplatesApiGenerated(Sentdm.Net.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="TemplatesApiGenerated"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public TemplatesApiGenerated(Sentdm.Net.Client.ISynchronousClient client, Sentdm.Net.Client.IAsynchronousClient asyncClient, Sentdm.Net.Client.IReadableConfiguration configuration)
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
        /// Create a new message template Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="templateCreateRequest">Template creation details including customer ID and template name</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ResponsesTemplateResponse</returns>
        public ResponsesTemplateResponse CreateTemplate(TemplateCreateRequest templateCreateRequest, int operationIndex = 0)
        {
            Sentdm.Net.Client.ApiResponse<ResponsesTemplateResponse> localVarResponse = CreateTemplateWithHttpInfo(templateCreateRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Create a new message template Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="templateCreateRequest">Template creation details including customer ID and template name</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of ResponsesTemplateResponse</returns>
        public Sentdm.Net.Client.ApiResponse<ResponsesTemplateResponse> CreateTemplateWithHttpInfo(TemplateCreateRequest templateCreateRequest, int operationIndex = 0)
        {
            // verify the required parameter 'templateCreateRequest' is set
            if (templateCreateRequest == null)
            {
                throw new Sentdm.Net.Client.ApiException(400, "Missing required parameter 'templateCreateRequest' when calling TemplatesApi->CreateTemplate");
            }

            Sentdm.Net.Client.RequestOptions localVarRequestOptions = new Sentdm.Net.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
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

            localVarRequestOptions.Data = templateCreateRequest;

            localVarRequestOptions.Operation = "TemplatesApi.CreateTemplate";
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
            var localVarResponse = this.Client.Post<ResponsesTemplateResponse>("/templates", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateTemplate", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Create a new message template Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="templateCreateRequest">Template creation details including customer ID and template name</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ResponsesTemplateResponse</returns>
        public async System.Threading.Tasks.Task<ResponsesTemplateResponse> CreateTemplateAsync(TemplateCreateRequest templateCreateRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Sentdm.Net.Client.ApiResponse<ResponsesTemplateResponse> localVarResponse = await CreateTemplateWithHttpInfoAsync(templateCreateRequest, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Create a new message template Creates a new message template that can be used for sending standardized messages across different channels. Templates ensure consistent messaging and support variable substitution.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="templateCreateRequest">Template creation details including customer ID and template name</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ResponsesTemplateResponse)</returns>
        public virtual async System.Threading.Tasks.Task<Sentdm.Net.Client.ApiResponse<ResponsesTemplateResponse>> CreateTemplateWithHttpInfoAsync(TemplateCreateRequest templateCreateRequest, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'templateCreateRequest' is set
            if (templateCreateRequest == null)
            {
                throw new Sentdm.Net.Client.ApiException(400, "Missing required parameter 'templateCreateRequest' when calling TemplatesApi->CreateTemplate");
            }


            Sentdm.Net.Client.RequestOptions localVarRequestOptions = new Sentdm.Net.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
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

            localVarRequestOptions.Data = templateCreateRequest;

            localVarRequestOptions.Operation = "TemplatesApi.CreateTemplate";
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
            var localVarResponse = await this.AsynchronousClient.PostAsync<ResponsesTemplateResponse>("/templates", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateTemplate", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Retrieve all templates for a customer Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerId">Unique identifier of the customer</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>List&lt;ResponsesTemplateResponse&gt;</returns>
        public List<ResponsesTemplateResponse> GetTemplatesForCustomer(string customerId, int operationIndex = 0)
        {
            Sentdm.Net.Client.ApiResponse<List<ResponsesTemplateResponse>> localVarResponse = GetTemplatesForCustomerWithHttpInfo(customerId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve all templates for a customer Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerId">Unique identifier of the customer</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of List&lt;ResponsesTemplateResponse&gt;</returns>
        public Sentdm.Net.Client.ApiResponse<List<ResponsesTemplateResponse>> GetTemplatesForCustomerWithHttpInfo(string customerId, int operationIndex = 0)
        {
            // verify the required parameter 'customerId' is set
            if (customerId == null)
            {
                throw new Sentdm.Net.Client.ApiException(400, "Missing required parameter 'customerId' when calling TemplatesApi->GetTemplatesForCustomer");
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

            localVarRequestOptions.QueryParameters.Add(Sentdm.Net.Client.ClientUtils.ParameterToMultiMap("", "customerId", customerId, ""));

            localVarRequestOptions.Operation = "TemplatesApi.GetTemplatesForCustomer";
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
            var localVarResponse = this.Client.Get<List<ResponsesTemplateResponse>>("/templates", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetTemplatesForCustomer", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Retrieve all templates for a customer Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerId">Unique identifier of the customer</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;ResponsesTemplateResponse&gt;</returns>
        public async System.Threading.Tasks.Task<List<ResponsesTemplateResponse>> GetTemplatesForCustomerAsync(string customerId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Sentdm.Net.Client.ApiResponse<List<ResponsesTemplateResponse>> localVarResponse = await GetTemplatesForCustomerWithHttpInfoAsync(customerId, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve all templates for a customer Returns a list of all message templates associated with the specified customer ID. Templates are returned in descending order by creation date.
        /// </summary>
        /// <exception cref="Sentdm.Net.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerId">Unique identifier of the customer</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;ResponsesTemplateResponse&gt;)</returns>
        public virtual async System.Threading.Tasks.Task<Sentdm.Net.Client.ApiResponse<List<ResponsesTemplateResponse>>> GetTemplatesForCustomerWithHttpInfoAsync(string customerId, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'customerId' is set
            if (customerId == null)
            {
                throw new Sentdm.Net.Client.ApiException(400, "Missing required parameter 'customerId' when calling TemplatesApi->GetTemplatesForCustomer");
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

            localVarRequestOptions.QueryParameters.Add(Sentdm.Net.Client.ClientUtils.ParameterToMultiMap("", "customerId", customerId, ""));

            localVarRequestOptions.Operation = "TemplatesApi.GetTemplatesForCustomer";
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
            var localVarResponse = await this.AsynchronousClient.GetAsync<List<ResponsesTemplateResponse>>("/templates", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetTemplatesForCustomer", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
