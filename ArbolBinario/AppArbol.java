
public class AppArbol {

	public static void main(String[] args) {
		
		Arbol<String> a = new Arbol<String>();
		String [] nombres = {"Alfredo", "Javier", "Angel", "Ana", "Antonio", "Luis"};
		
		
		if(a.Vacio()) 
			System.out.println("Arbol vacio");
		else
			System.out.println("Arbol no vacio");
		
		
		System.out.println();
		for(String nombre : nombres) {
			System.out.println(a.buscarNodo(nombre));
		}
		
		for(String nombre : nombres) {
			a.Insertar(nombre);
		}

		System.out.println("\nAhora si se insertaron los nombres");
		
			
		System.out.println();
		if(a.Vacio()) 
			System.out.println("Arbol vacio");
		else
			System.out.println("Arbol NO vacio");
		

		System.out.println("\nArbol InOrden:");
		a.ImprimirArbol();
		
		
		System.out.println();
		for(String nombre : nombres) {
			System.out.println(a.buscarNodo(nombre));
		}

	}
	
	 
}