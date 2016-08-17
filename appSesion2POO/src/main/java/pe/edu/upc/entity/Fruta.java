package pe.edu.upc.entity;

public class Fruta {
	//ATRIBUTOS DE INSTANCIA:LOS VALORES CAMBIAN POR CADA OBJETO QUE SE AGREGUE
	//this: generar constructor
	private String nombre;
	private String color;
	private String sabor;
	private boolean puedoHacerJugo;
	
	//atributos clase
	
	public static String Lugarorigen="UPC";
	
	//constructor sobrecarga
	
	public Fruta(){
		this.nombre = "Indefinido";
		this.color = "S/C";
		this.sabor = "S/C";
		this.puedoHacerJugo=false;
	}
	
	

	public Fruta(String nombre, String color, String sabor) {
		super();//heredar constructor clase padre
		this.nombre = nombre;
		this.color = color;
		this.sabor = sabor;
		this.puedoHacerJugo=false;
	}
	
	//Metodos de Acceso de datos (set get)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isPuedoHacerJugo() {
		return puedoHacerJugo;
	}

	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		this.puedoHacerJugo = puedoHacerJugo;
	}

//Sobre escritura de metodos heredados

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", puedoHacerJugo="
				+ puedoHacerJugo + "]";
	}
}
