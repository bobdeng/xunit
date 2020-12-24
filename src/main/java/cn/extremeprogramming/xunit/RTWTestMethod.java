package cn.extremeprogramming.xunit;

public class RTWTestMethod {
    private final String name;
    private final Runnable method;

    public RTWTestMethod(String name, Runnable method) {
        this.name = name;
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public RTWTestResult run() {
        try {
            method.run();
            return new RTWTestResult(name, true, null);
        } catch (Throwable e) {
            return new RTWTestResult(name, false, e);
        }
    }
}
