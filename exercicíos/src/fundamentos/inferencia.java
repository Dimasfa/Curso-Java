package fundamentos;

public class inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; // variável foi declarada
		d=123.65; // variável foi inicializada
		System.out.println(d); // usada!
		// acima está um exemplo em duas linhas no double.
		
		// com o var não é possível fazer como o double em duas linhas.
		// uma variável sempre sera númerica ou de texto 
	}

}
