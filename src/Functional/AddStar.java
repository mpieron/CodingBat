package Functional;

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream().map(x -> x + "*").collect(Collectors.toList());
    }
}
