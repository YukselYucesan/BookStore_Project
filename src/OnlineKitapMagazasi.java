import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class OnlineKitapMagazasi {
    private ArrayList<Kitap> kitapListesi = new ArrayList<>();
    private Scanner scannerStr = new Scanner(System.in);
    private Scanner scannerInt = new Scanner(System.in);
    private Scanner scannerDob = new Scanner(System.in);

    public void kitapEkle() {
        // TODO: kitapEkle() methodunu doldurunuz
        // Kullanıcıdan Kitap Adı, Yazar Adı, Yayın Yılı (int) ve Fiyat (double) bilgisini alarak,
        // itapListesine ekleyen metodu yazınız.
        // NOT: Kullanıcıdan aldığınız bilgilerle bir kitap nesnesi oluşturmayı unutmayınız.

        System.out.print("Kitap Adı = ");
        String kitapAdi=scannerStr.nextLine().trim();
        System.out.print("Yazar Adı = ");
        String yazarAdi=scannerStr.nextLine().trim();
        System.out.print("Yayın Yılı = ");
        int yayinYili=scannerInt.nextInt();
        System.out.print("Fiyat= ");
        double fiyat= scannerDob.nextDouble();
        Kitap kitap=new Kitap(kitapAdi,yazarAdi,yayinYili,fiyat);
        kitapListesi.add(kitap);

    }
    //////////////////////////////////////////////////
    public void kitapSil() {

        // TODO: kitapSil() methodunu doldurunuz
        // Kullanıcıdan unique (yegane) kitap numarasını alarak, kitap listesinden çıkaran metodu yazınız.
        // NOT: Silinecek kitabın listede olup olmadığını kontrol etmeyi unutmayınız.
        // İşlemin sonucunu konsola yazdırınız: "Kitap başarıyla silindi." veya "Belirtilen numarada bir kitap bulunamadı." gibi...

        System.out.print("Silmek istediğiniz kitabın numarasını girin: ");
        int kitapNumarasi=scannerInt.nextInt();
        boolean yesNo=true;
        Iterator<Kitap> iterator= kitapListesi.iterator();
        while (iterator.hasNext()){
            Kitap k=iterator.next();
            if (k.getKitapNumarasi()==kitapNumarasi){
                iterator.remove();
                System.out.println("Kitap başarıyla silindi.");
                yesNo=false;
            }
        }
        if (yesNo){
            System.out.println("Belirtilen numarada bir kitap bulunamadı.");
        }

    }
//////////////////////////////////////////////////
    public void kitapListele() {
        // TODO: kitapListele() methodunu doldurunuz
        // Lİstede bulunan kitapları listeleyen metodu yazınız...
        // Listede kitap yoksa konsola "Henüz kitap eklenmemiş." veya "Listede kitap yok" mesajı yazdırınız.

        if (!kitapListesi.isEmpty()){
            for (Kitap k:kitapListesi){
                System.out.println(k);
            }
        }else {System.out.println("Listede kitap yok");}

    }
}
