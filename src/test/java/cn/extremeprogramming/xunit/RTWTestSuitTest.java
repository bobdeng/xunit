package cn.extremeprogramming.xunit;

import cn.extremeprogramming.xunit.fixture.*;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RTWTestSuitTest {
    @Test
    public void should_has_0_test_case_when_empty() {
        RTWEmptyTestSuit rtwTestSuit = new RTWEmptyTestSuit();
        assertThat(rtwTestSuit.numberOfTestCase(), is(0));
    }

    @Test
    public void should_has_1_test_case_when_register_one() {
        RTWSingleTestCaseSuit testCaseSuit = new RTWSingleTestCaseSuit();
        assertThat(testCaseSuit.numberOfTestCase(), is(1));
    }

    @Test
    public void should_get_empty_results_when_run() {
        RTWEmptyTestSuit testCaseSuit = new RTWEmptyTestSuit();
        List<RTWTestSuitResult> testSuitResults = testCaseSuit.runTest();
        assertThat(testSuitResults.size(), is(0));
    }

    @Test
    public void should_get_one_test_results_with_empty_test_result_when_run_with_empty_test_case() {
        RTWSingleTestCaseSuitWithEmptyTestCase testSuit = new RTWSingleTestCaseSuitWithEmptyTestCase();
        List<RTWTestSuitResult> testSuitResults = testSuit.runTest();
        assertThat(testSuitResults.size(), is(1));
        assertThat(testSuitResults.get(0).getTestCase().getName(), is(EmptyTestCase.class.getName()));
        assertThat(testSuitResults.get(0).getResultList().size(), is(0));
    }

    @Test
    public void should_get_one_test_results_with_1_test_result_when_run_with_single_test_case() {
        RTWSingleTestCaseSuit testSuit = new RTWSingleTestCaseSuit();
        List<RTWTestSuitResult> testSuitResults = testSuit.runTest();
        assertThat(testSuitResults.size(), is(1));
        assertThat(testSuitResults.get(0).getTestCase().getName(), is(SingleMethodTestCase.class.getName()));
        assertThat(testSuitResults.get(0).getResultList().size(), is(1));
    }
}
