package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class RelatorioDepartamentos extends javax.swing.JFrame {

    public RelatorioDepartamentos() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos");
            ResultSet resultado = stConsultar.executeQuery();
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);
            
            while (resultado.next()) { 
                Object dep[] = {
                  resultado.getString("codigo"),
                  resultado.getString("nome"),
                  resultado.getString("cidade"),
                  resultado.getString("telefone")
                };
                modeloTabela.addRow(dep);
                cmbCodigo.addItem(resultado.getString("codigo"));
                cmbCidade.addItem(resultado.getString("cidade"));
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        cmbCodigo = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        lblCidade = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();

        setTitle("Relatório de Departamento");

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cidade", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tblDepartamentos);

        lblCodigo.setText("Filtrar Código:");

        cmbCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoActionPerformed(evt);
            }
        });

        lblNome.setText("Filtrar Nome:");

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCidadeActionPerformed(evt);
            }
        });

        lblCidade.setText("Filtrar Cidade:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCidade)
                        .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNome)
                        .addComponent(btnPesquisar)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(602, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos where codigo = ?");
            stConsultar.setString(1, cmbCodigo.getSelectedItem().toString());
            ResultSet resultado = stConsultar.executeQuery();
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);
            
            while (resultado.next()) { 
                Object dep[] = {
                  resultado.getString("codigo"),
                  resultado.getString("nome"),
                  resultado.getString("cidade"),
                  resultado.getString("telefone")
                };
                modeloTabela.addRow(dep);
            } 
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }//GEN-LAST:event_cmbCodigoActionPerformed

    private void cmbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCidadeActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos where cidade = ?");
            stConsultar.setString(1, cmbCidade.getSelectedItem().toString());
            ResultSet resultado = stConsultar.executeQuery();
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);

            while (resultado.next()) {
                Object dep[] = {
                    resultado.getString("codigo"),
                    resultado.getString("nome"),
                    resultado.getString("cidade"),
                    resultado.getString("telefone")
                };
                modeloTabela.addRow(dep);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbCidadeActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_empresa", "root", "Uninove@123");
            PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM departamentos WHERE nome LIKE ?");
            stConsultar.setString(1, "%" + txtNome.getText() + "%");
            ResultSet resultado = stConsultar.executeQuery();
            DefaultTableModel modeloTabela;
            modeloTabela = (DefaultTableModel) tblDepartamentos.getModel();
            modeloTabela.setRowCount(0);

            while (resultado.next()) {
                Object dep[] = {
                    resultado.getString("codigo"),
                    resultado.getString("nome"),
                    resultado.getString("cidade"),
                    resultado.getString("telefone")
                };
                modeloTabela.addRow(dep);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
