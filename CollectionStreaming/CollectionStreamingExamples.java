import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionStreamingExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve","AnotherNameToShowFiltering");
        
        ///non terminal operation: filtering
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
        ///non terminal operation: mapping- transofming elements
        names.stream().map(name->name.length()).forEach(System.out::println);
        //non terminal operation: sorting
        names.stream().sorted().forEach(System.out::println);

        //Terminal operation: collecting
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);
        //Terminal operation: reducing
        String concatenatedNames = names.stream()
                                        .reduce("", (a, b) -> a + b);
        System.out.println("Concatenated Names: " + concatenatedNames);
        //terminal: find first
        Optional<String> matched = names.stream()
                                        .findFirst();
        System.out.println("Found: "+ matched.toString());

        //non terminal: skip
        names.stream().skip(2).forEach(System.out::println);

}

}