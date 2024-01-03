/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ClienteDAO;
import controller.ControllerClienteBinario;
import controller.ControllerClienteTexto;
import controller.ControllerFornecedorTexto;
import controller.ControllerFornecedorBinario;
import controller.ControllerProdutoBinario;
import controller.ControllerProdutoTexto;
import javax.swing.JOptionPane;
import controller.FornecedorDAO;
import controller.ProdutoDAO;
import controller.ClienteRelatorio;
import controller.FornecedorRelatorio;
import controller.ProdutoRelatorio;


public class TelaInicialView extends javax.swing.JFrame {

    //Controllers
    //Fornecedor
    private ControllerFornecedorTexto ft = new ControllerFornecedorTexto();
    private ControllerFornecedorBinario fb = new ControllerFornecedorBinario();
    private FornecedorDAO fornDAO = new FornecedorDAO();
    //Produto
    private ControllerProdutoTexto pt = new ControllerProdutoTexto();
    private ControllerProdutoBinario pb = new ControllerProdutoBinario();
    private ProdutoDAO pdb = new ProdutoDAO();
    //Cliente
    private ControllerClienteTexto ct = new ControllerClienteTexto();
    private ControllerClienteBinario cb = new ControllerClienteBinario();
    private ClienteDAO cdb = new ClienteDAO();
    //Relatorio
    private ClienteRelatorio cr = new ClienteRelatorio();
    private ProdutoRelatorio pr = new ProdutoRelatorio();
    private FornecedorRelatorio fr = new FornecedorRelatorio();
    
    //Labels
    public static final int TEXT = 1;
    public static final int BINARY = 2;
    public static final int DATABASE = 3;
    private static int modeForn;
    private static int modeCliente;
    private static int modeProd;

    public TelaInicialView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioBCliente = new javax.swing.ButtonGroup();
        RadioBFornecedor = new javax.swing.ButtonGroup();
        RadioBProduto = new javax.swing.ButtonGroup();
        MenuExterno = new javax.swing.JInternalFrame();
        MenuInterno = new javax.swing.JPanel();
        cadastrarClienteB = new javax.swing.JButton();
        procurarClienteB = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CadastrarProdutoB = new javax.swing.JButton();
        buscarProdutoB = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        cadastrarFornB = new javax.swing.JButton();
        procurarFornB = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        relCliente = new javax.swing.JButton();
        relProd = new javax.swing.JButton();
        relForn = new javax.swing.JButton();
        Image = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        MenuArquivos = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        textCliente = new javax.swing.JRadioButton();
        binCliente = new javax.swing.JRadioButton();
        dbCliente = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        textProduto = new javax.swing.JRadioButton();
        binProduto = new javax.swing.JRadioButton();
        dbProduto = new javax.swing.JRadioButton();
        clienteSelect = new javax.swing.JButton();
        produtoSelect = new javax.swing.JButton();
        fornecedorSelect = new javax.swing.JButton();
        dbForn = new javax.swing.JRadioButton();
        binForn = new javax.swing.JRadioButton();
        textForn = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuExterno.setVisible(true);

        MenuInterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cadastrarClienteB.setText("Cadastrar Cliente");
        cadastrarClienteB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadastrarClienteBMousePressed(evt);
            }
        });

        procurarClienteB.setText("Procurar Cliente");
        procurarClienteB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                procurarClienteBMousePressed(evt);
            }
        });

        jLabel1.setText("Cliente");

        jLabel2.setText("Produto");

        CadastrarProdutoB.setText("Cadastrar Produto");
        CadastrarProdutoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CadastrarProdutoBMousePressed(evt);
            }
        });

        buscarProdutoB.setText("Procurar Produto");
        buscarProdutoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarProdutoBMousePressed(evt);
            }
        });

        jLabel3.setText("Fornecedor");

        cadastrarFornB.setText("Cadastrar Fornecedor");
        cadastrarFornB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadastrarFornBMousePressed(evt);
            }
        });

        procurarFornB.setText("Procurar Fornecedor");
        procurarFornB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                procurarFornBMousePressed(evt);
            }
        });

        jLabel7.setText("Relatórios");

        relCliente.setText("Relatório cliente");
        relCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                relClienteMousePressed(evt);
            }
        });

        relProd.setText("Relatório produtos");
        relProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                relProdMousePressed(evt);
            }
        });

        relForn.setText("Relatório fornecedores");
        relForn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                relFornMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MenuInternoLayout = new javax.swing.GroupLayout(MenuInterno);
        MenuInterno.setLayout(MenuInternoLayout);
        MenuInternoLayout.setHorizontalGroup(
            MenuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuInternoLayout.createSequentialGroup()
                        .addGroup(MenuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuInternoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuInternoLayout.createSequentialGroup()
                                .addComponent(cadastrarClienteB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(procurarClienteB)
                                .addGap(22, 22, 22))
                            .addGroup(MenuInternoLayout.createSequentialGroup()
                                .addComponent(cadastrarFornB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(procurarFornB))
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addGroup(MenuInternoLayout.createSequentialGroup()
                                .addGroup(MenuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MenuInternoLayout.createSequentialGroup()
                        .addComponent(CadastrarProdutoB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarProdutoB)
                        .addGap(22, 22, 22))
                    .addGroup(MenuInternoLayout.createSequentialGroup()
                        .addComponent(relCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(relProd)
                        .addGap(17, 17, 17))
                    .addGroup(MenuInternoLayout.createSequentialGroup()
                        .addComponent(relForn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        MenuInternoLayout.setVerticalGroup(
            MenuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(MenuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarClienteB)
                    .addComponent(procurarClienteB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarProdutoB)
                    .addComponent(buscarProdutoB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarFornB)
                    .addComponent(procurarFornB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relCliente)
                    .addComponent(relProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(relForn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopCart.png"))); // NOI18N

        title.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        title.setText("Supermercado X");

        MenuArquivos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Cliente");

        RadioBCliente.add(textCliente);
        textCliente.setText("Texto");

        RadioBCliente.add(binCliente);
        binCliente.setText("Binário");

        RadioBCliente.add(dbCliente);
        dbCliente.setText("Banco de dados");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Produto");

        RadioBProduto.add(textProduto);
        textProduto.setText("Texto");

        RadioBProduto.add(binProduto);
        binProduto.setText("Binário");

        RadioBProduto.add(dbProduto);
        dbProduto.setText("Banco de dados");

        clienteSelect.setText("Selecionar");
        clienteSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clienteSelectMousePressed(evt);
            }
        });

        produtoSelect.setText("Selecionar");
        produtoSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                produtoSelectMousePressed(evt);
            }
        });

        fornecedorSelect.setText("Selecionar");
        fornecedorSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fornecedorSelectMousePressed(evt);
            }
        });

        RadioBFornecedor.add(dbForn);
        dbForn.setText("Banco de dados");

        RadioBFornecedor.add(binForn);
        binForn.setText("Binario");

        RadioBFornecedor.add(textForn);
        textForn.setText("Texto");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Fornecedor");

        javax.swing.GroupLayout MenuArquivosLayout = new javax.swing.GroupLayout(MenuArquivos);
        MenuArquivos.setLayout(MenuArquivosLayout);
        MenuArquivosLayout.setHorizontalGroup(
            MenuArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuArquivosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator3)
                    .addGroup(MenuArquivosLayout.createSequentialGroup()
                        .addGroup(MenuArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(textCliente)
                            .addComponent(binCliente)
                            .addComponent(dbCliente)
                            .addComponent(jLabel6)
                            .addComponent(textProduto)
                            .addComponent(binProduto)
                            .addComponent(dbProduto)
                            .addComponent(clienteSelect)
                            .addComponent(produtoSelect)
                            .addComponent(dbForn)
                            .addComponent(binForn)
                            .addComponent(textForn)
                            .addComponent(fornecedorSelect)
                            .addComponent(jLabel4))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MenuArquivosLayout.setVerticalGroup(
            MenuArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuArquivosLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(binCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dbCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clienteSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(binProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dbProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(produtoSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textForn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(binForn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dbForn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fornecedorSelect)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuExternoLayout = new javax.swing.GroupLayout(MenuExterno.getContentPane());
        MenuExterno.getContentPane().setLayout(MenuExternoLayout);
        MenuExternoLayout.setHorizontalGroup(
            MenuExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuExternoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MenuExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(MenuInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(MenuArquivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        MenuExternoLayout.setVerticalGroup(
            MenuExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuExternoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MenuExternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MenuArquivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuExternoLayout.createSequentialGroup()
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title)
                        .addGap(9, 9, 9)
                        .addComponent(MenuInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuExterno)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarClienteBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarClienteBMousePressed
        if (cdb.getFlag() || ct.getFlag() || cb.getFlag()) {
            CadastrarClienteView cc = new CadastrarClienteView(modeCliente);
            cc.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um arquivo!!!", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarClienteBMousePressed

    private void procurarClienteBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procurarClienteBMousePressed
        if (cdb.getFlag() || ct.getFlag() || cb.getFlag()) {
            ProcurarClienteView pc = new ProcurarClienteView(modeCliente);
            pc.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um arquivo!!!", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_procurarClienteBMousePressed

    private void CadastrarProdutoBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarProdutoBMousePressed
        if (pdb.getFlag() || pt.getFlag() || pb.getFlag()) {
            CadastrarProdutoView cp = new CadastrarProdutoView(modeProd);
            cp.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um arquivo!!!", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CadastrarProdutoBMousePressed

    private void buscarProdutoBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarProdutoBMousePressed
        if (pdb.getFlag() || pt.getFlag() || pb.getFlag()) {
            ProcurarProdutoView pp = new ProcurarProdutoView(modeProd);
            pp.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um arquivo!!!", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarProdutoBMousePressed

    private void cadastrarFornBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarFornBMousePressed
        if (fornDAO.getFlag() || ft.getFlag() || fb.getFlag()) {
            CadastrarFornecedorView ft = new CadastrarFornecedorView(modeForn);
            ft.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um arquivo!!!", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarFornBMousePressed

    private void procurarFornBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procurarFornBMousePressed
        if (fornDAO.getFlag() || ft.getFlag() || fb.getFlag()) {
            ProcurarFornecedorView pf = new ProcurarFornecedorView(modeForn);
            pf.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um arquivo!!!", "Arquivo não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_procurarFornBMousePressed

    private void fornecedorSelectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fornecedorSelectMousePressed
        setFileTypeForn();
    }//GEN-LAST:event_fornecedorSelectMousePressed

    private void clienteSelectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteSelectMousePressed
        setFileTypeCliente();
    }//GEN-LAST:event_clienteSelectMousePressed

    private void produtoSelectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtoSelectMousePressed
        setFileTypeProduto();
    }//GEN-LAST:event_produtoSelectMousePressed

    private void relClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relClienteMousePressed
 
        int status = cr.imprimeRelatorio(paramRelatorio());
   
        //Alertar de erro
        switch(status){
            case ClienteRelatorio.EXCEPTION -> {
                JOptionPane.showMessageDialog(this, "Ocorreu um problema", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            case ClienteRelatorio.EMPTY_REPORT -> {
                JOptionPane.showMessageDialog(this, "CPF não corresponde a um cliente cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
            }case -2 -> {
                JOptionPane.showMessageDialog(this, "Formato inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_relClienteMousePressed

    private void relProdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relProdMousePressed
        int status = pr.imprimeRelatorio();
        
        //Alertar de erro
        switch(status){
            case ClienteRelatorio.EXCEPTION -> {
                JOptionPane.showMessageDialog(this, "Ocorreu um problema", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            case ClienteRelatorio.EMPTY_REPORT -> {
                JOptionPane.showMessageDialog(this, "CPF não corresponde a um cliente cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
            }case -2 -> {
                JOptionPane.showMessageDialog(this, "Formato inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_relProdMousePressed

    private void relFornMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relFornMousePressed
        int status = fr.imprimeRelatorio();
        
        //Alertar de erro
        switch(status){
            case ClienteRelatorio.EXCEPTION -> {
                JOptionPane.showMessageDialog(this, "Ocorreu um problema", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            case ClienteRelatorio.EMPTY_REPORT -> {
                JOptionPane.showMessageDialog(this, "CPF não corresponde a um cliente cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
            }case -2 -> {
                JOptionPane.showMessageDialog(this, "Formato inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_relFornMousePressed

    
    private long paramRelatorio(){
        String sInput = (String) JOptionPane.showInputDialog(
                this,
                "Insira o CPF do cliente que deseja gerar o relatório",
                "Cliente",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                0);
        try{
            long userInput = Long.parseLong(sInput);
            return userInput;
        }catch(NumberFormatException e){
            return -2;
        }
    }
    private void setFileTypeForn() {
        if (textForn.isSelected()) {
            if (ControllerFornecedorTexto.CFile.setArquivo("Salvar")) {
                if (ControllerFornecedorTexto.CFile != null) {
                    TelaInicialView.modeForn = TEXT;
                    ft.setFlag();
                    System.out.println("text");
                } else {
                    ft.resetFlag();
                }
            }
        } else if (binForn.isSelected()) {
            if (ControllerFornecedorBinario.BFile.setArquivo("Abrir")) {
                if (ControllerFornecedorBinario.BFile != null) {
                    TelaInicialView.modeForn = BINARY;
                    fb.setFlag();
                    System.out.println("bin");
                } else {
                    ft.resetFlag();
                }
            }
        } else if (dbForn.isSelected()) {
            try {
                if (fornDAO.criaConexao()) {
                    //DEBUG
                    System.out.println("Conexao estabelecida");
                    //FIM DEBUG
                    TelaInicialView.modeForn = DATABASE;
                    fornDAO.setFlag();

                    JOptionPane.showMessageDialog(this, "Conexão estabelecida!!!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao estabelecer a conexão", "Erro", JOptionPane.ERROR_MESSAGE);
                    fornDAO.resetFlag();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao estabelecer a conexão", "Erro", JOptionPane.ERROR_MESSAGE);
                fornDAO.resetFlag();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma opção", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setFileTypeCliente() {
        if (textCliente.isSelected()) {
            ControllerClienteTexto.CFile.setArquivo("Salvar");
            if (ControllerClienteTexto.CFile != null) {
                TelaInicialView.modeCliente = TEXT;
                ct.setFlag();
                System.out.println("text");
            } else {
                ct.resetFlag();
            }
        } else if (binCliente.isSelected()) {
            ControllerClienteBinario.BFile.setArquivo("Abrir");
            if (ControllerClienteBinario.BFile != null) {
                TelaInicialView.modeCliente = BINARY;
                cb.setFlag();
                System.out.println("bin");
            } else {
                cb.resetFlag();
            }
        } else if (dbCliente.isSelected()) {
            try {
                if (cdb.criaConexao()) {
                    //DEBUG
                    System.out.println("Conexao estabelecida");
                    //FIM DEBUG
                    TelaInicialView.modeCliente = DATABASE;
                    cdb.setFlag();

                    JOptionPane.showMessageDialog(this, "Conexão estabelecida!!!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao estabelecer a conexão", "Erro", JOptionPane.ERROR_MESSAGE);
                    cdb.resetFlag();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao estabelecer a conexão", "Erro", JOptionPane.ERROR_MESSAGE);
                cdb.resetFlag();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma opção", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setFileTypeProduto() {
        if (textProduto.isSelected()) {
            ControllerProdutoTexto.CFile.setArquivo("Salvar");
            if (ControllerProdutoTexto.CFile != null) {
                TelaInicialView.modeProd = TEXT;
                pt.setFlag();
                System.out.println("text");
            } else {
                pt.resetFlag();
            }
        } else if (binProduto.isSelected()) {
            ControllerProdutoBinario.BFile.setArquivo("Abrir");
            if (ControllerProdutoBinario.BFile != null) {
                TelaInicialView.modeProd = BINARY;
                pb.setFlag();
                System.out.println("bin");
            } else {
                pb.resetFlag();
            }
        } else if (dbProduto.isSelected()) {
            try {
                if (pdb.criaConexao()) {
                    //DEBUG
                    System.out.println("Conexao estabelecida");
                    //FIM DEBUG
                    TelaInicialView.modeProd = DATABASE;
                    pdb.setFlag();

                    JOptionPane.showMessageDialog(this, "Conexão estabelecida!!!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao estabelecer a conexão", "Erro", JOptionPane.ERROR_MESSAGE);
                    pdb.resetFlag();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao estabelecer a conexão", "Erro", JOptionPane.ERROR_MESSAGE);
                pdb.resetFlag();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma opção", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /* Main */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
 
            new TelaInicialView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarProdutoB;
    private javax.swing.JLabel Image;
    private javax.swing.JPanel MenuArquivos;
    private javax.swing.JInternalFrame MenuExterno;
    private javax.swing.JPanel MenuInterno;
    private javax.swing.ButtonGroup RadioBCliente;
    private javax.swing.ButtonGroup RadioBFornecedor;
    private javax.swing.ButtonGroup RadioBProduto;
    private javax.swing.JRadioButton binCliente;
    private javax.swing.JRadioButton binForn;
    private javax.swing.JRadioButton binProduto;
    private javax.swing.JButton buscarProdutoB;
    private javax.swing.JButton cadastrarClienteB;
    private javax.swing.JButton cadastrarFornB;
    private javax.swing.JButton clienteSelect;
    private javax.swing.JRadioButton dbCliente;
    private javax.swing.JRadioButton dbForn;
    private javax.swing.JRadioButton dbProduto;
    private javax.swing.JButton fornecedorSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToggleButton procurarClienteB;
    private javax.swing.JButton procurarFornB;
    private javax.swing.JButton produtoSelect;
    private javax.swing.JButton relCliente;
    private javax.swing.JButton relForn;
    private javax.swing.JButton relProd;
    private javax.swing.JRadioButton textCliente;
    private javax.swing.JRadioButton textForn;
    private javax.swing.JRadioButton textProduto;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
