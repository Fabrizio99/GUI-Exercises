package registroconyuge;

public class Conyuge {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    public Conyuge(String nombre, String apellido, String fechaNacimiento) {
        this.nombre          = nombre;
        this.apellido        = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
