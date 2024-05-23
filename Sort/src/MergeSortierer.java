import java.util.ArrayList;
import java.util.List;

public class MergeSortierer extends Sortierer{
    public MergeSortierer(List<Integer> liste) {
    super(liste); 
  }
  //implementierung der Methode sortieren
  protected List<Integer> sortieren(List<Integer> liste) {
    //wenn die Liste nur ein Element hat, ist sie bereits sortiert
    if (liste.size() <= 1) {
      return liste;
    } else {
      //teile die Liste in zwei Hälften
      int mitte = liste.size() / 2;
      List<Integer> ersteListe = new ArrayList<Integer>(liste.subList(0, mitte));
      List<Integer> zweiteListe = new ArrayList<Integer>(liste.subList(mitte, liste.size()));
      //rekursiv sortiere die beiden Hälften
      ersteListe = sortieren(ersteListe);
      zweiteListe = sortieren(zweiteListe);
      //füge die sortierten Hälften zusammen
      List<Integer> ergebnis = new ArrayList<Integer>();
int i = 0, j = 0;
while (i < ersteListe.size() && j < zweiteListe.size()) {
    if (ersteListe.get(i) <= zweiteListe.get(j)) {
        ergebnis.add(ersteListe.get(i));
        i++;
    } else {
        ergebnis.add(zweiteListe.get(j));
        j++;
    }
}
while (i < ersteListe.size()) {
    ergebnis.add(ersteListe.get(i));
    i++;
}
while (j < zweiteListe.size()) {
    ergebnis.add(zweiteListe.get(j));
    j++;
}
return ergebnis;

      
    }
  }
  
  }

