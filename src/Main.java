/*
Napisz program, który oblicza pole prostokąta. Wartości boków a i b wprowadzamy
z klawiatury. W programie należy przyjąć, że zmienne a, b oraz
pole są typu double (rzeczywistego).
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) throws IOException{
        double a, b;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program do obliczania pola powirzchni prostokąta");
        System.out.println("Podaj długość boku a (.) ");

        a = Double.parseDouble(buff.readLine());
        System.out.println("Podaj długość boku b (.) ");
        b = Double.parseDouble(buff.readLine());

        System.out.println("Pole prostokąta o wymiarach " + a + " x " + b + " = " + a*b);

    }
}
