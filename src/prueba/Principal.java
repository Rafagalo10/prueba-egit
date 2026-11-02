package prueba;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Persona persona1 = new Persona();
		System.out.println("Introducir nombre");
		persona1.setNombre(scanner.nextLine());
		System.out.println("Introducir Apellidos");
		persona1.setApellidos(scanner.nextLine());
		System.out.println("Introducir Edad");
		persona1.setEdad(scanner.nextInt());
		
		
		persona1.saludar();
		

	}

}
