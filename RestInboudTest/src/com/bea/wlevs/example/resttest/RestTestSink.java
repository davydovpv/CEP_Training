/* (c) 2006-2014 Oracle.  All rights reserved. */
package com.bea.wlevs.example.resttest;

import com.bea.wlevs.ede.api.StreamSink;
import com.bea.wlevs.event.example.resttest.RestEvent;

public class RestTestSink implements StreamSink {

    /* (non-Javadoc)
     * @see com.bea.wlevs.ede.api.StreamSink#onInsertEvent(java.lang.Object)
     */
    public void onInsertEvent(Object event) {
        if (event instanceof RestEvent) {
            RestEvent restEvent = (RestEvent) event;
            System.out.println("Message: " + restEvent.getMessage());
        }
    }
}
