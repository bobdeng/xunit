package cn.extremeprogramming.xunit;

import cn.extremeprogramming.xunit.fixture.EmptyTestCase;
import cn.extremeprogramming.xunit.fixture.SingleMethodTestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
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
        assertThat(singleMethodTestCase.testMethods(),is(Collections.singletonList("single_test_method")));
    }

}
