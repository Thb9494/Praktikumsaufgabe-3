import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class QuickSortierer extends Sortierer{

  public QuickSortierer(List<Integer> liste) {
    super(liste);
  }

  protected List<Integer> sortieren(List<Integer> liste) {
  List<Integer> ersteListe = new ArrayList<Integer>();
  List<Integer> zweiteListe = new ArrayList<Integer>();
  List<Integer> sortierteListe = new ArrayList<Integer>();
  if (liste.size() <= 1) {  //wenn liste nur ein Element hat  
    return liste; 
  } else {
    int pivot = liste.get(0); //erstes Element als Pivot
    liste.remove(0); //Pivot entfernen
    for (int i = 0; i < liste.size(); i++) {
      if (liste.get(i) < pivot) {
        ersteListe.add(liste.get(i)); //Elemente kleiner als Pivot in ersteListe
      } else {
        zweiteListe.add(liste.get(i)); //Elemente größer als Pivot in zweiteListe
      }
    }
    ersteListe = sortieren(ersteListe); //rekursiv sortieren
    zweiteListe = sortieren(zweiteListe); //rekursiv sortieren

    sortierteListe.addAll(ersteListe); //ersteListe hinzufügen
    sortierteListe.add(pivot); //Pivot hinzufügen
    sortierteListe.addAll(zweiteListe); //zweiteListe hinzufügen
    return sortierteListe;
}
}
}
