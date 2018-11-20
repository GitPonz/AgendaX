package agendax;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AgendaX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion,menor,mayor,num;
        String nombre;
        Agenda agenda = new Agenda();
        
        
        
        do{
            Menu.mostrarmenu();
            System.out.println("Que accion quieres realizar");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: 
                        leer = new Scanner(System.in);
                        System.out.println("Dame un nuevo contacto (nombre,telefono y edad)");
                        Persona p= new Persona(leer.nextLine(),leer.nextInt(), leer.nextInt());
                        agenda.añadirPersona(p);
                        break;
                        
                case 2: 
                        leer = new Scanner(System.in);
                        System.out.println("Dame un nombre para borrar su contacto");
                        nombre=leer.nextLine();
                        agenda.borrarPersona(nombre);
                        break;
                        
                case 3: 
                        leer = new Scanner(System.in);
                        System.out.println("La agenda va a contar los contactos mayores de edad");
                        num=0;
                        agenda.contarMayoresDeEdad(num);
                        
                        System.out.println("Hay "+ num + "mayores de edad");
                        break;
                
                case 4: 
                        leer = new Scanner(System.in);
                        System.out.println("Dame el rango de valores");
                        System.out.println("El menor");
                        menor = leer.nextInt();
                        System.out.println("El mayor");
                        mayor = leer.nextInt();
                        
                        agenda.buscarRangoEdad(menor, mayor);
                        break;
                        
                case 5: 
                        leer = new Scanner(System.in);
                        agenda.mostrarContactos();
                        break;
                        
                case 0:
                        System.out.println("Adios");
                        break;
                    
                default:
                        System.out.println("Numero incorrecto");
            }
        }while(opcion!=0); 
        
                        System.out.println("Has salido de la agenda");
    }      
}  

