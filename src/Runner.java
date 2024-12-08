import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // TODO:  main methodunu doldurunuz

        //  Kullanıcıya menü seçeneklerini göstererek bir seçim yapmasını isteyin;
        //  yapılan seçime göre ilgili menüye (OnlineKitapMagazasi sınıfında oluşturduğunuz metodlara) yönlendirin.
        //  NOT: OnlineKitapMagazasi'nın metodlarını kullanabilmek için, nesnesini oluşturmamız şart.
        //  Sadece static metodların nesne oluşturmadan kullanılabildiğini unutmayın!

        Scanner scanner = new Scanner(System.in);
        int secim;

        OnlineKitapMagazasi onlineKitapMagazasi = new OnlineKitapMagazasi();

        do
        {
            System.out.print("============ Online Kitap Mağazası ============\n" +
                    "    1. Kitap Ekle\n" +
                    "    2. Numarasıyla Kitap Sil\n" +
                    "    3. Tüm Kitapları Listele\n" +
                    "    4. Çıkış\n" +
                    "    Seçiminiz = ");
            secim=scanner.nextInt();
            // Kullanıcı bir seçenek belirlediğinde, ilgili işlemi gerçekleştirmek için uygun methodları çağırın.
            // Programın sürekli çalışmasını sağlayın, yani kullanıcı çıkış seçeneğini seçene kadar program çalışmaya devam etmelidir.
            // Müşteri farklı bir seçenek seçtiğinde "Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin." mesajı almalıdır.

            //  kitapMagazasi.kitapEkle();

            //  kitapMagazasi.kitapSil();

            //  kitapMagazasi.kitapListele();

            //  System.out.println("Program sonlandırılıyor.");

            //  System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.\n");
            switch (secim){
                case 1: onlineKitapMagazasi.kitapEkle(); break;
                case 2: onlineKitapMagazasi.kitapSil(); break;
                case 3: onlineKitapMagazasi.kitapListele(); break;
                case 4: System.out.println("Program sonlandırılıyor.");break;
                default: System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.\n");
            }

        }while (secim!=4);
    }
}

