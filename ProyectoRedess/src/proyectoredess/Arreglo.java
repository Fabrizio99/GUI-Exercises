package proyectoredess;

import javax.swing.JTable;

public class Arreglo {
    private int[] codigo;
    private String[] descripcion;
    private String[] tipo;
    private int cantidad=-1;

    public Arreglo() {
        codigo = new int[100];
        descripcion = new String[100];
        tipo = new String[100];
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public String[] getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String[] descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresarPorCodigo(int posicion, int dato){
        codigo[posicion]=dato;
    }
    public void agregarElemento(int arr1, String arr2, String arr3){
       cantidad++;
       codigo[cantidad]=arr1;
       descripcion[cantidad]=arr2;
       tipo[cantidad]=arr3;
    }
    public void listarTabla(){
        for (int i = 0; i <= cantidad; i++) {
            Formulario.objeto[0]= codigo[i];
            Formulario.objeto[1]= descripcion[i];
            Formulario.objeto[2]= tipo[i];
            Formulario.modelo.addRow(Formulario.objeto);
        }
        
    }
    
}
