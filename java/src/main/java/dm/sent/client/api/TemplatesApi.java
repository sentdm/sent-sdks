package dm.sent.client.api;

import dm.sent.client.ApiClient;
import dm.sent.client.model.ResponsesTemplateResponse;
import dm.sent.client.model.TemplateCreateRequest;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplatesApi extends TemplatesApiGenerated {

    public TemplatesApi(ApiClient apiClient) throws IllegalArgumentException {
        super(apiClient);
    }
    public class CreateTemplateRequestBuilder extends CreateTemplateRequestBuilderGenerated {
        public CreateTemplateRequestBuilder(UUID customerId, String name) {
            super(customerId, name);
        }
    }
    public class GetTemplatesForCustomerRequestBuilder extends GetTemplatesForCustomerRequestBuilderGenerated {
        public GetTemplatesForCustomerRequestBuilder(UUID customerId) {
            super(customerId);
        }
    }
}
