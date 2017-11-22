package main;

import controle.ControleFornecedor;
import java.util.List;
import modelo.Fornecedor;

public class teste extends javax.swing.JDialog {
    ControleFornecedor controleFornecedor = new ControleFornecedor();
    List<Fornecedor> listaFornecedores;
    Fornecedor fornecedor = new Fornecedor();

    public teste() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBteste = new javax.swing.JComboBox<>();
        jBObter = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jCBteste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        jBObter.setText("Obter");
        jBObter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBObterActionPerformed(evt);
            }
        });

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(" #,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBObter)
                    .addComponent(jCBteste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jCBteste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jBObter)
                .addGap(52, 52, 52)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBObterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBObterActionPerformed
        
        if(obterItemSelecionar() == 0){
            System.out.print("Nenhum item selecionado");
        }else{
            fornecedor = listaFornecedores.get(obterItemSelecionar()-1);
            System.out.print(fornecedor.getId()+" "+fornecedor.getNome()+" "+fornecedor.getEmail());
        }
    }//GEN-LAST:event_jBObterActionPerformed
    public void preencherCaixa(){
        listaFornecedores = controleFornecedor.selecionarTodosFornecedores();
        
        for(Fornecedor forn : listaFornecedores){
            jCBteste.addItem(forn.getId()+" "+forn.getNome());
        }
    }
    
    public int obterItemSelecionar(){
        int item = jCBteste.getSelectedIndex();
        return item;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBObter;
    private javax.swing.JComboBox<String> jCBteste;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    // End of variables declaration//GEN-END:variables
}
