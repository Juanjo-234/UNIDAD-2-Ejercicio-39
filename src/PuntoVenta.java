public class PuntoVenta {
    LectorOptico lector;

    public  PuntoVenta(LectorOptico lector){
        this.lector = lector;
    }

    public void setLector(LectorOptico lector) {
        this.lector = lector;
    }
    public void procesarArticulo() {
        System.out.println("--- Caja Registradora: Procesando Artículo ---");
        String codigoDetectado = lector.escanearCodigo();
        System.out.println("Resultado -> Código detectado: " + codigoDetectado);
        System.out.println("-----------------------------------------------\n");
    }
}
