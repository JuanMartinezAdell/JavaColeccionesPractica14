/**
 * 
 */
package poot7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author Juan
 *
 */
public class TestHotel {
	
	private HashSet<Hotel> hoteles;
	private Object getHoteles;
	
	/**
	 * @param hoteles
	 */
	public TestHotel( ) {
	
		hoteles = new HashSet<>();
	}
	
	public HashSet<Hotel> getHoteles() {
		return hoteles;
	}
	
	public TreeSet<Hotel> buscar(String zona){
		
		//Crear un TreeSet
		TreeSet<Hotel> hotelesOrder = new TreeSet<>();
		
		for(Hotel h : hoteles) {
			if(h.getZona().equals(zona))
				hotelesOrder.add(h);
		}
		
		return hotelesOrder;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestHotel th = new TestHotel();
		//Creamos conjunto sin ordenar de hoteles

		
		//Añadoimos 10 hoteles de cada zona
		for(int i=0; i<10; i++) {
			th.getHoteles().add(new Hotel(i, "playa", "Hotel"+i,  200+(10*i)));
		}
		
		for(int i=10; i<20; i++) {
			th.getHoteles().add(new Hotel(i, "montaña", "Hotel"+i,  300+(10*i)));
		}
		
		for(int i=20; i<30; i++) {
			th.getHoteles().add(new Hotel(i, "rural", "Hotel"+i,  400+(10*i)));
		}
		
		
		for(Hotel h : th.getHoteles()) {
			System.out.println(th);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Donde quieres el hotel: ");
		System.out.println("1.Playa");
		System.out.println("2.Montaña");
		System.out.println("3.Rural");
		String opcion = sc.nextLine();
		switch(opcion) {
		case "1":{
			System.out.println(th.buscar("playa"));
			break;
		}
		case "2":{
			System.out.println(th.buscar("montaña"));
			break;
		}
		case "3":{
			System.out.println(th.buscar("rural"));
			break;
		}
			
		
		default: new IllegalArgumentException("Unexpected value: " + opcion);
	}
	}

}
