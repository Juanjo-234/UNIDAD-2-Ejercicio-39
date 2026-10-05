public class CamaraQR implements LectorOptico{
    @Override
    public String escanearCodigo() {
        System.out.println("Enfocando matriz de puntos y enfocando codigo QR");
        return "https://tienda.virtual/producto/sku-98765";
    }
}
