package visual;

import controle.ControleFornecedor;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Endereco;
import modelo.Fornecedor;
import util.BuscarCep;
import util.ValidarCNPJ;
import util.ValidarEmail;

public class VisualAtualizaCadastroFornecedor extends javax.swing.JDialog {
    ControleFornecedor controleFornecedor = new ControleFornecedor();
    Fornecedor forn = new Fornecedor();
    Endereco end = new Endereco();

    VisualAtualizaCadastroFornecedor() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFRazaoSocial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFCNPJ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFCep = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFEstado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFNResidencial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBAtualizar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jFTFTelefone = new javax.swing.JFormattedTextField();
        jTFBairro = new javax.swing.JTextField();
        jTFComplemento = new javax.swing.JTextField();
        jBBuscarCep = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastar");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Atualizar cadastro de Fornecedor");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Razão social : ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("CNPJ :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Email : ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("CEP : ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Rua : ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Complemento de endereço: ");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Nº residencial : ");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Bairro : ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("Estado :");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel12.setText("Cidade: ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Telefone : ");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Management50.png"))); // NOI18N

        jBAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
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

        try {
            jFTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBBuscarCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscarCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search20.png"))); // NOI18N
        jBBuscarCep.setToolTipText("Buscar CEP");
        jBBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarCepActionPerformed(evt);
            }
        });

        jLabel4.setText("* Preencha todos os campos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFRazaoSocial)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBBuscarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFRua)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFNResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFCNPJ))
                            .addComponent(jFTFTelefone)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFComplemento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jBCancelar)))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15)
                    .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jTFRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBBuscarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTFNResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBAtualizar)
                        .addComponent(jBCancelar))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed

        if(validarCamposTextos()){
            if(validarCamposNumericos()){
                boolean verificarEmail = ValidarEmail.verificar(jTFEmail.getText());
                if(verificarEmail){
                    boolean resultadoValidarCNPJ = ValidarCNPJ.verificar(jTFCNPJ.getText());
                    if(resultadoValidarCNPJ){
                        forn = formarObjetoFornecedor();
                        boolean resultadoAtualizadoFornecedor = controleFornecedor.atualizarFornecedor(forn);
                        if(resultadoAtualizadoFornecedor){
                            JOptionPane.showMessageDialog(null, "Fornecedor "+jTFRazaoSocial.getText()+" cadastro atualizado");
                            limparCamposTexto();
                        }else{
                            JOptionPane.showMessageDialog(null, "Erro ao salvar fornecedor");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "CNPJ inválido");
                    } 
                }else{
                    JOptionPane.showMessageDialog(null, "Email inválido");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Alguns campo(s) númerico(s) inválido");
            }   
        }else{
            JOptionPane.showMessageDialog(null, "Alguns campo(s) texto(s) falta(m) conteúdo");
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarCepActionPerformed
        if(jTFCep.getText().length() == 8){
            jTFRua.setText("");
            jTFNResidencial.setText("");
            jTFBairro.setText("");
            jTFCidade.setText("");
            jTFEstado.setText("");
            try {
                String rua = BuscarCep.getEndereco(jTFCep.getText());
                String bairro = BuscarCep.getBairro(jTFCep.getText());
                String cidade = BuscarCep.getCidade(jTFCep.getText());
                String estado = BuscarCep.getUF(jTFCep.getText());
                
                if(jTFCep.getText().equals(rua)){
                    JOptionPane.showMessageDialog(null, "CEP não é válido");
                }else{
                    jTFRua.setText(rua);
                    jTFBairro.setText(bairro);
                    jTFCidade.setText(cidade);
                    jTFEstado.setText(estado);
                }
            } catch (IOException ex) {};
        }else{
            JOptionPane.showMessageDialog(null, "CEP não é válido");
        }
    }//GEN-LAST:event_jBBuscarCepActionPerformed
    
    public boolean validarCamposNumericos(){
        if(jTFCNPJ.getText().length()!=0){
            String[] campos = {jTFCNPJ.getText()};
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
    
    public boolean validarCamposTextos(){
        if(jTFBairro.getText().length()<=0 || jTFNResidencial.getText().length()<=0 || jTFEstado.getText().length()<=0 
            || jTFCidade.getText().length()<=0 || jTFRazaoSocial.getText().length()<=0 || jTFRua.getText().length()<=0 || 
            jTFCep.getText().length()<=0 || jTFEmail.getText().length()<=0 || jTFComplemento.getText().length()<=0 
            || jTFCNPJ.getText().length()<=0 || jFTFTelefone.getText().equals("(  )     -    ")){
            return false;
        }else{
            return true;
        }
    }
    
    public void preencharCampos(Fornecedor fornecedor){
        end.setId(fornecedor.getEndereco().getId());
        jTFBairro.setText(fornecedor.getEndereco().getBairro());
        jTFCep.setText(fornecedor.getEndereco().getCep());
        jTFCidade.setText(fornecedor.getEndereco().getCidade());
        jTFComplemento.setText(fornecedor.getEndereco().getComplemento());
        jTFEstado.setText(fornecedor.getEndereco().getEstado());
        jTFNResidencial.setText(fornecedor.getEndereco().getNumero());
        jTFRua.setText(fornecedor.getEndereco().getRua());
        
        forn.setId(fornecedor.getId());
        jTFCNPJ.setText(fornecedor.getCnpj());
        jTFEmail.setText(fornecedor.getEmail());
        jTFRazaoSocial.setText(fornecedor.getNome());
        jFTFTelefone.setText(fornecedor.getTelefone());
    }
    
    public void limparCamposTexto(){
        jTFBairro.setText("");
        jTFCep.setText("");
        jTFCidade.setText("");
        jTFComplemento.setText("");
        jTFEmail.setText("");
        jTFEstado.setText("");
        jTFNResidencial.setText("");
        jTFRazaoSocial.setText("");
        jTFCNPJ.setText("");
        jTFRua.setText("");
        jFTFTelefone.setText("");
    }
    
    public Fornecedor formarObjetoFornecedor(){
        
        end.setRua(jTFRua.getText());
        end.setCep(jTFCep.getText());
        end.setBairro(jTFBairro.getText());
        end.setCidade(jTFCidade.getText());
        end.setEstado(jTFEstado.getText());
        end.setNumero(jTFNResidencial.getText());
        end.setComplemento(jTFComplemento.getText());
        
        forn.setTelefone(jFTFTelefone.getText());
        forn.setCnpj(jTFCNPJ.getText());
        forn.setEmail(jTFEmail.getText());
        forn.setNome(jTFRazaoSocial.getText().toUpperCase());
        forn.setEndereco(end);
         
        return forn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBBuscarCep;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JFormattedTextField jFTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCNPJ;
    private javax.swing.JTextField jTFCep;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFNResidencial;
    private javax.swing.JTextField jTFRazaoSocial;
    private javax.swing.JTextField jTFRua;
    // End of variables declaration//GEN-END:variables

}
