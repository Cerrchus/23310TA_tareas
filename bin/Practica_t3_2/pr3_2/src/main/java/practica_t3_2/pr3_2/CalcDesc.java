package practica_t3_2.pr3_2;

public class CalcDesc {

	
	Double precio;
	Double porcentDesc;
	
	
	public double aplicarDescuento(double precio, double porcentDesc) {
		if(precio<0||porcentDesc<0||porcentDesc>100) {
			throw new IllegalArgumentException("esos valores no me valen chaval");
		}
		
		return precio-(precio*(porcentDesc/100));
	}
}
