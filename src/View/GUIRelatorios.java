/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import jdbc.ReportUtils;
import net.sf.jasperreports.engine.JRException;

public class GUIRelatorios extends javax.swing.JFrame {

    /**
     * Creates new form GUIPesquisar
     */
    public GUIRelatorios() {
     Model.LookAndFeel.estilo();         initComponents();
              this.setDefaultCloseOperation(2);      this.setResizable(false);   this.setTitle("FaciModas 1.0"); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblselecionar = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bttselecionefuncionariocad1 = new javax.swing.JButton();
        bttselecionefuncionariocad = new javax.swing.JButton();
        bttselecionecartcad = new javax.swing.JButton();
        bttselecionecontascad1 = new javax.swing.JButton();
        bttselecioneprodutopesq = new javax.swing.JButton();
        bttselecioneclientepesq = new javax.swing.JButton();
        bttselecionefornecedorcad = new javax.swing.JButton();
        bttvoltarmenupesquisar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        lblselecionar.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        lblselecionar.setForeground(new java.awt.Color(255, 255, 255));
        lblselecionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblselecionar.setText("Relatórios");
        jPanel1.add(lblselecionar);
        lblselecionar.setBounds(0, 40, 920, 60);

        lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logobranco1.png"))); // NOI18N
        lblimg.setText("jLabel1");
        jPanel1.add(lblimg);
        lblimg.setBounds(-20, -10, 200, 120);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cartão");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 310, 130, 170);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Produto");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 130, 130, 170);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cliente");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 130, 130, 170);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contas");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 310, 130, 170);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fornecedor");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(420, 310, 130, 170);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pedido");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(560, 130, 210, 350);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Funcionário");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, 130, 130, 170);

        bttselecionefuncionariocad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pedido.jpg"))); // NOI18N
        bttselecionefuncionariocad1.setBorder(null);
        bttselecionefuncionariocad1.setContentAreaFilled(false);
        bttselecionefuncionariocad1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttselecionefuncionariocad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttselecionefuncionariocad1ActionPerformed(evt);
            }
        });
        jPanel1.add(bttselecionefuncionariocad1);
        bttselecionefuncionariocad1.setBounds(560, 130, 210, 350);

        bttselecionefuncionariocad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/addhom.jpg"))); // NOI18N
        bttselecionefuncionariocad.setBorder(null);
        bttselecionefuncionariocad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttselecionefuncionariocad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttselecionefuncionariocadActionPerformed(evt);
            }
        });
        jPanel1.add(bttselecionefuncionariocad);
        bttselecionefuncionariocad.setBounds(420, 150, 120, 110);

        bttselecionecartcad.setBackground(new java.awt.Color(0, 0, 0));
        bttselecionecartcad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/card1.jpg"))); // NOI18N
        bttselecionecartcad.setBorder(null);
        bttselecionecartcad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttselecionecartcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttselecionecartcadActionPerformed(evt);
            }
        });
        jPanel1.add(bttselecionecartcad);
        bttselecionecartcad.setBounds(280, 340, 130, 110);

        bttselecionecontascad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/contas.jpg"))); // NOI18N
        bttselecionecontascad1.setBorder(null);
        bttselecionecontascad1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttselecionecontascad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttselecionecontascad1ActionPerformed(evt);
            }
        });
        jPanel1.add(bttselecionecontascad1);
        bttselecionecontascad1.setBounds(150, 340, 110, 110);

        bttselecioneprodutopesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/saltoalto.png"))); // NOI18N
        bttselecioneprodutopesq.setBorder(null);
        bttselecioneprodutopesq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttselecioneprodutopesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttselecioneprodutopesqActionPerformed(evt);
            }
        });
        jPanel1.add(bttselecioneprodutopesq);
        bttselecioneprodutopesq.setBounds(150, 150, 110, 110);

        bttselecioneclientepesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/addcli.jpg"))); // NOI18N
        bttselecioneclientepesq.setBorder(null);
        bttselecioneclientepesq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttselecioneclientepesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttselecioneclientepesqActionPerformed(evt);
            }
        });
        jPanel1.add(bttselecioneclientepesq);
        bttselecioneclientepesq.setBounds(280, 150, 120, 110);

        bttselecionefornecedorcad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fornecedor.jpg"))); // NOI18N
        bttselecionefornecedorcad.setBorder(null);
        bttselecionefornecedorcad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttselecionefornecedorcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttselecionefornecedorcadActionPerformed(evt);
            }
        });
        jPanel1.add(bttselecionefornecedorcad);
        bttselecionefornecedorcad.setBounds(420, 340, 120, 110);

        bttvoltarmenupesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltaresquerdanovo.jpg"))); // NOI18N
        bttvoltarmenupesquisar1.setToolTipText("Voltar para o menu de pesquisas!");
        bttvoltarmenupesquisar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        bttvoltarmenupesquisar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttvoltarmenupesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttvoltarmenupesquisar1ActionPerformed(evt);
            }
        });
        jPanel1.add(bttvoltarmenupesquisar1);
        bttvoltarmenupesquisar1.setBounds(30, 500, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-5, 0, 930, 580);

        setSize(new java.awt.Dimension(931, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttselecioneprodutopesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttselecioneprodutopesqActionPerformed
//InputStream inputStream = getClass().getResourceAsStream( "relatorios/Clientes.jasper" );
 InputStream inputStream = GUIRelatorios.class.getClassLoader().getResourceAsStream("relatorios/Produtos.jasper");
        // mapa de parâmetros do relatório (ainda vamos aprender a usar)
        Map parametros = new HashMap();
 
 try{       
            ReportUtils.openReport("Produtos", inputStream, parametros, ConnectionFactory.getLojaConnection() );
  } catch ( SQLException exc ) {
            exc.printStackTrace();
        } catch ( JRException exc ) {
            exc.printStackTrace();
        }
    }//GEN-LAST:event_bttselecioneprodutopesqActionPerformed

    private void bttselecioneclientepesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttselecioneclientepesqActionPerformed
//InputStream inputStream = getClass().getResourceAsStream( "relatorios/Clientes.jasper" );
 InputStream inputStream = GUIRelatorios.class.getClassLoader().getResourceAsStream("relatorios/Clientes.jasper");
        // mapa de parâmetros do relatório (ainda vamos aprender a usar)
        Map parametros = new HashMap();
 
 try{       
            ReportUtils.openReport("Clientes", inputStream, parametros, ConnectionFactory.getLojaConnection() );
  } catch ( SQLException exc ) {
            exc.printStackTrace();
        } catch ( JRException exc ) {
            exc.printStackTrace();
        }
    }//GEN-LAST:event_bttselecioneclientepesqActionPerformed

    private void bttselecionefornecedorcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttselecionefornecedorcadActionPerformed
//InputStream inputStream = getClass().getResourceAsStream( "relatorios/Clientes.jasper" );
 InputStream inputStream = GUIRelatorios.class.getClassLoader().getResourceAsStream("relatorios/Fornecedores.jasper");
        // mapa de parâmetros do relatório (ainda vamos aprender a usar)
        Map parametros = new HashMap();
 
 try{       
            ReportUtils.openReport("Fornecedores", inputStream, parametros, ConnectionFactory.getLojaConnection() );
  } catch ( SQLException exc ) {
            exc.printStackTrace();
        } catch ( JRException exc ) {
            exc.printStackTrace();
        }
    }//GEN-LAST:event_bttselecionefornecedorcadActionPerformed

    private void bttselecionecontascad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttselecionecontascad1ActionPerformed
String lugar="";

Object [] conts = {"Contas a pagar","Contas a receber"};

int op = JOptionPane.showOptionDialog(null,"Selecione uma opção","Relatório - FaciModas 1.0",0,3,null,conts,"");
if (op == 0){
lugar = "ContasAPagar";
}else{
lugar = "ContasAReceber";    
}
 InputStream inputStream = GUIRelatorios.class.getClassLoader().getResourceAsStream("relatorios/"+lugar+".jasper");
        // mapa de parâmetros do relatório (ainda vamos aprender a usar)
        Map parametros = new HashMap();
 
 try{       
            ReportUtils.openReport(lugar, inputStream, parametros, ConnectionFactory.getLojaConnection() );
  } catch ( SQLException exc ) {
            exc.printStackTrace();
        } catch ( JRException exc ) {
            exc.printStackTrace();
        }
    }//GEN-LAST:event_bttselecionecontascad1ActionPerformed

    private void bttselecionefuncionariocadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttselecionefuncionariocadActionPerformed
//InputStream inputStream = getClass().getResourceAsStream( "relatorios/Clientes.jasper" );
 InputStream inputStream = GUIRelatorios.class.getClassLoader().getResourceAsStream("relatorios/Funcionarios.jasper");
        // mapa de parâmetros do relatório (ainda vamos aprender a usar)
        Map parametros = new HashMap();
 
 try{       
            ReportUtils.openReport("Funcionarios", inputStream, parametros, ConnectionFactory.getLojaConnection() );
  } catch ( SQLException exc ) {
            exc.printStackTrace();
        } catch ( JRException exc ) {
            exc.printStackTrace();
        }
    }//GEN-LAST:event_bttselecionefuncionariocadActionPerformed

    private void bttselecionecartcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttselecionecartcadActionPerformed
//InputStream inputStream = getClass().getResourceAsStream( "relatorios/Clientes.jasper" );
 InputStream inputStream = GUIRelatorios.class.getClassLoader().getResourceAsStream("relatorios/Cartao.jasper");
        // mapa de parâmetros do relatório (ainda vamos aprender a usar)
        Map parametros = new HashMap();
 
 try{       
            ReportUtils.openReport("Cartao", inputStream, parametros, ConnectionFactory.getLojaConnection() );
  } catch ( SQLException exc ) {
            exc.printStackTrace();
        } catch ( JRException exc ) {
            exc.printStackTrace();
        }
    }//GEN-LAST:event_bttselecionecartcadActionPerformed

    private void bttvoltarmenupesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttvoltarmenupesquisar1ActionPerformed
  this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bttvoltarmenupesquisar1ActionPerformed

    private void bttselecionefuncionariocad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttselecionefuncionariocad1ActionPerformed
//InputStream inputStream = getClass().getResourceAsStream( "relatorios/Clientes.jasper" );
 InputStream inputStream = GUIRelatorios.class.getClassLoader().getResourceAsStream("relatorios/Pedidos.jasper");
        // mapa de parâmetros do relatório (ainda vamos aprender a usar)
        Map parametros = new HashMap();
 
 try{       
            ReportUtils.openReport("Pedidos", inputStream, parametros, ConnectionFactory.getLojaConnection() );
  } catch ( SQLException exc ) {
            exc.printStackTrace();
        } catch ( JRException exc ) {
            exc.printStackTrace();
        }
    }//GEN-LAST:event_bttselecionefuncionariocad1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttselecionecartcad;
    private javax.swing.JButton bttselecioneclientepesq;
    private javax.swing.JButton bttselecionecontascad1;
    private javax.swing.JButton bttselecionefornecedorcad;
    private javax.swing.JButton bttselecionefuncionariocad;
    private javax.swing.JButton bttselecionefuncionariocad1;
    private javax.swing.JButton bttselecioneprodutopesq;
    private javax.swing.JButton bttvoltarmenupesquisar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblselecionar;
    // End of variables declaration//GEN-END:variables
}
