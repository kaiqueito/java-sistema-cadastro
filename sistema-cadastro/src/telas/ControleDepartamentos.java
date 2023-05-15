package telas;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 

public class ControleDepartamentos extends javax.swing.JFrame {

    public ControleDepartamentos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Controle de Departamentos");
        getContentPane().setLayout(null);

        lblCodigo.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código:");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(30, 40, 110, 30);

        txtNome.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(110, 80, 300, 30);

        lblNome.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 80, 120, 30);

        lblCidade.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setText("Cidade:");
        getContentPane().add(lblCidade);
        lblCidade.setBounds(30, 120, 110, 30);

        txtTelefone.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(110, 160, 300, 30);

        lblTelefone.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone:");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(30, 160, 120, 30);

        txtCodigo.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(110, 40, 200, 30);

        txtCidade.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(0, 0, 0));
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtCidade);
        txtCidade.setBounds(110, 120, 300, 30);

        btnSalvar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(51, 51, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(30, 210, 90, 40);

        btnConsultar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(51, 51, 51));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(320, 40, 90, 30);

        btnLimpar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(51, 51, 51));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(330, 210, 80, 20);

        btnExcluir.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(51, 51, 51));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(130, 210, 90, 40);

        btnAlterar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(51, 51, 51));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(230, 210, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 370);

        setSize(new java.awt.Dimension(602, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public ControleDepartamentos(String op) {
        initComponents();
        if (op.equalsIgnoreCase("cadastrar")) {
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnConsultar.setVisible(false);
        } else if (op.equalsIgnoreCase("consultar")) {
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnSalvar.setVisible(false);
        } else if (op.equalsIgnoreCase("excluir")) {
            btnConsultar.setVisible(false);
            btnAlterar.setVisible(false);
            btnSalvar.setVisible(false);
        } else if (op.equalsIgnoreCase("alterar")) {
            btnConsultar.setVisible(false);
            btnExcluir.setVisible(false);
            btnSalvar.setVisible(false);
        }
    }
        
  
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            // Indica o caminho da classe Driver na biblioteca do projeto
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Faz a conexão com o banco de dados
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            // Define o comando SQL que será executado na tabela do banco de dados
            PreparedStatement stSalvar = conectado.prepareStatement("INSERT INTO departamentos VALUES(?,?,?,?)");
            // Completa o comando insert com os dados que desejamos inserir no banco de dados
            stSalvar.setString(1, txtCodigo.getText());
            stSalvar.setString(2, txtNome.getText());
            stSalvar.setString(3, txtCidade.getText());
            stSalvar.setString(4, txtTelefone.getText());
            // Executa o comando insert
            stSalvar.executeUpdate();
            // Mensagem de sucesso após a execução
            JOptionPane.showMessageDialog(null, "Departamento cadastrado com sucesso!");
            
            txtCodigo.setText("");
            txtNome.setText("");
            txtCidade.setText("");
            txtTelefone.setText("");
            
            txtCodigo.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            //Se você errou alguma informação do banco de dados mostra a mensagem abaixo
            if (ex.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Este departamento de código " + txtCodigo.getText() + " já está cadastrado.");
                txtCodigo.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }     
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            //Faz a conexão com o banco de dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            //Define o comando SELECT incompleto (?) a ser executado na busca do departamento
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos WHERE codigo = ?");
            //Indica qual valor será colocado no ? do comando SELECT
            stConsultar.setString(1, txtCodigo.getText());
            //Executa o comando SELECT criado e armazena o departamento trazido da tabela na variável resultado
            ResultSet resultado = stConsultar.executeQuery();
            if (resultado.next()) { //Se encontrou os dados do departamento
                //Carregar os dados do departamento nos campos do formulário
                txtNome.setText(resultado.getString("nome"));
                txtCidade.setText(resultado.getString("cidade"));
                txtTelefone.setText(resultado.getString("telefone"));
                btnExcluir.setVisible(true);
                btnAlterar.setVisible(true);
                btnLimpar.setVisible(true);
            } else { //Se não encontrou o dados do departamento
                //Mostra uma mensagem indicando que o departamento não foi encontrado
                JOptionPane.showMessageDialog(null, "Departamento não encontrado!");
                //Posiciona o cursor no campo txtCodigo
                txtCodigo.requestFocus();
            }
        } catch (ClassNotFoundException ex) {
            //Se der erro na linha do comando Class.Forname, exibe esta mensagem
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            //Se você digitou alguma coisa do banco de dados incorretamente (nome do banco, nome da tabela, senha)
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCodigo.setText("");
        txtNome.setText("");
        txtCidade.setText("");
        txtTelefone.setText("");
        txtCodigo.requestFocus();
        btnExcluir.setVisible(false);
        btnAlterar.setVisible(false);     
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O código é obrigatório");
            txtCodigo.requestFocus();
            return; // para a execução do programa
        }
        try {
            //Indica o nome da classe do driver JDBC colocada na Library do projto
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Faz a conexão com o banco de dados  guarda na variável conectado
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            //Prepara um comando SQL DELETE incompleto
            PreparedStatement stExcluir = conectado.prepareStatement("DELETE FROM departamentos WHERE codigo = ?");
            //Completa o comando SQL DELETE preparado na linha anterior
            stExcluir.setString(1, txtCodigo.getText());
             //Executa o comando DELETE e insere os dados digitados na tabela departamento do banco de dados
            stExcluir.executeUpdate();
            //Mostra a mensagem de confirmação da exclusao do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Departamento excluído com sucesso!");
            //Limpar os campos na tela
            txtCodigo.setText("");
            txtNome.setText("");
            txtCidade.setText("");
            txtTelefone.setText("");
            //Colocar o cursor no campo código
            txtCodigo.requestFocus();
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O código é obrigatório");
            txtCodigo.requestFocus();
            return; // para a execução do programa
        }
        try {
            //Indica o nome da classe do driver JDBC colocada na Library do projto
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Faz a conexão com o banco de dados  guarda na variável conectado
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            //Prepara um comando SQL UPDATE incompleto
            PreparedStatement stAlterar = conectado.prepareStatement("UPDATE departamentos SET nome = ? , cidade = ? , telefone = ? WHERE codigo = ?");
            //Completa o comando SQL UPDATE preparado na linha anterior
            stAlterar.setString(1, txtNome.getText());
            stAlterar.setString(2, txtCidade.getText());
            stAlterar.setString(3, txtTelefone.getText());
            stAlterar.setString(4, txtCodigo.getText());
            //Executa o comando UPDATE e insere os dados digitados na tabela departamento do banco de dados
            stAlterar.executeUpdate();
            //Mostra a mensagem de confirmação da alteração do registro na tabela do banco de dados
            JOptionPane.showMessageDialog(null, "Departamento alterado com sucesso!");
            btnExcluir.setVisible(false);
            btnAlterar.setVisible(false);
            btnLimpar.setVisible(false);
            //Limpar os campos na tela
            txtCodigo.setText("");
            txtNome.setText("");
            txtCidade.setText("");
            txtTelefone.setText("");
            //Colocar o cursor no campo código
            txtCodigo.requestFocus();
        } catch (ClassNotFoundException ex) {
            //Se a classe do driver JDBC não estiver na Library do projeto, mostra a mensagem de erro abaixo
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(ControleDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleDepartamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
