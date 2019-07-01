package arrayobjetos;


public class ArrayObjetos {

    public static void main(String[] args) {
        /**Restaurante arregloObjetos[] = new Restaurante[3];
        //instanciando los restaurantes
        arregloObjetos[0] = new Restaurante("RT01", "jR aaaaaaaa", "Villa el Salvador", 23, 141, "12:00", "23:00");
        arregloObjetos[1] = new Restaurante("RT02", "jR bbbb", "Villa el Salvador", 20, 120, "11:00", "22:00");
        arregloObjetos[2] = new Restaurante("RT03", "jR cccccc", "Surco", 28, 180, "11:00", "23:00");
        System.out.println(arregloObjetos[1].getNombre());
        int total = 0;
        for (int i = 0; i <arregloObjetos.length ; i++) {
            total+=arregloObjetos[i].getCantidadMesas();
        }
        System.out.println(total);**/
        
        ventanarestaurante ventana = new ventanarestaurante();
        ventana.setVisible(true);
    }
    
}
