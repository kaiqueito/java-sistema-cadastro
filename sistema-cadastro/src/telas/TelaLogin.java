package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        ckbVisualizarSenha = new javax.swing.JCheckBox();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Login");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(null);

        txtUsuario.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(110, 40, 300, 30);

        txtSenha.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtSenha);
        txtSenha.setBounds(110, 80, 300, 30);

        btnCadastrar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(51, 51, 51));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(130, 150, 90, 40);

        lblSenha.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(30, 80, 120, 30);

        lblUsuario.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(30, 40, 110, 30);

        ckbVisualizarSenha.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        ckbVisualizarSenha.setForeground(new java.awt.Color(255, 255, 255));
        ckbVisualizarSenha.setText("Visualizar senha");
        ckbVisualizarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbVisualizarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(ckbVisualizarSenha);
        ckbVisualizarSenha.setBounds(100, 120, 240, 20);

        btnEntrar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(51, 51, 51));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(30, 150, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 370);

        setSize(new java.awt.Dimension(602, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void ckbVisualizarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbVisualizarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbVisualizarSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        dispose();
        new CadastroUsuarios().setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            PreparedStatement st = conectado.prepareStatement ("SELECT * FROM usuarios WHERE usuario = ? AND senha = ?");
            st.setString(1, txtUsuario.getText());
            st.setString(2, txtSenha.getText());
            ResultSet resultado = st.executeQuery();
            if(resultado.next()) { //Se encontrou os dados do usuário
                String usuario, cargo;
                usuario = resultado.getString("usuario");
                cargo = resultado.getString("cargo");
                dispose();
                new TelaMenu(usuario, cargo).setVisible(true);
            } else { //Se não encontrou os dados do usuário
                JOptionPane.showMessageDialog(null, "Usuário e/ou Senha inválido.");
                txtUsuario.requestFocus();
            }
                       
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JCheckBox ckbVisualizarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
