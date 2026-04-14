public class Vendedor {
    public String vendedor;
    public String area;
    private double montoVendido;
    private int porcentajeComision;
    private int cumplimimentoMeta;

    public Vendedor(String vendedor, String area){
        if (vendedor=null||vendedor.isBlank()){
            System.out.println("Error, no se permite campos vacios");
        }
        else {
            this.vendedor=vendedor;
        }
        if (area=null||area.isBlank()){
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
        this.porcentajeComision = porcentajeComision;
    }

    public void setCumplimimentoMeta(int cumplimimentoMeta) {
        this.cumplimimentoMeta = cumplimimentoMeta;
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





}
