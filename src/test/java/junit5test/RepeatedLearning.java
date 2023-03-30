package junit5test;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedLearning {

    @RepeatedTest(5)
    void firstRepeatedTest(){
        System.out.println("We are repeating this test");
    }

    @RepeatedTest(value = 3, name = "Total repetition: {totalRepetitions}" )
    @DisplayName("This is a repeated test method")
    void secondRepeatedTest(){
        System.out.println("Test");
    }

    @RepeatedTest(3)
    void thirdRepeatedTest(RepetitionInfo info){
        Assumptions.assumingThat(info.getCurrentRepetition() == 3,
                ()-> System.out.println("running asuming test"));
    }
}
