/**
 * 
 */
package poot7;

/**
 * @author Juan
 *
 */
public class Hotel implements Comparable<Hotel> {
	
	private int idHotel;
	private String zona;
	private String nombre;
	private double precio;
	
	/**
	 * 
	 */
	public Hotel( ) {
		super();
		this.idHotel = 0;
		this.zona = "no asignada ";
		this.nombre = " ";
		this.precio = 0;
	}


	/**
	 * @param idHotel
	 * @param zona
	 * @param precio
	 */
	public Hotel(int idHotel, String zona, String nombre, double precio) {
		super();
		this.idHotel = idHotel;
		this.zona = zona;
		this.precio = precio;
		this.nombre = nombre;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hotel [idHotel=");
		builder.append(idHotel);
		builder.append(", zona=");
		builder.append(zona);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idHotel;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (idHotel != other.idHotel)
			return false;
		return true;
	}


	@Override
	public int compareTo(Hotel o) {
		// TODO Auto-generated method stub
		return (int) (this.getPrecio()-o.getPrecio());
	}
	
	
	
	
}
