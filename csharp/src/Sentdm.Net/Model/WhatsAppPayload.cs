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
    /// WhatsApp contact information including profile and verification details
    /// </summary>
    [DataContract(Name = "WhatsAppPayload")]
    public partial class WhatsAppPayload : IEquatable<WhatsAppPayload>, IValidatableObject
    {
        /// <summary>
        /// Type of phone number (MOBILE, LANDLINE, etc)
        /// </summary>
        /// <value>Type of phone number (MOBILE, LANDLINE, etc)</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum NumberTypeEnum
        {
            /// <summary>
            /// Enum MOBILE for value: MOBILE
            /// </summary>
            [EnumMember(Value = "MOBILE")]
            MOBILE = 1,

            /// <summary>
            /// Enum LANDLINE for value: LANDLINE
            /// </summary>
            [EnumMember(Value = "LANDLINE")]
            LANDLINE = 2,

            /// <summary>
            /// Enum VOIP for value: VOIP
            /// </summary>
            [EnumMember(Value = "VOIP")]
            VOIP = 3,

            /// <summary>
            /// Enum UNKNOWN for value: UNKNOWN
            /// </summary>
            [EnumMember(Value = "UNKNOWN")]
            UNKNOWN = 4

        }


        /// <summary>
        /// Type of phone number (MOBILE, LANDLINE, etc)
        /// </summary>
        /// <value>Type of phone number (MOBILE, LANDLINE, etc)</value>
        [DataMember(Name = "numberType", EmitDefaultValue = false)]
        public NumberTypeEnum? NumberType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="WhatsAppPayload" /> class.
        /// </summary>
        /// <param name="id">Unique identifier for the phone number record.</param>
        /// <param name="sentId">Sent platform identifier.</param>
        /// <param name="phoneNumber">Phone number in E.164 format.</param>
        /// <param name="whatsappId">Unique WhatsApp identifier for the contact.</param>
        /// <param name="countryCode">ISO country code of the phone number.</param>
        /// <param name="numberType">Type of phone number (MOBILE, LANDLINE, etc).</param>
        /// <param name="profilePicture">URL to the contact&#39;s WhatsApp profile picture.</param>
        /// <param name="isBusiness">Indicates if the number belongs to a WhatsApp Business account.</param>
        /// <param name="invalidRecord">Indicates if the WhatsApp account is invalid or deactivated.</param>
        public WhatsAppPayload(string id = default(string), string sentId = default(string), string phoneNumber = default(string), string whatsappId = default(string), string countryCode = default(string), NumberTypeEnum? numberType = default(NumberTypeEnum?), string profilePicture = default(string), bool isBusiness = default(bool), bool invalidRecord = default(bool))
        {
            this.Id = id;
            this.SentId = sentId;
            this.PhoneNumber = phoneNumber;
            this.WhatsappId = whatsappId;
            this.CountryCode = countryCode;
            this.NumberType = numberType;
            this.ProfilePicture = profilePicture;
            this.IsBusiness = isBusiness;
            this.InvalidRecord = invalidRecord;
        }

        /// <summary>
        /// Unique identifier for the phone number record
        /// </summary>
        /// <value>Unique identifier for the phone number record</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Sent platform identifier
        /// </summary>
        /// <value>Sent platform identifier</value>
        [DataMember(Name = "sentId", EmitDefaultValue = false)]
        public string SentId { get; set; }

        /// <summary>
        /// Phone number in E.164 format
        /// </summary>
        /// <value>Phone number in E.164 format</value>
        [DataMember(Name = "phoneNumber", EmitDefaultValue = false)]
        public string PhoneNumber { get; set; }

        /// <summary>
        /// Unique WhatsApp identifier for the contact
        /// </summary>
        /// <value>Unique WhatsApp identifier for the contact</value>
        [DataMember(Name = "whatsappId", EmitDefaultValue = false)]
        public string WhatsappId { get; set; }

        /// <summary>
        /// ISO country code of the phone number
        /// </summary>
        /// <value>ISO country code of the phone number</value>
        [DataMember(Name = "countryCode", EmitDefaultValue = false)]
        public string CountryCode { get; set; }

        /// <summary>
        /// URL to the contact&#39;s WhatsApp profile picture
        /// </summary>
        /// <value>URL to the contact&#39;s WhatsApp profile picture</value>
        [DataMember(Name = "profilePicture", EmitDefaultValue = false)]
        public string ProfilePicture { get; set; }

        /// <summary>
        /// Indicates if the number belongs to a WhatsApp Business account
        /// </summary>
        /// <value>Indicates if the number belongs to a WhatsApp Business account</value>
        [DataMember(Name = "isBusiness", EmitDefaultValue = true)]
        public bool IsBusiness { get; set; }

        /// <summary>
        /// Indicates if the WhatsApp account is invalid or deactivated
        /// </summary>
        /// <value>Indicates if the WhatsApp account is invalid or deactivated</value>
        [DataMember(Name = "invalidRecord", EmitDefaultValue = true)]
        public bool InvalidRecord { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class WhatsAppPayload {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  SentId: ").Append(SentId).Append("\n");
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append("\n");
            sb.Append("  WhatsappId: ").Append(WhatsappId).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  NumberType: ").Append(NumberType).Append("\n");
            sb.Append("  ProfilePicture: ").Append(ProfilePicture).Append("\n");
            sb.Append("  IsBusiness: ").Append(IsBusiness).Append("\n");
            sb.Append("  InvalidRecord: ").Append(InvalidRecord).Append("\n");
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
            return this.Equals(input as WhatsAppPayload);
        }

        /// <summary>
        /// Returns true if WhatsAppPayload instances are equal
        /// </summary>
        /// <param name="input">Instance of WhatsAppPayload to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WhatsAppPayload input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.SentId == input.SentId ||
                    (this.SentId != null &&
                    this.SentId.Equals(input.SentId))
                ) && 
                (
                    this.PhoneNumber == input.PhoneNumber ||
                    (this.PhoneNumber != null &&
                    this.PhoneNumber.Equals(input.PhoneNumber))
                ) && 
                (
                    this.WhatsappId == input.WhatsappId ||
                    (this.WhatsappId != null &&
                    this.WhatsappId.Equals(input.WhatsappId))
                ) && 
                (
                    this.CountryCode == input.CountryCode ||
                    (this.CountryCode != null &&
                    this.CountryCode.Equals(input.CountryCode))
                ) && 
                (
                    this.NumberType == input.NumberType ||
                    this.NumberType.Equals(input.NumberType)
                ) && 
                (
                    this.ProfilePicture == input.ProfilePicture ||
                    (this.ProfilePicture != null &&
                    this.ProfilePicture.Equals(input.ProfilePicture))
                ) && 
                (
                    this.IsBusiness == input.IsBusiness ||
                    this.IsBusiness.Equals(input.IsBusiness)
                ) && 
                (
                    this.InvalidRecord == input.InvalidRecord ||
                    this.InvalidRecord.Equals(input.InvalidRecord)
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.SentId != null)
                {
                    hashCode = (hashCode * 59) + this.SentId.GetHashCode();
                }
                if (this.PhoneNumber != null)
                {
                    hashCode = (hashCode * 59) + this.PhoneNumber.GetHashCode();
                }
                if (this.WhatsappId != null)
                {
                    hashCode = (hashCode * 59) + this.WhatsappId.GetHashCode();
                }
                if (this.CountryCode != null)
                {
                    hashCode = (hashCode * 59) + this.CountryCode.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.NumberType.GetHashCode();
                if (this.ProfilePicture != null)
                {
                    hashCode = (hashCode * 59) + this.ProfilePicture.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsBusiness.GetHashCode();
                hashCode = (hashCode * 59) + this.InvalidRecord.GetHashCode();
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