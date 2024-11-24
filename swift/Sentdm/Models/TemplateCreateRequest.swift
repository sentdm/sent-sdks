//
// TemplateCreateRequest.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Request model for creating a new message template */
public struct TemplateCreateRequest: Codable, JSONEncodable, Hashable {

    /** Unique identifier of the customer creating the template */
    public var customerId: String
    /** Name of the template for identification purposes */
    public var name: String

    public init(customerId: String, name: String) {
        self.customerId = customerId
        self.name = name
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case customerId
        case name
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var codingContainer = encoder.container(keyedBy: CodingKeys.self)
        try codingContainer.encode(customerId, forKey: .customerId)
        try codingContainer.encode(name, forKey: .name)
    }
}
