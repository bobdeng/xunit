package cn.extremeprogramming.xunit.fixture;

import cn.extremeprogramming.xunit.RTWTestCase;

public class SingleMethodTestCase extends RTWTestCase {
    public void single_test_method(){

    }

    public SingleMethodTestCase() {
        this.registerTestMethod("single_test_method", this::single_test_method);
    }

}
