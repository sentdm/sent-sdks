using Sentdm.Net.Client;

namespace Sentdm.Net.Api
{
    public partial class SMSApi : SMSApiGenerated {
        public SMSApi() : base() {}
        public SMSApi(string basePath): base(basePath) {}
        public SMSApi(Sentdm.Net.Client.Configuration configuration): base(configuration) {}
        public SMSApi(Sentdm.Net.Client.ISynchronousClient client, Sentdm.Net.Client.IAsynchronousClient asyncClient, Sentdm.Net.Client.IReadableConfiguration configuration): base(client, asyncClient, configuration) {}
    }
}