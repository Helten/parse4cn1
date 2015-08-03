/**
 * Your application code goes here
 */

package userclasses;

import com.codename1.system.NativeLookup;
import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;
import com.parse4cn1.Parse;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    static private String installationId;
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
        
        Parse.initialize("j1KMuH9otZlHcPncU9dZ1JFH7cXL8K5XUiQQ9ot8", 
                "V6ZUyBtfERtzbq6vjeAb13tiFYij980HN9nQTWGB");
        NativePush nn = (NativePush)NativeLookup.create(NativePush.class);
        if (nn != null && nn.isSupported()) {
            installationId = nn.enablePush(Parse.getApplicationId(), Parse.getClientKey());
        }
    }


    @Override
    protected void beforeMain(Form f) {
        String msg = null;
        NativePush nn = (NativePush)NativeLookup.create(NativePush.class);
        if (nn != null) {
           if (nn.isSupported()) {
               msg = "Installation ID: " + installationId;
           } else {
               msg = "NN not supported";
           }
        } else {
            msg = "NN could not be instantiated";
        }
        
        Dialog.show("Native access", msg, "Ok", null);
    }
}
