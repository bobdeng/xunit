package cn.extremeprogramming.xunit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class RTWTestSuit {
    private final List<RTWTestCase> testCaseList = new ArrayList<>();

    public void registerTestCase(RTWTestCase testCase) {
        this.testCaseList.add(testCase);
    }

    public List<RTWTestSuitResult> runTest() {
        return testCaseList.stream()
                .map(testCase -> new RTWTestSuitResult(testCase.getClass(),testCase.runTest()))
                .collect(Collectors.toList());
    }

    public int numberOfTestCase() {
        return testCaseList.size();
    }
}
