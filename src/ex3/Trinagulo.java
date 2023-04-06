package ex3;

public class Trinagulo implements AbastracFormas{


private int numArestas = 3;





 
    @Override
    public int numArestas() {
       return this.numArestas;
    }






    public int getNumArestas() {
        return numArestas;
    }






    public Trinagulo() {
        
    }






    @Override
    public String toString() {
        return "Trinagulo [numArestas=" + numArestas + "]";
    }






    public void setNumArestas(int numArestas) {
        this.numArestas = numArestas;
    }
    
}
