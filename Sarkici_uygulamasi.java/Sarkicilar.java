
import java.util.ArrayList;

// Sarkicilar sınıfı, şarkıcı işlemlerini yöneten bir sınıftır
public class Sarkicilar {

    // Şarkıcı listesini tutmak için ArrayList kullanılır
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();

    // Şarkıcıları listeleme metodu
    public void sarkicilari_bastir() {

        System.out.println("Sarkici listesinde " + sarkici_listesi.size() + " kadar sarkici var.");

        for (int i = 0; i < sarkici_listesi.size(); i++) {
            System.out.println((i + 1) + ". Sarkici: " + sarkici_listesi.get(i));
        }
    }

    // Yeni bir şarkıcı ekleyen metot
    public void sarkici_ekle(String isim) {
        sarkici_listesi.add(isim);
        System.out.println("Sarkici eklendi ...");
    }

    // Mevcut bir şarkıcıyı güncelleyen metot
    public void sarkici_guncelle(String yeni_isim, int pozisyon) {
        sarkici_listesi.set(pozisyon, yeni_isim);
        System.out.println("Sarkici listesi guncellendi ...");
    }

    // Belirtilen pozisyondaki şarkıcıyı silen metot
    public void sarkici_sil(int pozisyon) {
        String isim = sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        System.out.println(isim + " Isimli sarkici listeden kaldirildi ... ");
    }

    // Belirtilen şarkıcıyı arayan metot
    public void sarkici_ara(String sarkici_ismi) {
        int pozisyon = sarkici_listesi.indexOf(sarkici_ismi);

        if (pozisyon >= 0) {
            System.out.println("Sarkici bulundu.");
            System.out.println(sarkici_ismi + " isimli sarkici " + (pozisyon + 1) + ". pozisyonda");
        } else {
            System.out.println("Sarkici bulunamadi ...");
        }
    }
}
