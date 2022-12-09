package vaksin;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class admin extends javax.swing.JFrame {

    public admin() {
        initComponents();  
    }
    
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tombologout = new javax.swing.JButton();
        kelola = new javax.swing.JButton();

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Tambah data film");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 204));
        setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/4.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 400);

        tombologout.setBackground(new java.awt.Color(153, 255, 204));
        tombologout.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        tombologout.setForeground(new java.awt.Color(0, 204, 102));
        tombologout.setText("logout");
        tombologout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombologoutActionPerformed(evt);
            }
        });
        getContentPane().add(tombologout);
        tombologout.setBounds(460, 360, 40, 20);

        kelola.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        kelola.setForeground(new java.awt.Color(204, 0, 204));
        kelola.setText("Kelola Data");
        kelola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelolaActionPerformed(evt);
            }
        });
        getContentPane().add(kelola);
        kelola.setBounds(180, 170, 140, 80);

        setSize(new java.awt.Dimension(514, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kelolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelolaActionPerformed
        dispose();
        crud kelola = new crud ();
        kelola.setVisible(true);
    }//GEN-LAST:event_kelolaActionPerformed

    private void tombologoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombologoutActionPerformed
        JFrame MyPopUp = new JFrame();
        int ok = JOptionPane.showConfirmDialog(null,"Logout Mode Admin?","Konfirmasi",JOptionPane.YES_NO_OPTION);
          
        switch(ok){
            case JOptionPane.YES_OPTION:
             JOptionPane.showMessageDialog(MyPopUp,"Akun Berhasil Logout!");
             dispose();
            login login = new login();
            login.setVisible(true);
            break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(MyPopUp,"Anda Kembali Ke Mode Admin!");
        }
    }//GEN-LAST:event_tombologoutActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JButton kelola;
    private javax.swing.JButton tombologout;
    // End of variables declaration//GEN-END:variables
}
