/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttiketpesawat;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */

public class hlmAwal extends javax.swing.JFrame {
    
    /**
     * Creates new form hlmAwal
     */
    public hlmAwal() {
        initComponents();
        Cooser.setVisible(false);
        Child.setVisible(false);
        jSpinner2.setVisible(false);
        }
   
    
    
    int harga = 0;
    int total = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        from = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        to = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        Checkbox = new javax.swing.JCheckBox();
        Seat = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Child = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        Ceeq = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        UangPelanggan = new javax.swing.JTextField();
        Kembalian = new javax.swing.JTextField();
        MustPay = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Cooser = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 66, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\AppData\\Local\\Temp\\icons8_airplane_take_off_26px.png")); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Jakarta", "Indonesia" }));
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });
        jPanel4.add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 0, 100, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 109, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("From");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 87, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("To");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 81, -1));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\AppData\\Local\\Temp\\icons8_airplane_landing_26px.png")); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 30, 28));

        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Bali", "Amerika" }));
        jPanel5.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 100, 40));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 109, -1, 56));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\AppData\\Local\\Temp\\icons8_buying_16px.png")); // NOI18N
        jButton1.setText("Buy Ticket");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 541, 230, -1));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 189, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("Seat Class");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 87, -1, -1));

        Hasil.setEditable(false);
        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 320, 150));

        jLabel7.setForeground(new java.awt.Color(153, 255, 255));
        jLabel7.setText("Depature Date");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 193, -1, -1));

        Checkbox.setBackground(new java.awt.Color(51, 51, 51));
        Checkbox.setForeground(new java.awt.Color(153, 255, 255));
        Checkbox.setText("Return Date");
        Checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckboxActionPerformed(evt);
            }
        });
        jPanel2.add(Checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 189, -1, -1));

        Seat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "First Class", "VIP Class" }));
        jPanel2.add(Seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 109, 103, 40));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\AppData\\Local\\Temp\\icons8_flight_seat_32px_1.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 40, 40));
        jPanel2.add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 213, 136, -1));

        jLabel8.setBackground(new java.awt.Color(153, 255, 255));
        jLabel8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("                                    Payment Ticketing");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 27, 496, -1));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\AppData\\Local\\Temp\\icons8_person_80px.png")); // NOI18N
        jLabel9.setText("Adults");

        Child.setForeground(new java.awt.Color(153, 255, 255));
        Child.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\AppData\\Local\\Temp\\icons8_child_96px.png")); // NOI18N
        Child.setText("Child");

        Ceeq.setText("Bersama Anak Kecil ? ");
        Ceeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeeqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Ceeq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Child, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ceeq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Child, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 270, -1, 196));

        jLabel11.setForeground(new java.awt.Color(153, 255, 255));
        jLabel11.setText("Must Pay");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        jLabel12.setForeground(new java.awt.Color(153, 255, 255));
        jLabel12.setText("Money Customers");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 162, -1));

        jLabel13.setForeground(new java.awt.Color(153, 255, 255));
        jLabel13.setText("Refound");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 162, -1));
        jPanel2.add(UangPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 162, -1));

        Kembalian.setEditable(false);
        jPanel2.add(Kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 162, -1));

        MustPay.setEditable(false);
        MustPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MustPayActionPerformed(evt);
            }
        });
        jPanel2.add(MustPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 162, -1));

        jButton2.setText("Check Prize");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        jButton3.setText("Count");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));
        jPanel2.add(Cooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 213, 150, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\images.png")); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 220, 80));

        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\AppData\\Local\\Temp\\icons8_back_to_50px.png")); // NOI18N
        jToggleButton1.setText("Back to Choose Plane");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 586, 220, 60));

        jToggleButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\AppData\\Local\\Temp\\icons8_export_16px.png")); // NOI18N
        jToggleButton2.setText("Logout");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, 220, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 820, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckboxActionPerformed
        // TODO add your handling code here:
       boolean cba = Checkbox.isSelected();
        if (cba) {
            Cooser.setVisible(true);
        }
        else{
            Cooser.setVisible(false);
        }
       
    }//GEN-LAST:event_CheckboxActionPerformed

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fromActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Object a = jSpinner1.getValue();
        Number b = (Number) a;
        int c = b.intValue();
       
        Object o = jSpinner2.getValue();
        Number d = (Number) o;
        int z = d.intValue();
        
        
        
        Date tanggal = DateChooser.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(tanggal);
        Date TanggalBalik = Cooser.getDate();
        SimpleDateFormat AmbilTanggalBalik = new SimpleDateFormat("yyy-MM-dd");
        AmbilTanggalBalik.format(TanggalBalik);
        
        
        if (from.getSelectedItem() == "Jakarta" && to.getSelectedItem() == "Bali" && Seat.getSelectedItem() == "First Class") {
            Hasil.setText("Selamat transaksi anda sudah berhasil" + "\n berangkat dari : " + from.getSelectedItem()+" " + " \npergi ke " + to.getSelectedItem() +"\nHarga Tiket : " +MustPay.getText()+ "\nUang mu : "+ UangPelanggan.getText()+"\nKembalian : " +Kembalian.getText()+"\nmemilih bangku : " +Seat.getSelectedItem()+"\nBerangkat tanggal : "+ tanggal + "\nUntuk Orang dewasa : " + c);
            
            
        }
      
        if (from.getSelectedItem() == "Jakarta" && to.getSelectedItem() == "Bali" && Seat.getSelectedItem() == "VIP Class") {
            Hasil.setText("Selamat transaksi anda sudah berhasil" + "\n berangkat dari : " + from.getSelectedItem() + " " + " \npergi ke " + to.getSelectedItem() + "\nHarga Tiket : " + MustPay.getText() + "\nUang mu : " + UangPelanggan.getText() + "\nKembalian : " + Kembalian.getText() + "\nmemilih bangku : " + Seat.getSelectedItem() + "\nBerangkat tanggal : " + tanggal + "\nUntuk Orang dewasa : " + c);
            
        }
        
        if (from.getSelectedItem() == "Indonesia" && to.getSelectedItem() == "Amerika" && Seat.getSelectedItem() == "First Class") {
        

        }
        
        if (from.getSelectedItem() == "Indonesia" && to.getSelectedItem() == "Amerika" && Seat.getSelectedItem() == "VIP Class") {
         Hasil.setText("Selamat transaksi anda sudah berhasil" + "\n berangkat dari : " + from.getSelectedItem() + " " + " \npergi ke " + to.getSelectedItem() + "\nHarga Tiket : " + MustPay.getText() + "\nUang mu : " + UangPelanggan.getText() + "\nKembalian : " + Kembalian.getText() + "\nmemilih bangku : " + Seat.getSelectedItem() + "\nBerangkat tanggal : " + tanggal + "\nUntuk Orang dewasa : " + c);

        }
        
        if (Checkbox.isSelected()) {
            Hasil.setText("Selamat transaksi anda sudah berhasil" + "\n   berangkat dari :" + from.getSelectedItem() + "pergi ke " + to.getSelectedItem() + "\nmemilih bangku : " + Seat.getSelectedItem() + "\nBerangkat tanggal : " + tanggal + "\nBalik tanggal : " + TanggalBalik + "\nHarga Tiket : " + MustPay.getText() + "\nUang mu : " + UangPelanggan.getText() + "\nKembalian: " + Kembalian.getText() + "\nUntuk Orang dewasa : " + c);
 
        }
        if (Ceeq.isSelected()) {
            Hasil.setText("Selamat transaksi anda sudah berhasil" + "\n   berangkat dari :" + from.getSelectedItem() + "pergi ke " + to.getSelectedItem() + "\nmemilih bangku : " + Seat.getSelectedItem() + "\nBerangkat tanggal : " + tanggal + "\nBalik tanggal : " + TanggalBalik + "\nHarga Tiket : " + MustPay.getText() + "\nUang mu : " + UangPelanggan.getText() + "\nKembalian: " + Kembalian.getText() +"\nUntuk Orang dewasa : " + c+ " \nUntuk Anak Kecil : " +d);

        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
        if (from.getSelectedItem() == "Jakarta" && to.getSelectedItem() == "Bali" && Seat.getSelectedItem() == "First Class") {
            harga = 4000000;
            MustPay.setText("" + harga);
           
        }if (from.getSelectedItem() == "Jakarta" && to.getSelectedItem() == "Bali" && Seat.getSelectedItem() == "VIP Class") {
            harga = 7000000;
            MustPay.setText("" + harga);
        }
        
        if (from.getSelectedItem() == "Indonesia" && to.getSelectedItem() == "Amerika" && Seat.getSelectedItem() == "First Class") {
            harga = 10000000;
            MustPay.setText("" + harga);
            
        }if (from.getSelectedItem() == "Indonesia" && to.getSelectedItem() == "Amerika" && Seat.getSelectedItem() == "VIP Class") {
            harga = 15000000;
            MustPay.setText("" + harga);
           
        } 
        if (Checkbox.isSelected()) {
            harga = harga*2;
            MustPay.setText(""+harga);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MustPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MustPayActionPerformed
        // TODO add your handling code here:  
       
        
    }//GEN-LAST:event_MustPayActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (from.getSelectedItem() == "Jakarta" && to.getSelectedItem() == "Bali" && Seat.getSelectedItem() == "First Class") {
        int a1 = Integer.parseInt(MustPay.getText());
        int a2 = Integer.parseInt(UangPelanggan.getText());
        int total = (a2 - a1);
        Kembalian.setText(String.valueOf(total));
        }if (from.getSelectedItem() == "Jakarta" && to.getSelectedItem() == "Bali" && Seat.getSelectedItem() == "VIP Class") {
            int a1 = Integer.parseInt(MustPay.getText());
            int a2 = Integer.parseInt(UangPelanggan.getText());
            int total = (a2 - a1);
            Kembalian.setText(String.valueOf(total));
        }if (from.getSelectedItem() == "Indonesia" && to.getSelectedItem() == "Amerika" && Seat.getSelectedItem() == "First Class") {
            int a1 = Integer.parseInt(MustPay.getText());
            int a2 = Integer.parseInt(UangPelanggan.getText());
            int total = (a2 - a1);
            Kembalian.setText(String.valueOf(total));
        }if (from.getSelectedItem() == "Indonesia" && to.getSelectedItem() == "Amerika" && Seat.getSelectedItem() == "Vip Class") {
            int a1 = Integer.parseInt(MustPay.getText());
            int a2 = Integer.parseInt(UangPelanggan.getText());
            int total = (a2 - a1);
            Kembalian.setText(String.valueOf(total));
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CeeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeeqActionPerformed
        // TODO add your handling code here:
        boolean untukanakkecil = Ceeq.isSelected();
        if (untukanakkecil) {
            Child.setVisible(true);
            jSpinner2.setVisible(true);
        }
        else{
            Child.setVisible(false);
            jSpinner2.setVisible(false);
        }
    }//GEN-LAST:event_CeeqActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        DaftarPesawat pesawat = new DaftarPesawat();
        pesawat.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        HalamanLogin login = new HalamanLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(hlmAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hlmAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hlmAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hlmAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hlmAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ceeq;
    private javax.swing.JCheckBox Checkbox;
    private javax.swing.JLabel Child;
    private com.toedter.calendar.JDateChooser Cooser;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JTextField Kembalian;
    private javax.swing.JTextField MustPay;
    private javax.swing.JComboBox<String> Seat;
    private javax.swing.JTextField UangPelanggan;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JComboBox<String> to;
    // End of variables declaration//GEN-END:variables
}
