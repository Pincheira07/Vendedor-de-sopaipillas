public class EjemploVendedor {
    public static void main(String[] args) {
        VendedorSopaipillas miVendedor = new VendedorSopaipillas("Luis Perez", "Sopaipletos", 100000);
        System.out.println(miVendedor.getCantSopaipillas());
        int cantidad = miVendedor.realizarVenta();
        miVendedor.venderSopaipillas(cantidad);
        miVendedor.cobrar();
    }
}
