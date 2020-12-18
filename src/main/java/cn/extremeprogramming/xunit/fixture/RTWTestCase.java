package cn.extremeprogramming.xunit.fixture;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RTWTestCase {
    private final List<RTWTestMethod> methods = new ArrayList<>();

    public int numberOfTestMethods() {
        return methods.size();
    }

    protected void registerTestMethod(String methodName) {
        methods.add(new RTWTestMethod(methodName));
    }

    public List<String> testMethods() {
        return methods.stream().map(RTWTestMethod::getName).collect(Collectors.toList());
    }

}
