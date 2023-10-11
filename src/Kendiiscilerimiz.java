public class Kendiiscilerimiz implements Iİsciler, IEatable, IMaas {
    private String ad;
    private String soyad;
    private String bolum;

    public Kendiiscilerimiz(String ad, String soyad, String bolum) {
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public void Work() {
        System.out.println(ad + " " + soyad + " çalışanı, " + bolum + " bölümünde çalışıyor. Çalışma saatleri: 8-17");
    }

	@Override
	public void maas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

    
}
