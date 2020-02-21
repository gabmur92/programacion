package ejercicio99;

public class cliente {
	private static int edad;
	private static String nombre;
	
		public cliente(String nombre, int edad) {
			this.nombre=nombre;
			this.edad=edad;
			
			
		}
		public static  void cli() {
			
			System.out.println(nombre+" "+edad);
		}
	
	
}
