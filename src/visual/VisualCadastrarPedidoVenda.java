package visual;

import controle.ControleCliente;
import controle.ControlePedidoVenda;
import controle.ControleProduto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.PedidoVenda;
import modelo.Produto;

public class VisualCadastrarPedidoVenda extends javax.swing.JDialog {
    
    ControlePedidoVenda controlePedidoVenda = new ControlePedidoVenda();
    ControleProduto controleProduto = new ControleProduto();
    ControleCliente controleCliente = new ControleCliente();
    PedidoVenda pedido = new PedidoVenda();
    Produto produto = new Produto();
    Cliente cliente = new Cliente();
    List<Cliente> listaClientes;
    List<Produto> listaProdutos = controleProduto.selecionarTodosProdutos();
    List<Produto> produtosPedido = new ArrayList<Produto>();
    DefaultTableModel tableProdutosPedido;
    

    public VisualCadastrarPedidoVenda() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        preencherCampoSelecaoCliente();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCBCliente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCBProduto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFObservacao = new javax.swing.JTextField();
        jBConfirma = new javax.swing.JButton();
        jBCancelae = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLQuantidadeProdutoEstoque = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBBuscarQuantidadeProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutoPedido = new javax.swing.JTable();
        jBRetirarProduto = new javax.swing.JButton();
        jBAdicionarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitar Pedido Venda");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Purchase50.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Solicitar Pedido de Venda");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Nome  : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Cliente : ");

        jCBCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        jCBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBClienteActionPerformed(evt);
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

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Produto em estoque : ");

        jLQuantidadeProdutoEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLQuantidadeProdutoEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Peças");

        jBBuscarQuantidadeProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscarQuantidadeProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search20.png"))); // NOI18N
        jBBuscarQuantidadeProduto.setToolTipText("Quantidade de Produto no estoque");
        jBBuscarQuantidadeProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBBuscarQuantidadeProdutoMouseClicked(evt);
            }
        });

        jTProdutoPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTProdutoPedido);

        jBRetirarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRetirarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Minus20.png"))); // NOI18N
        jBRetirarProduto.setToolTipText("Retirar Produto");
        jBRetirarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRetirarProdutoActionPerformed(evt);
            }
        });

        jBAdicionarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add20.png"))); // NOI18N
        jBAdicionarProduto.setToolTipText("Adicionar Produto");
        jBAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCancelae)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBConfirma))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFNome))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jCBCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(jBBuscarQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFQuantidade)
                                    .addComponent(jTFObservacao)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(76, 76, 76)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLQuantidadeProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBRetirarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jCBProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBBuscarQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLQuantidadeProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBRetirarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(18, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirma)
                    .addComponent(jBCancelae))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmaActionPerformed
            if(jTFNome.getText().length() != 0){
                if(!produtosPedido.isEmpty() && !jCBCliente.getSelectedItem().equals("Selecionar")){
                    pedido = formarObjetoPedido();      
                    String resultadoInsercao = controlePedidoVenda.inserirPedidoVenda(pedido);
                    if(resultadoInsercao.equals("")){
                        JOptionPane.showMessageDialog(null, "Pedido realizado com sucesso","Sucesso",
                                JOptionPane.INFORMATION_MESSAGE);
                    }else if(resultadoInsercao.equals("insuficiente")){
                        JOptionPane.showMessageDialog(null, "Quantidade de produto no estoque insuficiente para rea"
                                    + "lização do pedido");
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro no pedido de venda");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Nenhum produto adicionado a lista de produtos do pedido"
                            , "Error",JOptionPane.YES_NO_OPTION);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Adicione nome ao pedido", "Error",JOptionPane.YES_NO_OPTION);
            }
        
    }//GEN-LAST:event_jBConfirmaActionPerformed

    private void jBCancelaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelaeActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelaeActionPerformed

    private void jCBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBClienteActionPerformed
        preencherCampoSelecaoProduto();
    }//GEN-LAST:event_jCBClienteActionPerformed

    private void jBBuscarQuantidadeProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarQuantidadeProdutoMouseClicked
        produto = retornarObjetoProdutoSelecionado();
        if(produto.getQuantidade() == null){
            jLQuantidadeProdutoEstoque.setText("0");
        }else{
            jLQuantidadeProdutoEstoque.setText(Integer.toString(produto.getQuantidade()));
        }
    }//GEN-LAST:event_jBBuscarQuantidadeProdutoMouseClicked

    private void jBAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarProdutoActionPerformed
        produto = retornarObjetoProdutoSelecionado();
        String quantidadeProdutoPedido = jTFQuantidade.getText();
        
        if(produto.getNome() != null && !quantidadeProdutoPedido.equals("") && validarCampoQuantidade()){
            Integer quantidade = Integer.parseInt(quantidadeProdutoPedido);
            if(quantidade > 0){
                if(produto.getQuantidade() >= Integer.parseInt(quantidadeProdutoPedido)){
                    if(!verificarExistenciaProdutoLista(produto)){
                        produto.setQuantidade(Integer.parseInt(quantidadeProdutoPedido));
                        adicionarProdutoemListaProdutos(produto);
                        produtosPedido.add(produto);
                    }else{
                        JOptionPane.showMessageDialog(null, "Produto existente na lista", "Error",
                            JOptionPane.YES_NO_OPTION);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Quantidade de produto insuficiente", "Error",
                        JOptionPane.YES_NO_OPTION);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Quantidade de produto igual a 0", "Error",JOptionPane.YES_NO_OPTION);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Quantidade de produto inválida", "Error",JOptionPane.YES_NO_OPTION);
        }
        
    }//GEN-LAST:event_jBAdicionarProdutoActionPerformed

    private void jBRetirarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRetirarProdutoActionPerformed
        int row = jTProdutoPedido.getSelectedRow();
        if(row != -1){
            produtosPedido.remove(row);
            tableProdutosPedido.removeRow(row);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado na lista");
        }
    }//GEN-LAST:event_jBRetirarProdutoActionPerformed
    
    public boolean verificarExistenciaProdutoLista(Produto prod){
        for(Produto p : produtosPedido){
            if(p.getId() == prod.getId()){
                return true;
            }
        }
        return false;
    }
    
    public void adicionarProdutoemListaProdutos(Produto prod){
        tableProdutosPedido = (DefaultTableModel) jTProdutoPedido.getModel();
        tableProdutosPedido.addRow(new Object[]{prod.getId(), prod.getNome(), prod.getQuantidade()});
    }
    
    public void preencherCampoSelecaoCliente(){
        listaClientes = controleCliente.selecionarTodosClientesAtivos();
        for(Cliente cliente : listaClientes){
            jCBCliente.addItem(cliente.getId()+"-"+cliente.getNome());
        }
    }
    
    public void preencherCampoSelecaoProduto(){
        jCBProduto.removeAllItems();
        jCBProduto.addItem("Selecionar");
        for(Produto prod : listaProdutos){
            jCBProduto.addItem(prod.getId()+"-"+prod.getNome());
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
    
    public Cliente retornarObjetoClienteSelecionado(){
        int itemSelecionado = jCBCliente.getSelectedIndex();
        cliente = listaClientes.get(itemSelecionado-1);
        return cliente;
    }
    
    public Produto retornarObjetoProdutoSelecionado(){
        int itemSelecionado = jCBProduto.getSelectedIndex();
        listaProdutos = controleProduto.selecionarTodosProdutos();
        if(itemSelecionado != 0){
            produto = listaProdutos.get(itemSelecionado-1);
        }
        return produto;
    }
    
    public PedidoVenda formarObjetoPedido(){
        
        pedido.setNome(jTFNome.getText());
        pedido.setObservacao(jTFObservacao.getText());
        pedido.setCliente_id(retornarObjetoClienteSelecionado());
        pedido.setListaProdutos(produtosPedido);
             
        return pedido;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionarProduto;
    private javax.swing.JButton jBBuscarQuantidadeProduto;
    private javax.swing.JButton jBCancelae;
    private javax.swing.JButton jBConfirma;
    private javax.swing.JButton jBRetirarProduto;
    private javax.swing.JComboBox<String> jCBCliente;
    private javax.swing.JComboBox<String> jCBProduto;
    private javax.swing.JLabel jLQuantidadeProdutoEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFObservacao;
    private javax.swing.JTextField jTFQuantidade;
    private javax.swing.JTable jTProdutoPedido;
    // End of variables declaration//GEN-END:variables
}
