
@SuppressWarnings("hiding")
public class Arbol<String extends Comparable<String>> {

	private Nodo<String> raiz;

	public Arbol() {
		this.raiz = null;
	}
	
	public boolean Vacio() {
		return raiz == null;
	}
	
	public Nodo<String> buscarNodo(String nombre) {
		return buscarNodo(nombre, raiz);
	}

	private Nodo<String> buscarNodo(String nombre, Nodo<String> nodo) {
		if (nodo == null)
			return null;
		else {
			if (nombre.compareTo(nodo.getNombre()) < 0)
				return buscarNodo(nombre, nodo.getIzq());
			else if (nombre.compareTo(nodo.getNombre()) > 0)
				return buscarNodo(nombre, nodo.getDer());
			else
				return nodo;
		}
	}
	
	public void Insertar(String nombre) {
		if (Vacio()) {
			raiz = new Nodo<String>(nombre);
		}
		Insertar(nombre, raiz);
	}

	private void Insertar(String nombre, Nodo<String> r) {
		if (r != null) {
			if (nombre.compareTo(r.getNombre()) < 0) {
				if (r.getIzq() != null) 
					Insertar(nombre, r.getIzq());
				else  // si no, agregamos el nuevo nodo
					r.setIzq(new Nodo<String>(nombre));
			}
			if (nombre.compareTo(r.getNombre()) > 0) {
				if (r.getDer() != null) 
					Insertar(nombre, r.getDer());
				else  /
					r.setDer(new Nodo<String>(nombre));
			}
		}
	}
	
	public void ImprimirArbol() {
		ImprimirArbol(raiz);
	}

	private void ImprimirArbol(Nodo<String> nodo) {
		if (nodo != null) {
			ImprimirArbol(nodo.getIzq());
			System.out.println(nodo.getNombre());
			ImprimirArbol(nodo.getDer());
		}
	}
	
}