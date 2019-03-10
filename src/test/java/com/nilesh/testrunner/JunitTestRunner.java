package com.nilesh.testrunner;


import com.nilesh.test.JUnitTest;
import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class JunitTestRunner {

    private static Logger LOG = LoggerFactory.getLogger(JunitTestRunner.class);

    public static void main(String[] args){
        Result result = JUnitCore.runClasses(JUnitTest.class);

        if(!result.wasSuccessful()){

            List<Failure> failures = result.getFailures();
            for(Failure failure : failures){

                LOG.error( "Failed test description : " + failure.getDescription());
                LOG.error("Failed test message " + failure.getMessage());
                LOG.error("Failed test header " + failure.getTestHeader());

            }
        }
    }
}
