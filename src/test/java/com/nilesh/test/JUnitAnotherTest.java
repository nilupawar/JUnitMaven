package com.nilesh.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class JUnitAnotherTest {
    private static final Logger LOG = LoggerFactory.getLogger(JUnitAnotherTest.class);

    @Test
    public void thirdTestTrial(){
        LOG.info("LOGGER - info - This is first Unit test for sample JUnit/Maven/Logger example");
        assertThat("Value did not match",true,is(equalTo(false)));
    }
}
