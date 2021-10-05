import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorSopaipillasTest {


    @Test
    void validarNumeroSopaipillas() {
        VendedorSopaipillas testVendedor = new VendedorSopaipillas();
        boolean prueba  = testVendedor.validarNumeroSopaipillas(-100);
        assertFalse(prueba);
    }
    @Test
    void validarNumeroSopaipillas2() {
        VendedorSopaipillas testVendedor = new VendedorSopaipillas();
        boolean prueba  = testVendedor.validarNumeroSopaipillas(299);
        assertTrue(prueba);
    }

    @Test
    void validarPago() {
        VendedorSopaipillas testVendedor = new VendedorSopaipillas(50000, 2500);
        boolean prueba = testVendedor.validarPago(5000);
        assertFalse(prueba);
    }

    @Test
    void calcularValorVenta() {
        VendedorSopaipillas testVendedor = new VendedorSopaipillas();
        int precio = testVendedor.calcularValorVenta(10);
        assertEquals(5000,precio);
    }
}