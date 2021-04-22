/**
 * 
 */
package poot7;

import java.util.LinkedList;

/**
 * @author Juan
 *
 */
public class ColaGen<T>{
	
	private LinkedList<T> cola;

	/**
	 * @param cola
	 */
	public ColaGen( ) {
		
		this.cola = new LinkedList<>();
	}
	
	
	public void insertar(T t) {
		cola.offer(t);
	}
	
	public T sacar() {
		return cola.poll();
		
	}
	
	public T mostrar() {
		return cola.peek();
		
	}
	
	public String monstrarTodo() {
		StringBuilder sb = new StringBuilder();
		for(T t : cola) {
			sb.append(t + System.getProperty("line.separator"));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		ColaGen<Persona> filaVacunas = new ColaGen<>();
		
		filaVacunas.insertar(new Persona("Juan", "Martinez", 40));
		filaVacunas.insertar(new Persona("Pepe", "Martinez", 35));
		filaVacunas.insertar(new Persona("Rocio", "Martinez", 40));
		
		System.out.println(filaVacunas.mostrar());
		System.out.println(filaVacunas.monstrarTodo());
	}
}
