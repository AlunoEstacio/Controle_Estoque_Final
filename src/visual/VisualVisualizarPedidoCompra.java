package visual;

import controle.ControlePedidoCompra;
import controle.ControleProduto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.PedidoCompra;
import util.ValidarData;

public class VisualVisualizarPedidoCompra extends javax.swing.JDialog {
    ControlePedidoCompra controlePedido = new ControlePedidoCompra();
    ControleProduto controleProduto = new ControleProduto();
    VisualAtualizarPedidoCompra vAtualizarPedidoCompra = new VisualAtualizarPedidoCompra();
    PedidoCompra pedidoCompra = new PedidoCompra();
    
    List<PedidoCompra> listaPedidos;
    DefaultTableModel tablePedidos;

    public VisualVisualizarPedidoCompra() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFBuscarPedido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaPedidos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jBAtualizarStatus = new javax.swing.JButton();
        jBListaProdutos = new javax.swing.JButton();
        jBBuscarProduto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCBReferenciaBusca = new javax.swing.JComboBox<>();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar Produtos");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/View50.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Visualizar lista de pedidos de compra");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Pedido : ");

        jTFBuscarPedido.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTListaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quantidade", "Produto", "Fornecedor", "Status", "Data Início", "Data Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListaPedidos);
        if (jTListaPedidos.getColumnModel().getColumnCount() > 0) {
            jTListaPedidos.getColumnModel().getColumn(0).setResizable(false);
            jTListaPedidos.getColumnModel().getColumn(0).setPreferredWidth(4);
            jTListaPedidos.getColumnModel().getColumn(2).setPreferredWidth(40);
        }

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Lista de Produtos");

        jBAtualizarStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAtualizarStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Refresh20.png"))); // NOI18N
        jBAtualizarStatus.setText("Atualizar status");
        jBAtualizarStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarStatusActionPerformed(evt);
            }
        });

        jBListaProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBListaProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/List20.png"))); // NOI18N
        jBListaProdutos.setText("Lista pedidos");
        jBListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListaProdutosActionPerformed(evt);
            }
        });

        jBBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search20.png"))); // NOI18N
        jBBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarProdutoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Buscar por :");

        jCBReferenciaBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Nome", "Quantidade", "Produto", "Fornecedor", "Status" }));

        jBCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jBAtualizarStatus)
                                .addGap(18, 18, 18)
                                .addComponent(jBListaProdutos))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jCBReferenciaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscarProduto)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jBBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTFBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jCBReferenciaBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAtualizarStatus)
                    .addComponent(jBListaProdutos)
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarStatusActionPerformed
        int row = jTListaPedidos.getSelectedRow();
        String statusPedido = tablePedidos.getValueAt(row, 5).toString();
        if(row != -1 && statusPedido.equals("ABERTO")){
            int idPedidoSelecionado = Integer.parseInt(tablePedidos.getValueAt(row, 0).toString());
            for(PedidoCompra pedido : listaPedidos){
                if(pedido.getId() == idPedidoSelecionado){
                    vAtualizarPedidoCompra.obterPedido(pedido);
                    vAtualizarPedidoCompra.setVisible(true);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum pedido selecionado na lista ou pedido "+statusPedido);
        }
    }//GEN-LAST:event_jBAtualizarStatusActionPerformed

    private void jBListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListaProdutosActionPerformed
        listaPedidos = controlePedido.selecionarTodosPedidosCompra();
        listarPedidos(listaPedidos);
        
    }//GEN-LAST:event_jBListaProdutosActionPerformed

    private void jBBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarProdutoActionPerformed
        String nomeBuscar = jTFBuscarPedido.getText().toUpperCase();
        String referenciaBusca = jCBReferenciaBusca.getSelectedItem().toString();
        
        if(!referenciaBusca.equals("Selecionar") && nomeBuscar.length()>0){
           
            listaPedidos = controlePedido.selecionarPedidosCompraporReferencia(nomeBuscar, referenciaBusca);
            
            if(listaPedidos.size()>0){
                listarPedidos(listaPedidos);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum produto encontrado com "+nomeBuscar);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo busca ou seleção vázio");
        }
    }//GEN-LAST:event_jBBuscarProdutoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed
    
    public void listarPedidos(List<PedidoCompra> listaPedidos){
        tablePedidos = (DefaultTableModel) jTListaPedidos.getModel();
        tablePedidos.setNumRows(0);
        for(PedidoCompra pedido : listaPedidos){
            String dataFinal = null;
            if(pedido.getDataFinal() != null){
                dataFinal = ValidarData.converterDataParaFormatoDaMascara(pedido.getDataFinal().toString());
            }
            String dataInicio = ValidarData.converterDataParaFormatoDaMascara(pedido.getDataInicio().toString());
            tablePedidos.addRow(new Object[]{pedido.getId(), pedido.getNome(), pedido.getQuantidade(),
            pedido.getProduto_id().getNome(), pedido.getFornecedor_id().getNome(), pedido.getStatus(),
            dataInicio, dataFinal});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizarStatus;
    private javax.swing.JButton jBBuscarProduto;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBListaProdutos;
    private javax.swing.JComboBox<String> jCBReferenciaBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscarPedido;
    private javax.swing.JTable jTListaPedidos;
    // End of variables declaration//GEN-END:variables
}
