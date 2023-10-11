public class Firmacalisanlari implements Iİsciler {
    private String ad;
    private String departman;

    public Firmacalisanlari(String ad, String departman) {
        this.ad = ad;
        this.departman = departman;
    }

    @Override
    public void Work() {
        System.out.println(ad + " firma çalışanı, " + departman + " departmanında iş yapıyor.");
    }

    public void setFirmacalisanAd(String ad) {
        this.ad = ad;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getFirmaCalisanAd() {
        return ad;
    }

    public String getDepartman() {
        return departman;
    }
}
