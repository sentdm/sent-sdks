using Sentdm.Net.Client;

namespace Sentdm.Net.Api
{
    public partial class MessagesApi : MessagesApiGenerated {
        public MessagesApi() : base() {}
        public MessagesApi(string basePath): base(basePath) {}
        public MessagesApi(Sentdm.Net.Client.Configuration configuration): base(configuration) {}
        public MessagesApi(Sentdm.Net.Client.ISynchronousClient client, Sentdm.Net.Client.IAsynchronousClient asyncClient, Sentdm.Net.Client.IReadableConfiguration configuration): base(client, asyncClient, configuration) {}
    }
}