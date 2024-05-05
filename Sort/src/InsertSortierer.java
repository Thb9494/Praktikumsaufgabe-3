import java.util.ArrayList;
import java.util.List;

public class InsertSortierer extends Sortierer {
    public InsertSortierer(List<Integer> liste) {
    super(liste);
  }

  protected List<Integer> sortieren(List<Integer> liste) {
    this.liste = new ArrayList<Integer>(liste);
    for (int i = 1; i < liste.size(); i++) {
      int key = liste.get(i);
      int j = i - 1;

      // Verschiebe die Elemente von liste[0..i-1], die größer sind als der Schlüssel,
      // um eine Position nach rechts
      while (j >= 0 && liste.get(j) > key) {
          liste.set(j + 1, liste.get(j));
          j = j - 1;
      }
      liste.set(j + 1, key);
  }
  return liste;
}
}
