package dm.sent.client.api;

import dm.sent.client.ApiClient;
import dm.sent.client.model.SMSPayload;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmsApi extends SmsApiGenerated {

    public SmsApi(ApiClient apiClient) throws IllegalArgumentException {
        super(apiClient);
    }
    public class GetContactInfoRequestBuilder extends GetContactInfoRequestBuilderGenerated {
        public GetContactInfoRequestBuilder(String phoneNumber, Boolean retrieveIfDoesNotExists) {
            super(phoneNumber, retrieveIfDoesNotExists);
        }
    }
}
