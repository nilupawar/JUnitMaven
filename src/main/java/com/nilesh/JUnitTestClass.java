
package com.nilesh;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JUnitTestClass {

    private static final Logger LOG = LoggerFactory.getLogger(JUnitTestClass.class);

    @Test
    public void firstTestTrial(){
        System.out.println("SOUT - This is first Unit test for sample JUnit/Maven/Logger example");
        LOG.info("LOGGER - info - This is first Unit test for sample JUnit/Maven/Logger example");
        LOG.debug("LOGGER - debug - This is first Unit test for sample JUnit/Maven/Logger example");
    }
}
