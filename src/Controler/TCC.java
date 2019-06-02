
package Controler;



import View.GUILogin;
import View.GUISplash;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Table;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TCC {
    
 static  String url2 = "jdbc:mysql://localhost/loja"; // enderço do BD
  static String username = "root";        //nome de um usuário de seu BD
  static String password = "";  // senha do BD
  static Connection conn;
     
     public static void main(String[] args) {
         
          Conectar.carregarDriver(); 
                     Connection con = null;
       try {

                    con = (Connection) DriverManager.getConnection(url2, username, password);
                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Primeira Ultilização!\nAperte OK para instalar o banco de dados","FaciModas 1.0",1);
              
              try {
                   url2 = "jdbc:mysql://localhost/"; 
                         con = (Connection) DriverManager.getConnection(url2, username, password);
              } catch (SQLException ex1) {
                        try {
                  username = JOptionPane.showInputDialog(null,"Escreva o nome do usuário do localhost","FaciModas 1.0",1);
                  password = JOptionPane.showInputDialog(null,"Escreva a senha do usuário "+username+" do localhost","FaciModas 1.0",1);
                  url2 = "jdbc:mysql://localhost"; 
                        con = (Connection) DriverManager.getConnection(url2, username, password);
                   } catch (SQLException ex2) {
               JOptionPane.showMessageDialog(null,"Senha/Usuário do localhost inválida!\nMude o usuário para root e deixe sem senha\n"+ex2,"FaciModas 1.0",1);
                            }
              }
              
                try{             
                    
                    
                
    

                      

      String sql = "CREATE DATABASE loja;" ;


                try{
                   
                   PreparedStatement criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute(); // Executando a inserção
                       
               } catch(SQLException f){
                JOptionPane.showMessageDialog(null,"\nErro na criação do banco. Tente Novamente!\n"+f,"ERRO!",0);
            }
                try{
                   url2 = "jdbc:mysql://localhost/loja";
                     con = (Connection) DriverManager.getConnection(url2, username, password);
                sql = 
"CREATE TABLE cartao (" +
"  cart_cod int(9) NOT NULL AUTO_INCREMENT,\n" +
"  cart_num bigint(18) NOT NULL,\n" +
"  cart_cli_dtnasc date NOT NULL,\n" +
"  cart_cli_nome varchar(50) NOT NULL,\n" +
"  cart_cli_cpf bigint(18) NOT NULL,\n" +
"  cart_val date NOT NULL,\n" +
"  cart_grufi varchar(50) NOT NULL,\n" +
"  cart_sexo varchar(15) NOT NULL,\n" +
"  cart_estacivil varchar(50) NOT NULL,\n" +
"  cart_saldo float DEFAULT NULL,\n" +
"  PRIMARY KEY (cart_cod,cart_num));";
                
                  PreparedStatement criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();         
                       
                     sql =   "CREATE TABLE cliente (\n" +
"  cli_cod int(9) NOT NULL AUTO_INCREMENT,\n" +
"  cli_cpf bigint(14) NOT NULL,\n" +
"  cli_rg bigint(14) NOT NULL,\n" +
"  cli_nome varchar(50) NOT NULL,\n" +
"  cli_end varchar(50) NOT NULL,\n" +
"  cli_bairro varchar(20) NOT NULL,\n" +
"  cli_compl varchar(20) NOT NULL,\n" +
"  cli_cep int(8) NOT NULL,\n" +
"  cli_tel bigint(14) DEFAULT NULL,\n" +
"  cli_email varchar(30) DEFAULT NULL,\n" +
"  cli_dtnasc date NOT NULL,\n" +
"  cli_pontpromo int(9) DEFAULT NULL,\n" +
"  PRIMARY KEY (cli_cod,cli_cpf));";
                   criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();
                   sql = 
"CREATE TABLE contasapagar (\n" +
"  cap_cod int(9) NOT NULL AUTO_INCREMENT,\n" +
"  cap_dte date NOT NULL,\n" +
"  cap_dtvenc date NOT NULL,\n" +
"  cap_cobrador varchar(50) NOT NULL,\n" +
"  cap_ncobra varchar(50) NOT NULL,\n" +
"  cap_tipo varchar(50) NOT NULL,\n" +
"  cap_valor float NOT NULL,\n" +
"  cap_status varchar(10) NOT NULL,\n" +
"  cap_desc varchar(50) NOT NULL,\n" +
"  cap_obs varchar(100) NOT NULL,\n" +
"  PRIMARY KEY (cap_cod)\n" +
");\n";
                   criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();
                   sql =
                   
"CREATE TABLE  contasareceber (\n" +
"  car_cod int(9) NOT NULL AUTO_INCREMENT,\n" +
"  car_dte date NOT NULL,\n" +
"  car_dtvenc date NOT NULL,\n" +
"  car_sacado varchar(50) NOT NULL,\n" +
"  car_ncobra varchar(50) NOT NULL,\n" +
"  car_tipo varchar(50) NOT NULL,\n" +
"  car_valor float NOT NULL,\n" +
"  car_status varchar(10) NOT NULL,\n" +
"  car_desc varchar(50) NOT NULL,\n" +
"  car_obs varchar(100) NOT NULL,\n" +
"  PRIMARY KEY (car_cod)\n" +
") ;\n";
                   criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();
                   sql =
"CREATE TABLE empresa (\n" +
"  emp_cnpj bigint(14) NOT NULL,\n" +
"  emp_insc bigint(14) NOT NULL,\n" +
"  emp_nome varchar(50) NOT NULL,\n" +
"  emp_tel bigint(14) NOT NULL,\n" +
"  emp_site varchar(50) NOT NULL,\n" +
"  emp_email varchar(50) NOT NULL,\n" +
"  PRIMARY KEY (emp_cnpj)\n" +
");\n"; 
                           criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();
                   sql =
"CREATE TABLE fornecedor (\n" +
"  forn_cod int(9) NOT NULL AUTO_INCREMENT,\n" +
"  forn_cnpj bigint(25) NOT NULL,\n" +
"  forn_ie bigint(25) DEFAULT NULL,\n" +
"  forn_rasoci varchar(50) NOT NULL,\n" +
"  forn_end varchar(50) DEFAULT NULL,\n" +
"  forn_bairro varchar(20) NOT NULL,\n" +
"  forn_compl varchar(20) NOT NULL,\n" +
"  forn_cep int(8) DEFAULT NULL,\n" +
"  forn_tel bigint(14) DEFAULT NULL,\n" +
"  forn_email varchar(30) NOT NULL,\n" +
"  PRIMARY KEY (forn_cod,forn_cnpj));";
                   
                   criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();
                   sql =
"CREATE TABLE funcionario (\n" +
"  func_cod int(9) NOT NULL AUTO_INCREMENT,\n" +
"  func_nome varchar(50) NOT NULL,\n" +
"  func_cpf bigint(14) NOT NULL,\n" +
"  func_rg bigint(14) NOT NULL,\n" +
"  func_ctps bigint(20) NOT NULL,\n" +
"  func_dtnasc date NOT NULL,\n" +
"  func_end varchar(50) NOT NULL,\n" +
"  func_bairro varchar(20) NOT NULL,\n" +
"  func_compl varchar(20) NOT NULL,\n" +
"  func_cep int(8) NOT NULL,\n" +
"  func_tel bigint(14) DEFAULT NULL,\n" +
"  func_sal float NOT NULL,\n" +
"  func_comi float DEFAULT NULL,\n" +
"  func_peri varchar(50) NOT NULL,\n" +
"  func_email varchar(50) DEFAULT NULL,\n" +
"  PRIMARY KEY (func_cod)\n" +
");\n";
                   criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();
                   sql =
"CREATE TABLE  nf (\n" +
"  nf_cod int(9) NOT NULL AUTO_INCREMENT,\n" +
"  nf_cpf bigint(14) NOT NULL,\n" +
"  nf_desc varchar(50) NOT NULL,\n" +
"  nf_valor float NOT NULL,\n" +
"  nf_dte date NOT NULL,\n" +
"  PRIMARY KEY (nf_cod,nf_cpf)\n" +
");\n";
                   criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();
                   sql =
"CREATE TABLE pedido (\n" +
"  pedi_cod int(9) NOT NULL AUTO_INCREMENT,\n" +
"  pedi_data date NOT NULL,\n" +
"  pedi_cli_cod int(9) NOT NULL,\n" +
"  pedi_desc varchar(255) DEFAULT NULL,\n" +
"  pedi_obs varchar(30) NOT NULL,\n" +
"  pedi_total float NOT NULL,\n" +
"  pedi_forpaga varchar(20) NOT NULL,\n" +
"  pedi_codfunc int(9) NOT NULL,\n" +
"  PRIMARY KEY (pedi_cod,pedi_data)\n" +
");\n";
                   criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();
                   sql =
                           
"CREATE TABLE produto (\n" +
"  prod_cod int(9) NOT NULL AUTO_INCREMENT,\n" +
"  prod_codbarra varchar(50) NOT NULL,\n" +
"  prod_nome varchar(50) NOT NULL,\n" +
"  prod_tipo varchar(50) NOT NULL,\n" +
"  prod_marca varchar(20) NOT NULL,\n" +
"  prod_vlvenda float NOT NULL,\n" +
"  prod_vlforn float NOT NULL,\n" +
"  prod_tam varchar(50) NOT NULL,\n" +
"  prod_cor varchar(30) NOT NULL,\n" +
"  prod_cate varchar(20) NOT NULL,\n" +
"  prod_quant int(9) NOT NULL,\n" +
"  prod_taxatri float NOT NULL,\n" +
"  prod_margem float NOT NULL,\n" +
"  PRIMARY KEY (prod_cod)\n" +
");\n";
                   criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();
                   sql =
"CREATE TABLE usuario (\n" +
"  user_cod int(9) NOT NULL AUTO_INCREMENT,\n" +
"  user_login varchar(50) NOT NULL,\n" +
"  user_pass varchar(50) NOT NULL,\n" +
"  user_func_cod varchar(50) NOT NULL,\n" +
"  user_tipo varchar(50) NOT NULL,\n" +
"  PRIMARY KEY (user_cod,user_login)\n" +
");"; 
                           criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute();
                   sql =
"\nINSERT INTO usuario (user_cod,user_login,user_pass,user_func_cod,user_tipo) VALUES\n" +
"	(1, 'admin', 'adminyrev', '0', 'Administrador');";
                        

                
               criarbanco = (PreparedStatement) con.prepareStatement(sql);
                   criarbanco.execute(); // Executando a inserção
                       
               } catch(SQLException f){
                JOptionPane.showMessageDialog(null,"\nErro na criação de tabelas do banco. Tente Novamente!\n"+f,"ERRO!",0);
            }

             
                
                }catch (HeadlessException e) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null,"Erro ao conectar com o SQL\nPor favor verifique se o computador tem o MySQL Instalado!\n"+e,"ERRO!",0);
            }

              }
       
           new GUISplash().setVisible(true);
         


     }
      public static void refresh(JTable tabela, String onde){
    
try{
      
  conn = (Connection) DriverManager.getConnection(url2, username, password);
    Conectar.carregarDriver();    
    
    System.out.println("realizado");
            String sql = "SELECT * FROM " + onde + ";";
PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
ResultSet rs = pst.executeQuery();
tabela.setModel(Atualizar.cliente(rs, onde));
for (int indice=0; indice < tabela.getColumnCount(); indice ++){
tabela.getColumnModel().getColumn(indice).setPreferredWidth(150);
}
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}    
    } 
      
 public static void pesquisa(JTable tabela, String onde, String coluna, String coluna2, String palavra){
    
try{
      
  conn = (Connection) DriverManager.getConnection(url2, username, password);
    Conectar.carregarDriver();    
    
    System.out.println("realizado");
            String sql = "SELECT * FROM " + onde + " WHERE "+coluna+" LIKE '"+palavra+"%' OR "+coluna2+" LIKE '"+palavra+"%';";
PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
ResultSet rs = pst.executeQuery();
tabela.setModel(Atualizar.cliente(rs, onde));
for (int indice=0; indice < tabela.getColumnCount(); indice ++){
tabela.getColumnModel().getColumn(indice).setPreferredWidth(150);
}
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}    
    } 
}
