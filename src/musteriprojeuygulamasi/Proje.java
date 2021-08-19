package musteriprojeuygulamasi;


public class Proje {

    public Proje(int id, String ad, int kullaniciId, String durum, String musteriAd, String ilgiliKisi, String ilgiliTelefon, String musteriAdres, String platform, String teslim_tarih, String teknolojiler, String alanAdiKayit, String sunucuKayit, String sunucuIp, String sunucuPanelAdres, String sunucuKullaniciAd, String sunucuSifre, String webPanelKullanici, String webPanelSifre, String mailSunucuKayit, String mailBilgi, String projeDetay) {
        this.id = id;
        this.ad = ad;
        this.kullaniciId = kullaniciId;
        this.durum = durum;
        this.musteriAd = musteriAd;
        this.ilgiliKisi = ilgiliKisi;
        this.ilgiliTelefon = ilgiliTelefon;
        this.musteriAdres = musteriAdres;
        this.platform = platform;
        this.teslim_tarih = teslim_tarih;
        this.teknolojiler = teknolojiler;
        this.alanAdiKayit = alanAdiKayit;
        this.sunucuKayit = sunucuKayit;
        this.sunucuIp = sunucuIp;
        this.sunucuPanelAdres = sunucuPanelAdres;
        this.sunucuKullaniciAd = sunucuKullaniciAd;
        this.sunucuSifre = sunucuSifre;
        this.webPanelKullanici = webPanelKullanici;
        this.webPanelSifre = webPanelSifre;
        this.mailSunucuKayit = mailSunucuKayit;
        this.mailBilgi = mailBilgi;
        this.projeDetay = projeDetay;
    }
    
    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getAd() {
        return ad;
    }

    
    public void setAd(String ad) {
        this.ad = ad;
    }

    
    public int getKullaniciId() {
        return kullaniciId;
    }

    
    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    
    public String getDurum() {
        return durum;
    }

    
    public void setDurum(String durum) {
        this.durum = durum;
    }

    
    public String getMusteriAd() {
        return musteriAd;
    }

    
    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    
    public String getIlgiliKisi() {
        return ilgiliKisi;
    }

    
    public void setIlgiliKisi(String ilgiliKisi) {
        this.ilgiliKisi = ilgiliKisi;
    }

    
    public String getIlgiliTelefon() {
        return ilgiliTelefon;
    }

    
    public void setIlgiliTelefon(String ilgiliTelefon) {
        this.ilgiliTelefon = ilgiliTelefon;
    }

   
    public String getMusteriAdres() {
        return musteriAdres;
    }

    
    public void setMusteriAdres(String musteriAdres) {
        this.musteriAdres = musteriAdres;
    }

    
    public String getPlatform() {
        return platform;
    }

    
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    
    public String getTeslim_tarih() {
        return teslim_tarih;
    }

    
    public void setTeslim_tarih(String teslim_tarih) {
        this.teslim_tarih = teslim_tarih;
    }

    
    public String getTeknolojiler() {
        return teknolojiler;
    }

    
    public void setTeknolojiler(String teknolojiler) {
        this.teknolojiler = teknolojiler;
    }

    
    public String getAlanAdiKayit() {
        return alanAdiKayit;
    }

    
    public void setAlanAdiKayit(String alanAdiKayit) {
        this.alanAdiKayit = alanAdiKayit;
    }

    
    public String getSunucuKayit() {
        return sunucuKayit;
    }

    
    public void setSunucuKayit(String sunucuKayit) {
        this.sunucuKayit = sunucuKayit;
    }

    
    public String getSunucuIp() {
        return sunucuIp;
    }

    
    public void setSunucuIp(String sunucuIp) {
        this.sunucuIp = sunucuIp;
    }

    
    public String getSunucuPanelAdres() {
        return sunucuPanelAdres;
    }

    
    public void setSunucuPanelAdres(String sunucuPanelAdres) {
        this.sunucuPanelAdres = sunucuPanelAdres;
    }

    
    public String getSunucuKullaniciAd() {
        return sunucuKullaniciAd;
    }

    
    public void setSunucuKullaniciAd(String sunucuKullaniciAd) {
        this.sunucuKullaniciAd = sunucuKullaniciAd;
    }

    
    public String getSunucuSifre() {
        return sunucuSifre;
    }

    
    public void setSunucuSifre(String sunucuSifre) {
        this.sunucuSifre = sunucuSifre;
    }

    
    public String getWebPanelKullanici() {
        return webPanelKullanici;
    }

    
    public void setWebPanelKullanici(String webPanelKullanici) {
        this.webPanelKullanici = webPanelKullanici;
    }

    
    public String getWebPanelSifre() {
        return webPanelSifre;
    }

    
    public void setWebPanelSifre(String webPanelSifre) {
        this.webPanelSifre = webPanelSifre;
    }

    
    public String getMailSunucuKayit() {
        return mailSunucuKayit;
    }

    
    public void setMailSunucuKayit(String mailSunucuKayit) {
        this.mailSunucuKayit = mailSunucuKayit;
    }

    
    public String getMailBilgi() {
        return mailBilgi;
    }

    
    public void setMailBilgi(String mailBilgi) {
        this.mailBilgi = mailBilgi;
    }

    
    public String getProjeDetay() {
        return projeDetay;
    }

    
    public void setProjeDetay(String projeDetay) {
        this.projeDetay = projeDetay;
    }
    
    private int id;
    private String ad;
    private int kullaniciId;
    private String durum;
    private String musteriAd;
    private String ilgiliKisi;
    private String ilgiliTelefon;
    private String musteriAdres;
    private String platform;
    private String teslim_tarih;
    private String teknolojiler;
    private String alanAdiKayit;
    private String sunucuKayit;
    private String sunucuIp;
    private String sunucuPanelAdres;
    private String sunucuKullaniciAd;
    private String sunucuSifre;
    private String webPanelKullanici;
    private String webPanelSifre;
    private String mailSunucuKayit;
    private String mailBilgi;
    private String projeDetay;
    
}
