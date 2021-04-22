/**
 * 
 */
package poot7;

/**
 * @author Juan
 *
 */
public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;	
	
	/**
	 * 
	 */
	public Persona() {
		super();
	}



	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", edad=");
		builder.append(edad  );
		builder.append("");
		return builder.toString();
	}
	
	
	
}
