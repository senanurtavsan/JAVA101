import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluşturalım.
        int mat, fizik, turkce, kimya, muzik, tarih;
        // Scanner sınıfımızı tanımlayalım.
        Scanner inp=new Scanner(System.in);
        // Kullanıcıdan değerleri al.

        System.out.print("Matematik Notunu Giriniz : ");
        mat = inp.nextInt();

         System.out.print("Fizik Notunu Giriniz : ");
         fizik = inp.nextInt();

         System.out.print("Türkçe Notunu Giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunu Giriniz : ");
        muzik = inp.nextInt();

        System.out.print("Tarih Notunu Giriniz : ");
        tarih = inp.nextInt();

        int toplam = (mat + fizik + turkce + kimya + muzik +tarih );
        double sonuc = toplam / 6.0 ;

        int ab = 59;

        boolean abc = (sonuc > ab);

        String snc = abc ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalamanız : "+ sonuc);

       System.out.println(snc);
    }
}

