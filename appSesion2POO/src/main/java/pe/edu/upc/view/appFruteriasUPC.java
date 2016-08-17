package pe.edu.upc.view;

import pe.edu.upc.entity.Fruta;

public class appFruteriasUPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruta objFruta=new Fruta("Mango", "Amarillo", "Dulce");
		System.out.println(objFruta.toString());
		
		Fruta.Lugarorigen="Otro Lugar";
		System.out.println(Fruta.Lugarorigen);

	}

}
