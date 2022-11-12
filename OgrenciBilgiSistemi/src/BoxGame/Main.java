package BoxGame;

public class Main {
    public static void main(String[] args) {
      Fighter zayn = new Fighter("Zayn" , 15 , 100, 90, 0);
      Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
      Ring r = new Ring(zayn,alex , 90 , 100);
      r.run();
    }
}