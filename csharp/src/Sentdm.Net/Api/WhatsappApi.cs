using Sentdm.Net.Client;

namespace Sentdm.Net.Api
{
    public partial class WhatsappApi : WhatsappApiGenerated {
        public WhatsappApi() : base() {}
        public WhatsappApi(string basePath): base(basePath) {}
        public WhatsappApi(Sentdm.Net.Client.Configuration configuration): base(configuration) {}
        public WhatsappApi(Sentdm.Net.Client.ISynchronousClient client, Sentdm.Net.Client.IAsynchronousClient asyncClient, Sentdm.Net.Client.IReadableConfiguration configuration): base(client, asyncClient, configuration) {}
    }
}