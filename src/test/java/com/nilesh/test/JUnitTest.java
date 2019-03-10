package com.nilesh.test;

import com.nilesh.JUnitTestClassCopy;
import com.nilesh.MyApp;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class JUnitTest {

    private static final Logger LOG = LoggerFactory.getLogger(JUnitTestClassCopy.class);
    private MyApp myApp= new MyApp();


    @Test
    public void firstTestTrial(){
        LOG.info("LOGGER - info - This is first Unit test for sample JUnit/Maven/Logger example");
        assertThat("Value did not match",true,is(equalTo(false)));
    }


    @Test
    public void secondTestTrial(){
        LOG.info("LOGGER - info - This is second Unit test for sample JUnit/Maven/Logger example");
    }

}
