package visual;

import controle.ControleFuncionario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Funcionario;
import modelo.FuncionarioLogado;

public class VisualVisualizarFuncionario extends javax.swing.JDialog {
    VisualAtualizarCadastroFuncionario visualAtualizarCadastro = new VisualAtualizarCadastroFuncionario();
    ControleFuncionario controleFuncionario = new ControleFuncionario();
    FuncionarioLogado funcionarioLogado = new FuncionarioLogado();
    List<Funcionario> listaFuncionario;
    DefaultTableModel tableFuncionario;

    public VisualVisualizarFuncionario() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void obterObjetoFuncionarioLogado(FuncionarioLogado funcLogado){
        funcionarioLogado = funcLogado;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFBuscarFuncionario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaFuncionarios = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jBAtualizar = new javax.swing.JButton();
        jBApagar = new javax.swing.JButton();
        jBListaFuncionario = new javax.swing.JButton();
        jBBuscarFuncionarios = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCBReferenciaDeBusca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar Funcionário");
        setPreferredSize(new java.awt.Dimension(750, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/View50.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Visualizar lista de Funcionário");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Funcionário : ");

        jTFBuscarFuncionario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTListaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Cidade", "Cargo", "E-mail", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListaFuncionarios);
        if (jTListaFuncionarios.getColumnModel().getColumnCount() > 0) {
            jTListaFuncionarios.getColumnModel().getColumn(0).setResizable(false);
            jTListaFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Lista de Funcionários");

        jBAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Refresh20.png"))); // NOI18N
        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jBApagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete20.png"))); // NOI18N
        jBApagar.setText("Apagar");
        jBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBApagarActionPerformed(evt);
            }
        });

        jBListaFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBListaFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/List20.png"))); // NOI18N
        jBListaFuncionario.setText("Lista funcionários");
        jBListaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListaFuncionarioActionPerformed(evt);
            }
        });

        jBBuscarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search20.png"))); // NOI18N
        jBBuscarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarFuncionariosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Buscar por : ");

        jCBReferenciaDeBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Nome", "CPF", "Cidade", "Cargo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBListaFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(jBApagar)
                        .addGap(18, 18, 18)
                        .addComponent(jBAtualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBReferenciaDeBusca, 0, 116, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBBuscarFuncionarios)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTFBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jCBReferenciaDeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBBuscarFuncionarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAtualizar)
                    .addComponent(jBApagar)
                    .addComponent(jBListaFuncionario))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        int row = jTListaFuncionarios.getSelectedRow();
        if(row != -1){
            int idFuncionarioSelecionado = Integer.parseInt(tableFuncionario.getValueAt(row, 0).toString());
            for(Funcionario func : listaFuncionario){
                if(func.getId() == idFuncionarioSelecionado){
                    visualAtualizarCadastro.obterFuncionarioLogado(funcionarioLogado);
                    visualAtualizarCadastro.preencherCamposFuncionario(func);
                    visualAtualizarCadastro.setVisible(true);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum funcionário selecionado na lista");
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApagarActionPerformed
        String resultadoAlterarFuncionario;
        int row = jTListaFuncionarios.getSelectedRow();
        if(row != -1){
            int idFuncionarioSelecionado = Integer.parseInt(tableFuncionario.getValueAt(row, 0).toString());
            for(Funcionario func : listaFuncionario){
                if(func.getId() == idFuncionarioSelecionado){
                    resultadoAlterarFuncionario = controleFuncionario.atualizarStatusFuncionario(funcionarioLogado, func);
                    if(resultadoAlterarFuncionario.equals("")){
                        tableFuncionario.removeRow(row);
                        JOptionPane.showMessageDialog(null, "Funcionário desvinculado");
                    }else{
                        JOptionPane.showMessageDialog(null, resultadoAlterarFuncionario);
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum funcionário selecionado na lista");
        }
    }//GEN-LAST:event_jBApagarActionPerformed

    private void jBListaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListaFuncionarioActionPerformed
        listaFuncionario = controleFuncionario.selecionarTodosFuncionarios();
        listarFuncionarios(listaFuncionario);
        
    }//GEN-LAST:event_jBListaFuncionarioActionPerformed

    private void jBBuscarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarFuncionariosActionPerformed
        String nomeBuscar = jTFBuscarFuncionario.getText().toString();
        String referenciaBusca = jCBReferenciaDeBusca.getSelectedItem().toString();
        
        if(!referenciaBusca.equals("Selecionar") && nomeBuscar.length() > 0){
            listaFuncionario = controleFuncionario.selecionarFuncionariosPorReferencia(nomeBuscar, referenciaBusca);
            if(listaFuncionario.size()>0){
                listarFuncionarios(listaFuncionario);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum nome encontrado com "+nomeBuscar);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo de busca vázio ou caixa de seleção vázia");
        }
      
    }//GEN-LAST:event_jBBuscarFuncionariosActionPerformed
    
    public void listarFuncionarios(List<Funcionario> listaFuncionario){
        tableFuncionario = (DefaultTableModel) jTListaFuncionarios.getModel();
        tableFuncionario.setNumRows(0);
        for(Funcionario func : listaFuncionario){
            tableFuncionario.addRow(new Object[]{func.getId(), func.getNome(), func.getCpf(), func.getEndereco().getCidade(),
            func.getCargo(), func.getEmail(), func.getTelefone()});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBApagar;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBBuscarFuncionarios;
    private javax.swing.JButton jBListaFuncionario;
    private javax.swing.JComboBox<String> jCBReferenciaDeBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscarFuncionario;
    private javax.swing.JTable jTListaFuncionarios;
    // End of variables declaration//GEN-END:variables
}
