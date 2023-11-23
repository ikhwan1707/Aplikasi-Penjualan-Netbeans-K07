/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi.penjualan.netbeans.k07;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//import koneksi.koneksi;
/**
 *
 * @author NAUFAL YUSTIN AGIVA
 */
public class tableJenis extends javax.swing.JFrame {
    private DefaultTableModel model;
    /**
     * Creates new form tableJenis
     */
    public tableJenis() {
        initComponents();
        loadData();
        kosong();
        setEnabledFalse();
    }
    
    public void setEnabledFalse(){
        txtkode.setEnabled(false);
        txtjenisbarang.setEnabled(false);
        btnsave.setEnabled(false);
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
        btncancel.setEnabled(false);
    }
    
    public void setEnabledTrue(){  
        txtkode.setEnabled(true);
        txtjenisbarang.setEnabled(true);
        btnsave.setEnabled(true);
        btnupdate.setEnabled(true);
        btndelete.setEnabled(true);
        btncancel.setEnabled(true);
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
        tbljenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbljenisMouseClicked(evt);
            }
        });
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
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 70, -1));

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 70, -1));

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 70, -1));

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 70, -1));

        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:   
        setEnabledTrue();
        btnnew.setEnabled(false);
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);     
    }//GEN-LAST:event_btnnewActionPerformed

    private void txtjenisbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjenisbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjenisbarangActionPerformed

    private void tbljenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbljenisMouseClicked
        // TODO add your handling code here:
        int baris = tbljenis.getSelectedRow();
        
        if(baris == 1){
            //tak ada baris terseleksi
            return;
        }
        
        String kodebrg = tbljenis.getValueAt(baris,0).toString();
        txtkode.setText(kodebrg);
        String jenisbarang = tbljenis.getValueAt(baris,1).toString();
        txtjenisbarang.setText(jenisbarang);
        
        setEnabledFalse();
        txtkode.setEnabled(true);
        txtjenisbarang.setEnabled(true);
        btndelete.setEnabled(true);
        btnupdate.setEnabled(true);
        btncancel.setEnabled(true);
    }//GEN-LAST:event_tbljenisMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int i = tbljenis.getSelectedRow();
        
        if(i == -1){
            JOptionPane.showMessageDialog(this, "Harap Pilih Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String jenisbarang = txtjenisbarang.getText();
        String kodebrg = (String) model.getValueAt(i, 0);
        
        try{
            Connection c = Koneksi.getKoneksi();
            
            String sql = "UPDATE tbljenis SET Jenis = ? WHERE KodeJenis = ? ";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1, jenisbarang);
            p.setString(2, kodebrg);
                    
            p.executeUpdate();
            p.close();
            
            JOptionPane.showMessageDialog(null, "Ubah Data Berhasil");
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error" + e.getMessage());
        } finally{
            loadData();
            kosong();
            setEnabledFalse();
           
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String kodebrg = txtkode.getText();
        String jenisbarang = txtjenisbarang.getText();
        
        if ("".equals(kodebrg) || "".equals(jenisbarang))
        {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                Connection c = Koneksi.getKoneksi();
                String sql = "INSERT INTO tbljenis VALUES (?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                
                p.setString(1, kodebrg);
                p.setString(2, jenisbarang);
                
                p.executeUpdate();
                p.close();
                
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }finally{
                loadData();
                kosong();
                setEnabledFalse();
                btnnew.setEnabled(true);
            }
        }    
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int i = tbljenis.getSelectedRow();
        
        if(i == -1){
            JOptionPane.showMessageDialog(this, "Harap Pilih Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String kodebrg = (String) model.getValueAt(i, 0);
        
        try{
            Connection c = Koneksi.getKoneksi();
            
            String sql = "DELETE FROM tbljenis WHERE KodeJenis = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, kodebrg);
            p.executeUpdate();
            p.close();
            
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error"+e.getMessage());
        }finally{
            loadData();
            kosong();
            setEnabledFalse();
            btnnew.setEnabled(true);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        setEnabledFalse();
        btnnew.setEnabled(true);
        kosong();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

    private void loadData(){
        model = new DefaultTableModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        tbljenis.setModel(model);
        model.addColumn("Kode Jenis");
        model.addColumn("Jenis Barang");
        
        try{
            
            String sql = "SELECT * FROM tbljenis";
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                model.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2)
                });
            }
        }catch (SQLException e) {
            System.out.append("Terjadi Error");
        }
    }
    
    private void kosong(){
        txtkode.setText(null);
        txtjenisbarang.setText(null);
    }
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

}
