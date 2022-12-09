package vaksin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mulai extends javax.swing.JFrame {
    private Connection con;
    private Statement stat;
    private ResultSet res;
    
public mulai() {
        initComponents();
        koneksi();
        tabel();
    }
 private void koneksi(){
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/vaksin", "root", "");
    stat=con.createStatement();
    } catch(ClassNotFoundException | SQLException e){
                System.out.println("Error loading driver : "+e.getMessage());
}   
}
 private void tabel(){
    DefaultTableModel tb= new DefaultTableModel();
    tb.addColumn("No");
    tb.addColumn("Jenis");
    tb.addColumn("Jadwal");
    tb.addColumn("Dosis");
    tb.addColumn("Lokasi");
    tb.addColumn("Kapasitas");
    
    int No = 1;
    
    tabel_lihat.setModel(tb);
    try{
    res=stat.executeQuery("SELECT * FROM `vaksin`");

    while (res.next())
    {
    tb.addRow(new Object[]{
        No ++,
    res.getString("Jenis"),
    res.getString("Jadwal"),
    res.getString("Dosis"),
    res.getString("Lokasi"),
    res.getString("Kapasitas"),
    });
    }
    
    }catch (Exception e){
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_lihat = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        tombolhome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabel_lihat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel_lihat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 110, 600, 240);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/2.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 900, 450);

        tombolhome.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        tombolhome.setForeground(new java.awt.Color(255, 255, 51));
        tombolhome.setToolTipText("");
        tombolhome.setMaximumSize(new java.awt.Dimension(50, 50));
        tombolhome.setMinimumSize(new java.awt.Dimension(50, 50));
        tombolhome.setPreferredSize(new java.awt.Dimension(50, 50));
        tombolhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolhomeActionPerformed(evt);
            }
        });
        getContentPane().add(tombolhome);
        tombolhome.setBounds(860, 410, 40, 40);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(128, 318, 0, 0);

        setSize(new java.awt.Dimension(914, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tombolhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolhomeActionPerformed
        dispose();
        home home = new home ();
        home.setVisible(true);
        
    }//GEN-LAST:event_tombolhomeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mulai().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_lihat;
    private javax.swing.JButton tombolhome;
    // End of variables declaration//GEN-END:variables
}
