package telas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class CadastroFuncionarios extends javax.swing.JFrame {


    public CadastroFuncionarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMatriculaFuncionario = new javax.swing.JLabel();
        lblNomeFuncionarios = new javax.swing.JLabel();
        btnSalvarFuncionario = new javax.swing.JButton();
        txtSalarioFuncionario = new javax.swing.JTextField();
        lblSalarioFuncionario = new javax.swing.JLabel();
        lblCargoFuncionario = new javax.swing.JLabel();
        txtMatriculaFuncionario = new javax.swing.JTextField();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtCargoFuncionario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        lblMatriculaFuncionario.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblMatriculaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblMatriculaFuncionario.setText("Matrícula:");
        getContentPane().add(lblMatriculaFuncionario);
        lblMatriculaFuncionario.setBounds(30, 40, 110, 30);

        lblNomeFuncionarios.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblNomeFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeFuncionarios.setText("Nome:");
        getContentPane().add(lblNomeFuncionarios);
        lblNomeFuncionarios.setBounds(30, 80, 120, 30);

        btnSalvarFuncionario.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnSalvarFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        btnSalvarFuncionario.setText("Salvar");
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarFuncionario);
        btnSalvarFuncionario.setBounds(30, 210, 90, 40);

        txtSalarioFuncionario.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtSalarioFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        txtSalarioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtSalarioFuncionario);
        txtSalarioFuncionario.setBounds(110, 160, 300, 30);

        lblSalarioFuncionario.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblSalarioFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblSalarioFuncionario.setText("Salário:");
        getContentPane().add(lblSalarioFuncionario);
        lblSalarioFuncionario.setBounds(30, 160, 120, 30);

        lblCargoFuncionario.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblCargoFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblCargoFuncionario.setText("Cargo:");
        getContentPane().add(lblCargoFuncionario);
        lblCargoFuncionario.setBounds(30, 120, 110, 30);

        txtMatriculaFuncionario.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtMatriculaFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        txtMatriculaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatriculaFuncionario);
        txtMatriculaFuncionario.setBounds(110, 40, 300, 30);

        txtNomeFuncionario.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtNomeFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeFuncionario);
        txtNomeFuncionario.setBounds(110, 80, 300, 30);

        txtCargoFuncionario.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtCargoFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        txtCargoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtCargoFuncionario);
        txtCargoFuncionario.setBounds(110, 120, 300, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 370);

        setSize(new java.awt.Dimension(602, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionarioActionPerformed
        try {
            // Indica o caminho da classe Driver na biblioteca do projeto
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Faz a conexão com o banco de dados
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            // Define o comando SQL que será executado na tabela do banco de dados
            PreparedStatement st = conectado.prepareStatement("insert into funcionarios values(?,?,?,?)");
            // Completa o comando insert com os dados que desejamos inserir no banco de dados
            st.setString(1, txtMatriculaFuncionario.getText());
            st.setString(2, txtNomeFuncionario.getText());
            st.setString(3, txtCargoFuncionario.getText());
            st.setDouble(4, Double.parseDouble(txtSalarioFuncionario.getText()));
            // Executa o comando insert
            st.executeUpdate();
            // Mensagem de sucesso após a execução
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");

            txtMatriculaFuncionario.setText("");
            txtNomeFuncionario.setText("");
            txtCargoFuncionario.setText("");
            txtSalarioFuncionario.setText("");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarFuncionarioActionPerformed

    private void txtSalarioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioFuncionarioActionPerformed

    private void txtNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFuncionarioActionPerformed

    private void txtCargoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoFuncionarioActionPerformed

    private void txtMatriculaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCargoFuncionario;
    private javax.swing.JLabel lblMatriculaFuncionario;
    private javax.swing.JLabel lblNomeFuncionarios;
    private javax.swing.JLabel lblSalarioFuncionario;
    private javax.swing.JTextField txtCargoFuncionario;
    private javax.swing.JTextField txtMatriculaFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtSalarioFuncionario;
    // End of variables declaration//GEN-END:variables
}
