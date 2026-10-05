//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    LectorOptico laser = new EscanearLaser();
    PuntoVenta caja = new PuntoVenta(laser);

    System.out.println("=== ESCENARIO 1: Uso de Escáner Láser ===");
    caja.procesarArticulo();


    System.out.println("=== ESCENARIO 2: Intercambio a Cámara QR ===");
    caja.setLector(new CamaraQR());
    caja.procesarArticulo();
}


