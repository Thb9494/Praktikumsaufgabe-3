import java.util.List;

public class Ausgabe {
  public static void liste (List<Integer> liste) {
  //Liste soll ausgebenen werden, indem immer 30 Elemente in einer Zeile stehen
  for (int i = 0; i < liste.size(); i++) {
    if (i % 30 == 0) {
      System.out.println();
    }
    System.out.print(liste.get(i) + " ");
  }
  System.out.println();
}
}
