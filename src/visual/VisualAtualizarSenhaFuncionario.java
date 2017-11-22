package visual;

import controle.ControleLogin;
import javax.swing.JOptionPane;
import modelo.FuncionarioLogado;

public class VisualAtualizarSenhaFuncionario extends javax.swing.JDialog {
    
    FuncionarioLogado funcionarioLogado = new FuncionarioLogado();
    ControleLogin controleLogin = new ControleLogin();

    public VisualAtualizarSenhaFuncionario() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void obterObjetoFuncionarioLogado(FuncionarioLogado funcLogado){
        funcionarioLogado = funcLogado;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBAtualizar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jPFSenhaAtual = new javax.swing.JPasswordField();
        jPFNovaSenha = new javax.swing.JPasswordField();
        jPFConfirmarSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Senha");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Atualizar senha de login");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-User Credentials-50.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Senha atual : ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Nova senha : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Confirmar nova senha : ");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jPFNovaSenha))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBAtualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPFSenhaAtual))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPFConfirmarSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jPFSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPFNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPFConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAtualizar)
                    .addComponent(jBCancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        String senhaAtual = jPFSenhaAtual.getText();
        String novaSenha = jPFNovaSenha.getText();
        String confirmarSenha = jPFConfirmarSenha.getText();
        
        boolean confirmarNovaSenha = verificarConfirmarNovaSenha(novaSenha, confirmarSenha);
        
        if(confirmarNovaSenha){
            String resultadoAtualizacao = controleLogin.atulizarSenhaFuncionario(funcionarioLogado.getEmail(), 
                    senhaAtual, novaSenha);
            if(resultadoAtualizacao.equals("")){
                JOptionPane.showMessageDialog(null, "Senha Atualizada\nSeu próximo login deve ser "
                        + "com a nova senha", "Atualizar Senha",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }else if(resultadoAtualizacao.equals("incompativel")){
                JOptionPane.showMessageDialog(null, "Erro : Senha atual digitada não confere com a senha\n"
                    + "do seu login atual", "Atualizar Senha",JOptionPane.YES_NO_OPTION);
            }else{
                JOptionPane.showMessageDialog(null, "Erro : na conexão de atualizar senha", 
                        "Atualizar Senha",JOptionPane.YES_NO_OPTION);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Erro : nova senha digitada não confere com a senha\n"
                    + "do confirmar senha", "Atualizar Senha",JOptionPane.YES_NO_OPTION);
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed
    
    private boolean verificarConfirmarNovaSenha(String novaSenha, String confirmarSenha){
        if(novaSenha.equals(confirmarSenha)){
            return true;
        }else{
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPFConfirmarSenha;
    private javax.swing.JPasswordField jPFNovaSenha;
    private javax.swing.JPasswordField jPFSenhaAtual;
    // End of variables declaration//GEN-END:variables
}
