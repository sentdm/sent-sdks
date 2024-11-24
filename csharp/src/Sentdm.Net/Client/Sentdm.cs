/*
 * Sent.dm Core API
 *
 * Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: developers@sent.dm
 * Generated by: https://konfigthis.com
 */


using Sentdm.Net.Api;

namespace Sentdm.Net.Client
{
    /// <summary>
    ///  SDK client
    /// </summary>
    public class Sentdm
    {
        /// <summary>
        /// API instance
        /// </summary>
        public virtual ContactApi Contact { get; set; }

        /// <summary>
        /// API instance
        /// </summary>
        public virtual CustomersApi Customers { get; set; }

        /// <summary>
        /// API instance
        /// </summary>
        public virtual MessagesApi Messages { get; set; }

        /// <summary>
        /// API instance
        /// </summary>
        public virtual SMSApi SMS { get; set; }

        /// <summary>
        /// API instance
        /// </summary>
        public virtual TemplatesApi Templates { get; set; }

        /// <summary>
        /// API instance
        /// </summary>
        public virtual WhatsappApi Whatsapp { get; set; }

        /// <summary>
        /// Configuration instance
        /// </summary>
        public readonly Configuration Configuration;

        /// <summary>
        /// Constructor
        /// </summary>
        public Sentdm()
        {
            Configuration = new Configuration();
            init();
        }

        private void init()
        {
            Contact = new ContactApi(Configuration);
            Customers = new CustomersApi(Configuration);
            Messages = new MessagesApi(Configuration);
            SMS = new SMSApi(Configuration);
            Templates = new TemplatesApi(Configuration);
            Whatsapp = new WhatsappApi(Configuration);
        }

        /// <summary>
        /// Setter for base path
        /// </summary>
        public Sentdm SetBasePath(string basePath)
        {
            Configuration.BasePath = basePath;
            init();
            return this;
        }

        /// <summary>
        /// Setter for verify SSL configuration. Set to false when you want to disable SSL verification.
        /// </summary>
        public Sentdm SetVerifySsl(bool verifySsl)
        {
            Configuration.VerifySsl = verifySsl;
            init();
            return this;
        }

        /// <summary>
        /// Setter for Access Token
        /// </summary>
        public Sentdm SetAccessToken(string accessToken)
        {
            Configuration.AccessToken = accessToken;
            init();
            return this;
        }

        /// <summary>
        /// Setter for API Key
        /// </summary>
        public Sentdm SetApiKey(string apiKey)
        {
            Configuration.ApiKey["x-api-key"] = apiKey;
            init();
            return this;
        }
    }
}
