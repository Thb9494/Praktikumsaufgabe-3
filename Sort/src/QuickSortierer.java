import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class QuickSortierer extends Sortierer{

  public QuickSortierer(List<Integer> liste) {
    super(liste);
  }

  protected List<Integer> sortieren(List<Integer> liste) {
  ArrayList<Integer> ersteListe = new ArrayList<Integer>();
  ArrayList<Integer> zweiteListe = new ArrayList<Integer>();
  ArrayList<Integer> sortierteListe = new ArrayList<Integer>();
  if (liste.size() <= 1) {  //wenn liste nur ein Element hat  
    return liste; 
  } else {
    int pivot = liste.get(0); //erstes Element als Pivot
    for (int i = 1; i < liste.size(); i++) {
      if (liste.get(i) < pivot) {
        ersteListe.add(liste.get(i)); //Elemente kleiner als Pivot in ersteListe
      } else {
        zweiteListe.add(liste.get(i)); //Elemente größer als Pivot in zweiteListe
      }
    }
    ersteListe = (ArrayList<Integer>) sortieren(ersteListe); //rekursiv sortieren
    zweiteListe = (ArrayList<Integer>) sortieren(zweiteListe); //rekursiv sortieren
    ersteListe.add(pivot); //Pivot hinzufügen
    sortierteListe.addAll(ersteListe); //ersteListe hinzufügen
    sortierteListe.addAll(zweiteListe); //zweiteListe hinzufügen
    return sortierteListe;

  
}
}
}
