package mayinTarlasi;

import java.util.Scanner;

class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May�n tarlas� oyununa ho�geldiniz !\n"+
        "Tarlan�n boyutunu gir ,�rne�in : (4 7)  : ");
        int x , y ;
        x = scanner.nextInt();
        y = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(x, y);
       
        mineSweeper.run();
        scanner.close();
    }
  
}