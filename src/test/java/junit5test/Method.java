package junit5test;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Method {

    static List<Arguments> sourceListStringAndDouble(){
        return Arrays.asList(arguments("aplle", 2.0), arguments("carrot", 9.0), arguments("carrot", 1.0));
    }
}
