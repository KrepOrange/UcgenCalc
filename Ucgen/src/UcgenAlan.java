import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        //variable
        double kenarBir, kenariki, kenarUc, U, alan;
        Scanner kenarSay = new Scanner(System.in);

        System.out.print("Alanını bulmak istediğiniz üçgenin üç kenarından biri: ");
        kenarBir = kenarSay.nextDouble();
        System.out.print("Alanını bulmak istediğiniz üçgenin üç kenarından diğeri: ");
        kenarUc = kenarSay.nextDouble();
        System.out.print("Alanını bulmak istediğiniz üçgenin üç kenarından sonuncusu: ");
        kenariki = kenarSay.nextDouble();

        /*Üçgen çevresi = 2u
        u = (a+b+c)/2
        Alan * Alan = u*(u-a)*(u-b)*(u-c) */

        U = (kenarBir + kenariki + kenarUc) / 2;
        alan = Math.sqrt(U * (U-kenarBir) * (U - kenariki) * (U- kenarUc));
        System.out.println("Üçgenin Alanı = " + alan);
    }
}
