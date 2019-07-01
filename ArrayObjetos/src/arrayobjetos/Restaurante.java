package arrayobjetos;

public class Restaurante {
    private String nombre;
    private String direccion;
    private String distrito;
    private int cantidadMesas;
    private int aforo;
    private String horaInicio;
    private String horaFin;

    public Restaurante(String nombre, String direccion, String distrito, int cantidadMesas, int aforo, String horaInicio, String horaFin) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.distrito = distrito;
        this.cantidadMesas = cantidadMesas;
        this.aforo = aforo;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getCantidadMesas() {
        return cantidadMesas;
    }

    public void setCantidadMesas(int cantidadMesas) {
        this.cantidadMesas = cantidadMesas;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    
}
