package Udemy_SarkiciProcesi;

import java.util.Scanner;

// Sarkicilar_Main sınıfı, şarkıcı işlemlerini kullanıcıyla etkileşimli bir şekilde yöneten ana sınıftır
public class Sarkicilar_Main {
    private static Sarkicilar sarkicilar = new Sarkicilar(); // Sarkicilar sınıfından bir örnek (nesne) oluşturulur
    private static Scanner scanner = new Scanner(System.in); // Kullanıcıdan veri almak için Scanner sınıfından bir
                                                             // örnek oluşturulur

    // Kullanıcıya gösterilecek işlemleri ekrana yazan metot
    public static void islemileri_bastir() {
        System.out.println("\t 0-Islemleri goruntule");
        System.out.println("\t 1-Sarkicilari goruntule");
        System.out.println("\t 2-Sarkici ekle");
        System.out.println("\t 3-Sarkici guncelle");
        System.out.println("\t 4-Sarkici sil");
        System.out.println("\t 5-Sarkici ara");
        System.out.println("\t 6-Uygulamadan cik");
    }

    // Şarkıcıları görüntülemek için kullanılan metot
    public static void sarkici_goruntule() {
        sarkicilar.sarkicilari_bastir();
    }

    // Şarkıcı eklemek için kullanılan metot
    public static void sarkici_ekle() {
        System.out.println("Ekelmek istediginiz sarkiciyi girin: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }

    // Şarkıcı güncellemek için kullanılan metot
    public static void sarkici_guncelle() {
        System.out.println("Guncellemek istediginiz pozisyonu girin (1,2,3, ...): ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeni_isim, pozisyon - 1);
    }

    // Şarkıcı silmek için kullanılan metot
    public static void sarkici_sil() {
        System.out.println("Silmek istediginiz pozisyonu giriniz (1,2,3, ...): ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        sarkicilar.sarkici_sil(pozisyon - 1);
    }

    // Şarkıcı aramak için kullanılan metot
    public static void sarkici_ara() {
        System.out.println("Aramak istediginiz sarkici ismini girin: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }

    // Ana metodun bulunduğu başlangıç noktası
    public static void main(String[] args) {
        System.out.println("\tSarkici uygulamasina hosgeldiniz...");

        islemileri_bastir(); // Kullanıcıya işlemleri gösteren metot çağrılır

        boolean cikis = false;

        // Kullanıcı işlemlerini yöneten döngü
        while (!cikis) {
            System.out.println("Bir islem secin: ");
            int islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem) {
                case 0:
                    islemileri_bastir(); // Kullanıcıya işlemleri gösteren metot çağrılır
                    break;
                case 1:
                    sarkici_goruntule(); // Şarkıcıları görüntülemek için kullanılan metot çağrılır
                    break;
                case 2:
                    sarkici_ekle(); // Şarkıcı eklemek için kullanılan metot çağrılır
                    break;
                case 3:
                    sarkici_guncelle(); // Şarkıcı güncellemek için kullanılan metot çağrılır
                    break;
                case 4:
                    sarkici_sil(); // Şarkıcı silmek için kullanılan metot çağrılır
                    break;
                case 5:
                    sarkici_ara(); // Şarkıcı aramak için kullanılan metot çağrılır
                    break;
                case 6:
                    cikis = true; // Uygulamadan çıkış yapmak için cikis değişkeni true yapılır
                    System.out.println("Uygulamadan cikiliyor ...");
                    break;
                default:
                    System.out.println("Gecersiz secim"); // Geçersiz seçim durumu
            }
        }

        System.out.println("\n\nDerleme tamamlandi ...");
    }
}
