/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.View;

import br.ulbra.Controller.MedicamentoController;
import br.ulbra.Controller.MedicoController;
import br.ulbra.Controller.UsuarioController;
import br.ulbra.DAO.MedicamentoDAO;
import br.ulbra.Model.Medicamento;
import br.ulbra.Model.Medico;
import br.ulbra.Model.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicamentoscadastroView extends javax.swing.JFrame {

    private MedicamentoDAO dao;
    private Map<String, Integer> mapaMedicos = new HashMap<>();
    private Map<String, Integer> mapaPacientes = new HashMap<>();
    private MedicamentoController controller;
    private List<Medicamento> lista = new ArrayList<>();
    private int medicamentoSelecionadoId = -1;

    public MedicamentoscadastroView() {
        initComponents();
        controller = new MedicamentoController();
        carregarMedicos();
        carregarPacientes();
        atualizarTabela();
        setBotoes(0);
    }

    private void limparCampos() {

        txtNome.setText("");
        txtObs.setText("");

        cmbMedico.setSelectedIndex(-1);
        cmbPaciente.setSelectedIndex(-1);

        medicamentoSelecionadoId = -1;
    }

    public void setBotoes(int op) {
        switch (op) {
            case 1:
                btnSalvar.setEnabled(false);
                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
                break;
            default:
                btnSalvar.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);

        }
    }

    private void carregarMedicos() {
        try {
            MedicoController controller = new MedicoController();
            List<Medico> medicos = controller.listar();

            cmbMedico.removeAllItems();
            mapaMedicos.clear();

            for (Medico m : medicos) {
                cmbMedico.addItem(m.getNome());
                mapaMedicos.put(m.getNome(), m.getId());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar médicos: " + e.getMessage());
        }
    }

    private void carregarPacientes() {
        try {
            UsuarioController controller = new UsuarioController();
            List<Usuario> pacientes = controller.listarPacientes();

            cmbPaciente.removeAllItems();
            mapaPacientes.clear();

            cmbPaciente.addItem("Selecione um paciente");

            for (Usuario u : pacientes) {
                cmbPaciente.addItem(u.getNome());
                mapaPacientes.put(u.getNome(), u.getUsuarioId());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar pacientes: " + e.getMessage());
        }
    }

    private void atualizarTabela() {
        try {
            javax.swing.table.DefaultTableModel modelTbl
                    = (javax.swing.table.DefaultTableModel) tbMedicamentos.getModel();
            modelTbl.setRowCount(0);

            // Preenche a lista com o método do controller
            lista = controller.listarComNomes();

            for (Medicamento m : lista) {
                modelTbl.addRow(new Object[]{
                    m.getNomeMedico(),
                    m.getNomePaciente(),
                    m.getNome(),
                    m.getObservacoes()
                });
            }
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao listar medicamentos: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMedicamentos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        cmbMedico = new javax.swing.JComboBox<>();
        cmbPaciente = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(19, 57, 139));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Medicamentos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 78));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Medico ID:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Observações:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Paciente ID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel2.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 180, -1));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        tbMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Medico", "Paciente", "Medicamento", "Obs."
            }
        ));
        tbMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMedicamentos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 510, 150));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 90, -1, -1));

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel2.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Medicamento:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel2.add(txtObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 180, -1));

        cmbMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmbMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        cmbPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cmbPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            String nomeMed = txtNome.getText().trim();
            String obs = txtObs.getText().trim();

            if (nomeMed.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe o nome do medicamento!");
                return;
            }

            String nomeMedico = (String) cmbMedico.getSelectedItem();
            String nomePaciente = (String) cmbPaciente.getSelectedItem();

            if (nomeMedico == null || nomePaciente == null) {
                JOptionPane.showMessageDialog(this, "Selecione um médico e um paciente!");
                return;
            }

            int idMedico = mapaMedicos.get(nomeMedico);
            int idPaciente = mapaPacientes.get(nomePaciente);

            Medicamento med = new Medicamento(idMedico, idPaciente, nomeMed, obs);
            controller.salvar(med);

            JOptionPane.showMessageDialog(this, "Medicamento salvo com sucesso!");
            atualizarTabela();
            limparCampos();

        } catch (Exception ex) {
            ex.printStackTrace(); // Mostra no console
            JOptionPane.showMessageDialog(this,
                    "Erro ao salvar: " + ex.getClass().getName() + " - " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (medicamentoSelecionadoId == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um medicamento na tabela para editar!");
            return;
        }

        try {
            String nomeMedicamento = txtNome.getText().trim();
            String observacoes = txtObs.getText().trim();
            String nomeMedico = (String) cmbMedico.getSelectedItem();
            String nomePaciente = (String) cmbPaciente.getSelectedItem();

            int idMedico = mapaMedicos.get(nomeMedico);
            int idPaciente = mapaPacientes.get(nomePaciente);

            Medicamento m = new Medicamento();
            m.setId(medicamentoSelecionadoId);
            m.setMedicoId(idMedico);
            m.setUsuarioId(idPaciente);
            m.setNome(nomeMedicamento);
            m.setObservacoes(observacoes);

            controller.editar(m);
            JOptionPane.showMessageDialog(this, "Medicamento atualizado com sucesso!");
            atualizarTabela();
            limparCampos();
            setBotoes(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao editar medicamento: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (medicamentoSelecionadoId <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione um medicamento na tabela para excluir.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja excluir este medicamento?",
                "Confirmar exclusão",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            MedicamentoDAO dao = new MedicamentoDAO();
            dao.excluir(medicamentoSelecionadoId);

            atualizarTabela();
            limparCampos();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        atualizarTabela();
        limparCampos();
        setBotoes(0);
    }//GEN-LAST:event_btnListarActionPerformed

    private void tbMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMedicamentosMouseClicked
        int selectedRow = tbMedicamentos.getSelectedRow();
        setBotoes(1);
        if (selectedRow >= 0 && lista != null && !lista.isEmpty()) {
            Medicamento med = lista.get(selectedRow);
            medicamentoSelecionadoId = med.getId();

            txtNome.setText(med.getNome());
            txtObs.setText(med.getObservacoes());
            cmbMedico.setSelectedItem(med.getNomeMedico());
            cmbPaciente.setSelectedItem(med.getNomePaciente());
        }
    }//GEN-LAST:event_tbMedicamentosMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new DashboardCuidadorView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        setBotoes(0);
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(MedicamentoscadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicamentoscadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicamentoscadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicamentoscadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicamentoscadastroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbMedico;
    private javax.swing.JComboBox<String> cmbPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMedicamentos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObs;
    // End of variables declaration//GEN-END:variables
}
