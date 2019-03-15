package com.valuelabs.JUnitTesting;

public class PowerMock {
	 
    public String PrivateMethodCall(String message) {
        return privateMethod(message);
    }
 
    public String StaticMethodCall(String message) {
        return staticMethod(message);
    }
 
    private String privateMethod(String Message) {
        return "another " + Message;
    }
    
    public static String staticMethod(String message) {
        return "Hello " + message;
    }
}