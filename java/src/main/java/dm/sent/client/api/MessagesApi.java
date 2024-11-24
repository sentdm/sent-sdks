package dm.sent.client.api;

import dm.sent.client.ApiClient;
import dm.sent.client.model.MessagesSendMessageToContactResponse;
import dm.sent.client.model.MessagesSendMessageToPhoneNumberResponse;
import dm.sent.client.model.SendMessageToContactRequest;
import dm.sent.client.model.SendMessageToPhoneNumberRequest;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagesApi extends MessagesApiGenerated {

    public MessagesApi(ApiClient apiClient) throws IllegalArgumentException {
        super(apiClient);
    }
    public class SendMessageToContactRequestBuilder extends SendMessageToContactRequestBuilderGenerated {
        public SendMessageToContactRequestBuilder(UUID customerId, UUID contactId, UUID templateId) {
            super(customerId, contactId, templateId);
        }
    }
    public class SendMessageToPhoneNumberRequestBuilder extends SendMessageToPhoneNumberRequestBuilderGenerated {
        public SendMessageToPhoneNumberRequestBuilder(UUID customerId, String phoneNumber, UUID templateId) {
            super(customerId, phoneNumber, templateId);
        }
    }
}
