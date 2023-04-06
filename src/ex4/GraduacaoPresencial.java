package ex4;

public class GraduacaoPresencial implements GraduacaoAbstract {


    private String local = "unidade";
    private String requisitos = "ensino medio";


    public GraduacaoPresencial() {

    }


  
@Override
    public String getLocal() {
      return this.local;
    }

    @Override
    public String getRequisitos() {
      return  this.requisitos;
    }



    @Override
    public String toString() {
        return "GraduacaoPresencial [local=" + local + ", requisitos=" + requisitos + "]";
    }

    

}
