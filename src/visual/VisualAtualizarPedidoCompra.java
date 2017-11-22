package visual;

import controle.ControlePedidoCompra;
import javax.swing.JOptionPane;
import modelo.PedidoCompra;

public class VisualAtualizarPedidoCompra extends javax.swing.JDialog {
    ControlePedidoCompra controlePedidoCompra = new ControlePedidoCompra();
    PedidoCompra pedido = new PedidoCompra();

    public VisualAtualizarPedidoCompra() {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGStatus = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRBFechar = new javax.swing.JRadioButton();
        jRBCancelar = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jTFObservacao = new javax.swing.JTextField();
        jBConfirma = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar status pedido");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Atualizar status de pedido");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/UpdateTag50.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Status pedido : ");

        bGStatus.add(jRBFechar);
        jRBFechar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRBFechar.setText("FECHAR");

        bGStatus.add(jRBCancelar);
        jRBCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRBCancelar.setText("CANCELAR");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Observação : ");

        jBConfirma.setText("Confirmar");
        jBConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmaActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRBFechar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRBCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTFObservacao))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBConfirma)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRBFechar)
                    .addComponent(jRBCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFObservacao)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirma)
                    .addComponent(jBCancelar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmaActionPerformed
        if(jRBFechar.isSelected()){
            pedido.setStatus("FECHADO");
            boolean resultadoAtualizacao = controlePedidoCompra.fecharPedidoCompra(pedido);
            if(resultadoAtualizacao){
                JOptionPane.showMessageDialog(null, "Pedido fechado com sucesso");
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Erro no fechamento do pedido");
            }
        }
        else if(jRBCancelar.isSelected()){
            pedido.setStatus("CANCELADO");
            boolean resultadoAtualizacao = controlePedidoCompra.cancelarPedidoCompra(pedido);
            if(resultadoAtualizacao){
                JOptionPane.showMessageDialog(null, "Pedido cancelado com sucesso");
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Erro no cancelamento do pedido");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma opção de status de pedido");
        }
    }//GEN-LAST:event_jBConfirmaActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed
    
    public void obterPedido(PedidoCompra ped){
        pedido = ped;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGStatus;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBConfirma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBCancelar;
    private javax.swing.JRadioButton jRBFechar;
    private javax.swing.JTextField jTFObservacao;
    // End of variables declaration//GEN-END:variables
}
