package com.parse4cn1;

public class NativeAccessImpl {
    public String testNativeCall(String param) {
        return "Android " + param;
    }

    public boolean isSupported() {
        return true;
    }

}
