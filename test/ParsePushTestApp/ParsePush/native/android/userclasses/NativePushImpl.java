package userclasses;

import com.parse.Parse;
import com.parse.ParsePush;
import com.parse.SaveCallback;
import com.parse.ParseInstallation;
import com.parse.ParseException;
import com.codename1.impl.android.AndroidNativeUtil;

public class NativePushImpl {
    
    public void initialize(String appKey, String clientKey) {
//        Parse.initialize(AndroidNativeUtil.getActivity(), 
//                appKey, clientKey);
//        ParseInstallation.getCurrentInstallation().saveInBackground();
//        
//        ParsePush.subscribeInBackground("", new SaveCallback() {
//            @Override
//            public void done(ParseException e) {
////              if (e == null) {
////                Log.d("com.parse.push", "successfully subscribed to the broadcast channel.");
////              } else {
////                Log.e("com.parse.push", "failed to subscribe for push", e);
////              }
//            }
//          });
    }
    
    public String enablePush(String appKey, String clientKey) {
        
        Parse.initialize(AndroidNativeUtil.getActivity(), 
                appKey, clientKey);
        ParseInstallation.getCurrentInstallation().saveInBackground();
        
        ParsePush.subscribeInBackground("", new SaveCallback() {
            @Override
            public void done(ParseException e) {
//              if (e == null) {
//                Log.d("com.parse.push", "successfully subscribed to the broadcast channel.");
//              } else {
//                Log.e("com.parse.push", "failed to subscribe for push", e);
//              }
            }
          });
        
        return ParseInstallation.getCurrentInstallation().getInstallationId();
    }

    public String testNewNativeCall(String param) {
        return "NN Android " + param;
    }

    public boolean isSupported() {
        return true;
    }

}
