package visual;

import controle.ControleFornecedor;
import controle.ControlePedidoCompra;
import controle.ControleProduto;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Fornecedor;
import modelo.PedidoCompra;
import modelo.Produto;

public class VisualCadastrarPedidoCompra extends javax.swing.JDialog {
    
    ControleFornecedor controleFornecedor = new ControleFornecedor();
    ControleProduto controleProduto = new ControleProduto();
    ControlePedidoCompra controlePedido = new ControlePedidoCompra();
    Fornecedor fornecedor = new Fornecedor();
    Produto produto = new Produto();
    PedidoCompra pedido = new PedidoCompra();
    List<Fornecedor> listaFornecedores;
    List<Produto> listaProdutos;
    

    public VisualCadastrarPedidoCompra() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        preencherCampoSelecaoFornecedor();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCBFornecedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCBProduto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFObservacao = new javax.swing.JTextField();
        jBConfirma = new javax.swing.JButton();
        jBCancelae = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitar Pedido Compra");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buy50.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Solicitar Pedido de Compra");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Nome  : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Fornecedor : ");

        jCBFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        jCBFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFornecedorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Produto : ");

        jCBProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Quantidade : ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Observação : ");

        jBConfirma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Checkmark20.png"))); // NOI18N
        jBConfirma.setText("Confirmar");
        jBConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmaActionPerformed(evt);
            }
        });

        jBCancelae.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBCancelae.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete20.png"))); // NOI18N
        jBCancelae.setText("Cancelar");
        jBCancelae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelaeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFQuantidade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFObservacao))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCancelae)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBConfirma)))
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
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirma)
                    .addComponent(jBCancelae))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmaActionPerformed
        if(jTFNome.getText().length() != 0){
            if(!jCBProduto.getSelectedItem().equals("Selecionar") && !jCBFornecedor.getSelectedItem().equals("Selecionar")){
                if(validarCampoQuantidade()){
                    pedido = formarObjetoPedido();      
                    boolean resultadoInsercao = controlePedido.inserirPedidoCompra(pedido);
                    if(resultadoInsercao){
                        JOptionPane.showMessageDialog(null, "Pedido de compra realizado com sucesso");
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro no pedido de compra");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Quantidade do produto não específicada");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Item Produto ou Fornecedor não selecionado");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Adicione nome ao pedido");
        }
    }//GEN-LAST:event_jBConfirmaActionPerformed

    private void jBCancelaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelaeActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelaeActionPerformed

    private void jCBFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFornecedorActionPerformed
        fornecedor = retornarObjetoFornecedorSelecionado();
        preencherCampoSelecaoProduto(fornecedor.getId());
    }//GEN-LAST:event_jCBFornecedorActionPerformed

    public void preencherCampoSelecaoFornecedor(){
        listaFornecedores = controleFornecedor.selecionarTodosFornecedoresAtivos();
        for(Fornecedor forn : listaFornecedores){
            jCBFornecedor.addItem(forn.getId()+" "+forn.getNome());
        }
    }
    
    public void preencherCampoSelecaoProduto(Integer id){
        jCBProduto.removeAllItems();
        jCBProduto.addItem("Selecionar");
        listaProdutos = controleProduto.selecionarProdutosPorIdFornecedor(id);
        for(Produto produto : listaProdutos){
            jCBProduto.addItem(produto.getId()+"-"+produto.getNome());
        }
        
    }
    
    public boolean validarCampoQuantidade(){
        if(jTFQuantidade.getText().length()!=0){
            String[] campos = {jTFQuantidade.getText()};
            for(String text : campos){
                for (int i = 0; i < text.length(); i++) {
                    char ch = text.charAt(i);
                    if (ch < 48 || ch > 57)
                        return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    
    public Fornecedor retornarObjetoFornecedorSelecionado(){
        listaFornecedores = controleFornecedor.selecionarTodosFornecedores();
        int itemSelecionado = jCBFornecedor.getSelectedIndex();
        fornecedor = listaFornecedores.get(itemSelecionado-1);
        return fornecedor;
    }
    
    public Produto retornarObjetoProdutoSelecionado(){
        int itemSelecionado = jCBProduto.getSelectedIndex();
        produto = listaProdutos.get(itemSelecionado-1);
        return produto;
    }
    
    public PedidoCompra formarObjetoPedido(){
        
        pedido.setNome(jTFNome.getText());
        pedido.setQuantidade(Integer.parseInt(jTFQuantidade.getText()));
        pedido.setObservacao(jTFObservacao.getText());
        pedido.setFornecedor_id(retornarObjetoFornecedorSelecionado());
        pedido.setProduto_id(retornarObjetoProdutoSelecionado());
             
        return pedido;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelae;
    private javax.swing.JButton jBConfirma;
    private javax.swing.JComboBox<String> jCBFornecedor;
    private javax.swing.JComboBox<String> jCBProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFObservacao;
    private javax.swing.JTextField jTFQuantidade;
    // End of variables declaration//GEN-END:variables
}
