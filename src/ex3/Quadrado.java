package ex3;

public class Quadrado implements AbastracFormas {
    


    
private int numArestas = 4;

 


@Override
public String toString() {
    return "Quadrado [numArestas=" + numArestas + "]";
}


public Quadrado() {
  
}


@Override
public int numArestas() {
   return this.numArestas;
}


public int getNumArestas() {
    return numArestas;
}


public void setNumArestas(int numArestas) {
    this.numArestas = numArestas;
}

}


