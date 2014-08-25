/* (c) 2006-2014 Oracle.  All rights reserved. */
package com.bea.wlevs.example.helloworld;

import com.bea.wlevs.ede.api.StreamSink;
import com.bea.wlevs.event.example.helloworld.RestEvent;

public class HelloWorldBean implements StreamSink {

    /* (non-Javadoc)
     * @see com.bea.wlevs.ede.api.StreamSink#onInsertEvent(java.lang.Object)
     */
    public void onInsertEvent(Object event) {
        if (event instanceof RestEvent) {
            RestEvent helloWorldEvent = (RestEvent) event;
            System.out.println("Message: " + helloWorldEvent.getMessage());
        }
    }
}
