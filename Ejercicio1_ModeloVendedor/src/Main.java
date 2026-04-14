import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String vendedor;
        String area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        vendedor= sc.nextLine();
        System.out.println("Ingrese el area de trabajo: ");
        area= sc.nextLine();
        Vendedor v1= new Vendedor(vendedor, area);
        v1.setMontoVendido(2000);
        v1.setPorcentajeComision(8);
        v1.setCumplimimentoMeta(95);
        double comision=v1.calcularComision(v1.getMontoVendido(),v1.getPorcentajeComision());
        v1.calcularIngresoTotal(v1.getMontoVendido(),comision);
        String estado=v1.obtenerEstadoCumplimiento(v1.getCumplimimentoMeta());
        v1.obtenerMensajeDesempeno(estado);
    }
}
