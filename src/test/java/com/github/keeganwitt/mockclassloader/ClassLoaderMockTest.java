package com.github.keeganwitt.mockclassloader;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ClassLoaderMockTest {
    @Test
    public void testMockClassLoader() throws ClassNotFoundException {
        SomeClassToTest subject = Mockito.spy(new SomeClassToTest(Mockito.mock(ClassLoader.class)));
        Assert.assertNotNull(subject.findStringClass());
    }
}
