public class Paciente {
    public String nombre;
    public String tipoSeguro;
    public int nivelPrioridad;
    private String ID;
    private int edad;
    private double costo;
    private int numeroC;

    public Paciente(String nombre, String tipoSeguro, int nivelPrioridad){
        if (nombre==null||nombre.isBlank()){
            System.out.println("EL campo no puede estar vacio");
        }
        else {
            this.nombre=nombre;
        }
        if (tipoSeguro==null||tipoSeguro.isBlank()){
            System.out.println("EL campo no puede estar vacio");
        }
        else {
            this.tipoSeguro=tipoSeguro;
        }
        if (nivelPrioridad<=5&&nivelPrioridad>0){
            this.nivelPrioridad=nivelPrioridad;
        }
        else {
            System.out.println("Valor invalido");
        }
    }

    public void setID(String ID) {
        if (ID==null||ID.isBlank()){
            System.out.println("El campo no puede estar vacio");
        }
        else {
            this.ID = ID;
        }
    }

    public void setEdad(int edad) {
        if (edad>0){
            this.edad = edad;
        }
        else {
            System.out.println("Edad Invalida");
        }
    }

    public void setCosto(double costo) {
        if (costo>0){
            this.costo = costo;
        }
        else {
            System.out.println("Por favor ingrese valor de consulta");
        }
    }

    public void setNumeroC(int numeroC) {
        if (numeroC>=0){
            this.numeroC = numeroC;
        }
        else {
            System.out.println("No existe registro de consultas");
        }
    }

    public double getCosto() {
        return costo;
    }

    public String getID() {
        return ID;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public double costoTotal(double costo, int cantidad){
        double costoT=costo*cantidad;
        return costoT;
    }

    public int transformacion(String tipo){
        if (tipo.equals("Basico")){
            return 10;
        }
        else if(tipo.equals("Premium")){
            return 20;
        }
        else {
            return 0;
        }
    }

    public double descuento(double costoT, int porcentaje){
        double costoFinal= costoT*(porcentaje/100.00);
        return costoFinal;
    }

    public String prioridad(int nivelp){
        if (nivelp==1){
            return "Prioridad baja";
        } else if (nivelp==2||nivelp==3) {
            return "Prioridad media";
        } else{
            return "Atencion urgente";
        }
    }

    public void mensajeAtencion(String prioridad){
        if (prioridad.equals("Atencion urgente")){
            System.out.println("Atencion inmediata requerida");
        }
        if (prioridad.equals("Prioridad media")) {
            System.out.println("Seguimiento necesario");
        }
        if (prioridad.equals("Prioridad baja")){
            System.out.println("Control regular");
        }
    }



}
