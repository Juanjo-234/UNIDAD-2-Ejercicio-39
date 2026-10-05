public class EscanearLaser implements LectorOptico{
    @Override
    public String escanearCodigo() {
        System.out.println("Emitiendo haz infrarrojo y leyendo codigo de barras");
        return "7791234567890";
    }
}
