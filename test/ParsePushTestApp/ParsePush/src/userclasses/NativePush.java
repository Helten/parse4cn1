/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import com.codename1.system.NativeInterface;

/**
 *
 * @author okwudirec
 */
public interface NativePush extends NativeInterface {
    String testNewNativeCall(String input);
    void initialize(String applicationId, String clientKey);
    String enablePush(String applicationId, String clientKey);
}
