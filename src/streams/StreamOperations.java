package streams;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class StreamOperations {

    static List<String> students = List.of(
            "John", "Jane", "Mary", "Harry", "Joe", "George", "Emma", "Stella", "Ava", "Sophia", "Olivia", "Isabella",
            "Mia", "Charlotte", "Abigail", "Emily", "Harper", "Amelia", "Evelyn", "Elizabeth");

    public static void main(String[] args) {
        anyMatchCalls();
        allMatchCalls();
        filterCalls();
        mapCalls();
        reduceCalls();
        collectDemoCalls();
        multiOperationCalls();
    }

    public static void anyMatchCalls() {
        System.out.println("anyMatchCalls");
        System.out.println("=============");
        System.out
                .println("anyMatch(s -> s.startsWith(\"J\")) = " + students.stream().anyMatch(s -> s.startsWith("J")));
        System.out
                .println("anyMatch(s -> s.startsWith(\"Z\")) = " + students.stream().anyMatch(s -> s.startsWith("Z")));
        System.out.println();
    };

    public static void allMatchCalls() {
        System.out.println("allMatchCalls");
        System.out.println("=============");
        System.out
                .println("allMatch(s -> s.startsWith(\"J\")) = " + students.stream().allMatch(s -> s.startsWith("J")));
        System.out
                .println("allMatch(s -> s.startsWith(\"Z\")) = " + students.stream().allMatch(s -> s.startsWith("Z")));
        System.out.println();
    };

    public static void filterCalls() {
        System.out.println("filterCalls");
        System.out.println("===========");
        students.stream().filter(s -> s.startsWith("J")).forEach(System.out::println);
        students.stream().filter(s -> s.startsWith("Z")).forEach(System.out::println);
        System.out.println();
    };

    public static void mapCalls() {
        System.out.println("mapCalls");
        System.out.println("========");
        students.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        students.stream().map(s -> s.toLowerCase()).forEach(System.out::println);
        System.out.println();
    };

    public static void reduceCalls() {
        System.out.println("reduceCalls");
        System.out.println("===========");
        System.out.println(
                "reduce((s1, s2) -> s1 + \" \" + s2) = " + students.stream().reduce("", (s1, s2) -> s1 + " " + s2));
        System.out.println("reduce((s1, s2) -> s1 + \" \" + s2).get() = "
                + students.stream().reduce((s1, s2) -> s1 + " " + s2).get());
        System.out.println();
    };

    public static void collectDemoCalls() {
        System.out.println("collectDemoCalls");
        System.out.println("================");
        System.out.println("collect(Collectors.toList()) = " + students.stream().collect(Collectors.toList()));
        System.out.println("collect(Collectors.toSet()) = " + students.stream().collect(Collectors.toSet()));
        System.out.println("collect(Collectors.toCollection(LinkedList::new)) = "
                + students.stream().collect(Collectors.toCollection(LinkedList::new)));
        System.out.println("collect(Collectors.toMap(s -> s, s -> s.length())) = "
                + students.stream().collect(Collectors.toMap(s -> s, s -> s.length())));
        System.out.println();
    }

    public static void multiOperationCalls() {
        System.out.println("multiOperationCalls");
        System.out.println("==================");
        System.out.println(
                "students.stream().filter(s -> s.startsWith(\"J\")).map(s -> s.toUpperCase()).collect(Collectors.toList()) = "
                        + students.stream()
                                .filter(s -> s.startsWith("J"))
                                .map(s -> s.toUpperCase())
                                .collect(Collectors.toList()));
        System.out.println(
                "students.stream().filter(s -> s.startsWith(\"J\")).map(s -> s.toUpperCase()).reduce((s1, s2) -> s1 + \" \" + s2).get() = "
                        + students.stream()
                                .filter(s -> s.startsWith("J"))
                                .map(s -> s.toUpperCase())
                                .reduce((s1, s2) -> s1 + " " + s2)
                                .get());
        System.out.println();
    }

}
