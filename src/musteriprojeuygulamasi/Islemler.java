package musteriprojeuygulamasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Islemler {
    
    private Connection con = null;//bağlantı objesi

    private Statement statement = null;//sql sorularını çaıştırmak için class
    //içindeki metodlar ile çalıştıracağız

    private PreparedStatement preparedStatement = null;
    private PreparedStatement preparedStatement2=null;
    private PreparedStatement preparedStatement3=null;
    
    public Islemler() {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useUnicode=true&characterEncoding=utf8";
        //"?useUnicode=true&characterEncoding=utf8" türkçe karakterlerin eklenmesidne hata olmaması için 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("driver bulunamadi...");
        }

        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Baglanti başarılı");
        } catch (SQLException ex) {
            System.out.println("Baglanti Başarısız...");
            //ex.printStackTrace();
        }
    }

    public boolean girisYap(String mail, String sifre) {
        String sorgu = "select * from kullanici where mail=? and sifre=?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, sifre);

            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    public int kullaniciID(String mail, String sifre) {
        String sorgu = "select * from kullanici where mail=? and sifre=?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, sifre);

            ResultSet rs = preparedStatement.executeQuery();
            int id = 0;
            while (rs.next()) {
                id = rs.getInt("id");
            }
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    
    
    public int kayitKullaniciVarmi(String mail) { // bu mail adresine kayitli kullanici yoksa 0 , varsa id numarasi geri dönderilir.
        String sorgu = "SELECT * FROM kullanici WHERE mail=?";
        int sonuc = 0;
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, mail);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                sonuc = rs.getInt("id");
            }
            
            return sonuc;
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("hata verdi");
            return -1;
        }

    }

    public boolean kayitKullanici(String ad, String soyad, String mail, String sifre) { // mail adresine kayitli bir kullanici yoksa kullaniciyi kaydeder
        
        int var = kayitKullaniciVarmi(mail);

        if (var == 0) { // kayitli kullanici yoksa

            String sorgu = "INSERT INTO `kullanici`( `ad`, `soyad`, `mail`, `sifre`) VALUES (?,?,?,?)";
            
            try {
                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, ad);
                preparedStatement.setString(2, soyad);
                preparedStatement.setString(3, mail);
                preparedStatement.setString(4, sifre);
           
                preparedStatement.executeUpdate();
                
                return true;
                
            } catch (SQLException ex) {
                Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
            
        } 
        
        else {
            //varsa
            return false;
        }
        
    }
    
    public ArrayList<Proje> projeleriGetir(int _id , String _durum){
        
        ArrayList<Proje> cikti = new ArrayList<Proje>();
        
        try {
   
            String sorgu = "Select * From proje Where kullaniciId=? and durum=?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, _id);
            preparedStatement.setString(2, _durum);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                
                int id = rs.getInt("proje.id");
                String ad = rs.getString("proje.ad");
                int kullaniciId = rs.getInt("proje.kullaniciId");
                String durum = rs.getString("proje.durum");
                String musteriAd = rs.getString("proje.musteriAd");
                String ilgiliKisi = rs.getString("proje.ilgiliKisi");
                String ilgiliTelefon = rs.getString("proje.ilgiliTelefon");
                String musteriAdres = rs.getString("proje.musteriAdres");
                String platform = rs.getString("proje.platform");
                String teslimTarih = rs.getString("proje.teslimTarih");
                String teknolojiler = rs.getString("proje.teknolojiler");
                String alanAdiKayit = rs.getString("proje.alanAdiKayit");
                String sunucuKayit = rs.getString("proje.sunucuKayit");
                String sunucuIp = rs.getString("proje.sunucuIp");
                String sunucuPanelAdres = rs.getString("proje.sunucuPanelAdres");
                String sunucuKullaniciAd = rs.getString("proje.sunucuKullaniciAd");
                String sunucuSifre = rs.getString("proje.sunucuSifre");
                String webPanelKullanici = rs.getString("proje.webPanelKullanici");
                String webPanelSifre = rs.getString("proje.webPanelSifre");
                String mailSunucuKayit = rs.getString("proje.mailSunucuKayit");
                String mailBilgi = rs.getString("proje.mailBilgi");
                String projeDetay = rs.getString("proje.projeDetay");
                
                
                cikti.add(new Proje(id,ad,kullaniciId,durum,musteriAd,ilgiliKisi,ilgiliTelefon,musteriAdres,platform,teslimTarih,teknolojiler,alanAdiKayit,sunucuKayit,sunucuIp,sunucuPanelAdres,sunucuKullaniciAd,sunucuSifre,webPanelKullanici,webPanelSifre,mailSunucuKayit,mailBilgi,projeDetay));
            }
            
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public void projeEkle(String ad,int kullaniciId,String durum,String musteriAd,String ilgiliKisi,String ilgiliTelefon,String musteriAdres,String platform,String teslimTarih,String teknolojiler,String alanAdiKayit,String sunucuKayit,String sunucuIp,String sunucuPanelAdres,String sunucuKullaniciAd,String sunucuSifre,String webPanelKullanici,String webPanelSifre,String mailSunucuKayit,String mailBilgi,String projeDetay) {
        
        String sorgu = "insert into proje (ad,kullaniciId,durum,musteriAd,ilgiliKisi,ilgiliTelefon,musteriAdres,platform,teslimTarih,teknolojiler,alanAdiKayit,sunucuKayit,sunucuIp,sunucuPanelAdres,sunucuKullaniciAd,sunucuSifre,webPanelKullanici,webPanelSifre,mailSunucuKayit,mailBilgi,projeDetay) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setInt(2, kullaniciId);
            preparedStatement.setString(3, durum);
            preparedStatement.setString(4, musteriAd);
            preparedStatement.setString(5, ilgiliKisi);
            preparedStatement.setString(6, ilgiliTelefon);
            preparedStatement.setString(7, musteriAdres);
            preparedStatement.setString(8, platform);
            preparedStatement.setString(9, teslimTarih);
            preparedStatement.setString(10, teknolojiler);
            preparedStatement.setString(11, alanAdiKayit);
            preparedStatement.setString(12, sunucuKayit);
            preparedStatement.setString(13, sunucuIp);
            preparedStatement.setString(14, sunucuPanelAdres);
            preparedStatement.setString(15, sunucuKullaniciAd);
            preparedStatement.setString(16, sunucuSifre);
            preparedStatement.setString(17, webPanelKullanici);
            preparedStatement.setString(18, webPanelSifre);
            preparedStatement.setString(19, mailSunucuKayit);
            preparedStatement.setString(20, mailBilgi);
            preparedStatement.setString(21, projeDetay);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void projeSil(int id) {
        
        String sorgu = "delete from proje where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public Proje projeBul(int _id){
        
        
        try {
   
            String sorgu = "Select * From proje Where id=?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, _id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                
                int id = rs.getInt("proje.id");
                String ad = rs.getString("proje.ad");
                int kullaniciId = rs.getInt("proje.kullaniciId");
                String durum = rs.getString("proje.durum");
                String musteriAd = rs.getString("proje.musteriAd");
                String ilgiliKisi = rs.getString("proje.ilgiliKisi");
                String ilgiliTelefon = rs.getString("proje.ilgiliTelefon");
                String musteriAdres = rs.getString("proje.musteriAdres");
                String platform = rs.getString("proje.platform");
                String teslimTarih = rs.getString("proje.teslimTarih");
                String teknolojiler = rs.getString("proje.teknolojiler");
                String alanAdiKayit = rs.getString("proje.alanAdiKayit");
                String sunucuKayit = rs.getString("proje.sunucuKayit");
                String sunucuIp = rs.getString("proje.sunucuIp");
                String sunucuPanelAdres = rs.getString("proje.sunucuPanelAdres");
                String sunucuKullaniciAd = rs.getString("proje.sunucuKullaniciAd");
                String sunucuSifre = rs.getString("proje.sunucuSifre");
                String webPanelKullanici = rs.getString("proje.webPanelKullanici");
                String webPanelSifre = rs.getString("proje.webPanelSifre");
                String mailSunucuKayit = rs.getString("proje.mailSunucuKayit");
                String mailBilgi = rs.getString("proje.mailBilgi");
                String projeDetay = rs.getString("proje.projeDetay");
                
                return new Proje(id,ad,kullaniciId,durum,musteriAd,ilgiliKisi,ilgiliTelefon,musteriAdres,platform,teslimTarih,teknolojiler,alanAdiKayit,sunucuKayit,sunucuIp,sunucuPanelAdres,sunucuKullaniciAd,sunucuSifre,webPanelKullanici,webPanelSifre,mailSunucuKayit,mailBilgi,projeDetay);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    public void projeGuncelle(int id,String ad,String durum,String musteriAd,String ilgiliKisi,String ilgiliTelefon,String musteriAdres,String platform,String teslimTarih,String teknolojiler,String alanAdiKayit,String sunucuKayit,String sunucuIp,String sunucuPanelAdres,String sunucuKullaniciAd,String sunucuSifre,String webPanelKullanici,String webPanelSifre,String mailSunucuKayit,String mailBilgi,String projeDetay){
        String sorgu =  "update proje set ad = ? , durum = ? , musteriAd = ? , ilgiliKisi = ? , ilgiliTelefon = ?  , musteriAdres = ? , platform = ? , teslimTarih = ? , teknolojiler = ? , alanAdiKayit = ? , sunucuKayit = ? , sunucuIp = ? , sunucuPanelAdres = ? , sunucuKullaniciAd = ? , sunucuSifre = ? , webPanelKullanici = ? , webPanelSifre = ? , mailSunucuKayit = ? , mailBilgi = ? , projeDetay = ? where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, durum);
            preparedStatement.setString(3, musteriAd);
            preparedStatement.setString(4, ilgiliKisi);
            preparedStatement.setString(5, ilgiliTelefon);
            preparedStatement.setString(6, musteriAdres);
            preparedStatement.setString(7, platform);
            preparedStatement.setString(8, teslimTarih);
            preparedStatement.setString(9, teknolojiler);
            preparedStatement.setString(10, alanAdiKayit);
            preparedStatement.setString(11, sunucuKayit);
            preparedStatement.setString(12, sunucuIp);
            preparedStatement.setString(13, sunucuPanelAdres);
            preparedStatement.setString(14, sunucuKullaniciAd);
            preparedStatement.setString(15, sunucuSifre);
            preparedStatement.setString(16, webPanelKullanici);
            preparedStatement.setString(17, webPanelSifre);
            preparedStatement.setString(18, mailSunucuKayit);
            preparedStatement.setString(19, mailBilgi);
            preparedStatement.setString(20, projeDetay);
            preparedStatement.setInt(21, id);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Islemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
