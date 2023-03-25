package junit5test;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParameterizedTestClass {

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6})
    void intValues(int param){
        System.out.println("param = " + param);
    }

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @NullAndEmptySource
    @ValueSource(strings = {"first", "second"})
    void stringValues(String param){
        System.out.println("param = " + param);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve?rogers", "bucky?barnes"}, delimiter = '?')
    void csvLearningStringString(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);

    }

    @ParameterizedTest
    @MethodSource(value = "sourceString")
    void methodSourceString(String param1){
        System.out.println("param1 = " + param1);
    }

    @ParameterizedTest
    @MethodSource(value = "sourceStringAsStream")
    void methodSourceStringStream(String param1){
        System.out.println("param1 = " + param1);
    }

    @ParameterizedTest
    @MethodSource(value = "sourceListStringAndDouble")
    void methodSourceStringDouble(String param1, double param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @MethodSource(value = "junit5test.Method#sourceListStringAndDouble")
    void methodSourceStringDoubleClass(String param1, double param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    List<String> sourceString(){
        return Arrays.asList("tomato", "carrot", "cabbage");
    }

    Stream<String> sourceStringAsStream(){
        return Stream.of("test", "lol", "apple");
    }

    List<Arguments> sourceListStringAndDouble(){
        return Arrays.asList(arguments("aplle", 2.0), arguments("carrot", 9.0), arguments("carrot", 1.0));
    }
}
