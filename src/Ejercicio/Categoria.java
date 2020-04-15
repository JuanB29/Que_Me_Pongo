package Ejercicio;
import java.util.ArrayList;

public class Categoria{
  ArrayList<String> tipos; // Se definen en cada categoría
  
  boolean contieneA(String unTipo){
     return tipos.contains(unTipo);
  }
}

class Calzado extends Categoria{

	 ArrayList<String> tipos = new ArrayList<String>();
	 tipos.add("Zapato");
	 tipos.add("Ojota");
	 
	// tipos = ["Zapatilla", "Zapato", "Taco", "Ojota", "Pantufla"];
}

class ParteInferior extends Categoria{
     tipos = ["Pantalon", "Pollera"];
}

class Accesorio extends Categoria{
	tipos = ["Reloj", "Pulsera, Anillo"];
}

class ParteSuperior extends Categoria{
	tipos = ["Remera", "Sueter"];
}
