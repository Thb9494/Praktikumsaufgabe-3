import java.util.ArrayList;
public class Main{
public static void main(String[] args) {
  //erzeuge Array Liste mit 500 zufälligen Integer Werten zwischen 1900 und 2013 mit Hilfe der statischen Methode random der Klasse Math
  ArrayList<Integer> liste = new ArrayList<Integer>();
  
  for (int i = 0; i < 500; i++) {
    liste.add((int)(Math.random()*114)+1900);
  }
  Ausgabe.liste(liste);

  


 
}
}