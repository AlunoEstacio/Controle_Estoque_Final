package visual;

import controle.ControleCliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class VisualVisualizarCliente extends javax.swing.JDialog {
    VisualAtualizaCadastroCliente atualizarCadastroCliente = new VisualAtualizaCadastroCliente();
    ControleCliente controleCliente = new ControleCliente();
    List<Cliente> listaClientes;
    DefaultTableModel tableClientes;

    public VisualVisualizarCliente() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFBuscarCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaClientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jBAtualizar = new javax.swing.JButton();
        jBApagar = new javax.swing.JButton();
        jBListaClientes = new javax.swing.JButton();
        jBBuscarCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCBReferenciaBusca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar Clientes");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/View50.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Visualizar lista de Clientes");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Cliente : ");

        jTFBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome/Razão social", "CPF/CNPJ", "Cidade", "Pessoa", "E-mail", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListaClientes);
        if (jTListaClientes.getColumnModel().getColumnCount() > 0) {
            jTListaClientes.getColumnModel().getColumn(0).setResizable(false);
            jTListaClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Lista de Clientes");

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

        jBListaClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBListaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/List20.png"))); // NOI18N
        jBListaClientes.setText("Lista clientes");
        jBListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListaClientesActionPerformed(evt);
            }
        });

        jBBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search20.png"))); // NOI18N
        jBBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Buscar por : ");

        jCBReferenciaBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Nome/Razão social", "Cidade", "Pessoa" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBListaClientes)
                        .addGap(28, 28, 28)
                        .addComponent(jBApagar)
                        .addGap(24, 24, 24)
                        .addComponent(jBAtualizar))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTFBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBReferenciaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscarCliente)))
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
                    .addComponent(jBBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTFBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jCBReferenciaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAtualizar)
                    .addComponent(jBApagar)
                    .addComponent(jBListaClientes))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        int row = jTListaClientes.getSelectedRow();
        if(row != -1){
            int idClienteSelecionado = Integer.parseInt(tableClientes.getValueAt(row, 0).toString());
            for(Cliente cliente : listaClientes){
                if(cliente.getId() == idClienteSelecionado){
                    atualizarCadastroCliente.preencherCampos(cliente);
                    atualizarCadastroCliente.setVisible(true);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum funcionário selecionado na lista");
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApagarActionPerformed
        int row = jTListaClientes.getSelectedRow();
        if(row != -1){
            int idClienteSelecionado = Integer.parseInt(tableClientes.getValueAt(row, 0).toString());
            for(Cliente cliente : listaClientes){
                if(cliente.getId() == idClienteSelecionado){
                    boolean resultadoDeletarCliente = controleCliente.deletarCliente(cliente);
                    if(resultadoDeletarCliente){
                        tableClientes.removeRow(row);
                        JOptionPane.showMessageDialog(null, "Cliente deletado");
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro em apagar cliente");
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado na lista");
        }
    }//GEN-LAST:event_jBApagarActionPerformed

    private void jBListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListaClientesActionPerformed
        listaClientes = controleCliente.selecionarTodosClientesAtivos();
        listarClientes(listaClientes);
        
    }//GEN-LAST:event_jBListaClientesActionPerformed

    private void jBBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarClienteActionPerformed
        String nomeBuscar = jTFBuscarCliente.getText().toUpperCase();
        String referenciaBusca = jCBReferenciaBusca.getSelectedItem().toString();
        
        if(!referenciaBusca.equals("Selecionar") && nomeBuscar.length()>0){
            listaClientes = controleCliente.selecionarClientesPorReferencia(nomeBuscar, referenciaBusca);
            
            if(listaClientes.size()>0){
                listarClientes(listaClientes);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum cliente encontrado com "+nomeBuscar);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo busca ou seleção vázio");
        }
    }//GEN-LAST:event_jBBuscarClienteActionPerformed
    
    public void listarClientes(List<Cliente> listaClientes){
        tableClientes = (DefaultTableModel) jTListaClientes.getModel();
        tableClientes.setNumRows(0);
        for(Cliente cliente : listaClientes){
            tableClientes.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getNumeroRegistro(), 
                cliente.getEndereco().getCidade(), cliente.getTipoPessoa(), cliente.getEmail(), cliente.getTelefone()});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBApagar;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBBuscarCliente;
    private javax.swing.JButton jBListaClientes;
    private javax.swing.JComboBox<String> jCBReferenciaBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscarCliente;
    private javax.swing.JTable jTListaClientes;
    // End of variables declaration//GEN-END:variables
}
