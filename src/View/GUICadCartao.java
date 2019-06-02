/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controler.Conectar;
import static View.GUIPesquisarCartao.alteracaocartao;
import static View.GUIPesquisarCartao.codigocartao;
import static View.GUIPesquisarCartao.pesqcartaocpf;
import static View.GUIPesquisarCartao.pesqcartaodtnasc;
import static View.GUIPesquisarCartao.pesqcartaoestacivil;
import static View.GUIPesquisarCartao.pesqcartaogrufi;
import static View.GUIPesquisarCartao.pesqcartaonome;
import static View.GUIPesquisarCartao.pesqcartaonum;
import static View.GUIPesquisarCartao.pesqcartaosaldo;
import static View.GUIPesquisarCartao.pesqcartaosexo;
import static View.GUIPesquisarCartao.pesqcartaoval;
import static View.GUIVender.pegarcliente;
import com.mysql.jdbc.PreparedStatement;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author lab0519
 */
public class GUICadCartao extends javax.swing.JFrame {

    static long num;
    static String clidtnasc;
    static String clinome;
    static String val;
    static String grufi;
    static String sexo;
    static String estacivil;
    static float saldo;
    static int cod;
    static long cpf;
    static boolean pegarcartao=false;

    String url2 = "jdbc:mysql://localhost/loja"; // enderço do BD
  String username = "root";        //nome de um usuário de seu BD
  String password = "";  // senha do BD
            
    public GUICadCartao() {

       Model.LookAndFeel.estilo();
     Model.LookAndFeel.estilo();      
      
     initComponents();
    
              this.setDefaultCloseOperation(2);      this.setResizable(false);   this.setTitle("FaciModas 1.0"); 
this.setLocationRelativeTo( null );  
 DecimalFormat dFormat = new DecimalFormat("#,###,###.00") ;
        NumberFormatter formatter = new NumberFormatter(dFormat) ;
        formatter.setFormat(dFormat) ;
        formatter.setAllowsInvalid(false) ;      
        txtsaldo.setFormatterFactory ( new DefaultFormatterFactory ( formatter ) ) ;
             

        
if (alteracaocartao == true ){

DateFormat formate = new SimpleDateFormat("yyyy-dd-MM");
                    Date cartval=null, cartnasc=null;
            try {
cartnasc = (java.util.Date) formate.parse(pesqcartaodtnasc);
cartval= (java.util.Date) formate.parse(pesqcartaoval);
               
                
            } catch (ParseException ex) {
                Logger.getLogger(GUICadCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
           

 cod = codigocartao;
 if (pesqcartaosexo.equals("Feminino")){
     radiobuttonfemcart.setSelected(true);
 }
  if (pesqcartaosexo.equals("Masculino")){
          radiobuttonmascart.setSelected(true);
 }
               txtnumcart.setText(pesqcartaonum);
                txtcpfcart.setText(pesqcartaocpf);
         txtdatacart.setDate(cartnasc);
         txtclientecart.setText(pesqcartaonome);
         datavalcart.setDate(cartval);
         txtsaldo.setText(pesqcartaosaldo);
         comboboxgrupofidcart.setSelectedItem(pesqcartaogrufi); 
         comboboxestadocivilcart.setSelectedItem(pesqcartaoestacivil) ;
        lblselecionar.setText("Alterar Cartão");
       bttcadastrarcartao.setText("Salvar");
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

        cartsexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelimg = new javax.swing.JLabel();
        labelcodcliente = new javax.swing.JLabel();
        txtnumcart = new javax.swing.JTextField();
        try

        {

            javax.swing.text.MaskFormatter cart= new 

            javax.swing.text.MaskFormatter("############");

            txtnumcart = new javax.swing.JFormattedTextField(cart);

        }

        catch (Exception e)

        {     

            JOptionPane.showMessageDialog(null,"Ocorreu um erro");//mensagem se acontecer erro

        }
        labelnomecliente = new javax.swing.JLabel();
        labeldtnascliente = new javax.swing.JLabel();
        labelvalcartao = new javax.swing.JLabel();
        labelnomecliente1 = new javax.swing.JLabel();
        radiobuttonfemcart = new javax.swing.JRadioButton();
        radiobuttonmascart = new javax.swing.JRadioButton();
        comboboxestadocivilcart = new javax.swing.JComboBox();
        labeldtnascliente1 = new javax.swing.JLabel();
        labelgrupofidelidadecart = new javax.swing.JLabel();
        comboboxgrupofidcart = new javax.swing.JComboBox();
        bttcadastrarcartao = new javax.swing.JButton();
        bttlimparcartao = new javax.swing.JButton();
        datavalcart = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        lblselecionar = new javax.swing.JLabel();
        labelnomecliente2 = new javax.swing.JLabel();
        bttvoltarmenupesquisar = new javax.swing.JButton();
        labelcodcliente1 = new javax.swing.JLabel();
        txtcpfcart = new javax.swing.JFormattedTextField();
        try

        {

            javax.swing.text.MaskFormatter cpf= new 

            javax.swing.text.MaskFormatter("###.###.###-##");

            txtcpfcart = new javax.swing.JFormattedTextField(cpf);

        }

        catch (Exception e)

        {     

            JOptionPane.showMessageDialog(null,"Ocorreu um erro");//mensagem se acontecer erro

        }
        txtsaldo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        labelimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logobranco1.png"))); // NOI18N
        labelimg.setText("jLabel1");
        jPanel1.add(labelimg);
        labelimg.setBounds(-20, -20, 200, 140);

        labelcodcliente.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelcodcliente.setForeground(new java.awt.Color(255, 255, 255));
        labelcodcliente.setText("Saldo:");
        jPanel1.add(labelcodcliente);
        labelcodcliente.setBounds(40, 310, 90, 30);
        jPanel1.add(txtnumcart);
        txtnumcart.setBounds(100, 270, 240, 30);

        labelnomecliente.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelnomecliente.setForeground(new java.awt.Color(255, 255, 255));
        labelnomecliente.setText("Sexo:");
        jPanel1.add(labelnomecliente);
        labelnomecliente.setBounds(40, 230, 60, 30);

        txtclientecart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclientecartActionPerformed(evt);
            }
        });
        jPanel1.add(txtclientecart);
        txtclientecart.setBounds(100, 190, 470, 30);

        labeldtnascliente.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labeldtnascliente.setForeground(new java.awt.Color(255, 255, 255));
        labeldtnascliente.setText("Estado Civil:");
        jPanel1.add(labeldtnascliente);
        labeldtnascliente.setBounds(630, 230, 90, 30);
        jPanel1.add(txtdatacart);
        txtdatacart.setBounds(480, 230, 130, 30);

        labelvalcartao.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelvalcartao.setForeground(new java.awt.Color(255, 255, 255));
        labelvalcartao.setText("Validade:");
        jPanel1.add(labelvalcartao);
        labelvalcartao.setBounds(630, 270, 80, 30);

        labelnomecliente1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelnomecliente1.setForeground(new java.awt.Color(255, 255, 255));
        labelnomecliente1.setText("CPF:");
        jPanel1.add(labelnomecliente1);
        labelnomecliente1.setBounds(630, 190, 60, 30);

        radiobuttonfemcart.setBackground(new java.awt.Color(0, 0, 0));
        cartsexo.add(radiobuttonfemcart);
        radiobuttonfemcart.setForeground(new java.awt.Color(255, 255, 255));
        radiobuttonfemcart.setText("Feminino");
        jPanel1.add(radiobuttonfemcart);
        radiobuttonfemcart.setBounds(100, 230, 90, 30);

        radiobuttonmascart.setBackground(new java.awt.Color(0, 0, 0));
        cartsexo.add(radiobuttonmascart);
        radiobuttonmascart.setForeground(new java.awt.Color(255, 255, 255));
        radiobuttonmascart.setText("Masculino");
        jPanel1.add(radiobuttonmascart);
        radiobuttonmascart.setBounds(200, 230, 90, 30);

        comboboxestadocivilcart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro(a)", "Casado(a)", "Víuvo(a)", "Divorciado(a)" }));
        jPanel1.add(comboboxestadocivilcart);
        comboboxestadocivilcart.setBounds(720, 230, 130, 30);

        labeldtnascliente1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labeldtnascliente1.setForeground(new java.awt.Color(255, 255, 255));
        labeldtnascliente1.setText("Data de nascimento:");
        jPanel1.add(labeldtnascliente1);
        labeldtnascliente1.setBounds(350, 230, 120, 30);

        labelgrupofidelidadecart.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelgrupofidelidadecart.setForeground(new java.awt.Color(255, 255, 255));
        labelgrupofidelidadecart.setText("Grupo Fidelidade:");
        jPanel1.add(labelgrupofidelidadecart);
        labelgrupofidelidadecart.setBounds(350, 270, 130, 30);

        comboboxgrupofidcart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vip", "Master" }));
        jPanel1.add(comboboxgrupofidcart);
        comboboxgrupofidcart.setBounds(480, 270, 130, 30);

        bttcadastrarcartao.setBackground(new java.awt.Color(0, 0, 0));
        bttcadastrarcartao.setForeground(new java.awt.Color(255, 255, 255));
        bttcadastrarcartao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconsave.png"))); // NOI18N
        bttcadastrarcartao.setText("Cadastrar");
        bttcadastrarcartao.setBorder(null);
        bttcadastrarcartao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttcadastrarcartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttcadastrarcartaoActionPerformed(evt);
            }
        });
        jPanel1.add(bttcadastrarcartao);
        bttcadastrarcartao.setBounds(490, 390, 140, 30);

        bttlimparcartao.setBackground(new java.awt.Color(0, 0, 0));
        bttlimparcartao.setForeground(new java.awt.Color(255, 255, 255));
        bttlimparcartao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconlimpar.png"))); // NOI18N
        bttlimparcartao.setText("Limpar");
        bttlimparcartao.setBorder(null);
        bttlimparcartao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttlimparcartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttlimparcartaoActionPerformed(evt);
            }
        });
        jPanel1.add(bttlimparcartao);
        bttlimparcartao.setBounds(340, 390, 140, 30);
        jPanel1.add(datavalcart);
        datavalcart.setBounds(720, 270, 130, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconpesquisar3.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(580, 190, 30, 30);

        lblselecionar.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        lblselecionar.setForeground(new java.awt.Color(255, 255, 255));
        lblselecionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblselecionar.setText("Cadastrar Cartão");
        lblselecionar.setToolTipText("");
        jPanel1.add(lblselecionar);
        lblselecionar.setBounds(100, 60, 750, 40);

        labelnomecliente2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelnomecliente2.setForeground(new java.awt.Color(255, 255, 255));
        labelnomecliente2.setText("Nome:");
        jPanel1.add(labelnomecliente2);
        labelnomecliente2.setBounds(40, 190, 60, 30);

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
        bttvoltarmenupesquisar.setBounds(40, 440, 40, 40);

        labelcodcliente1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelcodcliente1.setForeground(new java.awt.Color(255, 255, 255));
        labelcodcliente1.setText("Número:");
        jPanel1.add(labelcodcliente1);
        labelcodcliente1.setBounds(40, 270, 90, 30);
        jPanel1.add(txtcpfcart);
        txtcpfcart.setBounds(720, 190, 130, 30);
        jPanel1.add(txtsaldo);
        txtsaldo.setBounds(100, 310, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 940, 580);

        setSize(new java.awt.Dimension(895, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttcadastrarcartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttcadastrarcartaoActionPerformed
         num = Long.valueOf(txtnumcart.getText());
         clidtnasc = new SimpleDateFormat("yyyy-MM-dd").format(txtdatacart.getDate());
         clinome = txtclientecart.getText();
        val = new SimpleDateFormat("yyyy-MM-dd").format(datavalcart.getDate());
         grufi = (String) comboboxgrupofidcart.getSelectedItem();  
        val = new SimpleDateFormat("yyyy-MM-dd").format(datavalcart.getDate());
        String tr = txtcpfcart.getText();
        tr = tr.replace(".", "");
        tr = tr.replace("-", "");
        cpf = Long.parseLong(tr);      
        tr = txtsaldo.getText();
         tr = tr.replace(".", "");
        tr = tr.replace(",", ".");        
        saldo = Float.valueOf(tr);
         if (radiobuttonfemcart.isSelected()){
           sexo = "Feminino";             
         }else{
             sexo = "Masculino";
         };
         estacivil = (String) comboboxestadocivilcart.getSelectedItem();
         
   
         
         Conectar.carregarDriver();
      
      try { 
               
                   
               
            Connection con = null;
            
            
    try {
    con = (Connection) DriverManager.getConnection(url2, username, password);
    } catch (SQLException ex) {

    Logger.getLogger(GUICadCartao.class.getName()).log(Level.SEVERE, null, ex);

            
                   }

            // Recebendo os dados a serem inseridos na tabela
            String sql;
             if (alteracaocartao == true){
          sql = "UPDATE cartao SET  cart_num="+num+",cart_cli_dtnasc='"+clidtnasc+"',cart_cli_nome='"+clinome+"',cart_cli_cpf="+cpf+",cart_val='"+val+"',cart_grufi='"+grufi+"',cart_sexo='"+sexo+"',cart_estacivil='"+estacivil+"',cart_saldo="+saldo+" WHERE cart_cod="+cod+";";
    } else{
            sql= "INSERT INTO cartao(cart_cod,cart_num,cart_cli_dtnasc,cart_cli_nome,cart_cli_cpf,cart_val,cart_grufi,cart_sexo,cart_estacivil,cart_saldo) values(null,"+num+",'"+clidtnasc+"','"+clinome+"',"+cpf+",'"+val+"','"+grufi+"','"+sexo+"','"+estacivil+"',"+saldo+");";
             }
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção
 if (alteracaocartao == true){
         JOptionPane.showMessageDialog(null,"Alteração realizada com sucesso!!","",-1);
         alteracaocartao = false;
         new GUIPesquisarCartao().setVisible(true);
         this.dispose();
} else{
  JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
                txtnumcart.setText("");
                txtcpfcart.setText("");
         txtdatacart.setDate(null);
         txtclientecart.setText("");
                 txtsaldo.setText("0,00");
         datavalcart.setDate(null);
         comboboxgrupofidcart.setSelectedItem(null); 
         comboboxestadocivilcart.setSelectedItem(null) ;
 }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            
        }
      
      
    }//GEN-LAST:event_bttcadastrarcartaoActionPerformed

    private void txtclientecartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclientecartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclientecartActionPerformed

    private void bttlimparcartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttlimparcartaoActionPerformed
                txtnumcart.setText("");
                txtcpfcart.setText("");
         txtdatacart.setDate(null);
     txtsaldo.setText("0,00");
         txtclientecart.setText("");
         datavalcart.setDate(null);
         comboboxgrupofidcart.setSelectedItem(null); 
         comboboxestadocivilcart.setSelectedItem(null) ;
    }//GEN-LAST:event_bttlimparcartaoActionPerformed

    private void bttvoltarmenupesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttvoltarmenupesquisarActionPerformed
if(alteracaocartao == true){
    alteracaocartao = false;
        new GUIPesquisarCartao().setVisible(true);      this.dispose();    
}else{
    new GUICadastrarMenu().setVisible(true);      this.dispose();      
}// TODO add your handling code here:
    }//GEN-LAST:event_bttvoltarmenupesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
pegarcartao=true;
        pegarcliente = true;
new GUIPesquisarClientes().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUICadCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICadCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICadCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICadCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICadCartao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttcadastrarcartao;
    private javax.swing.JButton bttlimparcartao;
    private javax.swing.JButton bttvoltarmenupesquisar;
    private javax.swing.ButtonGroup cartsexo;
    private javax.swing.JComboBox comboboxestadocivilcart;
    private javax.swing.JComboBox comboboxgrupofidcart;
    private com.toedter.calendar.JDateChooser datavalcart;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelcodcliente;
    private javax.swing.JLabel labelcodcliente1;
    private javax.swing.JLabel labeldtnascliente;
    private javax.swing.JLabel labeldtnascliente1;
    private javax.swing.JLabel labelgrupofidelidadecart;
    private javax.swing.JLabel labelimg;
    private javax.swing.JLabel labelnomecliente;
    private javax.swing.JLabel labelnomecliente1;
    private javax.swing.JLabel labelnomecliente2;
    private javax.swing.JLabel labelvalcartao;
    private javax.swing.JLabel lblselecionar;
    private javax.swing.JRadioButton radiobuttonfemcart;
    private javax.swing.JRadioButton radiobuttonmascart;
    public static final javax.swing.JTextField txtclientecart = new javax.swing.JTextField();
    public static javax.swing.JFormattedTextField txtcpfcart;
    public static final com.toedter.calendar.JDateChooser txtdatacart = new com.toedter.calendar.JDateChooser();
    private javax.swing.JTextField txtnumcart;
    private javax.swing.JFormattedTextField txtsaldo;
    // End of variables declaration//GEN-END:variables
}
