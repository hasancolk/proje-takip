package musteriprojeuygulamasi;

import javax.swing.JOptionPane;


public class GirisEkrani extends javax.swing.JFrame {

    private Islemler islemler = new Islemler();
    
    public GirisEkrani() {
        initComponents();
        this.setResizable(false);
        this.setSize(1200, 700);
        giris_paneli.setSize(1200, 700);
        giris_paneli.setFocusable(true);
        
        kayit_panel.setFocusable(false);
        kayit_panel.setVisible(false);
        kayit_panel.setSize(1200, 700);
        
        kayit_ad.setText("");
        kayit_soyad.setText("");
        kayit_mail.setText("");
        kayit_sifre.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        giris_paneli = new javax.swing.JPanel();
        giris_buton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        giris_mail = new javax.swing.JTextField();
        giris_sifre = new javax.swing.JPasswordField();
        kaydol_panel_buton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        kayit_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kayit_soyad = new javax.swing.JTextField();
        kayit_mail = new javax.swing.JTextField();
        kayit_ad = new javax.swing.JTextField();
        kayit_buton = new javax.swing.JButton();
        kayit_sifre = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        giris_paneli.setBackground(new java.awt.Color(153, 153, 255));
        giris_paneli.setMinimumSize(new java.awt.Dimension(1200, 700));
        giris_paneli.setPreferredSize(new java.awt.Dimension(1200, 700));
        giris_paneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        giris_buton.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        giris_buton.setForeground(new java.awt.Color(0, 204, 0));
        giris_buton.setText("GİRİŞ YAP");
        giris_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_butonActionPerformed(evt);
            }
        });
        giris_paneli.add(giris_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 270, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("ŞİFRE");
        giris_paneli.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 200, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("E-POSTA");
        giris_paneli.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 200, 50));

        giris_mail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        giris_paneli.add(giris_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 400, 50));

        giris_sifre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        giris_paneli.add(giris_sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 400, 50));

        kaydol_panel_buton.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        kaydol_panel_buton.setForeground(new java.awt.Color(255, 51, 0));
        kaydol_panel_buton.setText("KAYIT OL");
        kaydol_panel_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydol_panel_butonActionPerformed(evt);
            }
        });
        giris_paneli.add(kaydol_panel_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 280, 70));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("GİRİŞ EKRANI");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 470, 60));

        giris_paneli.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 140));

        kayit_panel.setBackground(new java.awt.Color(153, 153, 255));
        kayit_panel.setMinimumSize(new java.awt.Dimension(1200, 700));
        kayit_panel.setPreferredSize(new java.awt.Dimension(1200, 700));
        kayit_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("SOYAD");
        kayit_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 310, 169, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("MAİL");
        kayit_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 380, 169, 46));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("ŞİFRE");
        kayit_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 450, 169, 46));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("AD");
        kayit_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 240, 169, -1));

        kayit_soyad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kayit_soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_soyadActionPerformed(evt);
            }
        });
        kayit_panel.add(kayit_soyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 315, 510, 46));

        kayit_mail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kayit_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_mailActionPerformed(evt);
            }
        });
        kayit_panel.add(kayit_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 383, 510, 46));

        kayit_ad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kayit_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_adActionPerformed(evt);
            }
        });
        kayit_panel.add(kayit_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 250, 510, 46));

        kayit_buton.setBackground(new java.awt.Color(102,102,255));
        kayit_buton.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        kayit_buton.setForeground(new java.awt.Color(255, 0, 0));
        kayit_buton.setText("KAYIT OL");
        kayit_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_butonActionPerformed(evt);
            }
        });
        kayit_panel.add(kayit_buton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 260, 65));

        kayit_sifre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kayit_sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_sifreActionPerformed(evt);
            }
        });
        kayit_panel.add(kayit_sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 453, 510, 46));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("KAYIT EKRANI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 470, 60));

        kayit_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(giris_paneli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1330, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kayit_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(giris_paneli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kayit_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giris_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_butonActionPerformed
        
        String mail = this.giris_mail.getText();
        String sifre = new String(this.giris_sifre.getPassword());
        boolean girdiMi = islemler.girisYap(mail, sifre);
        if (girdiMi == true) {
            int id = islemler.kullaniciID(mail, sifre);
            
            ProjeEkrani arayuz = new ProjeEkrani(id);
            this.setVisible(false);
            this.setFocusable(false);

            arayuz.setVisible(true);
            arayuz.setFocusable(true);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Giriş Başarısız!");
        }
    }//GEN-LAST:event_giris_butonActionPerformed

    private void kayit_soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_soyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kayit_soyadActionPerformed

    private void kayit_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kayit_mailActionPerformed

    private void kayit_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kayit_adActionPerformed

    private void kayit_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_butonActionPerformed
        String ad = kayit_ad.getText();
        String soyad = kayit_soyad.getText();
        String mail = kayit_mail.getText();
        String sifre = new String(kayit_sifre.getPassword());
        
        if (ad.isEmpty() != true && soyad.isEmpty() != true && mail.isEmpty() != true && sifre.isEmpty() != true) {
            if (islemler.kayitKullanici(ad, soyad, mail, sifre)) {
                JOptionPane.showMessageDialog(rootPane, "Kayıt İşlemi Gerçekleşti");
                
                kayit_panel.setFocusable(false);
                kayit_panel.setVisible(false);
                
                giris_paneli.setVisible(true);
                giris_paneli.setFocusable(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Bu Mail Adresine Kayıtlı Kullanıcı Var");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Tüm Alanları Doldurunuz");
        }
    }//GEN-LAST:event_kayit_butonActionPerformed

    private void kayit_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kayit_sifreActionPerformed

    private void kaydol_panel_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydol_panel_butonActionPerformed
        giris_paneli.setVisible(false);
        giris_paneli.setFocusable(false);

        kayit_panel.setVisible(true);
        kayit_panel.setFocusable(true);
    }//GEN-LAST:event_kaydol_panel_butonActionPerformed

    
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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris_buton;
    private javax.swing.JTextField giris_mail;
    private javax.swing.JPanel giris_paneli;
    private javax.swing.JPasswordField giris_sifre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kaydol_panel_buton;
    private javax.swing.JTextField kayit_ad;
    private javax.swing.JButton kayit_buton;
    private javax.swing.JTextField kayit_mail;
    private javax.swing.JPanel kayit_panel;
    private javax.swing.JPasswordField kayit_sifre;
    private javax.swing.JTextField kayit_soyad;
    // End of variables declaration//GEN-END:variables
}
