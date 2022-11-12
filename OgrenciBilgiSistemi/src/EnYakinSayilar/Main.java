package EnYakinSayilar;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        int number = scn.nextInt();
        int[] list = {15,12,546,1,-1,81,2,0};
        System.out.println("Dizi: "+ Arrays.toString(list));
        System.out.println("Girilen Sayı: "+number);
        Arrays.sort(list);
        int little = list[0];
        int big = list[7];

        for (int j : list) {
            if (j > little && j < number) {
                little = j;
            }
        }

        for (int j : list) {
            if (j < big && j > number) {
                big = j;
            }
        }
        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: " + little);
        System.out.println("Girilen Sayıdan Büyük En Yakın Sayı: " + big);

    }
}
