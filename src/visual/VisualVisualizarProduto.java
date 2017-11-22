package visual;

import controle.ControleProduto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

public class VisualVisualizarProduto extends javax.swing.JDialog {
    VisualAtualizaCadastroProduto visualAtualizarProduto = new VisualAtualizaCadastroProduto();
    ControleProduto controleProduto = new ControleProduto();
    
    List<Produto> listaProdutos;
    DefaultTableModel tableProdutos;

    public VisualVisualizarProduto() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFBuscarProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaProdutos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jBAtualizar = new javax.swing.JButton();
        jBApagar = new javax.swing.JButton();
        jBListaProdutos = new javax.swing.JButton();
        jBBuscarProduto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCBReferenciaBusca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar Produtos");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/View50.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Visualizar lista de Produtos");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Produto : ");

        jTFBuscarProduto.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jTListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Marca", "Fornecedor", "Quantidade", "Categoria", "Preço Compra", "Preço Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListaProdutos);
        if (jTListaProdutos.getColumnModel().getColumnCount() > 0) {
            jTListaProdutos.getColumnModel().getColumn(0).setResizable(false);
            jTListaProdutos.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Lista de Produtos");

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

        jBListaProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBListaProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/List20.png"))); // NOI18N
        jBListaProdutos.setText("Lista produtos");
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

        jCBReferenciaBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Nome", "Marca", "Fornecedor", "Categoria", "Quantidade" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBListaProdutos)
                        .addGap(18, 18, 18)
                        .addComponent(jBApagar)
                        .addGap(22, 22, 22)
                        .addComponent(jBAtualizar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jCBReferenciaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscarProduto)))
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
                    .addComponent(jBBuscarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTFBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jCBReferenciaBusca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAtualizar)
                    .addComponent(jBApagar)
                    .addComponent(jBListaProdutos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        int row = jTListaProdutos.getSelectedRow();
        if(row != -1){
            int idProdutoSelecionado = Integer.parseInt(tableProdutos.getValueAt(row, 0).toString());
            for(Produto produto : listaProdutos){
                if(produto.getId() == idProdutoSelecionado){
                    visualAtualizarProduto.preencherCamposTexto(produto);
                    visualAtualizarProduto.setVisible(true);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado na lista");
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApagarActionPerformed
        int row = jTListaProdutos.getSelectedRow();
        if(row != -1){
            int idProdutoSelecionado = Integer.parseInt(tableProdutos.getValueAt(row, 0).toString());
            for(Produto produto : listaProdutos){
                if(produto.getId() == idProdutoSelecionado){
                    boolean resultadoDeletarProduto = controleProduto.apagarProduto(produto);
                    if(resultadoDeletarProduto){
                        tableProdutos.removeRow(row);
                        JOptionPane.showMessageDialog(null, "Produto deletado");
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro em apagar produto");
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado na lista");
        }
    }//GEN-LAST:event_jBApagarActionPerformed

    private void jBListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListaProdutosActionPerformed
        listaProdutos = controleProduto.selecionarTodosProdutos();
        listarProdutos(listaProdutos);
        
    }//GEN-LAST:event_jBListaProdutosActionPerformed

    private void jBBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarProdutoActionPerformed
        String nomeBuscar = jTFBuscarProduto.getText().toUpperCase();
        String referenciaBusca = jCBReferenciaBusca.getSelectedItem().toString();
        
        if(!referenciaBusca.equals("Selecionar") && nomeBuscar.length()>0){
            listaProdutos = controleProduto.selecionarTodosProdutosPorReferencia(nomeBuscar, referenciaBusca);
            
            if(listaProdutos.size()>0){
                listarProdutos(listaProdutos);
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum produto encontrado com "+nomeBuscar);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo busca ou seleção vázio");
        }
    }//GEN-LAST:event_jBBuscarProdutoActionPerformed
    
    public void listarProdutos(List<Produto> listaProdutos){
        tableProdutos = (DefaultTableModel) jTListaProdutos.getModel();
        tableProdutos.setNumRows(0);
        for(Produto produto : listaProdutos){
            tableProdutos.addRow(new Object[]{produto.getId(), produto.getNome(), produto.getMarca(), 
                produto.getFornecedor().getNome(), produto.getQuantidade(), produto.getCategoria(), 
                produto.getPrecoCompra(), produto.getPrecoVenda()});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBApagar;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBBuscarProduto;
    private javax.swing.JButton jBListaProdutos;
    private javax.swing.JComboBox<String> jCBReferenciaBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscarProduto;
    private javax.swing.JTable jTListaProdutos;
    // End of variables declaration//GEN-END:variables
}
