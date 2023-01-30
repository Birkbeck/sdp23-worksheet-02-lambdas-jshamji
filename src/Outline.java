import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
//    Integer[] intArray = {1,7,3,4,8,2};
//    System.out.println(Arrays.asList(intArray));
    // Arrays.sort(intArray,.......)


    String[] words = {"apple", "banana", "Eriksen", "dog", "elephant"};
    int[] num = {67, 43, 56, 22, 11, 7};

//    Arrays.sort(words, (a, b) -> a.length() - b.length());

//    Arrays.sort(words, (a,b) -> b.length() - a.length());

//    Arrays.sort(words, (a,b) -> a.charAt(0) - b.charAt(0));

//    Arrays.sort(words, (a,b) -> {
//      if (a.contains("e") && !b.contains("e")){
//        return -1;
//      }
//      else if (!a.contains("e") && b.contains("e")) {
//        return 1;
//      }
//      else return 0;
//    });

//    Arrays.sort(words, Outline::eChecker);
//
//    System.out.println(Arrays.toString(words));

//    String test1 = "Betterment";
//    String test2 = "Hello";
//
//    String better = StringBetter.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length());
//    String better1 = StringBetter.betterString(test1, test2, (s1, s2) -> true);
//    System.out.println(better1);

//    List<String> shortWords = Outline.allMatches(List.of(words), s -> s.length() < 4);
//    List<String> wordsWithB = Outline.allMatches(List.of(words), s -> s.contains("b"));
//    List<String> evenLengthWords = Outline.allMatches(List.of(words), s -> (s.length() % 2) == 0);
    List<Integer> result = Outline.allMatches(Arrays.stream(num).boxed().collect(Collectors.toList()), n -> n < 20);


//    List<String> excitingWords = Outline.transformedList(List.of(words), s -> s + "!");
//    List<String> eyeWords = Outline.transformedList(List.of(words), s -> s.replace("i", "eye"));
//    List<String> upperCaseWords = Outline.transformedList(List.of(words), String::toUpperCase);
    System.out.println(result);

  }

  public static int eChecker(String s1, String s2) {
    if (s1.contains("e") && !s2.contains("e")) {
      return -1;
    } else if (!s1.contains("e") && s2.contains("e")) {
      return 1;
    }
    else return 0;
  }

  public static <T> List<T> allMatches(List<T> stringList, Predicate<T> predicate) {
    List<T> newList = new ArrayList<>();

    for (T word : stringList) {
      if (predicate.test(word)) {
         newList.add(word);
      }
    }
    return newList;
  }

  public static List<String> transformedList(List<String> stringList, Function<String, String> stringFunction) {
    List<String> newList = new ArrayList<>();

    for (String word : stringList) {
      String newWord = stringFunction.apply(word);
      newList.add(newWord);
    }
    return newList;

  }
}
