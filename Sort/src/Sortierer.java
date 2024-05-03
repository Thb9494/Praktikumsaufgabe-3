import java.util.ArrayList;
import java.util.List;

public class Sortierer {
 //integer liste erstellen
 private List<Integer> liste;
 ArrayList<Integer> liste2 = new ArrayList<Integer>(liste);  //kopierte Liste liste 
 public long anfangszeit;
 public long endzeit;
  //konstruktor, objektreferenz liste soll auf Kopie der übergebenen Liste zeigen
  public Sortierer(List<Integer> liste) {
    this.liste = liste2;
  }

  protected List<Integer> sortieren(List<Integer> liste) {
    //sortiere liste
    // for (int i = 0; i < liste.size(); i++) {
    //   for (int j = i + 1; j < liste.size(); j++) {
    //     if (liste.get(i) > liste.get(j)) {
    //       int temp = liste.get(i);
    //       liste.set(i, liste.get(j));
    //       liste.set(j, temp);
    //     }
    //   }
    // }
    return liste;
  }

  public List<Integer> sortieren() {
    anfangszeit = System.currentTimeMillis();
    sortieren(liste);
    endzeit = System.currentTimeMillis();
    return liste;
    //return sortieren(liste);
  }

  public long getOperations() {
    return anfangszeit - endzeit;
  }




  }

