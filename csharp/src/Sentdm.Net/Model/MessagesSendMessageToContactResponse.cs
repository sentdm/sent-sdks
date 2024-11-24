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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Sentdm.Net.Client.OpenAPIDateConverter;

namespace Sentdm.Net.Model
{
    /// <summary>
    /// MessagesSendMessageToContactResponse
    /// </summary>
    [DataContract(Name = "MessagesSendMessageToContactResponse")]
    public partial class MessagesSendMessageToContactResponse : IEquatable<MessagesSendMessageToContactResponse>, IValidatableObject
    {
        /// <summary>
        /// Current status of the message
        /// </summary>
        /// <value>Current status of the message</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum Queued for value: queued
            /// </summary>
            [EnumMember(Value = "queued")]
            Queued = 1,

            /// <summary>
            /// Enum Sending for value: sending
            /// </summary>
            [EnumMember(Value = "sending")]
            Sending = 2,

            /// <summary>
            /// Enum Delivered for value: delivered
            /// </summary>
            [EnumMember(Value = "delivered")]
            Delivered = 3

        }


        /// <summary>
        /// Current status of the message
        /// </summary>
        /// <value>Current status of the message</value>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// Selected delivery channel
        /// </summary>
        /// <value>Selected delivery channel</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ChannelEnum
        {
            /// <summary>
            /// Enum Sms for value: sms
            /// </summary>
            [EnumMember(Value = "sms")]
            Sms = 1,

            /// <summary>
            /// Enum Whatsapp for value: whatsapp
            /// </summary>
            [EnumMember(Value = "whatsapp")]
            Whatsapp = 2

        }


        /// <summary>
        /// Selected delivery channel
        /// </summary>
        /// <value>Selected delivery channel</value>
        [DataMember(Name = "channel", EmitDefaultValue = false)]
        public ChannelEnum? Channel { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="MessagesSendMessageToContactResponse" /> class.
        /// </summary>
        /// <param name="messageId">Unique identifier for tracking the message.</param>
        /// <param name="status">Current status of the message.</param>
        /// <param name="channel">Selected delivery channel.</param>
        public MessagesSendMessageToContactResponse(string messageId = default(string), StatusEnum? status = default(StatusEnum?), ChannelEnum? channel = default(ChannelEnum?))
        {
            this.MessageId = messageId;
            this.Status = status;
            this.Channel = channel;
        }

        /// <summary>
        /// Unique identifier for tracking the message
        /// </summary>
        /// <value>Unique identifier for tracking the message</value>
        [DataMember(Name = "messageId", EmitDefaultValue = false)]
        public string MessageId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MessagesSendMessageToContactResponse {\n");
            sb.Append("  MessageId: ").Append(MessageId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Channel: ").Append(Channel).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as MessagesSendMessageToContactResponse);
        }

        /// <summary>
        /// Returns true if MessagesSendMessageToContactResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of MessagesSendMessageToContactResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MessagesSendMessageToContactResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.MessageId == input.MessageId ||
                    (this.MessageId != null &&
                    this.MessageId.Equals(input.MessageId))
                ) && 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.Channel == input.Channel ||
                    this.Channel.Equals(input.Channel)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.MessageId != null)
                {
                    hashCode = (hashCode * 59) + this.MessageId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                hashCode = (hashCode * 59) + this.Channel.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}