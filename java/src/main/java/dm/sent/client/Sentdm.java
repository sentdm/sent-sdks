package dm.sent.client;

import dm.sent.client.api.ContactApi;
import dm.sent.client.api.CustomersApi;
import dm.sent.client.api.MessagesApi;
import dm.sent.client.api.SmsApi;
import dm.sent.client.api.TemplatesApi;
import dm.sent.client.api.WhatsappApi;

public class Sentdm {
    private ApiClient apiClient;
    public final ContactApi contact;
    public final CustomersApi customers;
    public final MessagesApi messages;
    public final SmsApi sms;
    public final TemplatesApi templates;
    public final WhatsappApi whatsapp;

    public Sentdm() {
        this(null);
    }

    public Sentdm(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.contact = new ContactApi(this.apiClient);
        this.customers = new CustomersApi(this.apiClient);
        this.messages = new MessagesApi(this.apiClient);
        this.sms = new SmsApi(this.apiClient);
        this.templates = new TemplatesApi(this.apiClient);
        this.whatsapp = new WhatsappApi(this.apiClient);
    }

}
