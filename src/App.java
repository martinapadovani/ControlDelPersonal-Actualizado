import java.util.Scanner;

import Clases.Empleado;
import Clases.Metodos;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Sector Recursos Humanos

		Empleado r1 = new Empleado("Romina", "Lopez", "rominalopez@gmail.con", 23034187, 1, 87500, "mañana", "RRHH");

		Empleado r2 = new Empleado("Martin", "Rodriguez", "martinrodriguez@gmail.com", 37487129, 3287, 66300, "tarde",
				"RRHH");

		// Sector Finanzas

		Empleado f1 = new Empleado("Julieta", "Suarez", "julietasuarez@gmail.com", 35677235, 3094, 77500, "mañana",
				"Finanzas");

		Empleado f2 = new Empleado("Juan Martin", "Arocha", "juanmarocha@gmail.com", 36775304, 3953, 10200, "tarde",
				"Finanzas");

		// Sector Desarrollo

		Empleado d1 = new Empleado("Martina", "Padovani", "martinapadovani@gmail.com", 26598225, 2877, 96500, "mañana",
				"Desarrollo");

		Empleado d2 = new Empleado("Franco", "Pedraza", "francopedraza@gmail.com", 28576283, 3298, 85300, "tarde",
				"Desarrollo");

		Scanner scanner = new Scanner(System.in);
		

		// Lista empleados
		Empleado empleadosRRHH[] = new Empleado[10];
        empleadosRRHH[0] = r1;
        empleadosRRHH[1] = r2;
		Empleado empleadosFinanzas[] = new Empleado[10];
        empleadosFinanzas[0] = f1;
        empleadosFinanzas[1] = f2;
		Empleado empleadosDesarrollo[] = new Empleado[10];
        empleadosDesarrollo[0] = d1;
        empleadosDesarrollo[1] = d2;


        boolean mantenerse = true;

        while (mantenerse) {

            System.out.println("Elegir operacion que desea realizar, las opciones son: '1.Ver', '2.Agregar', '3.Despedir' '0.Salir'");

            int operacion = scanner.nextInt();
            scanner.nextLine();
    
            Metodos metodos = new Metodos(empleadosRRHH, empleadosFinanzas, empleadosDesarrollo);

            switch (operacion) {
		
                case 1: 
                    
                    metodos.verEmpleados();
                    mantenerse = deseaContinuar();
                    /*La funcion devuelve el valor booleano correspondiente, y realizo la asignacion acá, y no dentro de la funcion,
                     ya que los valores booleanos se pasan por valor y no por referencia, 
                     por lo tanto, si realizaba la asignacion en el metodo, no hubiese afectado la variable original
                    */

                break;
                    
                case 2: 
                    
                    metodos.agregarEmpleados();
                    mantenerse = deseaContinuar();

                break;
                    
                case 3: 

                    System.out.println("Eligio la opcion de despedir empleado!");
                
                    System.out.println("Elija el sector del empleado que desea despedir, las opciones son: ");
                    System.out.println("1. RRHH");
                    System.out.println("2. Desarrollo");
                    System.out.println("3. Finanzas");
                    int sector = scanner.nextInt();
                
                    switch (sector) {
                        case 1:
                    
                            empleadosRRHH = metodos.despedir(empleadosRRHH);

                            break;
                    
                        case 2:
                             empleadosDesarrollo = metodos.despedir(empleadosDesarrollo);
                            break;
                    
                        case 3:
                            empleadosFinanzas= metodos.despedir(empleadosFinanzas);

                            break;
                    
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                        mantenerse = deseaContinuar();
                break;
                    
                case 0:
        
                    System.out.println("Hasta pronto!");
                    mantenerse = false;
                break;
                
                default: 
                    System.out.println("Opcion invalida, vuelva a intentarlo");
            }
            
        }

        
    }

    static boolean deseaContinuar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Desea continuar? Si/No");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("No")) {
            System.out.println("¡Hasta Pronto!");
            return false;
        }
        return true;
    }
}
