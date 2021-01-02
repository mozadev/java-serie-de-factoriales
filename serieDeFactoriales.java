
package prueba3;

import javax.swing.JOptionPane;

public class prueba3 {
   public static void main(String[] args) {
           int m,n,f=1,a,b,sum=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n: "));
        for(int i=1;i<n+1;i++){
            f*=i;
            sum+=f;
        }
        JOptionPane.showMessageDialog(null,"El resultado es: "+sum);
        
        
    }
    
}