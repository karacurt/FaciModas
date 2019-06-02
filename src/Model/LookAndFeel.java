/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Xavier
 */
public class LookAndFeel {
    public static void estilo(){
     String laf="";  
  
try {  
  
            try {  
                //TENTA USAR O NIMBUS  
                UIManager.LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();  
  
                if (laf.length() == 0) {  
                    laf = "NimbusLookAndFeel";  
                }  
  
                for (UIManager.LookAndFeelInfo lookAndFeelInfo : info) {  
                    if (lookAndFeelInfo.getClassName().contains(laf)) {  
                        UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());  
                        break;  
                    }  
                }  
  
            } catch (Exception ex) {  
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  
            }  
  
        } catch (ClassNotFoundException ex) {  
        } catch (InstantiationException ex) {  
        } catch (IllegalAccessException ex) {  
        } catch (UnsupportedLookAndFeelException ex) {  
}  
    }
}
