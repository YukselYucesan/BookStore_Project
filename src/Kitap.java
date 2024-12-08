
class Kitap {

    //TODO: int kitapNumarasi ve yayinYili; String kitapAdi ve yazarAd; double fiyat fieldlarini olusturun.
    // Oluşan her kitap nesnesinin yegane (unique) bir kitap numarası olmalıdır.

    private String kitapAdi;
    private String yazarAd;
    private double fiyat;
    private int yayinYili;
    private final int kitapNumarasi;

    private static int sayac=1;

    ///////////////////////////////////////////////////////////////////////

    public Kitap(String kitapAdi, String yazarAd, int yayinYili, double fiyat) {
        //TODO: Kitap nesnesi oluşturma sırasında ilk çalışan metodu (constructor) olusturun
        //NOT: Her kitabın tekil bir kitap numarası (id) olduğunu unutmayınız...
        setKitapAdi(kitapAdi);
        setYazarAd(yazarAd);
        setYayinYili(yayinYili);
        setFiyat(fiyat);
        kitapNumarasi=sayac++;
    }

    // TODO: Gerekli olan getter() veya setter() metodlarını oluşturunuz.
    // Kullanılmayanları oluşturmanıza gerek yok.
    // Program tamamlandıktan sonra kullanılmayan metodları sonradan silmek de bir yöntemdir

    public String getYazarAd() {
        return yazarAd;
    }

    public void setYazarAd(String yazarAd) {
        this.yazarAd = yazarAd;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    public int getKitapNumarasi() {
        return kitapNumarasi;
    }

    @Override
    public String toString() {
        //TODO: Kitabın özelliklerini yazdıracak toString() metodunu tamamlayınız...(Return icini doldurun)
        return "Kitap{" +
                "kitapAdi='" + this.kitapAdi + '\'' +
                ", yazarAd='" + this.yazarAd + '\'' +
                ", fiyat=" + this.fiyat +
                ", yayinYili=" + this.yayinYili +
                ", kitapNumarasi=" + this.kitapNumarasi +
                '}';
    }
}