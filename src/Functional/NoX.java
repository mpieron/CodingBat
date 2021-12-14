package Functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public List<String> noX(List<String> strings) {
        return strings.stream().map(x -> x.replace("x", "")).collect(Collectors.toList());
    }
}
