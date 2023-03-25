package junit5test;

import org.junit.jupiter.api.*;

public class FirstTestClass {

    @BeforeAll
    static void bfAll(){
        System.out.println("Before all");
    }

    @BeforeEach
    public void bfEach(){
        System.out.println("Before each");
    }

    @AfterAll
    static void afAll(){
        System.out.println("after all");
    }

    @AfterEach
    void afEach(){
        System.out.println("after each");
    }

    @Test
    public void firstMethod(){
        System.out.println("First method");

    }

    @Test
    public void secondMethod(){
        System.out.println("Second method");
    }
}
