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
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import aplikasi.penjualan.netbeans.k07.Koneksi.koneksi;

/**
 *
 * @author labprogram123
 */
public class tablepetugas extends javax.swing.JFrame {

    private static void setModel(DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private DefaultTableModel model;
    /**
     * Creates new form tablepetugas
     */
    public tablepetugas() {
        initComponents();
        loadData();
        kosong();
        setEnabledFalse();
    }
    
     private void loadData() {
        model = new DefaultTableModel();
               
        model.getDataVector().removeAllElements();
        
        model.fireTableDataChanged();
        
        tablepetugas.setModel(model);
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Telepon");
        model.addColumn("Alamat");
        
         try{
            
            String sql = "SELECT * FROM tblpetugas";
            
            Connection c = Koneksi. getKoneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                
                model.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5)
                });
            }
            tablepetugas.setModel(model);
        }catch(SQLException e){
            System.out.println("Terjadi Error"); 
        }
    }
     
     private void kosong(){
        txtpetugas.setText(null);
        txtnama.setText(null);
        txtemail.setText(null);
        txttelpon.setText(null);
        txtalamat.setText(null);
    }

     public void setEnabledFalse(){
        txtpetugas.setEnabled(false);
        txtnama.setEnabled(false);
        txtalamat.setEnabled(false);
        txtemail.setEnabled(false);
        txttelpon.setEnabled(false);
        btnsv.setEnabled(false);
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
    }
     
      public void setEnabledTrue(){
        txtpetugas.setEnabled(true);
        txtnama.setEnabled(true);
        txtalamat.setEnabled(true);
        txtemail.setEnabled(true);
        txttelpon.setEnabled(true);
        btnsv.setEnabled(true);
        btnupdate.setEnabled(true);
        btndelete.setEnabled(true);
    }     
      
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpetugas = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttelpon = new javax.swing.JTextField();
        btnsv = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablepetugas = new javax.swing.JTable();
        btnnew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entri Data Petugas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Entri Data Petugas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 60));

        jLabel2.setText("ID Petugas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel3.setText("Nama Petugas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        getContentPane().add(txtpetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 140, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 320, -1));

        jLabel5.setText("Alamat Petugas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 320, 110));

        jLabel6.setText("E-mail");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 320, -1));

        jLabel7.setText("Telpon");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));
        getContentPane().add(txttelpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 160, -1));

        btnsv.setText("Save");
        btnsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsvActionPerformed(evt);
            }
        });
        getContentPane().add(btnsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 60, -1));

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, -1, -1));

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, -1, -1));

        tablepetugas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablepetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepetugasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablepetugas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 470, 150));

        btnnew.setText("Add New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        getContentPane().add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsvActionPerformed
        String id = txtpetugas.getText();
        String nama = txtnama.getText();
        String alamat = txtalamat.getText();
        String email = txtemail.getText();
        String telpon = txttelpon.getText();
        
        if ("".equals(id) || "".equals(nama) || "".equals(alamat)|| "".equals(email) || "".equals(telpon))
        {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "error", JOptionPane.WARNING_MESSAGE);
        } else {
            
            try{
                Connection c = Koneksi. getKoneksi();
                String sql = "insert into tblpetugas value ( ?, ?, ?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                
                p.setString(1, id);
                p.setString(2, nama);
                p.setString(3, email);
                p.setString(4, telpon);
                p.setString(5, alamat);
                
                p.executeUpdate();
                p.close();
                
                JOptionPane.showMessageDialog(null, "penyimpanan data berhasil");
              
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }finally{
                loadData();
                kosong();            }
        }
        
                setEnabledFalse();
                btnnew.setEnabled(true);
    }//GEN-LAST:event_btnsvActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        setEnabledFalse();
        btnnew.setEnabled(true);
        kosong();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
         int i = tablepetugas.getSelectedRow();
        
        if(i == -1){
            //tidak ada baris tewrseleksi
            JOptionPane.showMessageDialog(this, "harap pilih data terlebih dahulu", "error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String id = (String) model.getValueAt(i, 0);
        String nama = txtnama.getText();
        String alamat = txtalamat.getText();
        String email = txtemail.getText();
        String telpon = txttelpon.getText();

        try{
            
            Connection c = Koneksi.getKoneksi();

            String sql = "UPDATE tblpetugas SET NamaPetugas = ?, Alamat = ?, Email = ?, Telpon = ? WHERE IDPetugas = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1, nama);
            p.setString(2, email);
            p.setString(3, telpon);
            p.setString(4, alamat);
            p.setString(5, id);
            
            p.executeUpdate();
            p.close();
            
            JOptionPane.showMessageDialog(null,"Ubah Data Berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Terjadi ERROR" + e.getMessage());
        }finally{
            loadData();
            kosong();
        }
        
        setEnabledFalse();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int i = tablepetugas.getSelectedRow();
        
        if(i == -1){
            //tidak ada baris terseleksi
            JOptionPane.showMessageDialog(this, "harap pilih data terlebih dahulu", "error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       
         String Idpetugas = (String) model.getValueAt(i, 0);
        
        try{
            Connection c = Koneksi. getKoneksi();
            
            String sql = "DELETE FROM tblpetugas WHERE Idpetugas = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, Idpetugas);
            p.executeUpdate();
            p.close();
            
            JOptionPane.showMessageDialog(null,
                       "Hapus Data Berhasil");
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this,
                        e.getMessage());
                
            }finally{
            loadData();
            kosong();
        
        }
        
            setEnabledFalse();
            btnnew.setEnabled(true);
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void tablepetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepetugasMouseClicked
        // TODO add your handling code here:
         int baris = tablepetugas.getSelectedRow();
        
        if(baris == 1){
            //tak ada baris terseleksi
            return;
        }
        
        String id = tablepetugas.getValueAt(baris,0).toString();
        txtpetugas.setText(id);
        String nama = tablepetugas.getValueAt(baris,1).toString();
        txtnama.setText(nama);
        String alamat = tablepetugas.getValueAt(baris,2).toString();
        txtalamat.setText(alamat);
        String email = tablepetugas.getValueAt(baris, 3).toString();
        txtemail.setText(email);
        String telpon = tablepetugas.getValueAt(baris, 4).toString();
        txttelpon.setText(telpon);
        
        setEnabledFalse();
        txtpetugas.setEnabled(true);
        txtnama.setEnabled(true);
        txtalamat.setEnabled(true);
        txtemail.setEnabled(true);
        txttelpon.setEnabled(true);
        btndelete.setEnabled(true);
        btnupdate.setEnabled(true);
        btnnew.setEnabled(false);
    }//GEN-LAST:event_tablepetugasMouseClicked

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
        setEnabledTrue();
        btnnew.setEnabled(false);
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);  
    }//GEN-LAST:event_btnnewActionPerformed

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
            java.util.logging.Logger.getLogger(tablepetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablepetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablepetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablepetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablepetugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsv;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablepetugas;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpetugas;
    private javax.swing.JTextField txttelpon;
    // End of variables declaration//GEN-END:variables
}
