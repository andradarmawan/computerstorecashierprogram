/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_komputer;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andra
 */
public class JFrame_Kasir extends javax.swing.JFrame {

    
    kasir_craftComputer crafcom;
    String nama_komponen;
    DefaultTableModel tblkasir;
    /**
     * Creates new form JFrame_Kasir
     */
   
    
    public JFrame_Kasir() {
        initComponents();
        crafcom = new kasir_craftComputer();
        tblkasir = (DefaultTableModel) tbl_kasir.getModel();
    }
    
    public void refreshTable(){
        // resert row
        int jumlahRow = tblkasir.getRowCount();
        for(int i = jumlahRow -1; i >= 0; i--){
            tblkasir.removeRow(i);
        }
        
        ResultSet data = crafcom.getAllKasir();
    try {
        while(data.next()){
            tblkasir.addRow(new Object[]{
            data.getString("nama_barang"),
            data.getString("harga_barang"),
            data.getString("jumlah_beli"),
            data.getString("total_harga"),
            data.getString("jumlah_bayar"),
            data.getString("jumlah_kembalian")
        });
        } 
    } catch (SQLException ex) {
        Logger.getLogger(JFrame_Kasir.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_hapus = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_jumlahKembalian = new javax.swing.JTextField();
        tf_hargaBarang = new javax.swing.JTextField();
        tf_jumlahBeli = new javax.swing.JTextField();
        tf_totalHarga = new javax.swing.JTextField();
        tf_jumlahBayar = new javax.swing.JTextField();
        cb_namaBarang = new javax.swing.JComboBox<>();
        btn_jumlahKembalian = new javax.swing.JButton();
        btn_jumlahHarga = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_kasir = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CRAFT KOMPUTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(334, 334, 334))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 50));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_hapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel2.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 80, 30));

        btn_simpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 80, 30));

        btn_edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
        });
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel2.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 80, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 820, 50));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("JUMLAH KEMBALIAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 51, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("NAMA BARANG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 51, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("HARGA BARANG");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("JUMLAH BAYAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 51, 51));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("JUMLAH BELI");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("TOTAL HARGA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        getContentPane().add(tf_jumlahKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 200, 30));

        tf_hargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hargaBarangActionPerformed(evt);
            }
        });
        getContentPane().add(tf_hargaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 200, 30));

        tf_jumlahBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_jumlahBeliActionPerformed(evt);
            }
        });
        getContentPane().add(tf_jumlahBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 200, 30));
        getContentPane().add(tf_totalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, 30));
        getContentPane().add(tf_jumlahBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 200, 30));

        cb_namaBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH BARANG", "MONITOR SAMSUNG", "MONITOR LG", "MONITOR VIEWSONIC", "PROCESSOR INTEL i3", "PROCESSOR INTEL i5", "PROCESSOR INTEL i7", "PROCESSOR AMD R3", "PROCESSOR AMD R5", "PROCESSOR AMD R7", "NVIDIA RTX 4060", "NVIDIA RTX 4070", "NVIDIA RTX 4080", "SSD SAMSUNG", "SSD KINGSTON", "RAM ADATA", "RAM SAMSUNG" }));
        cb_namaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_namaBarangActionPerformed(evt);
            }
        });
        getContentPane().add(cb_namaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 200, 30));

        btn_jumlahKembalian.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_jumlahKembalian.setText("HITUNG JUMLAH KEMBALIAN");
        btn_jumlahKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jumlahKembalianActionPerformed(evt);
            }
        });
        getContentPane().add(btn_jumlahKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 210, 50));

        btn_jumlahHarga.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_jumlahHarga.setText("HITUNG JUMLAH HARGA");
        btn_jumlahHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jumlahHargaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_jumlahHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 210, 50));

        tbl_kasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Harga Barang", "Jumlah Beli", "Total Harga", "Jumlah Bayar", "Jumlah Kembalian"
            }
        ));
        tbl_kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_kasirMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_kasir);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 820, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_namaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_namaBarangActionPerformed
        // TODO add your handling code here:
        if(cb_namaBarang.getSelectedIndex()==1)
        {
            tf_hargaBarang.setText(String.valueOf("1300000"));
            nama_komponen = "MONITOR SAMSUNG";
        }
        else if(cb_namaBarang.getSelectedIndex()==2)
        {
            tf_hargaBarang.setText(String.valueOf("4300000"));
            nama_komponen = "MONITOR LG";
        }
        else if(cb_namaBarang.getSelectedIndex()==3)
        {
            tf_hargaBarang.setText(String.valueOf("3700000"));
            nama_komponen = "MONITOR VIEWSONIC";
        }
        else if(cb_namaBarang.getSelectedIndex()==4)
        {
            tf_hargaBarang.setText(String.valueOf("1800000"));
            nama_komponen = "PROCESSOR INTEL i3";
        }
        else if(cb_namaBarang.getSelectedIndex()==5)
        {
            tf_hargaBarang.setText(String.valueOf("3300000"));
            nama_komponen = "PROCESSOR INTEL i5";
        }
        else if(cb_namaBarang.getSelectedIndex()==6)
        {
            tf_hargaBarang.setText(String.valueOf("5700000"));
            nama_komponen = "PROCESSOR INTEL i7";
        }
        else if(cb_namaBarang.getSelectedIndex()==7)
        {
            tf_hargaBarang.setText(String.valueOf("1700000"));
            nama_komponen = "PROCESSOR AMD R3";
        }
        else if(cb_namaBarang.getSelectedIndex()==8)
        {
            tf_hargaBarang.setText(String.valueOf("3350000"));
            nama_komponen = "PROCESSOR AMD R5";
        }
        else if(cb_namaBarang.getSelectedIndex()==9)
        {
            tf_hargaBarang.setText(String.valueOf("5900000"));
            nama_komponen = "PROCESSOR AMD R7";
        }
        else if(cb_namaBarang.getSelectedIndex()==10)
        {
            tf_hargaBarang.setText(String.valueOf("6750000"));
            nama_komponen = "NVIDIA RTX 4060";
        }
        else if(cb_namaBarang.getSelectedIndex()==11)
        {
            tf_hargaBarang.setText(String.valueOf("8400000"));
            nama_komponen = "NVIDIA RTX 4070";
        }
        else if(cb_namaBarang.getSelectedIndex()==12)
        {
            tf_hargaBarang.setText(String.valueOf("12000000"));
            nama_komponen = "NVIDIA RTX 4080";
        }
        else if(cb_namaBarang.getSelectedIndex()==13)
        {
            tf_hargaBarang.setText(String.valueOf("2500000"));
            nama_komponen = "SSD SAMSUNG";
        }
        else if(cb_namaBarang.getSelectedIndex()==14)
        {
            tf_hargaBarang.setText(String.valueOf("2300000"));
            nama_komponen = "SSD KINGSTON";
        }
        else if(cb_namaBarang.getSelectedIndex()==15)
        {
            tf_hargaBarang.setText(String.valueOf("1700000"));
            nama_komponen = "RAM ADATA";
        }
        else if(cb_namaBarang.getSelectedIndex()==16)
        {
            tf_hargaBarang.setText(String.valueOf("1400000"));
            nama_komponen = "RAM SAMSUNG";
        }  
    }//GEN-LAST:event_cb_namaBarangActionPerformed

    private void tf_hargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hargaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hargaBarangActionPerformed

    private void btn_jumlahHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jumlahHargaActionPerformed
        // TODO add your handling code here:
        Integer harga, jumlah, total;
        harga = Integer.parseInt(tf_hargaBarang.getText());
        jumlah = Integer.parseInt(tf_jumlahBeli.getText());
        total = harga * jumlah;
        
        tf_totalHarga.setText(String.valueOf(total));
    }//GEN-LAST:event_btn_jumlahHargaActionPerformed

    private void tf_jumlahBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_jumlahBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_jumlahBeliActionPerformed

    private void btn_jumlahKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jumlahKembalianActionPerformed
        // TODO add your handling code here:
        Integer harga, bayar, total;
        harga = Integer.parseInt(tf_totalHarga.getText());
        bayar = Integer.parseInt(tf_jumlahBayar.getText());
        total = bayar - harga;
        
        tf_jumlahKembalian.setText(String.valueOf(total));
    }//GEN-LAST:event_btn_jumlahKembalianActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        boolean insert = crafcom.insertKasir(nama_komponen,
                Integer.parseInt(tf_hargaBarang.getText()),
                Integer.parseInt(tf_jumlahBeli.getText()),
                Integer.parseInt(tf_totalHarga.getText()),
                Integer.parseInt(tf_jumlahBayar.getText()),
                Integer.parseInt(tf_jumlahKembalian.getText()));
        
        if(insert==true){
            refreshTable();
            
            cb_namaBarang.setActionCommand("");
            tf_hargaBarang.setText("");
            tf_jumlahBeli.setText("");
            tf_totalHarga.setText("");        
            tf_jumlahBayar.setText("");
            tf_jumlahKembalian.setText("");
            
            JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
        }else{
            JOptionPane.showMessageDialog(this, "Data Gagal Disimpan");
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void tbl_kasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_kasirMouseClicked
        // TODO add your handling code here:
        int row = tbl_kasir.getSelectedRow();
        
        cb_namaBarang.setActionCommand(tbl_kasir.getValueAt(row, 0).toString());
        tf_hargaBarang.setText(tbl_kasir.getValueAt(row, 1).toString());
        tf_jumlahBeli.setText(tbl_kasir.getValueAt(row, 2).toString());
        tf_totalHarga.setText(tbl_kasir.getValueAt(row, 3).toString());
        tf_jumlahBayar.setText(tbl_kasir.getValueAt(row, 4).toString());
        tf_jumlahKembalian.setText(tbl_kasir.getValueAt(row, 5).toString());
        
        btn_edit.setVisible(true);
        btn_hapus.setVisible(true);
        btn_simpan.setVisible(false);
    }//GEN-LAST:event_tbl_kasirMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        boolean update = crafcom.updateKasir(nama_komponen,
                Integer.parseInt(tf_hargaBarang.getText()),
                Integer.parseInt(tf_jumlahBeli.getText()),
                Integer.parseInt(tf_totalHarga.getText()),
                Integer.parseInt(tf_jumlahBayar.getText()),
                Integer.parseInt(tf_jumlahKembalian.getText()));
        
        if(update == true){
            refreshTable();
            
            cb_namaBarang.setSelectedItem("");
            tf_hargaBarang.setText("");
            tf_jumlahBeli.setText("");
            tf_totalHarga.setText("");        
            tf_jumlahBayar.setText("");
            tf_jumlahKembalian.setText("");
            
            JOptionPane.showMessageDialog(this,"Data berhasil di edit");
        }else{ 
            JOptionPane.showMessageDialog(this,"Data gagal di edit");
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        // TODO add your handling code here:
        
        int row = tbl_kasir.getSelectedRow();
        
        cb_namaBarang.setActionCommand(tbl_kasir.getValueAt(row, 0).toString());
        tf_hargaBarang.setText(tbl_kasir.getValueAt(row, 1).toString());
        tf_jumlahBeli.setText(tbl_kasir.getValueAt(row, 2).toString());
        tf_totalHarga.setText(tbl_kasir.getValueAt(row, 3).toString());
        tf_jumlahBayar.setText(tbl_kasir.getValueAt(row, 4).toString());
        tf_jumlahKembalian.setText(tbl_kasir.getValueAt(row, 5).toString());
        
    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        
        crafcom.hapusKasir(cb_namaBarang.getActionCommand());
        refreshTable();
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
        
            cb_namaBarang.setActionCommand("");
            tf_hargaBarang.setText("");
            tf_jumlahBeli.setText("");
            tf_totalHarga.setText("");        
            tf_jumlahBayar.setText("");
            tf_jumlahKembalian.setText("");
            
            btn_simpan.setVisible(true);
            btn_edit.setVisible(false);
            btn_hapus.setVisible(false);
    }//GEN-LAST:event_btn_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_jumlahHarga;
    private javax.swing.JButton btn_jumlahKembalian;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cb_namaBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbl_kasir;
    private javax.swing.JTextField tf_hargaBarang;
    private javax.swing.JTextField tf_jumlahBayar;
    private javax.swing.JTextField tf_jumlahBeli;
    private javax.swing.JTextField tf_jumlahKembalian;
    private javax.swing.JTextField tf_totalHarga;
    // End of variables declaration//GEN-END:variables
}
