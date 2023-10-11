public class MainClass {
    public static void main(String[] args) {
        Kendiiscilerimiz kendiCalisanlar = new Kendiiscilerimiz("ömer", "Balci", "Muhasebe");
        Firmacalisanlari firmaCalisanlari = new Firmacalisanlari("faruk", "Mühendis");
        Robot robot = new Robot();

        // Kendi çalışanlarınız
        kendiCalisanlar.Work(); // John Doe çalışanı, Muhasebe bölümünde çalışıyor. Çalışma saatleri: 8-17
        System.out.println("Kendi Çalışan Adı: " + kendiCalisanlar.getAd());

        // Firma çalışanları
        firmaCalisanlari.Work(); 
        System.out.println("Firma Çalışan Adı: " + firmaCalisanlari.getFirmaCalisanAd());

        // Robotun iş yapma davranışı
        robot.Work(); // Robot iş yapıyor.
        robot.bakim();

        
    }
}
