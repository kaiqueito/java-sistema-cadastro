package telas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class CadastroUsuarios extends javax.swing.JFrame {


    public CadastroUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuarioCadastro = new javax.swing.JLabel();
        lblSenhaCadastro = new javax.swing.JLabel();
        btnSalvarCadastro = new javax.swing.JButton();
        txtUsuarioCadastro = new javax.swing.JTextField();
        txtSenhaCadastro = new javax.swing.JPasswordField();
        lblCargoCadastro = new javax.swing.JLabel();
        txtCargoCadastro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        lblUsuarioCadastro.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblUsuarioCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarioCadastro.setText("Usuário:");
        getContentPane().add(lblUsuarioCadastro);
        lblUsuarioCadastro.setBounds(30, 40, 110, 30);

        lblSenhaCadastro.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblSenhaCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhaCadastro.setText("Senha:");
        getContentPane().add(lblSenhaCadastro);
        lblSenhaCadastro.setBounds(30, 80, 120, 30);

        btnSalvarCadastro.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnSalvarCadastro.setForeground(new java.awt.Color(51, 51, 51));
        btnSalvarCadastro.setText("Salvar");
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarCadastro);
        btnSalvarCadastro.setBounds(30, 210, 90, 40);

        txtUsuarioCadastro.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtUsuarioCadastro.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuarioCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuarioCadastro);
        txtUsuarioCadastro.setBounds(110, 40, 300, 30);
        getContentPane().add(txtSenhaCadastro);
        txtSenhaCadastro.setBounds(110, 82, 300, 30);

        lblCargoCadastro.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblCargoCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblCargoCadastro.setText("Cargo:");
        getContentPane().add(lblCargoCadastro);
        lblCargoCadastro.setBounds(30, 130, 110, 30);

        txtCargoCadastro.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtCargoCadastro.setForeground(new java.awt.Color(0, 0, 0));
        txtCargoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(txtCargoCadastro);
        txtCargoCadastro.setBounds(110, 130, 300, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 370);

        setSize(new java.awt.Dimension(602, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        try {
            // Indica o caminho da classe Driver na biblioteca do projeto
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Faz a conexão com o banco de dados
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            // Define o comando SQL que será executado na tabela do banco de dados
            PreparedStatement st = conectado.prepareStatement("insert into usuarios values(?,?,?)");
            // Completa o comando insert com os dados que desejamos inserir no banco de dados
            st.setString(1, txtUsuarioCadastro.getText());
            st.setString(2, txtSenhaCadastro.getText());
            st.setString(3, txtCargoCadastro.getText());
            // Executa o comando insert
            st.executeUpdate();
            // Mensagem de sucesso após a execução
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

            txtUsuarioCadastro.setText("");
            txtSenhaCadastro.setText("");
            txtCargoCadastro.setText("");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void txtUsuarioCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioCadastroActionPerformed

    private void txtCargoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoCadastroActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCargoCadastro;
    private javax.swing.JLabel lblSenhaCadastro;
    private javax.swing.JLabel lblUsuarioCadastro;
    private javax.swing.JTextField txtCargoCadastro;
    private javax.swing.JPasswordField txtSenhaCadastro;
    private javax.swing.JTextField txtUsuarioCadastro;
    // End of variables declaration//GEN-END:variables
}
