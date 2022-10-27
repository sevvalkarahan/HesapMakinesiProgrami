import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz: ");
        double ilkSayi=klavye.nextDouble();
        System.out.println("ikinci sayıyı giriniz: ");
        double ikiniciSayi=klavye.nextDouble();
        String islemler="toplama için 1'e bas \n" +
                "çıkarma işlemi için 2'ye bas \n" +
                "çarpma işlemi için 3'e bas \n" +
                "bölme işlemi için 4'e bas";
        System.out.println("yapmak istediğiniz işlemi giriniz: \n" +islemler);
        int islem=klavye.nextInt();
        switch (islem){
            case  1:
                System.out.println("toplama işleminizin sonucu : "+(ilkSayi+ikiniciSayi));
                break;
            case 2:
                System.out.println("çıkarma işleminizin sonucu : "+(ilkSayi-ikiniciSayi));
                break;
            case 3:
                System.out.println("çarpma işleminizin sonucu : "+(ilkSayi*ikiniciSayi));
                break;
            case 4:
                System.out.println("bölme işleminizin sonucu : "+ (ilkSayi/ikiniciSayi));
                break;
            default:
                System.err.println("HATALI İŞLEM GİRDİNİZ !!!");
        }

    }
}
