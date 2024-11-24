//
// SmsGetContactInfoResponse.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct SmsGetContactInfoResponse: Codable, JSONEncodable, Hashable {

    public var error: String?

    public init(error: String? = nil) {
        self.error = error
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case error
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var codingContainer = encoder.container(keyedBy: CodingKeys.self)
        try codingContainer.encodeIfPresent(error, forKey: .error)
    }
}

