# 创建一个测试类
作为一个负责任的程序员，我希望我写的代码，都能被程序自动化测试。因此，我需要一个工具，把我的测试方法包装起来，这样在未来我就可以通过运行这些测试方法来验证代码的正确性。
每个测试方法应该是一个void的、无入参的方法。一个测试类应该可以包括有多个测试方法，由于测试类也可能有一些非测试方法（我们假设我们也没有反射这种东西），因此需要测试类把自己的测试方法注册进来。调用者可以通过测试类，获取测试类测试方法的数量、名称。

