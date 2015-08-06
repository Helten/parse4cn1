/*
 * Copyright 2015 Chidiebere Okwudire.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package userclasses;

import com.codename1.system.NativeLookup;
import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;
import com.parse4cn1.Parse;
import com.parse4cn1.ParseException;
import com.parse4cn1.TestApp.ParseNativeInterface;
import com.parse4cn1.command.ParseGetCommand;
import com.parse4cn1.command.ParseResponse;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    private ParseNativeInterface parseNative;
    
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
        parseNative = (ParseNativeInterface)NativeLookup.create(ParseNativeInterface.class);
        if (parseNative != null && parseNative.isSupported()) {
            parseNative.test("initVars()");
        }
    }


    @Override
    protected void beforeMain(Form f) {
        if (parseNative != null && parseNative.isSupported()) {
            parseNative.test("beforeMain()");
        }
    }

    @Override
    protected void onCreateMain() {
        if (parseNative != null && parseNative.isSupported()) {
            parseNative.test("onCreateMain()");
        }
    }

    @Override
    protected void postMain(Form f) {
        if (parseNative != null && parseNative.isSupported()) {
            parseNative.test("postMain()");
        }
    }

    @Override
    protected void exitMain(Form f) {
        if (parseNative != null && parseNative.isSupported()) {
            parseNative.test("exitMain()");
        }
    }
}
