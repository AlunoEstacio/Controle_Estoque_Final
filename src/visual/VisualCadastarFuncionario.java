package visual;

import controle.ControleFuncionario;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Endereco;
import modelo.Funcionario;
import util.BuscarCep;
import util.ValidarCPF;
import util.ValidarData;
import util.ValidarEmail;

public class VisualCadastarFuncionario extends javax.swing.JDialog {
    ControleFuncionario controleFuncionario = new ControleFuncionario();
    Funcionario func = new Funcionario();
    Endereco end = new Endereco();

    VisualCadastarFuncionario() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNomeCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFRg = new javax.swing.JTextField();
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
        jLabel13 = new javax.swing.JLabel();
        jTFCargo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTFSenha = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jBCadastar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jFTFDNascimento = new javax.swing.JFormattedTextField();
        jFTFTelefone = new javax.swing.JFormattedTextField();
        jTFBairro = new javax.swing.JTextField();
        jTFComplemento = new javax.swing.JTextField();
        jBBuscarCep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastar");
        setPreferredSize(new java.awt.Dimension(600, 350));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Funcionário");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Nome Completo : ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("CPF : ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Data Nascimento:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("RG : ");

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

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel13.setText("Cargo : ");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setText("E-mail : ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Telefone : ");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Senha :");

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
            jFTFDNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFTelefone))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(16, 16, 16)
                                .addComponent(jTFSenha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jBCadastar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBCancelar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFEstado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscarCep, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFRua, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFTFDNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(1, 1, 1)
                                .addComponent(jTFBairro))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFCpf)
                                    .addComponent(jTFRg)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNResidencial))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jTFNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFDNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel13)
                    .addComponent(jTFCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastar)
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastarActionPerformed
        boolean verificarDataNascimento = false;
        if(jFTFDNascimento.getText().equals("  /  /    ")){
            verificarDataNascimento = false;
        }else{
            verificarDataNascimento = ValidarData.verificar(jFTFDNascimento.getText());
        }
        
        if(validarCamposTextos()){
            if(validarCamposNumericos()){
                boolean verificarEmail = ValidarEmail.verificar(jTFEmail.getText());
                if(verificarEmail){
                    if(verificarDataNascimento){
                        if(ValidarCPF.verificar(jTFCpf.getText())){
                            func = formarObjetoFuncionario();
                            String resultadoCadastro = controleFuncionario.cadastrarFuncionario(func);
                            if(resultadoCadastro.equals("")){
                                JOptionPane.showMessageDialog(null, "Cadastro de funcionário(a) "+jTFNomeCompleto.getText()+
                                        " realizado com sucesso");
                                jTFBairro.setText("");
                                jTFCargo.setText("");
                                jTFCep.setText("");
                                jTFCidade.setText("");
                                jTFComplemento.setText("");
                                jTFCpf.setText("");
                                jTFEmail.setText("");
                                jTFEstado.setText("");
                                jTFNResidencial.setText("");
                                jTFNomeCompleto.setText("");
                                jTFRg.setText("");
                                jTFRua.setText("");
                                jTFSenha.setText("");
                                jFTFDNascimento.setText("");
                                jFTFTelefone.setText("");
                            }else{
                                JOptionPane.showMessageDialog(null,"ERROR : "+resultadoCadastro);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "CPF inválida");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Data de nascimento inválida");
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
        if(jTFCpf.getText().length()!=0 || jTFRg.getText().length()!=0){
            String[] campos = {jTFCpf.getText(), jTFRg.getText()};
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
        if(jTFBairro.getText().length()<=0 || jTFCargo.getText().length()<=0 || jTFNResidencial.getText().length()<=0 || 
                jTFEstado.getText().length()<=0 || jTFCidade.getText().length()<=0 || jTFNomeCompleto.getText().length()<=0 
                || jTFRua.getText().length()<=0 || jTFSenha.getText().length()<=0 || jTFCep.getText().length()<=0 ||
                jTFEmail.getText().length()<=0 || jTFComplemento.getText().length()<=0 || jTFRg.getText().length()<=0 ||
                jFTFTelefone.getText().equals("(  )     -    ")){
            return false;
        }else{
            return true;
        }
    }
    public Funcionario formarObjetoFuncionario(){
        String data = ValidarData.ConverterData(jFTFDNascimento.getText());
        
        end.setRua(jTFRua.getText());
        end.setCep(jTFCep.getText());
        end.setBairro(jTFBairro.getText());
        end.setCidade(jTFCidade.getText());
        end.setEstado(jTFEstado.getText());
        end.setNumero(jTFNResidencial.getText());
        end.setComplemento(jTFComplemento.getText());
        
        func.setId(0);
        func.setData_nascimento(data);
        func.setTelefone(jFTFTelefone.getText());
        func.setCargo(jTFCargo.getText().toUpperCase());
        func.setCpf(Long.parseLong(jTFCpf.getText()));
        func.setEmail(jTFEmail.getText());
        func.setNome(jTFNomeCompleto.getText().toUpperCase());
        func.setRg(Long.parseLong(jTFRg.getText()));
        func.setSenha(jTFSenha.getText());
        func.setEndereco(end);
         
        return func;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarCep;
    private javax.swing.JButton jBCadastar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JFormattedTextField jFTFDNascimento;
    private javax.swing.JFormattedTextField jFTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTextField jTFCargo;
    private javax.swing.JTextField jTFCep;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFCpf;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFNResidencial;
    private javax.swing.JTextField jTFNomeCompleto;
    private javax.swing.JTextField jTFRg;
    private javax.swing.JTextField jTFRua;
    private javax.swing.JTextField jTFSenha;
    // End of variables declaration//GEN-END:variables

}
