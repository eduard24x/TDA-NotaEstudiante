
package nota_estudiante;//Paquete

public class promedio_notas {//Clase publica
    int uno, dos, tres;//variables
    
    public promedio_notas(int uno, int dos, int tres){//Creación del método constructor
        
    }//Parentesis que cierra al método constructor

    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public int getDos() {
        return dos;
    }

    public void setDos(int dos) {
        this.dos = dos;
    }

    public int getTres() {
        return tres;
    }

    public void setTres(int tres) {
        this.tres = tres;
    }
    
    public void promedio(int uno, int dos, int tres){//Creación del método promedio
        int promedio=(uno+dos+tres)/3;//Operación
        System.out.println("El promedio de las tres notas es :" +promedio);//Mensaje al usuario
    }//Parentesis que cierra al método
    
}//Parentesis que cierra la clase promedio_notas
