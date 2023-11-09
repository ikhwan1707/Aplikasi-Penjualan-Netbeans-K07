/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi.penjualan.netbeans.k07;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
//import koneksi.koneksi;

/**
 *
 * @author NAUFAL YUSTIN AGIVA
 */
public class tableJenis extends javax.swing.JFrame {

    private static void setModel(DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form tableJenis
     */
    public tableJenis() {
        initComponents();
        loadData();
        kosong();
        SetEnabled();
        btnsave.setEnabled(false);
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
        btncancel.setEnabled(false);
    }

        private void loadData() {
        
        DefaultTableModel model = new DefaultTableModel();
               
        model.getDataVector().removeAllElements();
        
        model.fireTableDataChanged();
        
        tableJenis.setModel(model);
        model.addColumn("Kode Jenis Barang");
        model.addColumn("Nama Jenis Barang");
        
        try{
            String sql = "SELECT * FROM tblJenis";
            
            Connection c = Koneksi. getKoneksi();
//             Statement s = c.createStatement();
              ResultSet r = s.executeQuery(sql);
              
              while(r.next()){
                model.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2)
                });
              }
              
                tableJenis.setModel(model);
        }catch(SQLException e){
            System.out.println("Terjadi Error"); 
            }  
        }
        
           private void kosong(){
        txtkode.setText(null);
        txtjenisbarang.setText(null);
    }
            public void SetEnabledFalse(){
        txtkode.setEnabled(false);
        txtjenisbarang.setEnabled(false);
        
    }
            
        public void SetEnabledTrue(){
        txtkode.setEnabled(true);
        txtjenisbarang.setEnabled(true);
        
    }    
                
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtjenisbarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbljenis = new javax.swing.JTable();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entri Data Jenis Barang");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Kode Jenis");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        getContentPane().add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 110, -1));

        txtjenisbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjenisbarangActionPerformed(evt);
            }
        });
        getContentPane().add(txtjenisbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 350, -1));

        tbljenis.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbljenis);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 440, 240));

        btnnew.setText("Add New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        getContentPane().add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 90, -1));

        btnsave.setText("Save");
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        btnupdate.setText("Update");
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        btndelete.setText("Delete");
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        btncancel.setText("Cancel");
        getContentPane().add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        btnclose.setText("Close");
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    
    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_btnnewActionPerformed

    private void txtjenisbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjenisbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjenisbarangActionPerformed

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
            java.util.logging.Logger.getLogger(tableJenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tableJenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tableJenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tableJenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tableJenis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbljenis;
    private javax.swing.JTextField txtjenisbarang;
    private javax.swing.JTextField txtkode;
    // End of variables declaration//GEN-END:variables

    private void SetEnabled() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
