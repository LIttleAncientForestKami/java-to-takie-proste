package pl.edu.lafk;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

      Scanner s = new Scanner(System.in);
      System.out.println("Odgadnij liczbę (z przedziału <1,100>) by wygrać!");

      int liczba = 0;
      int los = (int)(100*Math.random()+1);

      do {
        System.out.print("Zgaduj! ");
        liczba = s.nextInt();
        if(liczba > los) System.out.println("Za wysoko!");
        else if(liczba < los) System.out.println("Za nisko!");
      } while (liczba != los);
      System.out.println("Dobry wybór!");

    }
}
