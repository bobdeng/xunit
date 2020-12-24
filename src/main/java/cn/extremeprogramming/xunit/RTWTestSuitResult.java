package cn.extremeprogramming.xunit;

import java.util.List;

public class RTWTestSuitResult {
    private final Class<? extends RTWTestCase> testCase;
    private final List<RTWTestResult> resultList;

    public RTWTestSuitResult(Class<? extends RTWTestCase> testCase, List<RTWTestResult> resultList) {
        this.testCase = testCase;
        this.resultList = resultList;
    }

    public Class<? extends RTWTestCase> getTestCase() {
        return testCase;
    }

    public List<RTWTestResult> getResultList() {
        return resultList;
    }
}
