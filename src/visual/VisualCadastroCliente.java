package visual;

import controle.ControleCliente;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Funcionario;
import util.BuscarCep;
import util.ValidarCNPJ;
import util.ValidarCPF;
import util.ValidarEmail;

public class VisualCadastroCliente extends javax.swing.JDialog {
    ControleCliente controleCliente = new ControleCliente();
    Cliente cliente = new Cliente();
    Endereco end = new Endereco();

    VisualCadastroCliente() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFNumeroRegistro = new javax.swing.JTextField();
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
        jLabel14 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBCadastar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jFTFTelefone = new javax.swing.JFormattedTextField();
        jTFBairro = new javax.swing.JTextField();
        jTFComplemento = new javax.swing.JTextField();
        jBBuscarCep = new javax.swing.JButton();
        jCBTipoPessoa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastar");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Nome / Razão social : ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Pessoa : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("CPF / CNPJ : ");

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

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setText("E-mail : ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Telefone : ");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/people.png"))); // NOI18N

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

        jCBTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Fisíca", "Jurídica" }));

        jLabel4.setText("*Preencha todos os campos.");

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFEstado))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBBuscarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFRua))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFNumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFNResidencial))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(1, 1, 1)
                                        .addComponent(jTFBairro))
                                    .addComponent(jFTFTelefone)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBTipoPessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(144, 144, 144)
                                .addComponent(jBCadastar)
                                .addGap(18, 18, 18)
                                .addComponent(jBCancelar)))
                        .addGap(23, 23, 23))))
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
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jCBTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFNumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBCadastar)
                        .addComponent(jBCancelar))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastarActionPerformed

        if(validarCamposTextos()){
            if(validarCamposNumericos()){
                boolean verificarEmail = ValidarEmail.verificar(jTFEmail.getText());
                if(verificarEmail){
                    String resultadoValidarNumeroRegistro = validarNumeroRegistro();
                    if(resultadoValidarNumeroRegistro.equals("")){
                        boolean resultadoCadastro =  controleCliente.cadastrarCliente(formarObjetoCliente());
                        if(resultadoCadastro){
                            JOptionPane.showMessageDialog(null, "Cadastro do cliente "+jTFNome.getText()+" realizado com sucesso");
                            limparCamposTexto();
                        }else{
                            JOptionPane.showMessageDialog(null, "Erro no cadastro");
                        }
                    }else{
                       JOptionPane.showMessageDialog(null, resultadoValidarNumeroRegistro); 
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
    }//GEN-LAST:event_jBCadastarActionPerformed

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
        if(jTFNumeroRegistro.getText().length()!=0){
            String[] campos = {jTFNumeroRegistro.getText()};
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
            || jTFCidade.getText().length()<=0 || jTFNome.getText().length()<=0 || jTFRua.getText().length()<=0 || 
            jTFCep.getText().length()<=0 || jTFEmail.getText().length()<=0 || jTFComplemento.getText().length()<=0 
            || jCBTipoPessoa.getSelectedItem().equals("Selecionar") || jFTFTelefone.getText().equals("(  )     -    ")){
            return false;
        }else{
            return true;
        }
    }
    
    public String validarNumeroRegistro(){
        if(jCBTipoPessoa.getSelectedItem().equals("Fisíca")){
            boolean resultaValidacaoCPF = ValidarCPF.verificar(jTFNumeroRegistro.getText());
            if(resultaValidacaoCPF){
                return "";
            }else{
                return "CPF inválido";
            }
        }else{
            boolean resultaValidacaoCNPJ = ValidarCNPJ.verificar(jTFNumeroRegistro.getText());
            if(resultaValidacaoCNPJ){
                return "";
            }else{
                return "CNPJ inválido"; 
            }    
        }
    }
    
    public void limparCamposTexto(){
        jTFBairro.setText("");
        jTFCep.setText("");
        jTFCidade.setText("");
        jTFComplemento.setText("");
        jTFEmail.setText("");
        jTFEstado.setText("");
        jTFNResidencial.setText("");
        jTFNome.setText("");
        jTFNumeroRegistro.setText("");
        jTFRua.setText("");
        jFTFTelefone.setText("");
    }
    
    public Cliente formarObjetoCliente(){
        
        end.setRua(jTFRua.getText());
        end.setCep(jTFCep.getText());
        end.setBairro(jTFBairro.getText());
        end.setCidade(jTFCidade.getText());
        end.setEstado(jTFEstado.getText());
        end.setNumero(jTFNResidencial.getText());
        end.setComplemento(jTFComplemento.getText());
        
        cliente.setTelefone(jFTFTelefone.getText());
        cliente.setNumeroRegistro(jTFNumeroRegistro.getText());
        cliente.setTipoPessoa(jCBTipoPessoa.getSelectedItem().toString());
        cliente.setEmail(jTFEmail.getText());
        cliente.setNome(jTFNome.getText().toUpperCase());
        cliente.setEndereco(end);
         
        return cliente;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarCep;
    private javax.swing.JButton jBCadastar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox<String> jCBTipoPessoa;
    private javax.swing.JFormattedTextField jFTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField jTFCep;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFNResidencial;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNumeroRegistro;
    private javax.swing.JTextField jTFRua;
    // End of variables declaration//GEN-END:variables

}
