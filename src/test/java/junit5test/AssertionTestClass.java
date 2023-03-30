package junit5test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionTestClass {

    @Test
    void assertEqual(){
        Assertions.assertEquals("first", "first");
    }
}
