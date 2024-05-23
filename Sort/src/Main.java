import java.util.ArrayList;
import java.util.List;
public class Main{
public static void main(String[] args) {
  //erzeuge Array Liste mit 500 zufälligen Integer Werten zwischen 1900 und 2013 mit Hilfe der statischen Methode random der Klasse Math
  ArrayList<Integer> liste = new ArrayList<Integer>();
  
  for (int i = 0; i < 500; i++) {
    liste.add((int)(Math.random()*114)+1900);
  }

  Ausgabe.liste(liste);

  // //new Insertsortierer objekt
  Ausgabe.insertSort();
  InsertSortierer insertSortierer = new InsertSortierer(liste);
  List<Integer> insertSortet = insertSortierer.sortieren(liste);
  insertSortierer.sortieren();
  Ausgabe.liste(insertSortet);
  Ausgabe.zeit(insertSortierer);

  // //new Quicksortierer objekt
  Ausgabe.quickSort();
  QuickSortierer quickSortierer = new QuickSortierer(liste);
  List<Integer> quickSortet = quickSortierer.sortieren(liste);
  quickSortierer.sortieren();
  Ausgabe.liste(quickSortet);
  Ausgabe.zeit(quickSortierer);

  // new Mergesortierer objekt
  Ausgabe.mergeSort();
  MergeSortierer mergeSortierer = new MergeSortierer(liste);
  List<Integer> mergeSortet = mergeSortierer.sortieren(liste);
  mergeSortierer.sortieren();
  Ausgabe.liste(mergeSortet);
  Ausgabe.zeit(mergeSortierer);



  

}
}