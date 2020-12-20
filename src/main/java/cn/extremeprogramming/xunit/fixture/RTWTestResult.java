package cn.extremeprogramming.xunit.fixture;

public class RTWTestResult {
    private String methodName;
    private boolean success;
    private Throwable exception;

    public String getMethodName() {
        return methodName;
    }

    public boolean isSuccess() {
        return success;
    }

    public Throwable getException() {
        return exception;
    }

    public RTWTestResult() {
    }

    public RTWTestResult(String methodName, boolean success, Throwable exception) {
        this.methodName = methodName;
        this.success = success;
        this.exception = exception;
    }

}
