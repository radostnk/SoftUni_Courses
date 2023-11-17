package OOP.L_Reflection;

import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReflectionUtils {
    public static <T extends Member> Stream<T> filterMembersByPredicate(T[] elements, Predicate<T> predicate) {
        return Arrays.stream(elements).filter(predicate);
    }

    public static <T extends Member> Stream<T> filterMembersByPredicate(Stream<T> elements, Predicate<T> predicate) {
        return elements.filter(predicate);
    }

    public static <T extends Member> Stream<T> filterMembersByName(T[] elements, String filter) {
        return filterMembersByPredicate(elements, m -> m.getName().contains(filter));
    }

    public static <T extends Member> TreeSet<T> collectMembers(Stream<T> elements) {
        return elements.collect(Collectors.toCollection(
                () -> new TreeSet<>(Comparator.comparing(Member::getName))));
    }

    public static <T extends Member> TreeSet<T> filterByNameAndCollect(T[] elements, String filter) {
        return Arrays.stream(elements)
                .filter(el -> el.getName().contains(filter))
                .collect(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(Member::getName))));
    }
}
