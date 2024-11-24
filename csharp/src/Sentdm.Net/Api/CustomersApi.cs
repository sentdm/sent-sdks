using Sentdm.Net.Client;

namespace Sentdm.Net.Api
{
    public partial class CustomersApi : CustomersApiGenerated {
        public CustomersApi() : base() {}
        public CustomersApi(string basePath): base(basePath) {}
        public CustomersApi(Sentdm.Net.Client.Configuration configuration): base(configuration) {}
        public CustomersApi(Sentdm.Net.Client.ISynchronousClient client, Sentdm.Net.Client.IAsynchronousClient asyncClient, Sentdm.Net.Client.IReadableConfiguration configuration): base(client, asyncClient, configuration) {}
    }
}