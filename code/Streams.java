import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        streamFilter();

        // stream examples:
        // join an array of strings into a single string
        String[] strArr = {"x", "y", "z"};
        String str = Stream.of(strArr).collect(Collectors.joining());

    }

    // stream examples:

    // 1. Stream.of will return a stream of the given values
    static void streamOf() {
        Stream.of("a", "b", "c").forEach(System.out::println);
    }

    // 2. Stream.empty will return an empty stream
    static void streamEmpty() {
        Stream.empty().forEach(System.out::println);
    }

    // 3. Stream.generate will return an infinite stream of the given value
    static void streamGenerate() {
        Stream.generate(() -> "element").forEach(System.out::println);
    }

    // 4. Stream.iterate will return an infinite stream of the given value
    static void streamIterate() {
        Stream.iterate(40, n -> n + 2).forEach(System.out::println);
    }

    // 5. Stream.concat will return a stream of the concatenated streams
    static void streamConcat() {
        String[] strArr1 = {"a", "b", "c"};
        Stream.concat(Stream.of(strArr1), Stream.of(new String[] {"x","y","z"})).forEach(a -> System.out.print(a + " "));
    }

    // 6. Stream.toArray will return an array of the stream
    static void streamToArray() {
        String[] strArr1 = {"a", "b", "c"};
        String[] strArr2 = Stream.of(strArr1).toArray(String[]::new);
        System.out.println(Arrays.toString(strArr2));
    }

    // 7. Stream.collect will return a collection of the stream
    static void streamCollect() {
        String[] strArr1 = {"a", "b", "c"};
        Collector<CharSequence, ?, String> collector = Collectors.joining();
        String str = Stream.of(strArr1).collect(collector);
        System.out.println(str);
        // in one line:
        System.out.println(Stream.of(strArr1).collect(Collectors.joining()));
    }

    // more examples:
    // 8. Stream.filter will return a stream of the filtered elements
    static void streamFilter() {
        String[] strArr1 = {"aaa", "bbb", "ccc"};
        Stream.of(strArr1).filter(s -> s.contains("b")).forEach(System.out::println);
    }

    // 9. Stream.map will return a stream of the mapped elements
    static void streamMap() {
        String[] strArr1 = {"a", "b", "c"};
        Stream.of(strArr1).map(s -> s.toUpperCase()).forEach(System.out::println);
    }

    // 10. Stream.flatMap will return a stream of the flat-mapped elements
    static void streamFlatMap() {
        String[] strArr1 = {"a", "b", "c"};
        Stream.of(strArr1).flatMap(s -> Stream.of(s.toUpperCase())).forEach(System.out::println);
    }

    // 11. Stream.distinct will return a stream of the distinct elements
    static void streamDistinct() {
        String[] strArr1 = {"a", "b", "c", "a"};
        Stream.of(strArr1).distinct().forEach(System.out::println);
    }

    // 12. Stream.sorted will return a stream of the sorted elements
    static void streamSorted() {
        String[] strArr1 = {"a", "b", "c"};
        Stream.of(strArr1).sorted().forEach(System.out::println);
    }

    // 13. Stream.peek will return a stream of the peeked elements
    static void streamPeek() {
        String[] strArr1 = {"a", "b", "c"};
        Stream.of(strArr1).peek(s -> System.out.println(s)).forEach(System.out::println);
    }

    // 14. Stream.limit will return a stream of the limited elements
    static void streamLimit() {
        String[] strArr1 = {"a", "b", "c"};
        Stream.of(strArr1).limit(2).forEach(System.out::println);
    }

    // 15. Stream.skip will return a stream of the skipped elements
    static void streamSkip() {
        String[] strArr1 = {"a", "b", "c"};
        Stream.of(strArr1).skip(2).forEach(System.out::println);
    }

    // 16. Stream.forEach will return a stream of the for-each elements
    static void streamForEach() {
        String[] strArr1 = {"a", "b", "c"};
        Stream.of(strArr1).forEach(System.out::println);
    }

    // 17. Stream.forEachOrdered will return a stream of the for-each-ordered elements
    static void streamForEachOrdered() {
        String[] strArr1 = {"a", "b", "c"};
        Stream.of(strArr1).forEachOrdered(System.out::println);
    }

    // 18. Stream.count will return a stream of the counted elements
    static void streamCount() {
        String[] strArr1 = {"a", "b", "c"};
        System.out.println(Stream.of(strArr1).count());
    }

    // 19. Stream.min will return a stream of the minimum elements
    static void streamMin() {
        String[] strArr1 = {"a", "b", "c"};
        System.out.println(Stream.of(strArr1).min((s1, s2) -> s1.compareTo(s2)));
    }

    // 20. Stream.max will return a stream of the maximum elements
    static void streamMax() {
        String[] strArr1 = {"a", "b", "c"};
        System.out.println(Stream.of(strArr1).max((s1, s2) -> s1.compareTo(s2)));
    }

    // 21. Stream.anyMatch will return a stream of the any-matched elements
    static void streamAnyMatch() {
        String[] strArr1 = {"a", "b", "c"};
        System.out.println(Stream.of(strArr1).anyMatch(s -> s.contains("b")));
    }

    // 22. Stream.allMatch will return a stream of the all-matched elements
    static void streamAllMatch() {
        String[] strArr1 = {"a", "b", "c"};
        System.out.println(Stream.of(strArr1).allMatch(s -> s.contains("b")));
    }

    // 23. Stream.noneMatch will return a stream of the none-matched elements
    static void streamNoneMatch() {
        String[] strArr1 = {"a", "b", "c"};
        System.out.println(Stream.of(strArr1).noneMatch(s -> s.contains("d")));
    }

    // 24. Stream.findFirst will return a stream of the first-found elements
    static void streamFindFirst() {
        String[] strArr1 = {"a", "b", "c"};
        System.out.println(Stream.of(strArr1).findFirst());
    }

    // 25. Stream.findAny will return a stream of the any-found elements
    static void streamFindAny() {
        String[] strArr1 = {"a", "b", "c"};
        System.out.println(Stream.of(strArr1).findAny());
    }

    
}

// what is String[]::new?

// String[]::new is a method reference to the constructor of String[]
// String[]::new is equivalent to the lambda expression () -> new String[]
// String[]::new is equivalent to the lambda expression (length) -> new String[length]

