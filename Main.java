
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1 = new Triangulo("Bermudas", 20,10,15);
		Triangulo t2 = new Triangulo("Triangulo T", 200,100,150);
		
		//Crear objeto de cada uno
		// Implementar Interfaz (los metodos que deben incluirse y hacer los calculos
		//Implementar la interfaz en todas las figuras 
		
		
//		System.out.println(t1);
		Main.imprimirCalculos(t1); //usar esto para imprimir
		Main.imprimirCalculos(t2);
	}//main 

	//esto No deberia ser modificado
		
	public static void imprimirCalculos(FiguraGeometrica t) { 
		System.out.println(t);
		System.out.println("+-------------------------------------------+");
		System.out.println("| El area de [" + t.getNombre() + "]");
		System.out.println("| Es " + t.calcularArea() );
		System.out.println("| El perimetro es de [" +t.getNombre()+ "]");
		System.out.println("| Es " + t.calcularPerimetro() );
		System.out.println("+-------------------------------------------+");
	}//imprimitcalculos
	
	
	
}//classMain
