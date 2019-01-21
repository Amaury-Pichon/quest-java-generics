
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Generics {
  interface Predicate<T> { boolean filter(T obj); }
  interface Mapper<T, U> { U map(T obj); }

  /**
   * Java entry point
   */
  public static void main(String... args) {
    new Generics();
  }

  /**
   * Class Constructor
   */
  private Generics() {
    List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    List<String>  strs = Arrays.asList("tout", "titi", "ototo", "jean", "tous", "taratata");

    // TODO - Ne retourner que les nombres pairs.
    // TODO - Multiplier par 2 chaque élément de la liste.
    ints
            .stream()
            .filter(i -> i%2 ==0)
            .mapToInt(i -> 2 * i)
            .forEach(System.out::println);


    // TODO - Ne retourner que les Strings contenant au moins 2 lettres t.
    // TODO - Passer en majuscule toutes les Strings
    strs
            .stream()
            .filter(i ->  i.matches("(.*t){2,}.*"))
            .map(String::toUpperCase)
            .forEach(System.out::println);
  }
}
