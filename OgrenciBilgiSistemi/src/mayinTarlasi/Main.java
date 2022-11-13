package mayinTarlasi;

import java.util.Scanner;

class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mayýn tarlasý oyununa hoþgeldiniz !\n"+
        "Tarlanýn boyutunu gir ,örneðin : (4 7)  : ");
        int x , y ;
        x = scanner.nextInt();
        y = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(x, y);
       
        mineSweeper.run();
        scanner.close();
    }
  
}