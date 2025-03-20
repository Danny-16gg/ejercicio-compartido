package ejercicio1;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        int x,x1,y,i,j;
        i=0;
        j=1;
       
        while (j>=1){
            System.out.println("Estás en la ronda "+ j);
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite la el primer número"));
            x1=x;
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
            
            if(x1<=y){        
                while (x1<=y){
                    System.out.println(" "+ x1);
                    x1++;
                    i++;
                }
            System.out.println("La cantidad de números enteros entre "+ x+ " y " +y+ " es: "+ i);
            }
        
            else if(x1>=y){        
              
                while (x1>=y){
                    System.out.println(" "+ x1);
                    x1--;
                    i++;
                }
            System.out.println("La cantidad de números enteros entre "+ x+ " y " +y+ " es: "+ i);
            }
            
            int resp=JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
            
            if (resp==JOptionPane.YES_OPTION){
                j++;
            }
            else {
                break;
            }
        }
    }   
}
