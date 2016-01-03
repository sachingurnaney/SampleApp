package test;

import android.test.InstrumentationTestCase;

/**
 * Created by sachin on 3/1/16.
 */
public class ExampleTest extends InstrumentationTestCase {


    public void test() throws Exception {
        final int expected = 1;
        final int reality = 1;
        assertEquals(expected, reality);
    }
}