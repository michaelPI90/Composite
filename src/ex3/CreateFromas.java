package ex3;

public class CreateFromas {
    
public AbastracFormas getForma(String forma){
    if (forma.equals("Triangulo"))
            return new Trinagulo();
        if (forma.equals("Quadrado"))
            return new Quadrado();
        return null;
}

}
