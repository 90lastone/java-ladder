package domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Util {
    public static List split(String names) {
        return Stream.of(names.split(","))
                .map(name -> new Person(name))
                .collect(Collectors.toList());
    }
}
