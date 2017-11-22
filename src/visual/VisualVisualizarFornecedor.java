package visual;

import controle.ControleFornecedor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Fornecedor;

public class VisualVisualizarFornecedor extends javax.swing.JDialog {
    VisualAtualizaCadastroFornecedor atualizarCadastroFornecedor = new VisualAtualizaCadastroFornecedor();
    ControleFornecedor controleFornecedor = new ControleFornecedor();
    List<Fornecedor> listaFornecedores;
    DefaultTableModel tableFornecedores;

    public VisualVisualizarFornecedor() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFBuscarFornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaFornecedores = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jBAtualizar = new javax.swing.JButton();
        jBApagar = new javax.swing.JButton();
        jBListaFornecedores = new javax.swing.JButton();
        jBBuscarFornecedor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCBReferenciaBusca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar Fornecedores");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/View50.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Visualizar lista de Fornecedores");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Fornecedor : ");

        jTFBuscarFornecedor.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTListaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Razão social", "CNPJ", "Cidade", "E-mail", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListaFornecedores);
        if (jTListaFornecedores.getColumnModel().getColumnCount() > 0) {
            jTListaFornecedores.getColumnModel().getColumn(0).setResizable(false);
            jTListaFornecedores.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Lista de Fornecedores");

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

        jBListaFornecedores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBListaFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/List20.png"))); // NOI18N
        jBListaFornecedores.setText("Lista de fornecedores");
        jBListaFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListaFornecedoresActionPerformed(evt);
            }
        });

        jBBuscarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search20.png"))); // NOI18N
        jBBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarFornecedorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Buscar por :");

        jCBReferenciaBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Razão Social", "CNPJ", "Cidade" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBListaFornecedores)
                        .addGap(18, 18, 18)
                        .addComponent(jBApagar)
                        .addGap(18, 18, 18)
                        .addComponent(jBAtualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBReferenciaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscarFornecedor))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTFBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jCBReferenciaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBBuscarFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAtualizar)
                    .addComponent(jBApagar)
                    .addComponent(jBListaFornecedores))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        int row = jTListaFornecedores.getSelectedRow();
        if(row != -1){
            int idFornecedorSelecionado = Integer.parseInt(tableFornecedores.getValueAt(row, 0).toString());
            for(Fornecedor forn : listaFornecedores){
                if(forn.getId() == idFornecedorSelecionado){
                    atualizarCadastroFornecedor.preencharCampos(forn);
                    atualizarCadastroFornecedor.setVisible(true);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum funcionário selecionado na lista");
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApagarActionPerformed
        int row = jTListaFornecedores.getSelectedRow();
        if(row != -1){
            int idFornecedorSelecionado = Integer.parseInt(tableFornecedores.getValueAt(row, 0).toString());
            for(Fornecedor forn : listaFornecedores){
                if(forn.getId() == idFornecedorSelecionado){
                    boolean resultadoDeletarFornecedor = controleFornecedor.deletarFornecedor(forn);
                    if(resultadoDeletarFornecedor){
                        tableFornecedores.removeRow(row);
                        JOptionPane.showMessageDialog(null, "Fornecedor deletado");
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro em apagar fornecedor");
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado na lista");
        }
    }//GEN-LAST:event_jBApagarActionPerformed

    private void jBListaFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListaFornecedoresActionPerformed
        listaFornecedores = controleFornecedor.selecionarTodosFornecedoresAtivos();
        listarFornecedores(listaFornecedores);
        
    }//GEN-LAST:event_jBListaFornecedoresActionPerformed

    private void jBBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarFornecedorActionPerformed
        String nomeBuscar = jTFBuscarFornecedor.getText().toUpperCase();
        String referenciaBusca = jCBReferenciaBusca.getSelectedItem().toString();
        
        if(!referenciaBusca.equals("Selecionar") && nomeBuscar.length()>0){
            listaFornecedores = controleFornecedor.selecionarTodosFornecedorPorReferencia(nomeBuscar, referenciaBusca);
            
            if(listaFornecedores.size()>0){
                listarFornecedores(listaFornecedores);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum produto encontrado com "+nomeBuscar);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo busca ou seleção vázio");
        }
    }//GEN-LAST:event_jBBuscarFornecedorActionPerformed
    
    public void listarFornecedores(List<Fornecedor> listaFornecedores){
        tableFornecedores = (DefaultTableModel) jTListaFornecedores.getModel();
        tableFornecedores.setNumRows(0);
        for(Fornecedor forn : listaFornecedores){
            tableFornecedores.addRow(new Object[]{forn.getId(), forn.getNome(), forn.getCnpj(), 
                forn.getEndereco().getCidade(), forn.getEmail(), forn.getTelefone()});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBApagar;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBBuscarFornecedor;
    private javax.swing.JButton jBListaFornecedores;
    private javax.swing.JComboBox<String> jCBReferenciaBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscarFornecedor;
    private javax.swing.JTable jTListaFornecedores;
    // End of variables declaration//GEN-END:variables
}
