package cn.extremeprogramming.xunit.fixture;

import cn.extremeprogramming.xunit.RTWTestSuit;

public class RTWSingleTestCaseSuitWithEmptyTestCase extends RTWTestSuit {

    public RTWSingleTestCaseSuitWithEmptyTestCase() {
        this.registerTestCase(new EmptyTestCase());
    }


}
