//
// SendMessageToContactRequest.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Request model for sending a message to a contact using a template */
public struct SendMessageToContactRequest: Codable, JSONEncodable, Hashable {

    /** Unique identifier of the customer */
    public var customerId: String
    /** Unique identifier of the contact */
    public var contactId: String
    /** Unique identifier of the message template */
    public var templateId: String

    public init(customerId: String, contactId: String, templateId: String) {
        self.customerId = customerId
        self.contactId = contactId
        self.templateId = templateId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case customerId
        case contactId
        case templateId
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var codingContainer = encoder.container(keyedBy: CodingKeys.self)
        try codingContainer.encode(customerId, forKey: .customerId)
        try codingContainer.encode(contactId, forKey: .contactId)
        try codingContainer.encode(templateId, forKey: .templateId)
    }
}

