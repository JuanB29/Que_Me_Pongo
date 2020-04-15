package Ejercicio;

public class Atuendo {

	ParteInferior parteInferior;
	ParteSuperior parteSuperior;
	Calzado calzado;
	Accesorio accesorio;

	public Atuendo(ParteInferior parteInferior, ParteSuperior parteSuperior, Calzado calzado, Accesorio accesorio) {
		
		// si tiene sentido usar ese atuendo...
		
		this.parteInferior = parteInferior;
		this.parteSuperior = parteSuperior;
		this.calzado = calzado;
		this.accesorio = accesorio;
	}
}