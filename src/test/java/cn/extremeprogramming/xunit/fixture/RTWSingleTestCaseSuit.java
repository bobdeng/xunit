package cn.extremeprogramming.xunit.fixture;

import cn.extremeprogramming.xunit.RTWTestSuit;

public class RTWSingleTestCaseSuit extends RTWTestSuit {

    public RTWSingleTestCaseSuit() {
        this.registerTestCase(new SingleMethodTestCase());
    }


}
