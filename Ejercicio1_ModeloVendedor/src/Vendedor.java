public class Vendedor {
    public String vendedor;
    public String area;
    private double montoVendido;
    private int porcentajeComision;
    private int cumplimimentoMeta;

    public Vendedor(String vendedor, String area){
        if (vendedor==null||vendedor.isBlank()){
            System.out.println("Error, no se permite campos vacios");
        }
        else {
            this.vendedor=vendedor;
        }
        if (area==null||area.isBlank()){
            System.out.println("Error, no se permite campos vacios");
        }
        else {
            this.area=area;
        }
    }

    public void setMontoVendido(double montoVendido) {
        if (montoVendido>=0){
            this.montoVendido = montoVendido;
        }
        else{
            System.out.println("Error... No puede haber valores negativos");
        }
    }

    public void setPorcentajeComision(int porcentajeComision) {
        if (porcentajeComision>=0){
            this.porcentajeComision = porcentajeComision;
        }
        else {
            System.out.println("Error... el porcentaje de comision no puede ser negativo");
        }
    }

    public void setCumplimimentoMeta(int cumplimimentoMeta) {
        if (cumplimimentoMeta>=0&&cumplimimentoMeta<100){
            this.cumplimimentoMeta = cumplimimentoMeta;
        }
        else {
            System.out.println("Error... No se permiten valores negaivos ni mayores a 100");
        }
    }

    public double getMontoVendido() {
        return montoVendido;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    public int getCumplimimentoMeta() {
        return cumplimimentoMeta;
    }

    public double calcularComision(double montoVendido, int porcentajeComision){
        double comision;
        comision=montoVendido*(porcentajeComision/100.0);
        return comision;
    }

    public void calcularIngresoTotal(double montoVendido, double comision){
        double ingresoT= montoVendido+comision;
        System.out.println("EL ingreso total fue de: "+ ingresoT);
    }

    public String obtenerEstadoCumplimiento(int cumplimimentoMeta){
        if (cumplimimentoMeta>=90){
            return "Excelente";
        }

        else if (cumplimimentoMeta>=70&&cumplimimentoMeta<90) {
            return "Aceptable";
        }
        else {
            return "Bajo";
        }
    }

    public void obtenerMensajeDesempeno(String estado){
        if (estado.equals("Excelente")) {
            System.out.println("Vendedor con desempeño sobresaliente");
        }
         else if (estado.equals("Aceptable")){
             System.out.println("Vendedor con desempeño aceptable");
        }
        else{
            System.out.println("Se requiere seguimiento comercial");
        }

    }


}
