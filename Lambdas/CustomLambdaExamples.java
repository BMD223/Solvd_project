public class CustomLambdaExamples {
    public static void main(String[] args) {
        MyPredicate<Integer> isEven = (Integer i) -> i % 2 == 0;
        System.out.println(isEven.test(4)); // true

        MyFunction<String, Integer> stringLength = (String s) -> s.length();
        System.out.println(stringLength.apply("Hello")); // 5
        
        MyBiFunction<String, String, String> concatStrings = (String s1, String s2) -> s1 + s2;
        System.out.println(concatStrings.apply("Hello", "World")); // HelloWorld
    }

    @FunctionalInterface
    interface MyPredicate<T> {
        boolean test(T t);
    }

    @FunctionalInterface
    interface MyFunction<T, R> {
        R apply(T t);
    }

    @FunctionalInterface
    interface MyBiFunction<T, U, R> {
        R apply(T t, U u);
    }
}