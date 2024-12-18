//
// Contact.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Represents a contact in the Sent messaging platform with their communication preferences and channel availability */
public struct Contact: Codable, JSONEncodable, Hashable {

    /** Unique identifier for the contact */
    public var id: String?
    /** Contact's phone number in E.164 format */
    public var phoneNumber: String?
    /** Two-letter ISO country code */
    public var countryCode: String?
    /** Phone number formatted according to national standards */
    public var nationalFormat: String?
    /** Comma-separated list of available messaging channels (SMS, WHATSAPP) */
    public var availableChannels: String?
    /** Preferred messaging channel for this contact */
    public var defaultChannel: String?
    /** Indicates if the contact's phone number has been verified */
    public var verified: Bool?
    /** Timestamp when the contact was created */
    public var createdAt: Date?
    /** Timestamp when the contact was last updated */
    public var updatedAt: Date?

    public init(id: String? = nil, phoneNumber: String? = nil, countryCode: String? = nil, nationalFormat: String? = nil, availableChannels: String? = nil, defaultChannel: String? = nil, verified: Bool? = nil, createdAt: Date? = nil, updatedAt: Date? = nil) {
        self.id = id
        self.phoneNumber = phoneNumber
        self.countryCode = countryCode
        self.nationalFormat = nationalFormat
        self.availableChannels = availableChannels
        self.defaultChannel = defaultChannel
        self.verified = verified
        self.createdAt = createdAt
        self.updatedAt = updatedAt
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case phoneNumber
        case countryCode
        case nationalFormat
        case availableChannels
        case defaultChannel
        case verified
        case createdAt
        case updatedAt
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var codingContainer = encoder.container(keyedBy: CodingKeys.self)
        try codingContainer.encodeIfPresent(id, forKey: .id)
        try codingContainer.encodeIfPresent(phoneNumber, forKey: .phoneNumber)
        try codingContainer.encodeIfPresent(countryCode, forKey: .countryCode)
        try codingContainer.encodeIfPresent(nationalFormat, forKey: .nationalFormat)
        try codingContainer.encodeIfPresent(availableChannels, forKey: .availableChannels)
        try codingContainer.encodeIfPresent(defaultChannel, forKey: .defaultChannel)
        try codingContainer.encodeIfPresent(verified, forKey: .verified)
        try codingContainer.encodeIfPresent(createdAt, forKey: .createdAt)
        try codingContainer.encodeIfPresent(updatedAt, forKey: .updatedAt)
    }
}

