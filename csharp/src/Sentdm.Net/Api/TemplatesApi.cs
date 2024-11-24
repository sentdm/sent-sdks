using Sentdm.Net.Client;

namespace Sentdm.Net.Api
{
    public partial class TemplatesApi : TemplatesApiGenerated {
        public TemplatesApi() : base() {}
        public TemplatesApi(string basePath): base(basePath) {}
        public TemplatesApi(Sentdm.Net.Client.Configuration configuration): base(configuration) {}
        public TemplatesApi(Sentdm.Net.Client.ISynchronousClient client, Sentdm.Net.Client.IAsynchronousClient asyncClient, Sentdm.Net.Client.IReadableConfiguration configuration): base(client, asyncClient, configuration) {}
    }
}