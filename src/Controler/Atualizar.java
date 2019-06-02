/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Atualizar {
    
    String url2 = "jdbc:mysql://localhost/loja"; // enderço do BD
  String username = "root";        //nome de um usuário de seu BD
  String password = "";  // senha do BD
  
  
    public static DefaultTableModel  cliente(ResultSet rs, String lugar) {
        try {
           ResultSetMetaData metaData = rs.getMetaData();
         int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
  
              
            if (lugar.equals("cartao")){
            columnNames.addElement("Código");
            columnNames.addElement("Numero");
            columnNames.addElement("Data de nascimento");
            columnNames.addElement("Nome");
             columnNames.addElement("CPF");
              columnNames.addElement("Validade");
               columnNames.addElement("Grupo");
                columnNames.addElement("Sexo");
                 columnNames.addElement("Estado civil");
            }
            
            
            if (lugar.equals("fornecedor")){
            columnNames.addElement("Código");
            columnNames.addElement("CNPJ");
            columnNames.addElement("Inscrição Estadual");
            columnNames.addElement("Razão Social");
            columnNames.addElement("Endereço");
            columnNames.addElement("Bairro");
            columnNames.addElement("Complemento");
            columnNames.addElement("CEP");
            columnNames.addElement("Telefone");
            columnNames.addElement("Email");
            }
            
              if (lugar.equals("funcionario")){
            columnNames.addElement("Código");
            columnNames.addElement("Nome");
            columnNames.addElement("CPF");
            columnNames.addElement("RG");
            columnNames.addElement("CTPS");
            columnNames.addElement("Data de nascimento");
            columnNames.addElement("Endereço");
            columnNames.addElement("Bairro");
            columnNames.addElement("Complemento");
            columnNames.addElement("CEP");
            columnNames.addElement("Telefone");
            columnNames.addElement("Salário");
            columnNames.addElement("Comissão");
            columnNames.addElement("Período");
            columnNames.addElement("Email");
            }
            
              if (lugar.equals("pedido")){
            columnNames.addElement("Código");
            columnNames.addElement("Data");
            columnNames.addElement("Código Cliente");
            columnNames.addElement("Descrição");
            columnNames.addElement("Forma de pagamento");
            columnNames.addElement("Total");
            columnNames.addElement("Código funcionário");
            columnNames.addElement("OBS");
            }
              
            if (lugar.equals("produto")){
            columnNames.addElement("Código");
            columnNames.addElement("Código de barras");
            columnNames.addElement("Nome");
            columnNames.addElement("Tipo");
            columnNames.addElement("Marca");
            columnNames.addElement("Tamanho");
            columnNames.addElement("Cor");
            columnNames.addElement("Categoria");
            columnNames.addElement("Quantidade");
            columnNames.addElement("Preço Fornecedor");
            columnNames.addElement("Taxa Tributária");
            columnNames.addElement("Margem");
            columnNames.addElement("Valor de venda");
            }
            
            if (lugar.equals("contasapagar") || lugar.equals("contasareceber") ){
              columnNames.addElement("Código");
            columnNames.addElement("Emissão");
            columnNames.addElement("Vencimento");
            if (lugar.equals("contas a pagar")){
                        columnNames.addElement("Cobrador");
            }else{
                        columnNames.addElement("Sacado");
            }
            columnNames.addElement("Nº Cobrança");
             columnNames.addElement("Tipo");
              columnNames.addElement("Valor");
              columnNames.addElement("Status");
              columnNames.addElement("Descrição");
              columnNames.addElement("Obs");
            }
          
            if (lugar.equals("cliente") ){
              columnNames.addElement("Código");
            columnNames.addElement("CPF");
            columnNames.addElement("RG");
            columnNames.addElement("Nome");
             columnNames.addElement("Endereço");
              columnNames.addElement("Bairro");
              columnNames.addElement("Complemento");
              columnNames.addElement("CEP");
              columnNames.addElement("Telefone");
                columnNames.addElement("Email");
                  columnNames.addElement("Data de Nascimento");
                    columnNames.addElement("Pontos promocionais");
                            }
            
            if(lugar.equals("usuario")){
               columnNames.addElement("Código");
            columnNames.addElement("Usuário");
            columnNames.addElement("Senha");
            columnNames.addElement("Código do funcionário");
             columnNames.addElement("Tipo");            
            }
            
            
            Vector rows = new Vector();
            while (rs.next()) {
                Vector newRow = new Vector();
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                rows.addElement(newRow);
            }
        
           return new DefaultTableModel(rows, columnNames);
       } catch (Exception e) {

           return null;
        }
        }
}
  

