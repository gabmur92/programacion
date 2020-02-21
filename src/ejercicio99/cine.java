package ejercicio99;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cine {

	public static void main(String[] args) {
		Scanner tcl=new Scanner(System.in);
		//HasMap<Integer, client> cine_sala = HasMap <Integer, client>();

		String nombre;
		int edad;
		int salas;
		int menu;
		int acceso;
		
		boolean si=true;
		
		System.out.println("Bienvenido a kinepolis, ¿de cuantas salas dispone tu cine? ");
		salas=tcl.nextInt();
		sala s1=new sala(salas);
		ArrayList<String> s=new ArrayList(salas);
	
		
		do {
		
		System.out.println("-----------------Menu Kinepolis----------------");
		System.out.println("1-Encolar cliente en una sala");
		System.out.println("2-Desencolar cliente de la sala");
		System.out.println("3-Informacion de una sala");
		System.out.println("4-Estado del cine");
		System.out.println("5-salir");
		menu=tcl.nextInt();
		
		switch(menu) {
			case 1:{
				System.out.println("Sobre que sala desea realizar la operacion?");	
				acceso =tcl.nextInt();
				
				
				if(acceso>salas) {
					System.out.println("la sala a la que intentas acceder no existe");
				}
				else {
					System.out.println("introduzca el nombre del cliente");
					nombre =tcl.next();
					
					System.out.println("introduzca su edad");	
					edad=tcl.nextInt();
					
					// necesito bucle para crear nuevos clientes
					cliente c1=new cliente(nombre, edad);
					Queue <cliente> client =new LinkedList<cliente>();
					client.add(c1);
				}
				break;
			}
			case 2:{
			
			}
			case 3:{
			
			}
			case 4:{
				sala.salac();
				break;
			}
			case 5:{
				si =false;
			}
			
		
		
		}
		}while(si==true);
		System.out.println("saliste del cine");
				
	}
	}


