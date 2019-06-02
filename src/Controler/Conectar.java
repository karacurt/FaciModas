
package Controler;


public class Conectar {
    
      public static void carregarDriver(){
    
        try{
Class.forName("com.mysql.jdbc.Driver").newInstance();
System.out.println("Driver MySQL carregado com sucesso");
}catch(Exception ex){
System.out.println("Drive MySQL não pode ser carregado");
}
      }
    
}
