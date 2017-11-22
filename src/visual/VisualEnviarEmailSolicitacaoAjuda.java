package visual;


import javax.swing.JOptionPane;
import org.apache.commons.mail.EmailException;
import util.EnviarEmail;
import util.EnviarEmailSolicitacaoAjuda;
import util.ValidarEmail;

public class VisualEnviarEmailSolicitacaoAjuda extends javax.swing.JDialog {

    public VisualEnviarEmailSolicitacaoAjuda() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        jTAMensagem.setLineWrap(true);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jTFAssunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAMensagem = new javax.swing.JTextArea();
        jBCancelar = new javax.swing.JButton();
        jBEnviarEmail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitar Ajudar ");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Solicitar ajuda");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Help50.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Nome : ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Email : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Assunto : ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Mensagem : ");

        jTAMensagem.setColumns(20);
        jTAMensagem.setRows(5);
        jScrollPane1.setViewportView(jTAMensagem);

        jBCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBEnviarEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBEnviarEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/SendEmail20.png"))); // NOI18N
        jBEnviarEmail.setText("Enviar");
        jBEnviarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBEnviarEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jTFAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBEnviarEmail))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBEnviarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarEmailActionPerformed
        String remetente = jTFEmail.getText();
        String titulo = jTFAssunto.getText();
        String mensagem = jTFNome.getText()+"--"+jTAMensagem.getText();
        
        if(validarCamposTexto()){
            if(validarEmail(remetente)){
                enviarEmail(remetente,titulo,mensagem);
            }else{
                JOptionPane.showMessageDialog(null, "Email digitado não é válido", "Erro",
                        JOptionPane.YES_NO_OPTION);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Algum campo de texto vázio", "Erro",JOptionPane.YES_NO_OPTION);
        }
        
    }//GEN-LAST:event_jBEnviarEmailActionPerformed
    
    private void enviarEmail(String remetende, String titulo, String mensagem){
        try {
            EnviarEmailSolicitacaoAjuda.send(remetende, titulo, mensagem);
            JOptionPane.showMessageDialog(null, "Email enviado com sucesso","Envio de E-mail",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (EmailException ex) {
            JOptionPane.showMessageDialog(null, "Erro no envio do email", "Envio de E-mail",JOptionPane.YES_NO_OPTION);
        }
    }
    
    private boolean validarEmail(String email){
        boolean resultadoValidacao = ValidarEmail.verificar(email);
        if(resultadoValidacao){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean validarCamposTexto(){
        if(jTFAssunto.getText().length()<=0 || jTFNome.getText().length()<=0 || jTFEmail.getText().length()<=0 || 
                jTAMensagem.getText().length()<=0 ){
            return false;
        }else{
            return true;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEnviarEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAMensagem;
    private javax.swing.JTextField jTFAssunto;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNome;
    // End of variables declaration//GEN-END:variables
}
