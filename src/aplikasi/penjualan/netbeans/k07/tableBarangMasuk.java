/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi.penjualan.netbeans.k07;

/**
 *
 * @author SMKI Utama5
 */
public class tableBarangMasuk extends javax.swing.JFrame {

    /**
     * Creates new form tableBarangMasuk
     */
    public tableBarangMasuk() {
        initComponents();
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
        tableDistributor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tanggalBarang = new javax.swing.JTextField();
        nota = new javax.swing.JTextField();
        cariData = new javax.swing.JButton();
        idPetugas = new javax.swing.JComboBox<String>();
        jTextField3 = new javax.swing.JTextField();
        idDistributor = new javax.swing.JComboBox<String>();
        namaDistributor = new javax.swing.JTextField();
        kota = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        kodeBarang = new javax.swing.JComboBox<String>();
        namaBarang = new javax.swing.JTextField();
        hargaJual = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        subTotal = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        addItem = new javax.swing.JButton();
        addNew = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();

        tableDistributor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableDistributor);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tanggal Barang Masuk");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 19, 132, -1));

        jLabel2.setText("No.Nota");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 46, 60, -1));

        jLabel3.setText("ID Petugas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 74, 68, -1));

        jLabel4.setText("Nama Petugas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 100, 87, -1));

        jLabel5.setText("ID Distributur");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 123, 87, -1));

        jLabel6.setText("Nama Distributor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 149, 105, -1));

        jLabel7.setText("Kota Asal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 183, 81, -1));

        tanggalBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalBarangActionPerformed(evt);
            }
        });
        getContentPane().add(tanggalBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 16, 405, -1));

        nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaActionPerformed(evt);
            }
        });
        getContentPane().add(nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 43, 71, 22));

        cariData.setBackground(new java.awt.Color(204, 204, 204));
        cariData.setForeground(new java.awt.Color(0, 0, 51));
        cariData.setText("Cari Data");
        getContentPane().add(cariData, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 42, -1, -1));

        idPetugas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Petugas" }));
        getContentPane().add(idPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 71, 405, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 97, 405, -1));

        idDistributor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Distributor", " " }));
        getContentPane().add(idDistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 123, 190, -1));
        getContentPane().add(namaDistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 149, 405, -1));
        getContentPane().add(kota, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 180, 405, -1));

        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Detail Barang");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 244, 84, -1));

        jLabel9.setText("Kode Barang");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 267, 80, -1));

        jLabel10.setText("Nama Barang");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 299, 80, -1));

        jLabel11.setText("Harga Jual");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 339, 65, -1));

        kodeBarang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Data Barang", " " }));
        getContentPane().add(kodeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 264, 130, -1));
        getContentPane().add(namaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 296, 177, -1));
        getContentPane().add(hargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 336, 94, -1));

        jLabel12.setText("Rp");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 339, 43, -1));

        jLabel13.setText("Jumlah");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 304, 43, -1));

        jLabel14.setText("Sub Total Rp");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 339, 80, -1));

        jLabel15.setText("Stok");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 267, 43, -1));
        getContentPane().add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 264, 49, -1));

        subTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subTotal.setText("0");
        subTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subTotalActionPerformed(evt);
            }
        });
        getContentPane().add(subTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 336, 136, -1));
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 296, 49, -1));

        hitung.setBackground(new java.awt.Color(204, 204, 204));
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 295, -1, -1));

        addItem.setBackground(new java.awt.Color(204, 204, 204));
        addItem.setText("Add Item");
        getContentPane().add(addItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 367, 224, -1));

        addNew.setBackground(new java.awt.Color(204, 204, 204));
        addNew.setText("Add New");
        getContentPane().add(addNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 612, -1, -1));

        transaksi.setBackground(new java.awt.Color(204, 204, 204));
        transaksi.setText("Save Transaction");
        getContentPane().add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 612, 153, -1));

        close.setBackground(new java.awt.Color(204, 204, 204));
        close.setText("Close");
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 612, 97, -1));

        jLabel16.setText("Total Rp");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 616, 58, -1));

        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("0");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 613, 133, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tanggalBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalBarangActionPerformed

    private void subTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalActionPerformed

    private void notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notaActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hitungActionPerformed

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
            java.util.logging.Logger.getLogger(tableBarangMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableBarangMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableBarangMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableBarangMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableBarangMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JButton addNew;
    private javax.swing.JButton cariData;
    private javax.swing.JButton close;
    private javax.swing.JTextField hargaJual;
    private javax.swing.JButton hitung;
    private javax.swing.JComboBox<String> idDistributor;
    private javax.swing.JComboBox<String> idPetugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jumlah;
    private javax.swing.JComboBox<String> kodeBarang;
    private javax.swing.JTextField kota;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField namaDistributor;
    private javax.swing.JTextField nota;
    private javax.swing.JTextField stok;
    private javax.swing.JTextField subTotal;
    private javax.swing.JTable tableDistributor;
    private javax.swing.JTextField tanggalBarang;
    private javax.swing.JTextField total;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
