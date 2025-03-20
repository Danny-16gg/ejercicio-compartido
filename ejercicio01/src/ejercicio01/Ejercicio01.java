
package ejercicio01;
import javax.swing.JOptionPane;

public class Ejercicio01 {

    public static void main(String[] args) {
        int numeroIn, numeroFin;
        int contador=0;
        int i=1;
        
       
        while(i==1){
            
        numeroIn = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero incial: "));
        numeroFin = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero donde termine: "));
       
            if (numeroIn <=numeroFin){            
                System.out.println(" "+numeroIn);        
                while (numeroIn <= numeroFin){
                    numeroIn++;
                    contador++;
                    if (numeroIn>numeroFin){
                    continue;
                      }
                    System.out.println(" "+numeroIn);
                    
                }
            System.out.println("los numero sumados son: "+contador);
            }
            else if (numeroIn >=numeroFin){            
                System.out.println(" "+numeroIn);        
                while (numeroIn >= numeroFin){
                    numeroIn--;
                    contador++;
                    if (numeroIn<numeroFin){
                    continue;
                      }
                    System.out.println(" "+numeroIn);
                } 
            System.out.println("los numero sumados son: "+contador);

            }
            else {
                System.out.println("Error");
        }
        int respuesta = JOptionPane.showConfirmDialog(null, "¿desacontinuar?");
        
        if (respuesta == JOptionPane.YES_OPTION){
            i=1;
        }
        else{
            break;
        }
        }
    }
}

    
   
