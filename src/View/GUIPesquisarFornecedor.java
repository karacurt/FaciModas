/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controler.Conectar;
import static Controler.TCC.pesquisa;
import static Controler.TCC.refresh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno Tard
 */
public class GUIPesquisarFornecedor extends javax.swing.JFrame {

static String lugar="fornecedor",palavra,coluna="forn_rasoci",coluna2="forn_cod";
static boolean alteracaofornecedor;
   String url2 = "jdbc:mysql://localhost/loja"; // enderço do BD
  String username = "root";        //nome de um usuário de seu BD
  String password = "";  // senha do BD
 static String  pesqforncod, pesqforncnpj, pesqfornie, pesqfornrasoci, pesqfornend, pesqfornbairro, pesqforncompl, pesqforncep, pesqforntel, pesqfornemail;
            static int codigofornecedor;     
    public GUIPesquisarFornecedor() {
     Model.LookAndFeel.estilo();         initComponents();
              this.setDefaultCloseOperation(2);      this.setResizable(false);   this.setTitle("FaciModas 1.0"); 
               for (int indice=0; indice < tabela.getColumnCount(); indice++){
tabela.getColumnModel().getColumn(indice).setPreferredWidth(150);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("loja?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        fornecedorQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Fornecedor f");
        fornecedorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : fornecedorQuery.getResultList();
        fornecedorQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Fornecedor f");
        fornecedorList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : fornecedorQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtpesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        bttvoltarmenupesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logobranco1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, -10, 200, 111);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fornecedor");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 40, 850, 40);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabela.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, fornecedorList1, tabela);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornecedorPK.fornCod}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornecedorPK.fornCnpj}"));
        columnBinding.setColumnName("CNPJ");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornIe}"));
        columnBinding.setColumnName("Inscrição Estadual");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornRasoci}"));
        columnBinding.setColumnName("Razão Social");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornEnd}"));
        columnBinding.setColumnName("Endereço");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornBairro}"));
        columnBinding.setColumnName("Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornCompl}"));
        columnBinding.setColumnName("Complemento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornCep}"));
        columnBinding.setColumnName("CEP");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornTel}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fornEmail}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tabela);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 150, 850, 350);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconexcluir.png"))); // NOI18N
        jButton1.setText("Excluir");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 110, 70, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconedit2.png"))); // NOI18N
        jButton2.setText("Alterar");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(420, 110, 80, 30);

        txtpesquisa.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        txtpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesquisaActionPerformed(evt);
            }
        });
        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyReleased(evt);
            }
        });
        jPanel1.add(txtpesquisa);
        txtpesquisa.setBounds(590, 110, 260, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconpesquisar3.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(850, 110, 40, 30);

        bttvoltarmenupesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltaresquerdanovo.jpg"))); // NOI18N
        bttvoltarmenupesquisar.setToolTipText("Voltar para o menu de pesquisas!");
        bttvoltarmenupesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        bttvoltarmenupesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttvoltarmenupesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttvoltarmenupesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(bttvoltarmenupesquisar);
        bttvoltarmenupesquisar.setBounds(40, 510, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 940, 580);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(931, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyPressed
    
        
        
    }//GEN-LAST:event_txtpesquisaKeyPressed

    private void txtpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesquisaActionPerformed

    private void txtpesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyReleased

        
        palavra = txtpesquisa.getText();
               

              if(palavra.equals("")){
                          refresh(tabela,lugar);
              }else{           
                                     pesquisa(tabela,lugar,coluna,coluna2,palavra);
               }
        

        
    }//GEN-LAST:event_txtpesquisaKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
           palavra = txtpesquisa.getText();
               

              if(palavra.equals("")){
                          refresh(tabela,lugar);
              }else{           
                    pesquisa(tabela,lugar,coluna,coluna2,palavra);
               }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
                        if (txtpesquisa.getText().equals("") || txtpesquisa.getText() ==null){
           
        
              codigofornecedor = (int) tabela.getValueAt(tabela.getSelectedRow(), 0);     
                      
            }else{
                   if(tabela.getRowCount() == 1){
                    codigofornecedor = (int) tabela.getValueAt(0,0);
                    
                }else{
                        codigofornecedor = Integer.valueOf(txtpesquisa.getText());
            }                 
               }
      
        try{    
            //Declarando a variavel código
           
   
                           
            Conectar.carregarDriver(); // Carregando o driver
            try {// Tratamento de erro para a conexao
                // Declarando  a variavel de conexão con
                // e estabelendo a conexão
                Connection con = null;

                try {
                    con = (Connection) DriverManager.getConnection(url2, username, password);
                } catch (SQLException ex) {
                    Logger.getLogger(GUIPesquisarFornecedor.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Declarando uma string com o comando mySQL para consulta
             String sql="";
                   

                      

         sql = "SELECT forn_cod,forn_cnpj,forn_ie,forn_rasoci,forn_end,forn_bairro,forn_compl,forn_cep,forn_tel,forn_email FROM fornecedor where forn_cod = "+codigofornecedor+";";
  

                      Statement stm = (Statement) con.createStatement();
                try
                {
                   
                    ResultSet rs = stm.executeQuery(sql);

                    int i=0; 

                    while (rs.next()) {  
                        
                   pesqforncod= rs.getString("forn_cod");
                   pesqforncnpj= rs.getString("forn_cnpj");
                   pesqfornie= rs.getString("forn_ie");
                   pesqfornrasoci= rs.getString("forn_rasoci");
                   pesqfornend= rs.getString("forn_end");
                   pesqfornbairro= rs.getString("forn_bairro");
                   pesqforncompl= rs.getString("forn_compl");
                   pesqforncep= rs.getString("forn_cep");
                   pesqforntel= rs.getString("forn_tel");
                   pesqfornemail= rs.getString("forn_email");
                             
                        i++;  
                                        }
                       if(i==0){ // Verificando se ha dados cadastrados atraves da variavel i

                        JOptionPane.showMessageDialog(null,"Código inválido!\n Digite um código válido!","Resultado",-1);

                    }else{
                       alteracaofornecedor = true;
                       new GUICadFornecedor().setVisible(true);
                       this.dispose();
                       
                       }

                 

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null,"Erro ao consultar!","ERRO",0);
                }

            } catch (SQLException ex) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null,"Erro ao conectar com o servidor","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Código fora do formato
            JOptionPane.showMessageDialog(null,"Digite o código corretamante","ERRO",0);
            txtpesquisa.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
            
                        if (txtpesquisa.getText().equals("") || txtpesquisa.getText() == null){
              
              codigofornecedor = (int) tabela.getValueAt(tabela.getSelectedRow(), 0);    
                      
            }else{
                   if(tabela.getRowCount() == 1){
                    codigofornecedor = (int) tabela.getValueAt(0,0);
                    
                }else{
                        codigofornecedor = Integer.valueOf(txtpesquisa.getText());
            }                 
               }
      
        try{    
            //Declarando a variavel código
           
   
                           
            Conectar.carregarDriver(); // Carregando o driver
            Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(url2, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(GUIPesquisarContas.class.getName()).log(Level.SEVERE, null, ex);
        }

              
  
        String sql = "DELETE FROM"+lugar+"WHERE"+coluna2+" ="+codigofornecedor+";";
    
        
        try { // Tratamento de Erros para inserção
            
            // Criando varialvel que executara a inserção
            PreparedStatement excluir = (PreparedStatement) con.prepareStatement(sql);
            excluir.execute(); // Executando a inserção
            
            JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso!!!\n","",-1);
            
          refresh(tabela,lugar);
          
         } catch (Exception ex) { // Consulta mal sucedida
            JOptionPane.showMessageDialog(null,"Erro ao consultar!"+ex,"ERRO",0);
        }

        }catch(NumberFormatException erro){
            // Código fora do formato
            JOptionPane.showMessageDialog(null,"Digite o código corretamante","ERRO",0);
            txtpesquisa.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bttvoltarmenupesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttvoltarmenupesquisarActionPerformed
  this.dispose();  
  new GUIPesquisar().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_bttvoltarmenupesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIPesquisarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPesquisarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPesquisarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPesquisarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPesquisarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttvoltarmenupesquisar;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<View.Fornecedor> fornecedorList;
    private java.util.List<View.Fornecedor> fornecedorList1;
    private javax.persistence.Query fornecedorQuery;
    private javax.persistence.Query fornecedorQuery1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtpesquisa;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}