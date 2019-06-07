package registroconyuge;

import javax.swing.JOptionPane;

public class MatrizConyuges {
    private String[][] matrizDatos;
    private int contador=-1;

    public MatrizConyuges() {
        matrizDatos = new String[100][6];
    }
    
    public boolean esVacia(){
        return contador==-1;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void anadirPareja(String nombreE, String apellidoE, String fechaE,String nombreA, String apellidoA, String fechaA){
        contador++;
        matrizDatos[contador][0] = nombreE;
        matrizDatos[contador][1] = apellidoE;
        matrizDatos[contador][2] = fechaE;
        matrizDatos[contador][3] = nombreA;
        matrizDatos[contador][4] = apellidoA;
        matrizDatos[contador][5] = fechaA;
    }
    
    public String[] buscarIndice(int indice){
        return matrizDatos[indice];
    }
    
    public void insertarTabla(){
        for (int i = 0; i <=contador; i++) {
            
            VentanaRegistro.objeto[0]=matrizDatos[i][0];
            VentanaRegistro.objeto[1]=matrizDatos[i][1];
            VentanaRegistro.objeto[2]=matrizDatos[i][2];
            VentanaRegistro.objeto[3]=matrizDatos[i][3];
            VentanaRegistro.objeto[4]=matrizDatos[i][4];
            VentanaRegistro.objeto[5]=matrizDatos[i][5];
            
            VentanaRegistro.modelo.addRow(VentanaRegistro.objeto);
            
        }
    }
    
    public void cambiarPosicion(int index1, int index2){
        String[] temporal        = matrizDatos[index1];
        matrizDatos[index1] = matrizDatos[index2];
        matrizDatos[index2] = temporal;
    }
    
    public void buscarConyuges(int inicio, int finall, String apellido){
        if(inicio>finall){
            JOptionPane.showMessageDialog(null, "No se encuentra a la persona en el registro");
        }else{
            int centro = (inicio+finall)/2;
            if(apellido.toLowerCase().equals(buscarIndice(centro)[1].toLowerCase())){
                JOptionPane.showMessageDialog(null, "La persona se encuentra en el registro, en la posición "+(centro+1));
                VentanaRegistro.tablaRegistro.setRowSelectionInterval(centro, centro);
            } else{
                if (apellido.compareToIgnoreCase(buscarIndice(centro)[1])<0) {
                    buscarConyuges(inicio, centro-1, apellido);
                } else {
                    buscarConyuges(centro+1, finall, apellido);
                }
            }
        }
    }
    
}
