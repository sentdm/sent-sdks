#import <Foundation/Foundation.h>
#import "SObject.h"

/**
* Sent.dm Core API
* Sent.dm is a unified messaging API that enables developers to seamlessly send messages across multiple channels including SMS and WhatsApp. It provides programmatic management of customer accounts, messaging capabilities with intelligent routing, message delivery, and template management. The API supports creating, updating, and managing customer profiles, sending messages using templates, retrieving contact information, and handling templates across different messaging channels.
*
* The version of the OpenAPI document: 1.1.0
* Contact: developers@sent.dm
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/





@protocol SMessagesSendMessageToContact400Response
@end

@interface SMessagesSendMessageToContact400Response : SObject


@property(nonatomic) NSString* error;

@property(nonatomic) NSArray<NSString*>* details;

@end
