
package temperaturas;

import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        String ciudades[] = new String[2];
        Double temp_min[] = new Double[2];
        Double temp_max[] = new Double[2];
      

        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        for (int ciudad = 0; ciudad < ciudades.length; ciudad++) {
            System.out.println("Ingrese una ciudad de Misiones: ");
            ciudades[ciudad] = scan.nextLine();

            System.out.println("Ingrese temperatura baja de Misiones: ");
            temp_min[ciudad] = scan1.nextDouble();

            System.out.println("Ingrese temperatura alta de Misiones: ");
            temp_max[ciudad] = scan1.nextDouble();
        }
        Double minimo=temp_min[0];
       
        
        int min_ciudad=0;
         for (int ciudad = 0; ciudad < temp_min.length; ciudad++){
                    if (temp_min[ciudad]<minimo){
                        minimo=temp_min[ciudad];
                        min_ciudad=ciudad;
                    }
         }
          Double maximo=temp_max[0];
          int max_ciudad=0;
          for (int ciudad = 0; ciudad < temp_max.length; ciudad++){
                    if (temp_max[ciudad]>maximo){
                        maximo=temp_max[ciudad];
                        max_ciudad=ciudad;
                    }
         }
          System.out.println("La ciudad de: " + ciudades[min_ciudad] + " registró la temperatura más baja de: " + minimo + "°");
          System.out.println("La ciudad de: " + ciudades[max_ciudad] + " registró la temperatura más alta de: " + maximo + "°");

        
    
} 
          
  }
    