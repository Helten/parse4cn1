package com.parse4cn1;

public class NativeAccessImpl {
    public String testNativeCall(String param) {
        return "j2me " + param;
    }

    public boolean isSupported() {
        return true;
    }

}
