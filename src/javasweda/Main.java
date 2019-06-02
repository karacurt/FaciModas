/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javasweda;

import com.sun.jna.Native;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        startApp();
    }

    public static void startApp() {
        final CONVECF dll = CONVECF.INSTANCE;
        int ret;

        ret = dll.ECF_AbrePortaSerial();
        System.out.println("Abrindo Porta Serial: "+ret);

        if (ret==0)
            System.out.println("VERIFIQUE A IMPRESSORA FISCAL");
        else;

        byte[] retorno = new byte[10];
       /* ret = dll.ECF_VersaoDll(retorno);
        System.out.println("Versao Dll "+ret+"|"+new String(retorno));*/

       /*//LEITURA X
        ret = dll.ECF_LeituraX();
        System.out.println("Leitura X: "+ret);*/

        //CUPOM FISCAL SIMPLES
        
        ret = dll.ECF_AbreCupomMFD("357.966.988.07","João","Rua das Rosas");
        System.out.println("Abre Cupom: "+ret);

        ret = dll.ECF_VendeItem("123456","Sapato","1800","I","2",2,"1,35","%","0000");
        System.out.println("Vende Item: "+ret);
        
   ret = dll.ECF_VendeItem("123456","Sapato","1800","I","2",2,"1,35","%","0000");
        System.out.println("Vende Item: "+ret);
        
           ret = dll.ECF_VendeItem("123456","Sapato","1800","I","2",2,"1,35","%","0000");
        System.out.println("Vende Item: "+ret);
        ret = dll.ECF_FechaCupom("DINHEIRO", "A", "%", "0000", "34,99", "Volte sempre !");
        System.out.println("Fecha Cupom: "+ret);

     /*  //GERAÇÃO DOS ARQUIVOS DA NFP
        ret = dll.ECF_DownloadMF("C:\\MFISCAL.MF");
        System.out.println("Download mf "+ret);

        ret = dll.ECF_DownloadMFD ("MFD.txt","0","000001","999999","0");
        System.out.println("Download MFD "+ret);

        ret = dll.ECF_ReproduzirMemoriaFiscalMFD("3", "01062009", "30062009", "C:\\cotepe.txt", "C:\\MFISCAL.MF");
        System.out.println("Cotepe "+ret);

        ret = dll.ECF_GeraRegistrosCAT52MFD("", "15072009");
        System.out.println("Geracao de Arquivos "+ret);*/

        ret = dll.ECF_FechaPortaSerial();
        System.out.println("Fechando Porta Serial "+ret);
    }
}
