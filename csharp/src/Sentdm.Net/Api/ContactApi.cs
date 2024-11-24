using Sentdm.Net.Client;

namespace Sentdm.Net.Api
{
    public partial class ContactApi : ContactApiGenerated {
        public ContactApi() : base() {}
        public ContactApi(string basePath): base(basePath) {}
        public ContactApi(Sentdm.Net.Client.Configuration configuration): base(configuration) {}
        public ContactApi(Sentdm.Net.Client.ISynchronousClient client, Sentdm.Net.Client.IAsynchronousClient asyncClient, Sentdm.Net.Client.IReadableConfiguration configuration): base(client, asyncClient, configuration) {}
    }
}