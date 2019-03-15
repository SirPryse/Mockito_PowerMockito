package com.valuelabs.JUnitTesting;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.support.membermodification.MemberMatcher.method;

import org.junit.Rule;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;


@PrepareForTest(PowerMock.class)
public class PowerMockTest {
	
    @Test
    public void testPrivateMethodCall() throws Exception{
        PowerMock PrivateSpy = PowerMockito.spy(new PowerMock());
        when(PrivateSpy, method(PowerMock.class, "privateMethod", String.class)).withArguments(anyString()).thenReturn("This is Private.");
        String result = PrivateSpy.PrivateMethodCall("test");
        assertEquals("This is Private.", result);
    }
 
    @Test
    public void testStaticMethodCall(){
        mockStatic(PowerMock.class);
        when(PowerMock.staticMethod(anyString())).thenReturn("This is Static.");
        String result = new PowerMock().StaticMethodCall("test");
        assertEquals("This is Static.", result);
    }

}
