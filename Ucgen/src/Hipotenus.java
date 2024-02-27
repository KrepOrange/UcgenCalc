import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        //variable
        double kenar1, kenar2, hipotenus;
        Scanner kenarlar = new Scanner(System.in);

        System.out.print("Hipotenüsünü bulmak istediğiniz dik üçgenin kenarlarından birini giriniz: ");
        kenar1 = kenarlar.nextDouble();
        System.out.print("Hipotenüsünü bulmak istediğiniz dik üçgenin diğer kenarını giriniz: ");
        kenar2 = kenarlar.nextDouble();

        hipotenus = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));
        System.out.println("İki kenarını verdiğiniz dik üçgenin hipotenüs uzunluğu = " + hipotenus);
    }
}