/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi.penjualan.netbeans.k07;

/**
 *
 * @author RnD
 */
public class tableBarang extends javax.swing.JFrame {

    /**
     * Creates new form tableBarang
     */
    public tableBarang() {
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

        jLabel1 = new javax.swing.JLabel();
        kdBarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namaBarang = new javax.swing.JTextField();
        hargaNet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hargaJual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Stock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBarang = new javax.swing.JTable();
        addNew = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        CbxKodeJenis = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jenisBarang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kode Barang");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, -1));
        getContentPane().add(kdBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 110, -1));

        jLabel2.setText("Nama Barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setText("Kode Jenis");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(namaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 330, -1));
        getContentPane().add(hargaNet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, -1));

        jLabel4.setText("Harga Net");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setText("Harga Jual");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        getContentPane().add(hargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 110, -1));

        jLabel6.setText("Stock");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 60, -1));
        getContentPane().add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 50, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Table Data Barang");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        tableBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 650, 220));

        addNew.setText("Add");
        addNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewActionPerformed(evt);
            }
        });
        getContentPane().add(addNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 70, -1));

        Delete.setText("Delete");
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, -1, -1));

        Close.setText("Close");
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 70, -1));

        Cancel.setText("Cancel");
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 70, -1));

        Save.setText("Save");
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 710, 50));

        CbxKodeJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kode Jenis Barang", " " }));
        getContentPane().add(CbxKodeJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, 20));

        jLabel8.setText("Jenis Barang");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jenisBarang.setEnabled(false);
        getContentPane().add(jenisBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 330, -1));

        jLabel9.setText("Rp");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel10.setText("Rp");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        Update.setText("Update");
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewActionPerformed
        
    }//GEN-LAST:event_addNewActionPerformed

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
            java.util.logging.Logger.getLogger(tableBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JComboBox<String> CbxKodeJenis;
    private javax.swing.JButton Close;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Save;
    private javax.swing.JTextField Stock;
    private javax.swing.JButton Update;
    private javax.swing.JButton addNew;
    private javax.swing.JTextField hargaJual;
    private javax.swing.JTextField hargaNet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jenisBarang;
    private javax.swing.JTextField kdBarang;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTable tableBarang;
    // End of variables declaration//GEN-END:variables

    private void SetEnabled() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
