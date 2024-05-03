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

public static void mergeSort() {
  System.out.println("Soertiert mit MergeSort");
  
}

public static void quickSort() {
  System.out.println("Sortiert mit QuickSort"); 
}

public static void insertSort() {
  System.out.println("Sortiert mit InsertSort");
}
}
