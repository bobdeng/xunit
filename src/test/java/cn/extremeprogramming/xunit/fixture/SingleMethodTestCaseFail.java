package cn.extremeprogramming.xunit.fixture;

import static org.junit.Assert.fail;

public class SingleMethodTestCaseFail extends RTWTestCase{
    public void single_test_method(){
        fail();
    }

    public SingleMethodTestCaseFail() {
        this.registerTestMethod("single_test_method", this::single_test_method);
    }

}
