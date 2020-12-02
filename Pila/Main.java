package Pila;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);

      pila pila =new pila();
      int elemento;
     int opc, opc2=0;
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Insertar dato");
        System.out.println("2. eliminar");
        System.out.println("3. mostar");
        System.out.println("4. Salir del programa");
        opc=leer.nextInt();
        switch(opc){
            case 1:
            Scanner Leer = new Scanner(System.in);
            int cont=10;
            while (cont>0){
            System.out.println("inserte un elemento ");
            elemento=Leer.nextInt();
            if(elemento>49 && elemento<501 ){
            pila.empuja(elemento); 
            cont--;
            }
            else{
                System.out.println("El numero no esta en el rango permitido");    
                    }
            }
            break;
            
            case 2:
                pila.Sacarpila();
                break;
            case 3:
                pila.mostrarPila();
                break;
            case 4: 
                System.exit(0);
                break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
        
          System.out.println("\n¿Desea realizar otro proceso? presione 2=NO");
       opc2=leer.nextInt();
       }while(opc2!=2); 


    }
    
}
