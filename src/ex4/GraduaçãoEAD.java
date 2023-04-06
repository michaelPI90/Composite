package ex4;

public class GraduaçãoEAD implements GraduacaoAbstract {


            private String local = "polo";
            private String requisitos = "ensino medio";


    public GraduaçãoEAD() {

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
        return "GraduaçãoEAD local=" + local + ", requisitos=" + requisitos + "";
    }


    

}
