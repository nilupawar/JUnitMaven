package com.nilesh.testrunner;


import com.nilesh.test.JUnitAnotherTest;
import com.nilesh.test.JUnitTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({JUnitTest.class, JUnitAnotherTest.class})

public class JUnitSuiteTestRunner {
}
