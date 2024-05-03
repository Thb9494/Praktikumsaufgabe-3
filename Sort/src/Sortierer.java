import java.util.ArrayList;
import java.util.List;

public abstract class Sortierer {
 //integer liste erstellen
 protected ArrayList<Integer> liste;

 public long anfangszeit;
 public long endzeit;

 
  //konstruktor, objektreferenz liste soll auf Kopie der übergebenen Liste zeigen
  public Sortierer(List<Integer> liste) {
    this.liste = new ArrayList<Integer>(liste);  //kopierte Liste liste  
  }

  protected abstract List<Integer> sortieren(List<Integer> liste);

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

