package visual;

import controle.ControleFuncionario;
import javax.swing.JOptionPane;
import modelo.Funcionario;
import modelo.FuncionarioLogado;

public class VisualPrincipal extends javax.swing.JFrame {
    VisualVisualizarFuncionario visulizarListaFuncionario = new VisualVisualizarFuncionario();
    FuncionarioLogado funcionarioLogado = new FuncionarioLogado();
    ControleFuncionario controleFuncionario = new ControleFuncionario();
    Funcionario funcionario = new Funcionario();

    public VisualPrincipal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    public void obterObjetoFuncionarioLogado(FuncionarioLogado funcLogado){
        funcionarioLogado = funcLogado;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMInicio = new javax.swing.JMenu();
        jMIInicioMinhasInfor = new javax.swing.JMenuItem();
        jMIAlterarSenha = new javax.swing.JMenuItem();
        jMISair = new javax.swing.JMenuItem();
        jMFuncionario = new javax.swing.JMenu();
        jMICadastrarFuncionario = new javax.swing.JMenuItem();
        jMIVisualizarFuncionario = new javax.swing.JMenuItem();
        jMCliente = new javax.swing.JMenu();
        jMClienteCadastrar = new javax.swing.JMenuItem();
        jMIClienteVisualizar = new javax.swing.JMenuItem();
        jMFornecedor = new javax.swing.JMenu();
        jMICadastrarFornecedor = new javax.swing.JMenuItem();
        jMIVisualizarFornecedor = new javax.swing.JMenuItem();
        jMProduto = new javax.swing.JMenu();
        jMIProdutoCadastrar = new javax.swing.JMenuItem();
        jMIVisualizarProduto = new javax.swing.JMenuItem();
        jMFuncionario3 = new javax.swing.JMenu();
        jMFuncionario4 = new javax.swing.JMenu();
        jMISolicitarPedidoCompra = new javax.swing.JMenuItem();
        jMISolicitarPedidoVenda = new javax.swing.JMenuItem();
        jMFuncionario5 = new javax.swing.JMenu();
        jMIVisualizarPedidoCompra = new javax.swing.JMenuItem();
        jMIVisualizarPedidoVenda = new javax.swing.JMenuItem();
        jMFuncionario1 = new javax.swing.JMenu();
        jMIGeraRelatorio = new javax.swing.JMenuItem();
        jMFuncionario2 = new javax.swing.JMenu();
        jMISolicitarAjuda = new javax.swing.JMenuItem();
        jMISobre = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque");
        setPreferredSize(new java.awt.Dimension(1036, 614));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal.jpg"))); // NOI18N

        jMInicio.setText("Início");

        jMIInicioMinhasInfor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-Survey-20.png"))); // NOI18N
        jMIInicioMinhasInfor.setText("Minhas informações");
        jMIInicioMinhasInfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIInicioMinhasInforActionPerformed(evt);
            }
        });
        jMInicio.add(jMIInicioMinhasInfor);

        jMIAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-User Credentials-20.png"))); // NOI18N
        jMIAlterarSenha.setText("Alterar senha");
        jMIAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlterarSenhaActionPerformed(evt);
            }
        });
        jMInicio.add(jMIAlterarSenha);

        jMISair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit20.png"))); // NOI18N
        jMISair.setText("Sair");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMInicio.add(jMISair);

        jMenuBar1.add(jMInicio);

        jMFuncionario.setText("Funcionário");

        jMICadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        jMICadastrarFuncionario.setText("Cadastrar");
        jMICadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMFuncionario.add(jMICadastrarFuncionario);

        jMIVisualizarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/show.png"))); // NOI18N
        jMIVisualizarFuncionario.setText("Visualizar");
        jMIVisualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarFuncionarioActionPerformed(evt);
            }
        });
        jMFuncionario.add(jMIVisualizarFuncionario);

        jMenuBar1.add(jMFuncionario);

        jMCliente.setText("Cliente");

        jMClienteCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        jMClienteCadastrar.setText("Cadastrar");
        jMClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClienteCadastrarActionPerformed(evt);
            }
        });
        jMCliente.add(jMClienteCadastrar);

        jMIClienteVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/show.png"))); // NOI18N
        jMIClienteVisualizar.setText("Visualizar");
        jMIClienteVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClienteVisualizarActionPerformed(evt);
            }
        });
        jMCliente.add(jMIClienteVisualizar);

        jMenuBar1.add(jMCliente);

        jMFornecedor.setText("Fornecedor");

        jMICadastrarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        jMICadastrarFornecedor.setText("Cadastrar");
        jMICadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarFornecedorActionPerformed(evt);
            }
        });
        jMFornecedor.add(jMICadastrarFornecedor);

        jMIVisualizarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/show.png"))); // NOI18N
        jMIVisualizarFornecedor.setText("Visualizar");
        jMIVisualizarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarFornecedorActionPerformed(evt);
            }
        });
        jMFornecedor.add(jMIVisualizarFornecedor);

        jMenuBar1.add(jMFornecedor);

        jMProduto.setText("Produto");

        jMIProdutoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        jMIProdutoCadastrar.setText("Cadastrar");
        jMIProdutoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIProdutoCadastrarActionPerformed(evt);
            }
        });
        jMProduto.add(jMIProdutoCadastrar);

        jMIVisualizarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/show.png"))); // NOI18N
        jMIVisualizarProduto.setText("Visualizar");
        jMIVisualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarProdutoActionPerformed(evt);
            }
        });
        jMProduto.add(jMIVisualizarProduto);

        jMenuBar1.add(jMProduto);

        jMFuncionario3.setText("Pedido");

        jMFuncionario4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cart20.png"))); // NOI18N
        jMFuncionario4.setText("Solicitar");

        jMISolicitarPedidoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buy20.png"))); // NOI18N
        jMISolicitarPedidoCompra.setText("Pedido de compra");
        jMISolicitarPedidoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISolicitarPedidoCompraActionPerformed(evt);
            }
        });
        jMFuncionario4.add(jMISolicitarPedidoCompra);

        jMISolicitarPedidoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Purchase20.png"))); // NOI18N
        jMISolicitarPedidoVenda.setText("Pedido de venda");
        jMISolicitarPedidoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISolicitarPedidoVendaActionPerformed(evt);
            }
        });
        jMFuncionario4.add(jMISolicitarPedidoVenda);

        jMFuncionario3.add(jMFuncionario4);

        jMFuncionario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/show.png"))); // NOI18N
        jMFuncionario5.setText("Visualizar");

        jMIVisualizarPedidoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Buy20.png"))); // NOI18N
        jMIVisualizarPedidoCompra.setText("Pedido de compra");
        jMIVisualizarPedidoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarPedidoCompraActionPerformed(evt);
            }
        });
        jMFuncionario5.add(jMIVisualizarPedidoCompra);

        jMIVisualizarPedidoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Purchase20.png"))); // NOI18N
        jMIVisualizarPedidoVenda.setText("Pedido de venda");
        jMIVisualizarPedidoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisualizarPedidoVendaActionPerformed(evt);
            }
        });
        jMFuncionario5.add(jMIVisualizarPedidoVenda);

        jMFuncionario3.add(jMFuncionario5);

        jMenuBar1.add(jMFuncionario3);

        jMFuncionario1.setText("Relatório");

        jMIGeraRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report20.png"))); // NOI18N
        jMIGeraRelatorio.setText("Gerar");
        jMIGeraRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGeraRelatorioActionPerformed(evt);
            }
        });
        jMFuncionario1.add(jMIGeraRelatorio);

        jMenuBar1.add(jMFuncionario1);

        jMFuncionario2.setText("Ajuda");

        jMISolicitarAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/help.png"))); // NOI18N
        jMISolicitarAjuda.setText("Solicitar ajuda");
        jMISolicitarAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISolicitarAjudaActionPerformed(evt);
            }
        });
        jMFuncionario2.add(jMISolicitarAjuda);

        jMISobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/about.png"))); // NOI18N
        jMISobre.setText("Sobre");
        jMISobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISobreActionPerformed(evt);
            }
        });
        jMFuncionario2.add(jMISobre);

        jMenuBar1.add(jMFuncionario2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(681, 681, 681)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(579, 579, 579))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMClienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClienteCadastrarActionPerformed
        VisualCadastroCliente visualCadastrarCliente = new VisualCadastroCliente();
        visualCadastrarCliente.setVisible(true);
    }//GEN-LAST:event_jMClienteCadastrarActionPerformed

    private void jMIGeraRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGeraRelatorioActionPerformed
        VisualSolicitarRelatorio solicitarRelatorio = new VisualSolicitarRelatorio();
        solicitarRelatorio.obterObjetoFuncionarioLogado(funcionarioLogado);
        solicitarRelatorio.setVisible(true);
    }//GEN-LAST:event_jMIGeraRelatorioActionPerformed

    private void jMISolicitarAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISolicitarAjudaActionPerformed
        VisualEnviarEmailSolicitacaoAjuda visualEmailAjuda = new VisualEnviarEmailSolicitacaoAjuda();
        visualEmailAjuda.setVisible(true);
    }//GEN-LAST:event_jMISolicitarAjudaActionPerformed

    private void jMISolicitarPedidoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISolicitarPedidoCompraActionPerformed
        VisualCadastrarPedidoCompra vCPedidoCompra = new VisualCadastrarPedidoCompra();
        vCPedidoCompra.setVisible(true);
    }//GEN-LAST:event_jMISolicitarPedidoCompraActionPerformed

    private void jMICadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarFuncionarioActionPerformed
        VisualCadastarFuncionario cadastrarFuncionario = new VisualCadastarFuncionario();
        cadastrarFuncionario.setVisible(true);
    }//GEN-LAST:event_jMICadastrarFuncionarioActionPerformed

    private void jMIVisualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarFuncionarioActionPerformed
        visulizarListaFuncionario.obterObjetoFuncionarioLogado(funcionarioLogado);
        visulizarListaFuncionario.setVisible(true);
    }//GEN-LAST:event_jMIVisualizarFuncionarioActionPerformed

    private void jMIInicioMinhasInforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIInicioMinhasInforActionPerformed
        VisualAtualizarCadastroFuncionario vAtualizarCadastro = new VisualAtualizarCadastroFuncionario();
        vAtualizarCadastro.obterFuncionarioLogado(funcionarioLogado);
        Integer id = funcionarioLogado.getId();
        funcionario = controleFuncionario.selecionarFuncionarioPorId(id);
        vAtualizarCadastro.preencherCamposFuncionario(funcionario);
        vAtualizarCadastro.setVisible(true);
    }//GEN-LAST:event_jMIInicioMinhasInforActionPerformed

    private void jMIAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlterarSenhaActionPerformed
        VisualAtualizarSenhaFuncionario vAtualizarSenha = new VisualAtualizarSenhaFuncionario();
        vAtualizarSenha.obterObjetoFuncionarioLogado(funcionarioLogado);
        vAtualizarSenha.setVisible(true);
    }//GEN-LAST:event_jMIAlterarSenhaActionPerformed

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        dispose();
        JOptionPane.showMessageDialog(null, "Saída realizada com sucesso", "Logout", JOptionPane.INFORMATION_MESSAGE);
        VisualLogin visualLogin = new VisualLogin();
        visualLogin.setVisible(true);
    }//GEN-LAST:event_jMISairActionPerformed

    private void jMIClienteVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClienteVisualizarActionPerformed
        VisualVisualizarCliente visualVisualizarCliente = new VisualVisualizarCliente();
        visualVisualizarCliente.setVisible(true);
    }//GEN-LAST:event_jMIClienteVisualizarActionPerformed

    private void jMICadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarFornecedorActionPerformed
        VisualCadastroFornecedor visualCadastroFornedor = new VisualCadastroFornecedor();
        visualCadastroFornedor.setVisible(true);
    }//GEN-LAST:event_jMICadastrarFornecedorActionPerformed

    private void jMIVisualizarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarFornecedorActionPerformed
        VisualVisualizarFornecedor visualVisualizarFornecedor = new VisualVisualizarFornecedor();
        visualVisualizarFornecedor.setVisible(true);
    }//GEN-LAST:event_jMIVisualizarFornecedorActionPerformed

    private void jMIProdutoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIProdutoCadastrarActionPerformed
        VisualCadastroProduto visualCadastroProduto = new VisualCadastroProduto();
        visualCadastroProduto.setVisible(true);
    }//GEN-LAST:event_jMIProdutoCadastrarActionPerformed

    private void jMIVisualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarProdutoActionPerformed
        VisualVisualizarProduto visualVisualizarProduto = new VisualVisualizarProduto();
        visualVisualizarProduto.setVisible(true);
    }//GEN-LAST:event_jMIVisualizarProdutoActionPerformed

    private void jMIVisualizarPedidoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarPedidoCompraActionPerformed
        VisualVisualizarPedidoCompra vVisualizarPedido = new VisualVisualizarPedidoCompra();
        vVisualizarPedido.setVisible(true);
    }//GEN-LAST:event_jMIVisualizarPedidoCompraActionPerformed

    private void jMISolicitarPedidoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISolicitarPedidoVendaActionPerformed
        VisualCadastrarPedidoVenda vCadastrarPedidoVenda = new VisualCadastrarPedidoVenda();
        vCadastrarPedidoVenda.setVisible(true);
    }//GEN-LAST:event_jMISolicitarPedidoVendaActionPerformed

    private void jMIVisualizarPedidoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisualizarPedidoVendaActionPerformed
        VisualVisualizarPedidoVenda vVisualizarPedidoVenda = new VisualVisualizarPedidoVenda();
        vVisualizarPedidoVenda.setVisible(true);
    }//GEN-LAST:event_jMIVisualizarPedidoVendaActionPerformed

    private void jMISobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISobreActionPerformed
        VisualSobre visualSobre = new VisualSobre();
        visualSobre.setVisible(true);
    }//GEN-LAST:event_jMISobreActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMCliente;
    private javax.swing.JMenuItem jMClienteCadastrar;
    private javax.swing.JMenu jMFornecedor;
    private javax.swing.JMenu jMFuncionario;
    private javax.swing.JMenu jMFuncionario1;
    private javax.swing.JMenu jMFuncionario2;
    private javax.swing.JMenu jMFuncionario3;
    private javax.swing.JMenu jMFuncionario4;
    private javax.swing.JMenu jMFuncionario5;
    private javax.swing.JMenuItem jMIAlterarSenha;
    private javax.swing.JMenuItem jMICadastrarFornecedor;
    private javax.swing.JMenuItem jMICadastrarFuncionario;
    private javax.swing.JMenuItem jMIClienteVisualizar;
    private javax.swing.JMenuItem jMIGeraRelatorio;
    private javax.swing.JMenuItem jMIInicioMinhasInfor;
    private javax.swing.JMenuItem jMIProdutoCadastrar;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenuItem jMISobre;
    private javax.swing.JMenuItem jMISolicitarAjuda;
    private javax.swing.JMenuItem jMISolicitarPedidoCompra;
    private javax.swing.JMenuItem jMISolicitarPedidoVenda;
    private javax.swing.JMenuItem jMIVisualizarFornecedor;
    private javax.swing.JMenuItem jMIVisualizarFuncionario;
    private javax.swing.JMenuItem jMIVisualizarPedidoCompra;
    private javax.swing.JMenuItem jMIVisualizarPedidoVenda;
    private javax.swing.JMenuItem jMIVisualizarProduto;
    private javax.swing.JMenu jMInicio;
    private javax.swing.JMenu jMProduto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
