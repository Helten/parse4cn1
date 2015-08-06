namespace com.parse4cn1.TestApp{

using System;
using System.Windows;
// using Parse;

public class ParseNativeInterfaceImpl {
    public void test(String param) {
    }

    public bool initializePushNotifications(String appId, String clientKey) {
        /*
        ParseClient.Initialize(appId, clientKey);
        ParseInstallation.CurrentInstallation.SaveAsync();

        this.Startup += async (sender, args) =>
        {
            // This optional line tracks statistics around app opens, including push effectiveness.
            //ParseAnalytics.TrackAppOpens(RootFrame); // TODO find out how to get root frame

            // By convention, the empty string is considered a "Broadcast" channel
            // Note that we had to add "async" to the definition to use the await keyword
            await ParsePush.SubscribeAsync("");
        }
        */
        return true;
    }

    public bool isSupported() {
        return true;
    }

}
}
