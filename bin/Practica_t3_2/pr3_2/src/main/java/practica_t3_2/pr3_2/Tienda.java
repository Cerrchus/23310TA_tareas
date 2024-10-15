package practica_t3_2.pr3_2;

public class Tienda {
private CalcDesc calculadora;
public Tienda(CalcDesc calculadora) {
this.calculadora = calculadora;
}
public double ComprarProducto(double precio, double porcentajeDescuento,
Boolean oferta) {
if (oferta) {
return calculadora.aplicarDescuento(precio, porcentajeDescuento);
} else {
return precio;
}
}
}