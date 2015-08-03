package com.parse4cn1;

public class NativeAccessImpl implements com.parse4cn1.NativeAccess{
    public String testNativeCall(String param) {
        return "JavaSE " + param;
    }

    public boolean isSupported() {
        return true;
    }

}
