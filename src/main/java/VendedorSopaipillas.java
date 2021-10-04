import java.util.InputMismatchException;
import java.util.Scanner;

public class VendedorSopaipillas {
    private String nombre;
    private String nombreCarrito;
    private int cantSopaipillas;
    private int dineroTotal;
    private int dineroVenta;

    public VendedorSopaipillas(String nombre, String nombreCarrito) {
        this.nombre = nombre;
        this.nombreCarrito = nombreCarrito;
        hacerSopaipillas();
        realizarVenta();

    }

    public void hacerSopaipillas() {
        int cantidad = -1;
        while (!validarNumeroSopaipillas(cantidad)){
            System.out.println("Sopaipillas a hacer: ");
            cantidad =leerCantidadSopaipillas();
        }
        setCantSopaipillas(cantidad);


    }

    public int leerCantidadSopaipillas(){
        int cantidad = 0;
        Scanner input = new Scanner(System.in);
        try {
            cantidad = input.nextInt();
        }catch (InputMismatchException e){
            input.next();
            System.out.println("Valor invalido");


        }
        return cantidad;
    }

    public boolean validarNumeroSopaipillas(int cantidad){
        return 0 < cantidad && cantidad < 300;
    }


    private void setCantSopaipillas(int cantSopaipillas) {
        this.cantSopaipillas = cantSopaipillas;
    }

    public int realizarVenta(){
        int cantidad = -1;
        while (!validarSopaipillasVenta(cantidad)){
            System.out.println("¿Cuantas sopaipillas quiere comprar? ");
            cantidad =leerCantidadSopaipillas();
        }
        return cantidad;

    }

    public boolean validarSopaipillasVenta(int cantidad){
        return 0<cantidad && cantidad<this.cantSopaipillas;
    }

    public void venderSopaipillas(int cant){
        int dineroVentas = 0;
        int precioSopaipillas = 500;

        dineroVentas = cant*precioSopaipillas;
        setDinero(dineroVentas);
        setCantSopaipillas(getCantSopaipillas()-cant);

    }

    public void setDinero(int dineroTotal) {
        this.dineroTotal = dineroTotal;
    }

    public int getCantSopaipillas() {
        return cantSopaipillas;
    }

    public int getDinero(){
        return dineroTotal;
    }
}
