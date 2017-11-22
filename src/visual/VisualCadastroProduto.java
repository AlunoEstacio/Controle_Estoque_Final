package visual;

import controle.ControleFornecedor;
import controle.ControleProduto;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Fornecedor;
import modelo.Produto;

public class VisualCadastroProduto extends javax.swing.JDialog {
    ControleProduto controleProduto = new ControleProduto();
    ControleFornecedor controleFornecedor = new ControleFornecedor();
    Produto produto = new Produto();
    Fornecedor fornecedor = new Fornecedor();
    List<Fornecedor> listaFornecedores;
    

    VisualCadastroProduto() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
        preencherCampoSelecaoFornecedor();
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBCadastar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCBFornecedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTFMarca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFLocalizacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCBCategoria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTFObeservacao = new javax.swing.JTextField();
        jTFPrecoCompra = new javax.swing.JTextField();
        jTFPrecoVenda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Produto");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Nome : ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Quantidade : ");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Product50.png"))); // NOI18N

        jBCadastar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBCadastar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        jBCadastar.setText("Cadastrar");
        jBCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastarActionPerformed(evt);
            }
        });

        jBCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("*Preencha todos os campos.");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Fornecedor : ");

        jCBFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar fornecedor" }));
        jCBFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFornecedorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Marca : ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Localização : ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Categoria : ");

        jCBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar categoria", "Alimento", "Bebida", "Material de limpeza", "Papelaria", "Eletrodomésticos", "Eletronico", "Cosméticos", "Importado", "Outro" }));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Preço de compra : ");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Preço de venda : ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("Observação sobre produto : ");

        jLabel12.setText("*SEPARE o valor de centavos do real por virgula.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFObeservacao))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFLocalizacao))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFMarca)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFQuantidade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPrecoVenda))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addGap(141, 141, 141))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jBCadastar)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBFornecedor)
                            .addComponent(jLabel6)
                            .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jCBCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jTFPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFPrecoCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTFObeservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCadastar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastarActionPerformed
        if(validarCamposTextos()){
            if(validarCamposPrecos() && validarCampoQuantidade()){
                boolean resultadoCadastro =  controleProduto.cadastrarProduto(formarObjetoProduto());
                if(resultadoCadastro){
                    JOptionPane.showMessageDialog(null, "Cadastro do produto "+jTFNome.getText()+" realizado com sucesso");
                    limparCamposTexto();
                }else{
                    JOptionPane.showMessageDialog(null, "Erro no cadastro");
                }
            }else{
                JOptionPane.showMessageDialog(null, "ERRO no campo preço ou quantidade");
            }   
        }else{
            JOptionPane.showMessageDialog(null, "Alguns campo(s) texto(s) falta(m) conteúdo");
        }
        
    }//GEN-LAST:event_jBCadastarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jCBFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFornecedorActionPerformed
        
    }//GEN-LAST:event_jCBFornecedorActionPerformed
    
    public boolean validarCamposPrecos(){
        String precoCompra = jTFPrecoCompra.getText();
        String precoVenda = jTFPrecoVenda.getText();
        
        precoCompra = precoCompra.replace(",", "").replace(".", "");
        precoVenda = precoVenda.replace(",", "").replace(".", "");
            
        if(precoCompra.length()!=0 || precoVenda.length()!=0){
            String[] campos = {precoCompra, precoVenda};
            boolean resultadoValidacao = validarCamposNumericos(campos);
            if(resultadoValidacao){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public boolean validarCampoQuantidade(){
        String quantidade = jTFQuantidade.getText();
        if(quantidade.length() > 0 && !quantidade.equals("0")){
            String[] campo = {quantidade};
            boolean resultadoValidacao = validarCamposNumericos(campo);
            if(resultadoValidacao){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public boolean validarCamposNumericos(String[] numero){
        for(String text : numero){
                for (int i = 0; i < text.length(); i++) {
                    char ch = text.charAt(i);
                    if (ch < 48 || ch > 57)
                        return false;
                }
            }
            return true;
    }
    
    public boolean validarCamposTextos(){
        if(jTFLocalizacao.getText().length()<=0 || jTFMarca.getText().length()<=0 || jTFNome.getText().length()<=0 
            || jTFObeservacao.getText().length()<=0 || jTFPrecoCompra.getText().length()<=0 || jTFPrecoVenda.getText().length()<=0 || 
            jTFQuantidade.getText().length()<=0 || jCBCategoria.getSelectedItem().equals("Selecionar categoria") ||
            jCBFornecedor.getSelectedItem().equals("Selecionar fornecedor")){
            return false;
        }else{
            return true;
        }
    }
    
    public void preencherCampoSelecaoFornecedor(){
        listaFornecedores = controleFornecedor.selecionarTodosFornecedores();
        
        for(Fornecedor forn : listaFornecedores){
            jCBFornecedor.addItem(forn.getId()+" "+forn.getNome());
        }
    }
    
    public void limparCamposTexto(){
        jTFLocalizacao.setText("");
        jTFMarca.setText("");
        jTFNome.setText("");
        jTFObeservacao.setText("");
        jTFPrecoCompra.setText("");
        jTFPrecoVenda.setText("");
        jTFQuantidade.setText("");
        jCBCategoria.setSelectedIndex(0);
        jCBFornecedor.setSelectedIndex(0);
    }
    
    public Fornecedor retornarObjetoFornecedor(){
        listaFornecedores = controleFornecedor.selecionarTodosFornecedores();
        int itemSelecionado = jCBFornecedor.getSelectedIndex();
        fornecedor = listaFornecedores.get(itemSelecionado-1);
        return fornecedor;
    }
    
    public BigDecimal formatarCampoPreco(String preco){
        String precoFormatado = preco.replace(".", "").replace(",", ".");
        BigDecimal precoDecimal = new BigDecimal(precoFormatado);
        return precoDecimal;
    } 
    
    public Produto formarObjetoProduto(){
        fornecedor =  retornarObjetoFornecedor();
        BigDecimal precoVenda = formatarCampoPreco(jTFPrecoVenda.getText());
        BigDecimal precoCompra = formatarCampoPreco(jTFPrecoCompra.getText());
        
        produto.setNome(jTFNome.getText());
        produto.setMarca(jTFMarca.getText());
        produto.setObservacao(jTFObeservacao.getText());
        produto.setQuantidade(Integer.parseInt(jTFQuantidade.getText()));
        produto.setLocalizacao(jTFLocalizacao.getText());
        produto.setCategoria(jCBCategoria.getSelectedItem().toString());
        produto.setPrecoVenda(precoVenda);
        produto.setPrecoCompra(precoCompra);
        produto.setFornecedor(fornecedor);
        
        return produto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox<String> jCBCategoria;
    private javax.swing.JComboBox<String> jCBFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTFLocalizacao;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFObeservacao;
    private javax.swing.JTextField jTFPrecoCompra;
    private javax.swing.JTextField jTFPrecoVenda;
    private javax.swing.JTextField jTFQuantidade;
    // End of variables declaration//GEN-END:variables

}
