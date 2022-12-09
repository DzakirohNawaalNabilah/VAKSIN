package vaksin;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        exitbutton = new javax.swing.JButton();
        pencetadmin = new javax.swing.JButton();
        pencetuser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 450);

        exitbutton.setBackground(new java.awt.Color(255, 204, 0));
        exitbutton.setFont(new java.awt.Font("Cooper Black", 0, 8)); // NOI18N
        exitbutton.setText("EXIT");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(exitbutton);
        exitbutton.setBounds(620, 340, 60, 17);

        pencetadmin.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        pencetadmin.setText("ADMIN");
        pencetadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetadminActionPerformed(evt);
            }
        });
        getContentPane().add(pencetadmin);
        pencetadmin.setBounds(700, 260, 90, 20);

        pencetuser.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        pencetuser.setText("USER");
        pencetuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetuserActionPerformed(evt);
            }
        });
        getContentPane().add(pencetuser);
        pencetuser.setBounds(520, 260, 100, 30);

        setSize(new java.awt.Dimension(914, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pencetuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetuserActionPerformed
      dispose();
       mulai mulai = new mulai ();
       mulai.setVisible(true);
    }//GEN-LAST:event_pencetuserActionPerformed

    private void pencetadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetadminActionPerformed
      dispose();
        login login = new login ();
        login.setVisible(true);
    }//GEN-LAST:event_pencetadminActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        JFrame MyPopUp = new JFrame();
        int ok = JOptionPane.showConfirmDialog(null,"Apakah anda yakin keluar?","Konfirmasi",JOptionPane.YES_NO_OPTION);
          
        switch(ok){
            case JOptionPane.YES_OPTION:
             JOptionPane.showMessageDialog(MyPopUp,"Anda berhasil keluar!");
             dispose();
             break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(MyPopUp,"Anda kembali ke program!");
        }
    }//GEN-LAST:event_exitbuttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton pencetadmin;
    private javax.swing.JButton pencetuser;
    // End of variables declaration//GEN-END:variables
}