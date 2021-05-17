
import static javax.swing.JOptionPane.showMessageDialog;

public class ListaDoblePrioridad {

    protected NodoDoble ini;
    protected NodoDoble fin;

    public ListaDoblePrioridad() {
        ini = fin = null;
        
    }

    public boolean insertar(char dato, int nivel) {
        NodoDoble nuevo = new NodoDoble(dato, nivel); // CREACION DE NODO NUEVO
        if (nuevo == null) { 
            return false;
        }
        if (hayListaDobleVacia()) {
            ini = fin = nuevo;
            return true;
        }
            //NIVEL MAYOR 
        if (nuevo.getNivel() > ini.getNivel()){
            nuevo.setSig(ini);
            ini.setAnt(nuevo);
            ini = nuevo;
            return true;
        }
            //NIVRL MENOR
        if(nuevo.getNivel() <= fin.getNivel()){
           fin.setSig(nuevo);
           nuevo.setAnt(fin);
           fin = nuevo;
        return true;
        }
            // DIRECCION INDIRECTA
        NodoDoble temp1 = ini.getSig();
        NodoDoble temp2 = ini; 
        do {
            if(nuevo.getNivel()<= temp1.getNivel()){ 
                temp1 = temp1.getSig();
            }else{
                temp2.setSig(nuevo);
                nuevo.setAnt(temp2);
                nuevo.setSig(temp1);
                temp1.setAnt(nuevo);
                return true; 
            }
                temp2 = temp2.getSig();
        } while (temp2 != null);   
        return false;

    }

    public boolean eliminar() {
      if(hayListaDobleVacia()) return false;
        if(hayUnSoloNodo()){
            ini = fin = null;
            return true;
        }
        NodoDoble temp = ini;
        ini = temp.getSig();
        ini.setAnt(null);
        temp.setSig(null);
        temp = null;
        return true;
    }

    public boolean hayUnSoloNodo() {
        return ini == fin;
    }

    public boolean hayListaDobleVacia() {
        return ini == null && fin == null;
    }

    public NodoDoble getIni() {
        return ini;
    }
}
