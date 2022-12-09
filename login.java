package vaksin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class login extends javax.swing.JFrame {
    public Connection c;
    public Statement s;
    public ResultSet r;
    
    public login() {    
        nyambung();
        initComponents();   
    }
    private void nyambung(){
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    c=DriverManager.getConnection("jdbc:mysql://localhost/vaksin", "root", "");
    s=c.createStatement();
    } catch(ClassNotFoundException | SQLException e){
                System.out.println("Error loading driver : "+e.getMessage());
}
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pw = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        tombolkembali = new javax.swing.JButton();
        LOGIN = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(96, 65, 43));
        jButton1.setFont(new java.awt.Font("Calisto MT", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 140, 100, 0);

        username.setCaretColor(new java.awt.Color(102, 102, 102));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(190, 130, 220, 40);

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 220, 79, 20);

        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        getContentPane().add(pw);
        pw.setBounds(190, 200, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/3.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 400);

        tombolkembali.setBackground(new java.awt.Color(153, 255, 204));
        tombolkembali.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        tombolkembali.setForeground(new java.awt.Color(0, 204, 102));
        tombolkembali.setText("KEMBALI");
        tombolkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(tombolkembali);
        tombolkembali.setBounds(460, 360, 40, 20);

        LOGIN.setBackground(new java.awt.Color(153, 255, 204));
        LOGIN.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(0, 204, 102));
        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        getContentPane().add(LOGIN);
        LOGIN.setBounds(330, 270, 80, 20);

        setSize(new java.awt.Dimension(514, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
      
    }//GEN-LAST:event_usernameActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
      
    }//GEN-LAST:event_pwActionPerformed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed

       try {
            r=s.executeQuery("SELECT * FROM admin WHERE username='"+username.getText()+"' AND password='"+pw.getText()+"'");
            
            if(r.next()){
                if(username.getText().equals(r.getString("username")) && pw.getText().equals(r.getString("password"))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    crud kelola = new crud();
                    kelola.setVisible(true);
                    dispose();
                }
            }else{
                    JOptionPane.showMessageDialog(null, "username atau password salah");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_LOGINActionPerformed

    private void tombolkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolkembaliActionPerformed
        dispose();
        //objek
        home home = new home();
        home.setVisible(true);
    }//GEN-LAST:event_tombolkembaliActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pw;
    private javax.swing.JButton tombolkembali;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}