package visual;

import controle.ControleFuncionario;
import controle.ControleLogin;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.FuncionarioLogado;

public class VisualLogin extends javax.swing.JFrame {
    ControleLogin controleLogin = new ControleLogin();
    ControleFuncionario controleFuncionario = new ControleFuncionario();
    VisualPrincipal visualPrincipal = new VisualPrincipal();
    VisualAtualizarSenhaFuncionario visualAtualizarSenha = new VisualAtualizarSenhaFuncionario();
    FuncionarioLogado funcionarioLogado = new FuncionarioLogado();
    
    public VisualLogin() {
        initComponents();
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jPFSenha = new javax.swing.JPasswordField();
        jBEntrar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLRecuperarSenha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Usuário");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Login de Usuário");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("E-mail : ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Senha : ");

        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLRecuperarSenha.setText("Recuperar senha ...");
        jLRecuperarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLRecuperarSenhaMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/enter.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(1, 1, 1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jPFSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLRecuperarSenha)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEntrar)
                    .addComponent(jBSair)
                    .addComponent(jLRecuperarSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Titulo Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        
        String usuario = jTFUsuario.getText();
        String senha = jPFSenha.getText();
        
        
        if(usuario.equals("") || senha.equals("")){
            JOptionPane.showMessageDialog(null, "Campo senha ou E-mail vázio", "Error",
                        JOptionPane.YES_NO_OPTION);
        }else{
            boolean validarUsuario = controleLogin.verificarLoginFuncionario(usuario, senha);
            if(validarUsuario){
                funcionarioLogado = controleFuncionario.selecionarFuncionarioPorEmail(usuario);
                
                if(funcionarioLogado.getRecuperacaoSenha() == 1){
                    JOptionPane.showMessageDialog(null,"Foi detectado uma solicitação de alteração de senha.\n"
                            + "Crei sua nova senha agora.");
                    visualAtualizarSenha.obterObjetoFuncionarioLogado(funcionarioLogado);
                    visualAtualizarSenha.setVisible(true);
                }else{
                    visualPrincipal.obterObjetoFuncionarioLogado(funcionarioLogado);
                    visualPrincipal.setVisible(true);
                    dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "E-mail ou senha incorreto", "Error",
                        JOptionPane.YES_NO_OPTION);
                jPFSenha.setText("");
            }
        }
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jLRecuperarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLRecuperarSenhaMouseClicked
        VisualRecuperarSenha visualRecuperar = new VisualRecuperarSenha();
        visualRecuperar.setVisible(true);
    }//GEN-LAST:event_jLRecuperarSenhaMouseClicked

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLRecuperarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables

}
