namespace com.parse4cn1{

using System;
using System.Windows;

public class NativeAccessImpl {
    public String  testNativeCall(String param) {
        return "WinPhone " + param;
    }

    public bool isSupported() {
        return true;
    }

}
}
