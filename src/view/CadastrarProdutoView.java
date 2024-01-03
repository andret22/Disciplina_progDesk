/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerClienteTexto;
import controller.ControllerFornecedorTexto;
import controller.ControllerProdutoBinario;
import controller.ControllerProdutoTexto;
import controller.ProdutoDAO;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author andre
 */
public class CadastrarProdutoView extends javax.swing.JFrame {

    //Controlls
    private ControllerProdutoTexto pt = new ControllerProdutoTexto();
    private ControllerProdutoBinario pb = new ControllerProdutoBinario();
    private ProdutoDAO pd = new ProdutoDAO();
    
    //Labels
    public static final int TEXT = 1;
    public static final int BINARY = 2;
    public static final int DATABASE = 3;
    private int mode = -1;

    public CadastrarProdutoView(int whereToSearch) {
        this.mode = whereToSearch;
        System.out.println("Entrando em modo " + mode);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idF = new javax.swing.JTextField();
        precoF = new javax.swing.JTextField();
        quantF = new javax.swing.JTextField();
        nomeF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cadastrarB = new javax.swing.JButton();
        voltarB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("ID");

        jLabel2.setText("Preço");

        jLabel4.setText("Quantidade");

        jLabel3.setText("Nome");

        jLabel5.setText("Cadastro Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeF)
                            .addComponent(idF)
                            .addComponent(precoF)
                            .addComponent(quantF, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37))
        );

        cadastrarB.setText("Cadastrar");
        cadastrarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadastrarBMousePressed(evt);
            }
        });

        voltarB.setText("Voltar");
        voltarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                voltarBMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(cadastrarB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarB)
                    .addComponent(voltarB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBMousePressed
        if(ControllerProdutoTexto.CFile.getArquivo() != null || ControllerProdutoBinario.BFile.getArquivo() != null || pd.checkConnection()){
           cadastraInfo(); 
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um arquivo!!!", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarBMousePressed

    private void voltarBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarBMousePressed
        TelaInicialView ti = new TelaInicialView();
        ti.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarBMousePressed


    private void cadastraProdutoBinario() {
        try {
            if (ControllerProdutoBinario.BFile.getArquivo() != null) {
                Produto prod = pb.createProduto(Integer.parseInt(idF.getText()), nomeF.getText(),
                        Float.parseFloat(precoF.getText()), Integer.parseInt(quantF.getText()));
                ControllerProdutoBinario.BFile.setObject(prod);
                ControllerProdutoBinario.BFile.escrever(true);
                JOptionPane.showMessageDialog(this, "Produto salvo com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um arquivo!!!", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Informação inválida nos campos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cadastraProdutoTexto() {
        if (ControllerProdutoTexto.CFile.isHasAFile()) {
            try {
                pt.setProduto(Integer.parseInt(idF.getText()), nomeF.getText(), Float.parseFloat(precoF.getText()),
                        Integer.parseInt(quantF.getText()));

                pt.salvar();
                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Informação inválida nos campos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um arquivo!!!", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cadastrarProdutoDB(){
        try{
            if(pd.inserir(field2object())){
                JOptionPane.showMessageDialog(this, "Produto salvo com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                pd.commit();
            }else{
                JOptionPane.showMessageDialog(this, "Produto já existe. Impossível cadastrar ID duplicado", "Erro", JOptionPane.ERROR_MESSAGE);
                pd.rollback();
            }
        }catch(NumberFormatException nfe){        
            JOptionPane.showMessageDialog(this, "Informação inválida nos campos", "Erro", JOptionPane.ERROR_MESSAGE);
            pd.rollback();
        }
    }
    private void cadastraInfo() {
        switch (this.mode) {
            case TEXT -> cadastraProdutoTexto();
            case BINARY -> cadastraProdutoBinario();
            case DATABASE -> cadastrarProdutoDB();
            default -> JOptionPane.showMessageDialog(this, "Selecione um arquivo!!!", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private Produto field2object(){
        Produto prod = new Produto(Integer.parseInt(idF.getText()), nomeF.getText(),
                        Float.parseFloat(precoF.getText()), Integer.parseInt(quantF.getText()));
        return prod;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cadastrarB;
    private javax.swing.JTextField idF;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeF;
    private javax.swing.JTextField precoF;
    private javax.swing.JTextField quantF;
    private javax.swing.JButton voltarB;
    // End of variables declaration//GEN-END:variables
}