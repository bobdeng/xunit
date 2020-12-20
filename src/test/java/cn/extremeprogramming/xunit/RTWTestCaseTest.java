package cn.extremeprogramming.xunit;

import cn.extremeprogramming.xunit.fixture.EmptyTestCase;
import cn.extremeprogramming.xunit.fixture.RTWTestResult;
import cn.extremeprogramming.xunit.fixture.SingleMethodTestCase;
import cn.extremeprogramming.xunit.fixture.SingleMethodTestCaseFail;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class RTWTestCaseTest {
    @Test
    public void should_create_test_object() {
        EmptyTestCase emptyTestCase = new EmptyTestCase();
        assertThat(emptyTestCase.numberOfTestMethods(), is(0));
    }

    @Test
    public void should_register_test_method() {
        SingleMethodTestCase singleMethodTestCase = new SingleMethodTestCase();
        assertThat(singleMethodTestCase.numberOfTestMethods(), is(1));
        assertThat(singleMethodTestCase.testMethods(), is(Collections.singletonList("single_test_method")));
    }

    @Test
    public void should_get_success_test_result_when_run_success() {
        SingleMethodTestCase singleMethodTestCase = new SingleMethodTestCase();
        List<RTWTestResult> testResults = singleMethodTestCase.runTest();
        assertThat(testResults.size(), is(1));
        assertThat(testResults.get(0).isSuccess(), is(true));
        assertThat(testResults.get(0).getException(), nullValue());
        assertThat(testResults.get(0).getMethodName(), is("single_test_method"));
    }
    @Test
    public void should_get_fail_test_result_when_run_fail(){
        SingleMethodTestCaseFail singleMethodTestCase = new SingleMethodTestCaseFail();
        List<RTWTestResult> testResults = singleMethodTestCase.runTest();
        assertThat(testResults.size(), is(1));
        assertThat(testResults.get(0).isSuccess(), is(false));
        assertThat(testResults.get(0).getException(), notNullValue());
        assertThat(testResults.get(0).getMethodName(), is("single_test_method"));

    }

}
