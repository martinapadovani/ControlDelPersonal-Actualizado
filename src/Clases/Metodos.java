package Clases;

import java.util.Scanner;

public class Metodos {
	
	int sector;
	String operacion;
	Scanner scanner = new Scanner(System.in);
	
	Empleado empleadosRRHH[] = {}; //RRHH
	Empleado empleadosFinanzas[]; //Finanzas
	Empleado empleadosDesarrollo[]; //Desarrollo
	
	public Metodos (Empleado [] empleadosRRHH, Empleado empleadosFinanzas[], Empleado empleadosDesarrollo[]) {
		
		this.empleadosRRHH = empleadosRRHH;
		this.empleadosFinanzas = empleadosFinanzas;
		this.empleadosDesarrollo = empleadosDesarrollo;
	}
	
    
    //Ver 
  
    public void verEmpleados () {
    	
    	System.out.println("Eligio la opcion de Ver Empleados!");
    	
    	System.out.println("Elija el sector de empleados que desea ver, las opciones son: ");
    	System.out.println("1. RRHH");
    	System.out.println("2. Desarrollo");
    	System.out.println("3. Finanzas");
    	
    	int sector = scanner.nextInt();

		switch (sector) {
			case 1:

				System.out.println("Los empleados del area de RRHH son: ");
				mostrarEmpleados(empleadosRRHH);
				
			break;
		
			case 2:
				System.out.println("Los empleados del area de Desarrollo son: ");
				mostrarEmpleados(empleadosDesarrollo);

			break;
			case 3:
				System.out.println("Los empleados del area de Finanzas son: ");
				mostrarEmpleados(empleadosFinanzas);
			break;
			default:
				System.out.println("Opcion invalida");
				break;
		}
		
  	}
 
    //Agregar
    
    public void agregarEmpleados () {
    	
    	System.out.println("Eligio la opcion de Agregar Empleados!");
    	
    	System.out.println("Ingrese el nombre del nuevo empleado");
    	String nombreEmpleado = scanner.nextLine();
    	
    	System.out.println("Ingrese el apellido del nuevo empleado");
    	String apellidoEmpleado = scanner.nextLine();
    	
    	System.out.println("Ingrese el email del nuevo empleado");
    	String emailEmpleado = scanner.nextLine();
    	
    	System.out.println("Ingrese el dni del nuevo empleado");
    	int dniEmpleado = scanner.nextInt();
    	
    	System.out.println("Ingrese el id del nuevo empleado");
    	int idEmpleado = scanner.nextInt();
    	
    	System.out.println("Ingrese el sueldo del nuevo empleado");
    	int sueldoEmpleado = scanner.nextInt(); //no consume el carácter de nueva línea que se genera al presionar "Enter", 
        scanner.nextLine(); // Consumir el carácter de nueva línea pendiente, para que no omita la entrada que se espera en turnoEmpleado
    	
    	System.out.println("Ingrese el turno del nuevo empleado");
    	String turnoEmpleado = scanner.nextLine();
    	
    	System.out.println("Ingrese el sector del nuevo empleado, las opciones son:  'RRHH', 'Desarrollo', 'Finanzas' ");
    	String sectorEmpleado = scanner.nextLine();
    	
    	Empleado nuevoEmpleado = new Empleado
    			(nombreEmpleado, apellidoEmpleado, emailEmpleado, dniEmpleado, idEmpleado, sueldoEmpleado, turnoEmpleado, sectorEmpleado);
   
        if (sectorEmpleado.equalsIgnoreCase("RRHH")) {;

			agregarEmpleado(empleadosRRHH, nuevoEmpleado);
        	
    	}
         
        else if (sectorEmpleado.equalsIgnoreCase("Desarrollo")) {

			agregarEmpleado(empleadosDesarrollo, nuevoEmpleado);
    	}
         
        else if (sectorEmpleado.equalsIgnoreCase("Finanzas")) {
			agregarEmpleado(empleadosFinanzas, nuevoEmpleado);
    	}
         
        else {
        	System.out.println("El sector ingresado no existe");
        }
    
    }
    
    //Despedir

	public Empleado[] despedir(Empleado [] empleados){
		
		System.out.println("Ingrese el id de la persona que desea despedir");
		int idDespedido = scanner.nextInt();
			scanner.nextLine();
   
		Empleado empleadosAuxiliar [] = new Empleado[10];


			for (int i = 0; i<empleados.length; i++) {
	   
			if(empleados [i] != null){
				if (idDespedido != empleados[i].getIdEmpleado()) {
					empleadosAuxiliar [i] = empleados[i];
				  }
			   }
		
		}
		empleados= empleadosAuxiliar;
   
		System.out.println("El empleado despedido ha sido eliminado del sistema exitosamente!");
	   	mostrarEmpleados(empleados);

		return empleados;
		
	}



	////Extras

	public void mostrarEmpleados(Empleado [] empleados){
		for (Empleado empleadoIngresado: empleados) {

			if (empleadoIngresado == null) {
				continue;
			}
			
		  System.out.println(empleadoIngresado);
		}
	}

	public void agregarEmpleado(Empleado [] empleados, Empleado nuevoEmpleado){
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] == null) {
				empleados[i] = nuevoEmpleado;
				break;
			}
		}

		System.out.println("El empleado: " + nuevoEmpleado.getNombre() + " " + nuevoEmpleado.getApellido() + " fue cargad@ exitosamente!");
	}

	

}

