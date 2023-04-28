package scheduler;


import java.util.List;
import java.util.Optional;

record Error(String name, String desc, int severity){}

public class App {
    public static void main(String[] args) {
        System.out.println(foo(null));
    }

    static List<Error> foo (List<String> errors){
        Optional<List<String>> errorList = Optional.ofNullable(errors);
        return errorList.map(err -> {
            String s = err.get(0);
            return List.of(new Error(s, s, 9));
        }).orElse(List.of(new Error("Empty", "Empty", 11)));
    }
}
