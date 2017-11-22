package visual;

import controle.ControleSolicitarRelatorio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.FuncionarioLogado;
import modelo.Relatorio;
import util.CriarPasta;

public class VisualSolicitarRelatorio extends javax.swing.JDialog  {
    ControleSolicitarRelatorio solicitacaoRelatorio = new ControleSolicitarRelatorio();
    FuncionarioLogado funcionarioLogado = new FuncionarioLogado();
    Relatorio relatorio = new Relatorio();

    public VisualSolicitarRelatorio() {       
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        CriarPasta.criarPstaRelatorios();
    }
    
    public void obterObjetoFuncionarioLogado(FuncionarioLogado funcLogado){
        funcionarioLogado = funcLogado;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFTFDataInicio = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFTFDataFinal = new javax.swing.JFormattedTextField();
        jTFNome = new javax.swing.JTextField();
        jBCriaRelatorio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCBTipoRelatorio = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        try {
            jFTFDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("De");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Até");

        try {
            jFTFDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBCriaRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBCriaRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/create20.png"))); // NOI18N
        jBCriaRelatorio.setText("Criar Relatório");
        jBCriaRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCriaRelatorioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Solicitação de relatório");

        jBCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report50.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Nome : ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Tipo : ");

        jCBTipoRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Relatório de Produto", "Relatório de Cliente", "Relatório de Pedido Venda", "Relatório de Pedido Compra" }));
        jCBTipoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoRelatorioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Período de Solicitação : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jFTFDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBTipoRelatorio, 0, 1, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jFTFDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBCriaRelatorio)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jCBTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFTFDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jFTFDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCriaRelatorio)
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCriaRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriaRelatorioActionPerformed
        if(!jTFNome.getText().equals("") && jTFNome.getText().length() > 5){
            if(jCBTipoRelatorio.getSelectedItem().equals("Relatório de Produto")){
            relatorio.setTipo("Relatório de Produto");
            relatorio.setNome(jTFNome.getText());
            relatorio.setFuncionarioSolicitante(funcionarioLogado);
            solicitacaoRelatorio.solicitarGeracaoRelatorio(relatorio);
            JOptionPane.showMessageDialog(null, "Relatório criado com sucesso\nRelatório disponível na "
                    + "área de trabalho do Desktop.\nAcesse a pasta RelatoriosCeE e visualize o relatório"
                        ,"Sucesso !",JOptionPane.INFORMATION_MESSAGE);
            
            }else if(jCBTipoRelatorio.getSelectedItem().equals("Relatório de Cliente")){
                relatorio.setTipo("Relatório de Cliente");
                relatorio.setNome(jTFNome.getText());
                relatorio.setFuncionarioSolicitante(funcionarioLogado);
                solicitacaoRelatorio.solicitarGeracaoRelatorio(relatorio);
                JOptionPane.showMessageDialog(null, "Relatório criado com sucesso\nRelatório disponível na "
                    + "área de trabalho do Desktop.\nAcesse a pasta RelatoriosCeE e visualize o relatório"
                        ,"Sucesso !",JOptionPane.INFORMATION_MESSAGE);

            }else if(jCBTipoRelatorio.getSelectedItem().equals("Relatório de Pedido Venda")){
                try {
                    if(verificarPeriodoSolicitacao()){
                        relatorio.setTipo("Relatório de Pedido Venda");
                        relatorio.setNome(jTFNome.getText());
                        relatorio.setFuncionarioSolicitante(funcionarioLogado);
                        solicitacaoRelatorio.solicitarGeracaoRelatorio(relatorio);
                        JOptionPane.showMessageDialog(null, "Relatório criado com sucesso\nRelatório disponível na "
                    + "área de trabalho do Desktop.\nAcesse a pasta RelatoriosCeE e visualize o relatório"
                        ,"Sucesso !",JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (ParseException ex) {};
            }else{
                try {
                    if(verificarPeriodoSolicitacao()){
                        relatorio.setTipo("Relatório de Pedido Compra");
                        relatorio.setNome(jTFNome.getText());
                        relatorio.setFuncionarioSolicitante(funcionarioLogado);
                        solicitacaoRelatorio.solicitarGeracaoRelatorio(relatorio);
                        JOptionPane.showMessageDialog(null, "Relatório criado com sucesso\nRelatório disponível na "
                    + "área de trabalho do Desktop.\nAcesse a pasta RelatoriosCeE e visualize o relatório"
                        ,"Sucesso !",JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (ParseException ex) {};
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nome de relatório inválido\nNome deve ter mais de 5 letras"
                        ,"Erro",JOptionPane.YES_NO_OPTION);
        }
        
    }//GEN-LAST:event_jBCriaRelatorioActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jCBTipoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoRelatorioActionPerformed
        
        if(jCBTipoRelatorio.getSelectedItem().equals("Relatório de Produto")){
            jFTFDataInicio.setEnabled(false);
            jFTFDataFinal.setEnabled(false);
        }if(jCBTipoRelatorio.getSelectedItem().equals("Relatório de Cliente")){
            jFTFDataInicio.setEnabled(false);
            jFTFDataFinal.setEnabled(false);
        }if(jCBTipoRelatorio.getSelectedItem().equals("Relatório de Pedido Venda")){
            jFTFDataInicio.setEnabled(true);
            jFTFDataFinal.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Determine o período relatório"
                        ,"Definição",JOptionPane.INFORMATION_MESSAGE);
        }if(jCBTipoRelatorio.getSelectedItem().equals("Relatório de Pedido Compra")){
            jFTFDataInicio.setEnabled(true);
            jFTFDataFinal.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Determine o período relatório"
                        ,"Definição",JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_jCBTipoRelatorioActionPerformed
    
    private boolean verificarPeriodoSolicitacao() throws ParseException {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        
        if(verificarCampoDataVazio()){
            Date dataInicio = formatoData.parse(jFTFDataInicio.getText());
            Date dataFinal = formatoData.parse(jFTFDataFinal.getText());
            Date dataAtual = new Date();
            
            boolean validarDataInicio = validarDataSolicitacao(jFTFDataInicio.getText());
            boolean validarDataFinal = validarDataSolicitacao(jFTFDataFinal.getText());
            
            if(validarDataInicio && validarDataFinal){
                if(dataInicio.after(dataFinal) || dataFinal.after(dataAtual) || dataAtual.before(dataFinal)){
                    JOptionPane.showMessageDialog(null, "Período de solicitação inválido"
                        ,"Erro",JOptionPane.YES_NO_OPTION);
                    jFTFDataInicio.setText("");
                    jFTFDataFinal.setText("");
                    return false;
                }else{
                    relatorio.setDataInicio(jFTFDataInicio.getText());
                    relatorio.setDataFinal(jFTFDataFinal.getText());
                    return true;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Data inválido"
                    , "Erro",JOptionPane.YES_NO_OPTION);
                jFTFDataInicio.setText("");
                jFTFDataFinal.setText("");
                return false;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Algum campo data vázio"
                    , "Erro",JOptionPane.YES_NO_OPTION);
            return false;
        }
        
    }
    
    private boolean verificarCampoDataVazio(){
        String dataInicio = jFTFDataInicio.getText();
        String dataFinal = jFTFDataFinal.getText();
        String dataInicioValidacao = dataInicio.replace(" ", "").replace("/", "");
        String dataFinalValidacao = dataFinal.replace(" ", "").replace("/", "");
                
        if(dataInicioValidacao.equals("") && dataFinalValidacao.equals("")){
            return false;
        }else{
            return true;
        }
    }
    
    private boolean validarDataSolicitacao(String data){
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6));
        
        if(dia >=1 && dia <=31){
            if(mes >=1 && mes <=12){
                if(ano > 1000){
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null, "Ano da solicitação inválido"
                    , "Erro",JOptionPane.YES_NO_OPTION);
                    return false;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Mês da solicitação inválido"
                    , "Erro",JOptionPane.YES_NO_OPTION);
                return false;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Dia da solicitação inválido"
                    , "Erro",JOptionPane.YES_NO_OPTION);
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBCriaRelatorio;
    private javax.swing.JComboBox<String> jCBTipoRelatorio;
    private javax.swing.JFormattedTextField jFTFDataFinal;
    private javax.swing.JFormattedTextField jFTFDataInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTFNome;
    // End of variables declaration//GEN-END:variables
}
