package telas;

public class TelaMenu extends javax.swing.JFrame {

    
    public TelaMenu(String usuario, String cargo) {
        initComponents();
        lblSaudacao.setText("Bem-vindo " + usuario + " (" + cargo + ")");
        if(cargo.equalsIgnoreCase("Estagiário")) {
            mnuUsuarios.setVisible(false);
            itmCadastrarDepartamentos.setEnabled(false);
            itmAlterarDepartamentos.setEnabled(false);
            itmExcluirDepartamentos.setEnabled(false);
            itmConsultarDepartamentos.setEnabled(false);
            itmCadastrarFuncionarios.setEnabled(false);
            itmAlterarFuncionarios.setEnabled(false);
            itmExcluirFuncionarios.setEnabled(false);
            itmConsultarFuncionarios.setEnabled(false);
        } else if(cargo.equalsIgnoreCase("RH")) {                
            itmCadastrarDepartamentos.setEnabled(false);
            itmAlterarDepartamentos.setEnabled(false);
            itmExcluirDepartamentos.setEnabled(false);
            itmCadastrarFuncionarios.setEnabled(false);
            itmAlterarFuncionarios.setEnabled(false);
            itmExcluirFuncionarios.setEnabled(false);           
        }  else if(cargo.equalsIgnoreCase("Analista")) {                
            mnuUsuarios.setVisible(false);
            itmAlterarDepartamentos.setEnabled(false);
            itmExcluirDepartamentos.setEnabled(false);
            itmExcluirFuncionarios.setEnabled(false); 
            itmAlterarFuncionarios.setEnabled(false);            
        }
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDestaque = new javax.swing.JButton();
        lblSaudacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuDepartamentos = new javax.swing.JMenu();
        itmCadastrarDepartamentos = new javax.swing.JMenuItem();
        itmConsultarDepartamentos = new javax.swing.JMenuItem();
        itmAlterarDepartamentos = new javax.swing.JMenuItem();
        itmExcluirDepartamentos = new javax.swing.JMenuItem();
        itmRelatoriosDepartamentos = new javax.swing.JMenu();
        itmRelatorioGeralDepartamentos = new javax.swing.JMenuItem();
        itmRelatorioCidadeDepartamentos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmSairDepartamentos = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmConsultarFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        itmRelatoriosFuncionarios = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenu();
        itmCadastrarUsuario = new javax.swing.JMenuItem();
        mneAjuda = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnDestaque.setBackground(new java.awt.Color(0, 102, 102));
        btnDestaque.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btnDestaque.setForeground(new java.awt.Color(255, 255, 255));
        btnDestaque.setText("Destaque");
        btnDestaque.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        btnDestaque.setBorderPainted(false);
        btnDestaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestaqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnDestaque);
        btnDestaque.setBounds(240, 270, 130, 40);

        lblSaudacao.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(20, 20, 350, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 350);

        mnuDepartamentos.setText("Departamentos");

        itmCadastrarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarDepartamentos.setText("Cadastrar");
        itmCadastrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmCadastrarDepartamentos);

        itmConsultarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmConsultarDepartamentos.setText("Consultar");
        itmConsultarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmConsultarDepartamentos);

        itmAlterarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarDepartamentos.setText("Alterar");
        itmAlterarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmAlterarDepartamentos);

        itmExcluirDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirDepartamentos.setText("Excluir");
        itmExcluirDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmExcluirDepartamentos);

        itmRelatoriosDepartamentos.setText("Relatórios");

        itmRelatorioGeralDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatorioGeralDepartamentos.setText("Geral");
        itmRelatorioGeralDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioGeralDepartamentosActionPerformed(evt);
            }
        });
        itmRelatoriosDepartamentos.add(itmRelatorioGeralDepartamentos);

        itmRelatorioCidadeDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatorioCidadeDepartamentos.setText("Por Cidade");
        itmRelatoriosDepartamentos.add(itmRelatorioCidadeDepartamentos);

        mnuDepartamentos.add(itmRelatoriosDepartamentos);
        mnuDepartamentos.add(jSeparator1);

        itmSairDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSairDepartamentos.setText("Sair");
        itmSairDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSairDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmSairDepartamentos);

        jMenuBar1.add(mnuDepartamentos);

        mnuFuncionarios.setText("Funcionários");

        itmCadastrarFuncionarios.setText("Cadastrar");
        itmCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmConsultarFuncionarios.setText("Consultar");
        mnuFuncionarios.add(itmConsultarFuncionarios);

        itmAlterarFuncionarios.setText("Alterar");
        mnuFuncionarios.add(itmAlterarFuncionarios);

        itmExcluirFuncionarios.setText("Excluir");
        mnuFuncionarios.add(itmExcluirFuncionarios);

        itmRelatoriosFuncionarios.setText("Relatórios");
        itmRelatoriosFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmRelatoriosFuncionarios);

        jMenuBar1.add(mnuFuncionarios);

        mnuUsuarios.setText("Usuários");

        itmCadastrarUsuario.setText("Cadastrar");
        itmCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmCadastrarUsuario);

        jMenuBar1.add(mnuUsuarios);

        mneAjuda.setText("Ajuda");

        jMenuItem13.setText("Manual do Usuário");
        mneAjuda.add(jMenuItem13);

        jMenuItem1.setText("Sobre");
        mneAjuda.add(jMenuItem1);

        jMenuBar1.add(mneAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(602, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmSairDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSairDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmSairDepartamentosActionPerformed

    private void itmRelatorioGeralDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioGeralDepartamentosActionPerformed
        new RelatorioDepartamentos().setVisible(true);
    }//GEN-LAST:event_itmRelatorioGeralDepartamentosActionPerformed

    private void itmRelatoriosFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmRelatoriosFuncionariosActionPerformed

    private void btnDestaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDestaqueActionPerformed

    private void itmCadastrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarDepartamentosActionPerformed
        new ControleDepartamentos("cadastrar").setVisible(true);
    }//GEN-LAST:event_itmCadastrarDepartamentosActionPerformed

    private void itmCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarUsuarioActionPerformed
        new CadastroUsuarios().setVisible(true);
    }//GEN-LAST:event_itmCadastrarUsuarioActionPerformed

    private void itmCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionariosActionPerformed
        new CadastroFuncionarios().setVisible(true);
    }//GEN-LAST:event_itmCadastrarFuncionariosActionPerformed

    private void itmConsultarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultarDepartamentosActionPerformed
        new ControleDepartamentos("consultar").setVisible(true);
    }//GEN-LAST:event_itmConsultarDepartamentosActionPerformed

    private void itmExcluirDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirDepartamentosActionPerformed
        new ControleDepartamentos("excluir").setVisible(true);
    }//GEN-LAST:event_itmExcluirDepartamentosActionPerformed

    private void itmAlterarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarDepartamentosActionPerformed
        new ControleDepartamentos("alterar").setVisible(true);
    }//GEN-LAST:event_itmAlterarDepartamentosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDestaque;
    private javax.swing.JMenuItem itmAlterarDepartamentos;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarDepartamentos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarUsuario;
    private javax.swing.JMenuItem itmConsultarDepartamentos;
    private javax.swing.JMenuItem itmConsultarFuncionarios;
    private javax.swing.JMenuItem itmExcluirDepartamentos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmRelatorioCidadeDepartamentos;
    private javax.swing.JMenuItem itmRelatorioGeralDepartamentos;
    private javax.swing.JMenu itmRelatoriosDepartamentos;
    private javax.swing.JMenuItem itmRelatoriosFuncionarios;
    private javax.swing.JMenuItem itmSairDepartamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mneAjuda;
    private javax.swing.JMenu mnuDepartamentos;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
