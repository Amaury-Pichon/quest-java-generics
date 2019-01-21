
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
    ints = filter(ints, i -> i%2 == 0);
    // TODO - Multiplier par 2 chaque élément de la liste.
    ints = map(ints, i -> 2 * i);
    for (Integer i: ints) System.out.println(i);

    // TODO - Ne retourner que les Strings contenant au moins 2 lettres t.
    strs = filter(strs, i -> i.matches("(.*t){2,}.*"));
    // TODO - Passer en majuscule toutes les Strings
    strs = map(strs, i -> i.toUpperCase());
    for (String s: strs) System.out.println(s);
  }

  /**
   * Returns a list consisting of the elements of a collection that match the given predicate.
   * @param c Collection<T>: The input collection
   * @param p The predicate
   * @param <T> Type of the element in the collection
   * @return A list that match the given filter.
   */
  private <T> List<T> filter(Collection<T> c, Predicate<T> p) {
    List<T> result = new ArrayList<>();
    // TODO - Ajouter le code ici

    for(T obj : c){
      if(p.filter(obj))
        result.add(obj);
    }

    // Retourner 'result' contenant les éléments de Collection filtrés par la méthode o.filter().
    return result;
  }

  /**
   * Returns a list consisting of the results of applying the given function to the elements of the collection.
   * @param c Collection<T>: The input collection
   * @param m The predicate
   * @param <T> Type of the element in the collection
   * @param <U> Type of the element in the returned list
   * @return A list that match the given mapper.
   */
  private <T, U> List<U> map(Collection<T> c, Mapper<T, U> m) {
    List<U> result = new ArrayList<>();
    // TODO - Ajouter le code ici
    for(T obj : c){
      result.add(m.map(obj));
    }
    // Retourner 'result' contenant les éléments de la Collection modifiés par la méthode m.map().
    return result;
  }
}
