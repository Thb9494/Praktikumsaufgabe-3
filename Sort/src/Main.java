import java.util.ArrayList;
public class Main{
public static void main(String[] args) {
  //erzeuge Array Liste mit 500 zufälligen Integer Werten zwischen 1900 und 2013 mit Hilfe der statischen Methode random der Klasse Math
  ArrayList<Integer> liste = new ArrayList<Integer>();
  
  for (int i = 0; i < 500; i++) {
    liste.add((int)(Math.random()*114)+1900);
  }

  Ausgabe.liste(liste);
//   Ausgabe.insertSort();
// //new Insertsortierer objekt
//   InsertSortierer insertSortierer = new InsertSortierer(liste);
//   insertSortierer.sortieren(liste);
//   Ausgabe.liste(insertSortierer.liste);
//   Ausgabe.zeit(insertSortierer);

  //new Quicksortierer objekt
  // Ausgabe.quickSort();
  // QuickSortierer quickSortierer = new QuickSortierer(liste);
  // quickSortierer.sortieren(liste);
  // Ausgabe.liste(quickSortierer.liste);
  // Ausgabe.zeit(quickSortierer);

  //new Mergesortierer objekt
  Ausgabe.mergeSort();
  MergeSortierer mergeSortierer = new MergeSortierer(liste);
  mergeSortierer.sortieren(liste);
  Ausgabe.liste(mergeSortierer.liste);
  Ausgabe.zeit(mergeSortierer);
  

}
}