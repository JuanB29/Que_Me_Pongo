package Ejercicio;

public class Prenda {
	
	 String tipo;
	 Categoria categoria;
	 String tela;
	 String color;
	 String colorSecundario;

	    
    public static void main(String[] args){}

    public Prenda(String unTipo, Categoria unaCategoria, String unaTela, String unColor, String unColorSecundario) {
       
    	this.validarTipo();
    	this.validarTela();
    	this.validarColor();
    	this.validarCategoria();
    	
    	if(!categoria.contieneA(tipo)){
            throw new RuntimeException("El tipo de la prenda no coincide con la categoría");
        
    	} else {
    	
    	tipo = unTipo;
        categoria = unaCategoria;
        tela = unaTela;
        color = unColor;
        colorSecundario = unColorSecundario;

        }
   }
      
    void validarTipo() {
    	if (tipo != null) {
    	   throw new RuntimeException("Una prenda debe tener un tipo definido");
    	}
    }
    
    void validarTela() {
    	if (tela != null) {
    	   throw new RuntimeException("Una prenda debe tener una tela definida");
    	}
    }
    
    void validarColor() {
    	if (color != null) {
    	   throw new RuntimeException("Una prenda debe tener un color definido");
    	}
    }
    
    void validarCategoria() {
    	if (categoria != null) {
    	   throw new RuntimeException("Una prenda debe tener una categoria definida");
    	}
    }
}  


