
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class sözlesme extends javax.swing.JFrame {

    public sözlesme() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        soyada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tc_noa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        D_Tarihia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Adresa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cep_tela = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        k_ada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        k_soyada = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        k_tc_noa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        k_d_tariha = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        k_adresa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        k_cep_tela = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ehliyet_noa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ehliyet_tarihia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        plakaa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        markaa = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        modela = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tipa = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        renka = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cıkıs_zamanıa = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        donus_zamanıa = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        toplam_ucreta = new javax.swing.JTextField();
        KAYDET = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        kma = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        yakıta = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        vitesa = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        sozlesme_noa = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        sozlesme_no2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        söz_süresia = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SÖZLEŞME FORMU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADI :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SOYAD :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TC NO ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOĞUM TARİH :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADRES :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CEP TELEFON :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("KEFİL AD :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("KEFİL SOYAD :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("KEFİL TC NO :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("KEFİL DOĞUM TARİH:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("KEFİL ADRES :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("KEFİL CEP TELEFON :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("EHLİYET NO :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("EHLİYET TARİHİ :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PLAKA :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("MARKA :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MODEL :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("TİP :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("RENK :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SÖZLEŞME SÜRESİ :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ÇIKIŞ ZAMANI  :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("DÖNÜŞ ZAMANI :");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("TOPLAM ÜCRET :");

        KAYDET.setBackground(new java.awt.Color(0, 0, 0));
        KAYDET.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        KAYDET.setForeground(new java.awt.Color(255, 255, 255));
        KAYDET.setText("KAYDET");
        KAYDET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KAYDETMouseClicked(evt);
            }
        });
        KAYDET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KAYDETActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("KİLOMETRE :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("YAKIT :");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("VİTES :");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("SÖZLEŞME NO :");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("       SORGULA");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("SÖZLEŞME NO :");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ARAMA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SİL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("ARAÇ EKLE :");

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("MÜSTERİ EKLE :");

        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("GÜNCELLE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton5.setText("CIKIS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(KAYDET, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel32)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ada, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                        .addComponent(soyada, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tc_noa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(D_Tarihia)
                                            .addComponent(Adresa)
                                            .addComponent(cep_tela)
                                            .addComponent(ehliyet_noa)
                                            .addComponent(ehliyet_tarihia)
                                            .addComponent(jComboBox2, 0, 138, Short.MAX_VALUE))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 88, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel16)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(plakaa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel31)
                                                    .addGap(32, 32, 32)
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel20)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(tipa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(modela, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel17)
                                                        .addGap(59, 59, 59)
                                                        .addComponent(markaa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jLabel25)
                                                .addComponent(jLabel26)
                                                .addComponent(jLabel27)))
                                        .addGap(126, 126, 126))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(kma, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(renka, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(yakıta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(vitesa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sozlesme_no2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(125, 125, 125))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8))
                                    .addGap(60, 60, 60))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel23)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel28)
                                                .addComponent(jLabel24)))
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(k_ada, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k_soyada, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k_tc_noa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k_d_tariha, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k_adresa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(k_cep_tela, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(söz_süresia, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cıkıs_zamanıa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donus_zamanıa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toplam_ucreta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sozlesme_noa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(262, 262, 262)
                .addComponent(jButton5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButton5))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(k_ada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plakaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel9)
                    .addComponent(k_soyada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addGap(684, 684, 684))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(soyada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(markaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tc_noa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(modela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(D_Tarihia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel19))
                                .addComponent(tipa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20)
                                        .addComponent(renka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(kma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Adresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cep_tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(yakıta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ehliyet_noa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(vitesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ehliyet_tarihia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addGap(11, 11, 11)
                            .addComponent(jLabel29)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(KAYDET)
                                .addComponent(jButton4)
                                .addComponent(jLabel30)
                                .addComponent(sozlesme_no2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton3))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(k_tc_noa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(k_d_tariha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(k_adresa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(k_cep_tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(söz_süresia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cıkıs_zamanıa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(donus_zamanıa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toplam_ucreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sozlesme_noa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Connection conn = null;

    private String url = "jdbc:mysql://localhost:3306/otokiralama";
    private String diver = "com.mysql.jdbc.Driver";
    private String userAdi = "root";
    private String userPass = "";
    private String properties = "?userUnicode=true&charecterEncoding=utf8";
    public ResultSet res;
    public PreparedStatement st;

    public java.sql.Statement baglantıAc() throws Exception {
        Class.forName(diver).newInstance();
        conn = (Connection) DriverManager.getConnection(url + properties, userAdi, userPass);
        return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }


    private void KAYDETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KAYDETActionPerformed
        // TODO add your handling code here:
        //KAYDET 


    }//GEN-LAST:event_KAYDETActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String temp = (String) jComboBox2.getSelectedItem();

        try {
            String sorgu = "Select *from musteriekle where tc_no=?";
            st = (PreparedStatement) conn.prepareStatement(sorgu);
            st.setString(1, temp);
            ResultSet sonuc = st.executeQuery(); 
            if (sonuc.next()) {  
                String ekle = sonuc.getString("adi");
                ada.setText(ekle);
                String ekle1 = sonuc.getString("soyadi"); 
                soyada.setText(ekle1);
                String ekle2 = sonuc.getString("tc_no");
                tc_noa.setText(ekle2);
                String ekle3 = sonuc.getString("dogum_tarihi");
                D_Tarihia.setText(ekle3);
                String ekle5 = sonuc.getString("adres");
                Adresa.setText(ekle5);
                String ekle6 = sonuc.getString("cep_telefon");
                cep_tela.setText(ekle6);
                String ekle7 = sonuc.getString("ehliyet_no");
                ehliyet_noa.setText(ekle7);
                String ekle8 = sonuc.getString("ehliyet_tarihi");
                ehliyet_tarihia.setText(ekle8);
            }

        } catch (Exception ex) {
            Logger.getLogger(Musteri_ekle.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        // TODO add your handling code here:

        try {
            String sorgu = "Select *from musteriekle";
            Statement ifade = (Statement) baglantıAc();
            ResultSet sonuc = ifade.executeQuery(sorgu);
            while (sonuc.next()) {
                String tc = sonuc.getString("tc_no");
                jComboBox2.addItem(tc);

             }
        } catch (Exception ex) {
            Logger.getLogger(Musteri_ekle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //SİL
        try {
            Statement ifade=(Statement) baglantıAc();
          //  st = (PreparedStatement) (Statement) baglantıAc();
            ifade.executeUpdate("Delete from sozlesme where sozlesme_no=" + sozlesme_no2.getText());

            JOptionPane.showMessageDialog(null, "İSTENEN VERİLER SİLİNDİ....");
            System.out.println("İSTENEN VERİLER  SİLİNDİ.....");
        } catch (SQLException ex) {
           
        } catch (Exception ex) {
                          Logger.getLogger(sözlesme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //ARAMA , LİSTELEME
        try {
            Statement ifade = (Statement) baglantıAc();
            String sorgu = "Select * from sozlesme";
            ResultSet sonuc = ifade.executeQuery(sorgu);
            while (sonuc.next()) {

                System.out.println("sozlesme_no: " + sonuc.getInt(1));
                System.out.println("Adi: " + sonuc.getString(2));
                System.out.println("Soyadi: " + sonuc.getString(3));
                System.out.println("Tc_No: " + sonuc.getInt(4));
                System.out.println("D_tarihi: " + sonuc.getDate(5));
                System.out.println("Adres: " + sonuc.getString(6));
                System.out.println("Cep_Tel: " + sonuc.getInt(7));
                System.out.println("Ehliyet_No: " + sonuc.getInt(8));
                System.out.println("Ehliyet Tarihi: " + sonuc.getDate(9));
                System.out.println("plaka: " + sonuc.getString(10));
                System.out.println("marka: " + sonuc.getString(11));
                System.out.println("model: " + sonuc.getString(12));
                System.out.println("tip: " + sonuc.getString(13));
                System.out.println("renk: " + sonuc.getString(14));
                System.out.println("kilometre: " + sonuc.getInt(15));
                System.out.println("yakıt: " + sonuc.getString(16));
                System.out.println("vites: " + sonuc.getString(17));
                System.out.println("k_adi: " + sonuc.getString(18));
                System.out.println("k_soyadi: " + sonuc.getString(19));
                System.out.println("k_tc_no: " + sonuc.getInt(20));
                System.out.println("k_d_tarihi: " + sonuc.getDate(21));
                System.out.println("k_adres: " + sonuc.getString(22));
                System.out.println("k_cep_tel: " + sonuc.getInt(23));
                System.out.println("soz_süresi: " + sonuc.getString(24));
                System.out.println("cıkıs_zamanı: " + sonuc.getDate(25));
                System.out.println("donuz_zamanı: " + sonuc.getDate(26));
                System.out.println("toplam_ucret: " + sonuc.getInt(27));

            }
            JOptionPane.showMessageDialog(null, "İSTENEN VERİLER LİSTELENDİ....");
            System.out.println("VERİLER BAŞARILI BİR ŞEKİLDE LİSTELENDİ....");
        } catch (ClassNotFoundException e) {
            System.out.println("sonuc bulunamadı...");
        } catch (SQLException e) {
            System.out.println("veritabanı hatası....");
        } catch (Exception ex) {
            Logger.getLogger(sözlesme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String temp1 = (String) jComboBox1.getSelectedItem();
        try {
            String sorgu = "Select *from arac_ekle where plaka=?";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sorgu);
            pst.setString(1, temp1);
            ResultSet sonuc = pst.executeQuery();
            if (sonuc.next()) {
                String ekle = sonuc.getString("plaka");
                plakaa.setText(ekle);
                String ekle1 = sonuc.getString("marka");
                markaa.setText(ekle1);
                String ekle2 = sonuc.getString("model");
                modela.setText(ekle2);
                String ekle3 = sonuc.getString("tip");
                tipa.setText(ekle3);
                String ekle5 = sonuc.getString("renk");
                renka.setText(ekle5);
                String ekle6 = sonuc.getString("kilometre");
                kma.setText(ekle6);
                String ekle7 = sonuc.getString("yakıt");
                yakıta.setText(ekle7);
                String ekle8 = sonuc.getString("vites");
                vitesa.setText(ekle8);
            }

        } catch (Exception ex) {
            Logger.getLogger(arac_ekle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        try {
            String sorgu = "Select *from arac_ekle";
            Statement ifade = (Statement) baglantıAc();
            ResultSet sonuc = ifade.executeQuery(sorgu);
            while (sonuc.next()) {
                String name = sonuc.getString("plaka");
                jComboBox1.addItem(name);

            }
        } catch (Exception ex) {
            Logger.getLogger(arac_ekle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ANASAYFA ana = new ANASAYFA();
        ana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void KAYDETMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KAYDETMouseClicked
        // TODO add your handling code here:
        // KAYDET
        try {
            Statement ifade = (Statement) baglantıAc();
            String sorgu = "Insert into sozlesme(sozlesme_no,adi,soyadi,tc_no,dogum_tarihi,adres,cep_telefon,ehliyet_no,ehliyet_tarihi,plaka,marka,model,tip,renk,kilometre,yakit,vites,kefil_adi,kefil_soyadi,kefil_tc_no,kefil_d_tarihi,kefil_adres,kefil_cep_tel,sozlesme_suresi,cikis_tarihi,donus_tarihi,toplam_ucret)Values ('" + sozlesme_noa.getText() + "','" + ada.getText() + "','" + soyada.getText() + "','" + tc_noa.getText() + "','" + D_Tarihia.getText() + "','" + Adresa.getText() + "','" + cep_tela.getText() + "','" + ehliyet_noa.getText() + "','" + ehliyet_tarihia.getText() + "','" + plakaa.getText() + "','" + markaa.getText() + "','" + modela.getText() + "','" + tipa.getText() + "','" + renka.getText() + "','" + kma.getText() + "','" + yakıta.getText() + "','" + vitesa.getText() + "','"+ k_ada.getText() + "','" + k_soyada.getText() + "','" + k_tc_noa.getText() + "','" + k_d_tariha.getText() + "','" + k_adresa.getText() + "','" + k_cep_tela.getText() + "','" + söz_süresia.getText() + "','" + cıkıs_zamanıa.getText() + "','" + donus_zamanıa.getText() + "','" + toplam_ucreta.getText() + "')";
            ifade.executeUpdate(sorgu);

            JOptionPane.showMessageDialog(null, "İSTENEN VERİLER  kaydedildi....");
            System.out.println("İSTENEN VERİLER BAŞARIYLA EKLENDİ...");
        } catch (SQLException ex) {
            Logger.getLogger(sözlesme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_KAYDETMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //GÜNCELLE
        
        try {
           Statement cst=(Statement) baglantıAc();
            cst.executeUpdate("Update sozlesme set sozlesme_no='"+sozlesme_noa.getText()+"',adi='"+ada.getText()+"',soyadi='"+soyada.getText()+"',tc_no='"+tc_noa.getText()+"',dogum_tarihi='"+D_Tarihia.getText()+"',adres='"+Adresa.getText()+"',cep_telefon='"+cep_tela.getText()+"',ehliyet_no='"+ehliyet_noa.getText()+"',ehliyet_tarihi='"+ehliyet_tarihia.getText()+"',plaka='"+plakaa.getText()+"',marka='"+markaa.getText()+"',model='"+modela.getText()+"',tip='"+tipa.getText()+"',renk='"+renka.getText()+"',kilometre='"+kma.getText()+"',yakit='"+yakıta.getText()+"',vites='"+vitesa.getText()+"',kefil_adi='"+k_ada.getText()+"',kefil_soyadi='"+k_soyada.getText()+"',kefil_tc_no='"+k_tc_noa.getText()+"',kefil_d_tarihi='"+k_d_tariha.getText()+"',kefil_adres='"+k_adresa.getText()+"',kefil_cep_tel='"+k_cep_tela.getText()+"',sozlesme_suresi='"+söz_süresia.getText()+"',cikis_tarihi='"+cıkıs_zamanıa.getText()+"',donus_tarihi='"+donus_zamanıa.getText()+"',toplam_ucret='"+toplam_ucreta.getText()+"' where sozlesme_no='"+Integer.valueOf(sozlesme_noa.getText())+"'");
       
                 JOptionPane.showMessageDialog(null,"VERİLER BAŞARILI BİR ŞEKİLDE GÜNCELLENDİ....");
                System.out.println("VERİLER BAŞARILI BİR ŞEKİLDE GÜNCELLENDİ....");
        } catch (SQLException ex) {
            Logger.getLogger(sözlesme.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e) {
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(sözlesme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sözlesme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sözlesme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sözlesme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sözlesme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adresa;
    private javax.swing.JTextField D_Tarihia;
    private javax.swing.JButton KAYDET;
    private javax.swing.JTextField ada;
    private javax.swing.JTextField cep_tela;
    private javax.swing.JTextField cıkıs_zamanıa;
    private javax.swing.JTextField donus_zamanıa;
    private javax.swing.JTextField ehliyet_noa;
    private javax.swing.JTextField ehliyet_tarihia;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField k_ada;
    private javax.swing.JTextField k_adresa;
    private javax.swing.JTextField k_cep_tela;
    private javax.swing.JTextField k_d_tariha;
    private javax.swing.JTextField k_soyada;
    private javax.swing.JTextField k_tc_noa;
    private javax.swing.JTextField kma;
    private javax.swing.JTextField markaa;
    private javax.swing.JTextField modela;
    private javax.swing.JTextField plakaa;
    private javax.swing.JTextField renka;
    private javax.swing.JTextField soyada;
    private javax.swing.JTextField sozlesme_no2;
    private javax.swing.JTextField sozlesme_noa;
    private javax.swing.JTextField söz_süresia;
    private javax.swing.JTextField tc_noa;
    private javax.swing.JTextField tipa;
    private javax.swing.JTextField toplam_ucreta;
    private javax.swing.JTextField vitesa;
    private javax.swing.JTextField yakıta;
    // End of variables declaration//GEN-END:variables
}
