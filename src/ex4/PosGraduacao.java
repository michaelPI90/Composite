package ex4;

public class PosGraduacao  implements GraduacaoAbstract{

    private String local = "unidade";
    private String requisitos = "ensino medio";


    public PosGraduacao() {

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
        return "PosGraduacao [local=" + local + ", requisitos=" + requisitos + "]";
    }

    
}
