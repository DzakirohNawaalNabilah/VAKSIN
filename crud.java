package vaksin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class crud extends javax.swing.JFrame {
 
    Connection con = null;
    final String dburl = "jdbc:mysql://localhost:3306/vaksin";
    final String username = "root";
    final String password = "";
    DefaultTableModel model;
    private Statement stat;
    private ResultSet res;

    public crud() {
        initComponents();
        String[] Jenis = {"Jenis","Jadwal","Dosis","Lokasi","Kapasitas"};
        model = new DefaultTableModel (Jenis, 0);
        tabel_lihat.setModel (model);
        tampil();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kolomjenis = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        kolomkapasitas = new javax.swing.JTextField();
        kolomjadwal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kembali = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_lihat = new javax.swing.JTable();
        kolomlokasi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kolomdosis = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pencettambah = new javax.swing.JButton();
        pencetupdate = new javax.swing.JButton();
        pencethapus = new javax.swing.JButton();
        pencetreset = new javax.swing.JButton();
        pencetbalik = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 100, 54, 0);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 150, 51, 0);

        kolomjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomjenisActionPerformed(evt);
            }
        });
        getContentPane().add(kolomjenis);
        kolomjenis.setBounds(640, 80, 140, 30);

        jLabel27.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel27);
        jLabel27.setBounds(158, 98, 0, 0);

        kolomkapasitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomkapasitasActionPerformed(evt);
            }
        });
        getContentPane().add(kolomkapasitas);
        kolomkapasitas.setBounds(640, 320, 140, 30);

        kolomjadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomjadwalActionPerformed(evt);
            }
        });
        getContentPane().add(kolomjadwal);
        kolomjadwal.setBounds(640, 140, 140, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 50, 44, 0);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(610, 50, 53, 0);

        kembali.setBackground(new java.awt.Color(51, 255, 204));
        kembali.setFont(new java.awt.Font("OCR A Extended", 0, 10)); // NOI18N
        kembali.setForeground(new java.awt.Color(0, 0, 153));
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        getContentPane().add(kembali);
        kembali.setBounds(918, 429, 0, 15);

        tabel_lihat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Jenis", "Jadwal", "Dosis", "Lokasi", "Kapasitas"
            }
        ));
        tabel_lihat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_lihatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_lihat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 100, 460, 190);

        kolomlokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomlokasiActionPerformed(evt);
            }
        });
        getContentPane().add(kolomlokasi);
        kolomlokasi.setBounds(640, 260, 140, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 100, 76, 0);

        kolomdosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomdosisActionPerformed(evt);
            }
        });
        getContentPane().add(kolomdosis);
        kolomdosis.setBounds(640, 200, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/5.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 450);

        pencettambah.setBackground(new java.awt.Color(153, 0, 0));
        pencettambah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pencettambah.setForeground(new java.awt.Color(255, 255, 255));
        pencettambah.setText("Tambah");
        pencettambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencettambahActionPerformed(evt);
            }
        });
        getContentPane().add(pencettambah);
        pencettambah.setBounds(170, 360, 100, 50);

        pencetupdate.setBackground(new java.awt.Color(153, 0, 0));
        pencetupdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pencetupdate.setForeground(new java.awt.Color(255, 255, 255));
        pencetupdate.setText("Update");
        pencetupdate.setMaximumSize(new java.awt.Dimension(81, 28));
        pencetupdate.setMinimumSize(new java.awt.Dimension(81, 28));
        pencetupdate.setPreferredSize(new java.awt.Dimension(81, 28));
        pencetupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetupdateActionPerformed(evt);
            }
        });
        getContentPane().add(pencetupdate);
        pencetupdate.setBounds(330, 360, 100, 50);

        pencethapus.setBackground(new java.awt.Color(153, 0, 0));
        pencethapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pencethapus.setForeground(new java.awt.Color(255, 255, 255));
        pencethapus.setText("Hapus");
        pencethapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencethapusActionPerformed(evt);
            }
        });
        getContentPane().add(pencethapus);
        pencethapus.setBounds(480, 360, 100, 50);

        pencetreset.setBackground(new java.awt.Color(153, 0, 0));
        pencetreset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pencetreset.setForeground(new java.awt.Color(255, 255, 255));
        pencetreset.setText("Reset");
        pencetreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetresetActionPerformed(evt);
            }
        });
        getContentPane().add(pencetreset);
        pencetreset.setBounds(630, 360, 100, 50);

        pencetbalik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetbalikActionPerformed(evt);
            }
        });
        getContentPane().add(pencetbalik);
        pencetbalik.setBounds(780, 390, 50, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(179, 124, 87));
        jLabel9.setText("Harga");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 150, 53, 21);

        setSize(new java.awt.Dimension(914, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kolomkapasitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomkapasitasActionPerformed
        
    }//GEN-LAST:event_kolomkapasitasActionPerformed

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        new admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliMouseClicked

    private void tabel_lihatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_lihatMouseClicked
        int i = tabel_lihat.getSelectedRow();
        if (i >-1){
            kolomjenis.setText(model.getValueAt(i, 0).toString());
            kolomjadwal.setText(model.getValueAt(i, 1).toString());
            kolomdosis.setText(model.getValueAt(i, 2).toString());
            kolomlokasi.setText(model.getValueAt(i, 3).toString());
            kolomkapasitas.setText(model.getValueAt(i, 4).toString());     
           
            
     kolomjenis.setEditable(false);
    }//GEN-LAST:event_tabel_lihatMouseClicked
    
       }     
    private void pencethapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencethapusActionPerformed
        hapus();
    }//GEN-LAST:event_pencethapusActionPerformed

    private void pencettambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencettambahActionPerformed
        tambah(); 
    }//GEN-LAST:event_pencettambahActionPerformed

    private void pencetupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetupdateActionPerformed
        update();
    }//GEN-LAST:event_pencetupdateActionPerformed

    private void kolomjadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomjadwalActionPerformed

    }//GEN-LAST:event_kolomjadwalActionPerformed

    private void kolomlokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomlokasiActionPerformed

    }//GEN-LAST:event_kolomlokasiActionPerformed

    private void kolomdosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomdosisActionPerformed

    }//GEN-LAST:event_kolomdosisActionPerformed

    private void pencetresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetresetActionPerformed
        kolomjenis.setText("");
        kolomjadwal.setText("");
        kolomdosis.setText("");
        kolomlokasi.setText("");
        kolomkapasitas.setText("");
        kolomjenis.setEditable(true);
    }//GEN-LAST:event_pencetresetActionPerformed

    private void pencetbalikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetbalikActionPerformed
       dispose();
            admin admin = new admin();
            admin.setVisible(true);
    }//GEN-LAST:event_pencetbalikActionPerformed

    private void kolomjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomjenisActionPerformed
  
    }//GEN-LAST:event_kolomjenisActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud().setVisible(true);
            }
        });
    }
    //CRUD 
    public void tambah() {
        try {
            con = DriverManager.getConnection(dburl, username, password);
                if (kolomjenis.getText().equals("")||
                        kolomkapasitas.getText().equals("")||
                        kolomjadwal.getText().equals("")||
                        kolomdosis.getText().equals("")||
                        kolomlokasi.getText().equals("")){
                  JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                return;
                }  
                ResultSet rs = con.createStatement().executeQuery("SELECT * FROM `vaksin` WHERE Jenis = '" + kolomjenis.getText() + "'");
                if (rs.next()){
                JOptionPane.showMessageDialog(null, "Jenis sudah tersedia!");  
                } else {
                con.createStatement().executeUpdate("INSERT INTO `vaksin` VALUES"+"('"+kolomjenis.getText()+"','"+kolomjadwal.getText()+"','"+kolomdosis.getText()+"','"+kolomlokasi.getText()+"','"+kolomkapasitas.getText()+"')"); 
                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan!");
                tampil();} 
                     {
        }
                }catch (SQLException se) {
            System.out.println(se);
            } 
    }
   
    public void hapus() {
         try {
             con = DriverManager.getConnection(dburl, username, password);
                if (kolomjenis.getText().equals("")||
                        kolomkapasitas.getText().equals("")||
                        kolomjadwal.getText().equals("")||
                        kolomdosis.getText().equals("")||
                        kolomlokasi.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus!");
                return;
                }
             else {
            con.createStatement().executeUpdate("DELETE FROM `vaksin` WHERE Jenis = '"+kolomjenis.getText()+"'");
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus!");
            tampil();}
        }       catch(SQLException se){
                System.out.println(se);
        }
    }
    
    public void update() {
        try {
            con = DriverManager.getConnection(dburl, username, password);
                if (kolomjenis.getText().equals("")||
                        kolomkapasitas.getText().equals("")||
                        kolomjadwal.getText().equals("")||
                        kolomdosis.getText().equals("")||
                        kolomlokasi.getText().equals("")){
                  JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                return;
                }
                else{
            con.createStatement().executeUpdate("UPDATE `vaksin` SET `Jenis`='"+kolomjenis.getText()+"',`Jadwal`='"+kolomjadwal.getText()+"',`Dosis`='"+kolomdosis.getText()+"',`Lokasi`='"+kolomlokasi.getText()+"',`Kapasitas`='"+kolomkapasitas.getText()+"' WHERE Jenis = '" + kolomjenis.getText()+"'");
            JOptionPane.showMessageDialog(null,"Data berhasil Diupdate!");
            tampil();}
        }       catch(SQLException se){           
                System.out.println(se);
        }
    }
    
     private void tampil() {
       int row = tabel_lihat.getRowCount();
       for (int i = 0;i<row;i++){
           model.removeRow(0);
       }   
      try {
         con = DriverManager.getConnection(dburl, username, password);
         ResultSet rs = con.createStatement().executeQuery("SELECT * FROM `vaksin`");
         while(rs.next()){
             String[] data = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
             model.addRow(data);
         }
         if (con != null) {
         }
      } catch (SQLException se) {
          System.out.println(se);
      }
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kembali;
    private javax.swing.JTextField kolomdosis;
    private javax.swing.JTextField kolomjadwal;
    private javax.swing.JTextField kolomjenis;
    private javax.swing.JTextField kolomkapasitas;
    private javax.swing.JTextField kolomlokasi;
    private javax.swing.JButton pencetbalik;
    private javax.swing.JButton pencethapus;
    private javax.swing.JButton pencetreset;
    private javax.swing.JButton pencettambah;
    private javax.swing.JButton pencetupdate;
    private javax.swing.JTable tabel_lihat;
    // End of variables declaration//GEN-END:variables
}