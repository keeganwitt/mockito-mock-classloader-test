package com.github.keeganwitt.mockclassloader;

public class SomeClassToTest {
    private ClassLoader classLoader;

    public SomeClassToTest(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public Class<?> findStringClass() throws ClassNotFoundException {
        return Class.forName("java.lang.String", true, classLoader);
    }
}
