public class Main {
    public static void main() {
        Paciente p1 = new Paciente("Carlos Pérez","Premium", 4 );
        p1.setID("0102030405");
        p1.setEdad(45);
        p1.setCosto(25.50);
        p1.setNumeroC(3);
        double costoT=p1.costoTotal(p1.getCosto(),p1.getNumeroC());
        int tipo= p1.transformacion(p1.tipoSeguro);
        double descuento = p1.descuento(costoT,tipo);
        String clasificacion = p1.prioridad(p1.nivelPrioridad);
        p1.mensajeAtencion(clasificacion);
        p1.mostrarReporteCompleto();

    }
}
