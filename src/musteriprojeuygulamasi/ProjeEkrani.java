package musteriprojeuygulamasi;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ProjeEkrani extends javax.swing.JFrame {
    
    int kullaniciId;
    String durum="Aktif";
    int sayac=0;
    ArrayList<Integer> projeId = new ArrayList<Integer>();
    int secilenProjeId=-1;
    
    DefaultTableModel model_proje;
    
    Islemler islemler = new Islemler();
    
    private PreparedStatement preparedStatement = null;
    
    public ProjeEkrani() {
        initComponents();
    }
    
    public ProjeEkrani(int kullaniciId) {
        initComponents();
        this.kullaniciId = kullaniciId;
        
        model_proje = (DefaultTableModel) proje_tablo.getModel();
        projeGoruntule(durum);
        
        this.setResizable(false);
        this.setSize(1200, 700);
        
        detayPanel.setFocusable(false);
        detayPanel.setVisible(false);
        detayPanel.setSize(1200, 700);

        panel.setSize(1200, 700);
        panel.setFocusable(true);
        panel.setVisible(true);
        
        aktifButon.setOpaque(false);
        aktifButon.setContentAreaFilled(false);
        aktifButon.setBorderPainted(false);
        olusturButon2.setOpaque(false);
        olusturButon2.setContentAreaFilled(false);
        olusturButon2.setBorderPainted(false);
        pasifButon.setOpaque(false);
        pasifButon.setContentAreaFilled(false);
        pasifButon.setBorderPainted(false);
        geri_buton.setOpaque(false);
        geri_buton.setContentAreaFilled(false);
        geri_buton.setBorderPainted(false);

        //durum_buton.setBackground(Color.red);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        proje_tablo = new javax.swing.JTable();
        label_proje = new javax.swing.JLabel();
        silButon2 = new javax.swing.JButton();
        detayButon = new javax.swing.JButton();
        proje_ara = new javax.swing.JTextField();
        panel_sekme = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        olusturButon2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        aktifButon = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pasifButon = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        detayPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        giris1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        giris3 = new javax.swing.JTextField();
        giris4 = new javax.swing.JTextField();
        giris5 = new javax.swing.JTextField();
        giris6 = new javax.swing.JTextField();
        giris7 = new javax.swing.JTextField();
        giris8 = new javax.swing.JTextField();
        giris9 = new javax.swing.JTextField();
        giris10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        giris11 = new javax.swing.JTextField();
        giris12 = new javax.swing.JTextField();
        giris13 = new javax.swing.JTextField();
        giris14 = new javax.swing.JTextField();
        giris15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        giris16 = new javax.swing.JTextField();
        giris17 = new javax.swing.JTextField();
        giris18 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        giris20 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        giris19 = new javax.swing.JTextArea();
        silButon = new javax.swing.JButton();
        olusturButon = new javax.swing.JButton();
        guncelleButon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        giris2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        label_proje2 = new javax.swing.JLabel();
        geri_buton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(153, 153, 255));
        panel.setMinimumSize(new java.awt.Dimension(1200, 700));
        panel.setName(""); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(1200, 700));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proje_tablo.setAutoCreateRowSorter(true);
        proje_tablo.setBackground(new java.awt.Color(240, 240, 240));
        proje_tablo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        proje_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Proje Adı", "Müşteri Adı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        proje_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proje_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(proje_tablo);
        if (proje_tablo.getColumnModel().getColumnCount() > 0) {
            proje_tablo.getColumnModel().getColumn(0).setResizable(false);
            proje_tablo.getColumnModel().getColumn(0).setHeaderValue("Proje Adı");
            proje_tablo.getColumnModel().getColumn(1).setResizable(false);
            proje_tablo.getColumnModel().getColumn(1).setHeaderValue("Müşteri Adı");
        }

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 880, 410));

        label_proje.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_proje.setForeground(new java.awt.Color(255, 51, 0));
        label_proje.setText("AKTİF PROJELER");
        panel.add(label_proje, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 370, 50));

        silButon2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        silButon2.setForeground(new java.awt.Color(255, 51, 51));
        silButon2.setText("SİL");
        silButon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButon2ActionPerformed(evt);
            }
        });
        panel.add(silButon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, 170, 40));

        detayButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        detayButon.setForeground(new java.awt.Color(51, 0, 204));
        detayButon.setText("PROJEYE GİT");
        detayButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detayButonActionPerformed(evt);
            }
        });
        panel.add(detayButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 170, 40));

        proje_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proje_araActionPerformed(evt);
            }
        });
        proje_ara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proje_araKeyReleased(evt);
            }
        });
        panel.add(proje_ara, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 880, 30));

        panel_sekme.setBackground(new java.awt.Color(102, 102, 255));
        panel_sekme.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        olusturButon2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        olusturButon2.setText("YENİ PROJE OLUŞTUR");
        olusturButon2.setBorderPainted(false);
        olusturButon2.setFocusPainted(false);
        olusturButon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturButon2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(olusturButon2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(olusturButon2))
        );

        panel_sekme.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 30));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        aktifButon.setBackground(new java.awt.Color(102,51,255));
        aktifButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aktifButon.setForeground(new java.awt.Color(255, 153, 0));
        aktifButon.setText("AKTİF PROJELER");
        aktifButon.setBorderPainted(false);
        aktifButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aktifButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aktifButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(aktifButon)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_sekme.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 30));

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        pasifButon.setBackground(new java.awt.Color(102,51,255));
        pasifButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pasifButon.setText("PASİF PROJELER");
        pasifButon.setBorderPainted(false);
        pasifButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasifButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pasifButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pasifButon))
        );

        panel_sekme.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 30));

        panel.add(panel_sekme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 700));

        detayPanel.setBackground(new java.awt.Color(153, 153, 255));
        detayPanel.setMinimumSize(new java.awt.Dimension(1200, 700));
        detayPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("AD :");
        detayPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 260, 40));

        giris1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 720, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("DURUM :");
        detayPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 260, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("MÜŞTERİ AD :");
        detayPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 260, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("İLGİLİ KİŞİ :");
        detayPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 260, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("İLGİLİ TELEFON :");
        detayPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 260, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("MÜŞTERİ ADRES :");
        detayPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 260, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("PLATFORM :");
        detayPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 260, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("TEKNOLOJİLER :");
        detayPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 260, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("TESLİM TARİHİ :");
        detayPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 260, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("ALAN ADI KAYIT :");
        detayPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 260, 40));

        giris3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 720, 40));

        giris4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 720, 40));

        giris5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 720, 40));

        giris6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 720, 40));

        giris7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 720, 40));

        giris8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 720, 40));

        giris9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 720, 40));

        giris10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 720, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("SUNUCU KAYIT :");
        detayPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, 260, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("SUNUCU IP :");
        detayPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 700, 260, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("SUNUCU PANEL ADRES :");
        detayPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 750, 260, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("SUNUCU KULLANICI AD :");
        detayPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 800, 260, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("SUNUCU ŞİFRE :");
        detayPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 850, 260, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setText("PROJE DETAYLARI :");
        detayPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1210, 260, 40));

        giris11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 720, 40));

        giris12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 700, 720, 40));

        giris13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 750, 720, 40));

        giris14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 800, 720, 40));

        giris15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 850, 720, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setText("WEB PANEL KULLANICI :");
        detayPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 900, 260, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 204));
        jLabel21.setText("WEB PANEL ŞİFRE :");
        detayPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 950, 260, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 204));
        jLabel22.setText("MAİL SUNUCU KAYIT :");
        detayPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1000, 260, 40));

        giris16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 900, 720, 40));

        giris17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 950, 720, 40));

        giris18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        detayPanel.add(giris18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1000, 720, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 204));
        jLabel23.setText("MAİL BİLGİLERİ :");
        detayPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1050, 260, 40));

        giris20.setColumns(20);
        giris20.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        giris20.setRows(5);
        jScrollPane4.setViewportView(giris20);

        detayPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1200, 720, 140));

        giris19.setColumns(20);
        giris19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        giris19.setRows(5);
        jScrollPane5.setViewportView(giris19);

        detayPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1050, 720, 140));

        silButon.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        silButon.setForeground(new java.awt.Color(255, 0, 0));
        silButon.setText("SİL");
        silButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButonActionPerformed(evt);
            }
        });
        detayPanel.add(silButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 1410, 240, 70));

        olusturButon.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        olusturButon.setForeground(new java.awt.Color(51, 0, 204));
        olusturButon.setText("PROJE OLUŞTUR");
        olusturButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturButonActionPerformed(evt);
            }
        });
        detayPanel.add(olusturButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1410, 260, 70));

        guncelleButon.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        guncelleButon.setForeground(new java.awt.Color(0, 204, 0));
        guncelleButon.setText("GÜNCELLE");
        guncelleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButonActionPerformed(evt);
            }
        });
        detayPanel.add(guncelleButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1410, 240, 70));

        jLabel1.setText(".");
        detayPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1500, -1, -1));

        giris2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        giris2.setMaximumRowCount(2);
        giris2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Pasif" }));
        detayPanel.add(giris2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 720, 40));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_proje2.setFont(new java.awt.Font("Tahoma", 0, 64)); // NOI18N
        label_proje2.setForeground(new java.awt.Color(255, 51, 51));
        label_proje2.setText("YENİ PROJE");
        jPanel4.add(label_proje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 550, 60));

        geri_buton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hasan\\Desktop\\back_icon.png")); // NOI18N
        geri_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri_butonActionPerformed(evt);
            }
        });
        jPanel4.add(geri_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 90));

        detayPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 120));

        jScrollPane2.setViewportView(detayPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proje_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proje_araActionPerformed
        
    }//GEN-LAST:event_proje_araActionPerformed

    private void aktifButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktifButonActionPerformed
            
            durum="Aktif";
            projeGoruntule(durum);
            label_proje.setText("AKTİF PROJELER");
            aktifButon.setForeground(new Color(255,153,0));
            pasifButon.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_aktifButonActionPerformed

    private void olusturButon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButon2ActionPerformed
        panel.setVisible(false);
        panel.setFocusable(false);

        detayPanel.setVisible(true);
        detayPanel.setFocusable(true);
        
        guncelleButon.setVisible(false);
        silButon.setVisible(false);
        olusturButon.setVisible(true);
        
        label_proje2.setText("YENİ PROJE");
        
        textTemizle();
    }//GEN-LAST:event_olusturButon2ActionPerformed

    private void proje_araKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proje_araKeyReleased
        String ara = proje_ara.getText();
        
        dinamikAra(model_proje,proje_tablo,ara);
    }//GEN-LAST:event_proje_araKeyReleased

    private void proje_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proje_tabloMouseClicked
        int selectedrow = proje_tablo.getSelectedRow();
        
        secilenProjeId=projeId.get(selectedrow);
    }//GEN-LAST:event_proje_tabloMouseClicked

    private void detayButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detayButonActionPerformed
        
        if(secilenProjeId!=-1){
            
        panel.setVisible(false);
        panel.setFocusable(false);

        detayPanel.setVisible(true);
        detayPanel.setFocusable(true);
        
        guncelleButon.setVisible(true);
        silButon.setVisible(true);
        olusturButon.setVisible(false);
        
        
        Proje proje = islemler.projeBul(secilenProjeId);

        giris1.setText(proje.getAd());
        giris2.setSelectedItem(proje.getDurum());
        giris3.setText(proje.getMusteriAd());
        giris4.setText(proje.getIlgiliKisi());
        giris5.setText(proje.getIlgiliTelefon());
        giris6.setText(proje.getMusteriAdres());
        giris7.setText(proje.getPlatform());
        giris8.setText(proje.getTeslim_tarih());
        giris9.setText(proje.getTeknolojiler());
        giris10.setText(proje.getAlanAdiKayit());
        giris11.setText(proje.getSunucuKayit());
        giris12.setText(proje.getSunucuIp());
        giris13.setText(proje.getSunucuPanelAdres());
        giris14.setText(proje.getSunucuKullaniciAd());
        giris15.setText(proje.getSunucuSifre());
        giris16.setText(proje.getWebPanelKullanici());
        giris17.setText(proje.getWebPanelSifre());
        giris18.setText(proje.getMailSunucuKayit());
        giris19.setText(proje.getMailBilgi());
        giris20.setText(proje.getProjeDetay());
        
        label_proje2.setText("PROJE DETAYLARI");
            
        }
        
        else{
            JOptionPane.showMessageDialog(rootPane, "Lütfen Proje Seçiniz");
        }
    }//GEN-LAST:event_detayButonActionPerformed

    private void olusturButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButonActionPerformed
            
        
            String ad  =  giris1.getText();
            String _durum = (String) giris2.getSelectedItem();
            String musteriAd = giris3.getText();
            String ilgiliKisi = giris4.getText();
            String ilgiliTelefon = giris5.getText();
            String musteriAdres = giris6.getText();
            String platform = giris7.getText();
            String teslimTarih = giris8.getText();
            String teknolojiler = giris9.getText();
            String alanAdiKayit = giris10.getText();
            String sunucuKayit = giris11.getText();
            String sunucuIp = giris12.getText();
            String sunucuPanelAdres = giris13.getText();
            String sunucuKullaniciAd = giris14.getText();
            String sunucuSifre = giris15.getText();
            String webPanelKullanici = giris16.getText();
            String webPanelSifre = giris17.getText();
            String mailSunucuKayit = giris18.getText();
            String mailBilgi = giris19.getText();
            String projeDetay = giris20.getText();
            
            if(ad.isEmpty() != true && musteriAd.isEmpty() != true){
                islemler.projeEkle(ad, kullaniciId, _durum, musteriAd, ilgiliKisi, ilgiliTelefon, musteriAdres, platform, teslimTarih, teknolojiler, alanAdiKayit, sunucuKayit, sunucuIp, sunucuPanelAdres, sunucuKullaniciAd, sunucuSifre, webPanelKullanici, webPanelSifre, mailSunucuKayit, mailBilgi, projeDetay);
                textTemizle();
                projeGoruntule(durum);
                JOptionPane.showMessageDialog(rootPane, "Proje Oluşturuldu");
                
                detayPanel.setFocusable(false);
                detayPanel.setVisible(false);
                panel.setFocusable(true);
                panel.setVisible(true);
                
        
            }
            
            else{
                if(ad.isEmpty() != true){
                    JOptionPane.showMessageDialog(rootPane, "Müşteri adı kısmı boş bırakılamaz ...");
                }
                else if(musteriAd.isEmpty() != true){
                    JOptionPane.showMessageDialog(rootPane, "Proje adı kısmı boş bırakılamaz ...");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Proje adı ve müşteri adı kısımları boş bırakılamaz ...");
                }
                
            }
           
    }//GEN-LAST:event_olusturButonActionPerformed

    private void silButon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButon2ActionPerformed
        if(secilenProjeId!=-1){
            islemler.projeSil(secilenProjeId);
            projeGoruntule(durum);
            secilenProjeId=-1;
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Lütfen Silinecek Projeyi Seçiniz");
        }
        
    }//GEN-LAST:event_silButon2ActionPerformed

    private void geri_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri_butonActionPerformed
        detayPanel.setFocusable(false);
        detayPanel.setVisible(false);
        
        panel.setFocusable(true);
        panel.setVisible(true);
        
        textTemizle();
    }//GEN-LAST:event_geri_butonActionPerformed

    private void guncelleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButonActionPerformed
            String ad  =  giris1.getText();
            String _durum = (String) giris2.getSelectedItem();
            String musteriAd = giris3.getText();
            String ilgiliKisi = giris4.getText();
            String ilgiliTelefon = giris5.getText();
            String musteriAdres = giris6.getText();
            String platform = giris7.getText();
            String teslimTarih = giris8.getText();
            String teknolojiler = giris9.getText();
            String alanAdiKayit = giris10.getText();
            String sunucuKayit = giris11.getText();
            String sunucuIp = giris12.getText();
            String sunucuPanelAdres = giris13.getText();
            String sunucuKullaniciAd = giris14.getText();
            String sunucuSifre = giris15.getText();
            String webPanelKullanici = giris16.getText();
            String webPanelSifre = giris17.getText();
            String mailSunucuKayit = giris18.getText();
            String mailBilgi = giris19.getText();
            String projeDetay = giris20.getText();
            
            if(ad.isEmpty() != true && musteriAd.isEmpty() != true){
                islemler.projeGuncelle(secilenProjeId,ad, _durum, musteriAd, ilgiliKisi, ilgiliTelefon, musteriAdres, platform, teslimTarih, teknolojiler, alanAdiKayit, sunucuKayit, sunucuIp, sunucuPanelAdres, sunucuKullaniciAd, sunucuSifre, webPanelKullanici, webPanelSifre, mailSunucuKayit, mailBilgi, projeDetay);
                projeGoruntule(durum);
                JOptionPane.showMessageDialog(rootPane, "Proje Güncellendi");
                detayPanel.setFocusable(false);
                detayPanel.setVisible(false);
                panel.setFocusable(true);
                panel.setVisible(true);
            }
            
            else{
                if(ad.isEmpty() != true){
                    JOptionPane.showMessageDialog(rootPane, "Müşteri adı kısmı boş bırakılamaz ...");
                }
                else if(musteriAd.isEmpty() != true){
                    JOptionPane.showMessageDialog(rootPane, "Proje adı kısmı boş bırakılamaz ...");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Proje adı ve müşteri adı kısımları boş bırakılamaz ...");
                }
                
            }
            
    }//GEN-LAST:event_guncelleButonActionPerformed

    private void silButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButonActionPerformed
        islemler.projeSil(secilenProjeId);
        projeGoruntule(durum);
        
        detayPanel.setFocusable(false);
        detayPanel.setVisible(false);
        
        panel.setFocusable(true);
        panel.setVisible(true);
        
        secilenProjeId=-1;
        
        textTemizle();
        JOptionPane.showMessageDialog(rootPane, "Proje Silindi");
    }//GEN-LAST:event_silButonActionPerformed

    private void pasifButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasifButonActionPerformed
            durum="Pasif";
            projeGoruntule(durum);
            label_proje.setText("PASİF PROJELER");
            pasifButon.setForeground(new Color(255,153,0));
            aktifButon.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_pasifButonActionPerformed

    
    public void projeGoruntule(String durum) { // verileri tabloya getirir.
        
        model_proje.setRowCount(0);
        
        ArrayList<Proje> projeler = new ArrayList<Proje>();
        
        projeler = islemler.projeleriGetir(kullaniciId,durum); // istenen durumdaki projelerin tutuldugu arraylist donderilir
        
        projeId.clear();
        
        if (projeler != null ) {
            
            for (Proje proje : projeler) {
                Object[] eklenecek = {proje.getAd(),proje.getMusteriAd()};
                
                projeId.add(proje.getId()); // ekrandaki projelerin id lerini arrayliste atar.
                
                model_proje.addRow(eklenecek);
            }
            
        }
           
    }
    
     public void dinamikAra(DefaultTableModel model,JTable tablo,String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      
        tablo.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
    }
     
     public void textTemizle(){
        giris1.setText("");
        giris2.setSelectedItem("");
        giris3.setText("");
        giris4.setText("");
        giris5.setText("");
        giris6.setText("");
        giris7.setText("");
        giris8.setText("");
        giris9.setText("");
        giris10.setText("");
        giris11.setText("");
        giris12.setText("");
        giris13.setText("");
        giris14.setText("");
        giris15.setText("");
        giris16.setText("");
        giris17.setText("");
        giris18.setText("");
        giris19.setText("");
        giris20.setText("");
     }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aktifButon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton detayButon;
    private javax.swing.JPanel detayPanel;
    private javax.swing.JButton geri_buton;
    private javax.swing.JTextField giris1;
    private javax.swing.JTextField giris10;
    private javax.swing.JTextField giris11;
    private javax.swing.JTextField giris12;
    private javax.swing.JTextField giris13;
    private javax.swing.JTextField giris14;
    private javax.swing.JTextField giris15;
    private javax.swing.JTextField giris16;
    private javax.swing.JTextField giris17;
    private javax.swing.JTextField giris18;
    private javax.swing.JTextArea giris19;
    private javax.swing.JComboBox<String> giris2;
    private javax.swing.JTextArea giris20;
    private javax.swing.JTextField giris3;
    private javax.swing.JTextField giris4;
    private javax.swing.JTextField giris5;
    private javax.swing.JTextField giris6;
    private javax.swing.JTextField giris7;
    private javax.swing.JTextField giris8;
    private javax.swing.JTextField giris9;
    private javax.swing.JButton guncelleButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel label_proje;
    private javax.swing.JLabel label_proje2;
    private javax.swing.JButton olusturButon;
    private javax.swing.JButton olusturButon2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_sekme;
    private javax.swing.JButton pasifButon;
    private javax.swing.JTextField proje_ara;
    private javax.swing.JTable proje_tablo;
    private javax.swing.JButton silButon;
    private javax.swing.JButton silButon2;
    // End of variables declaration//GEN-END:variables
}
