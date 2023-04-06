package ex4;

public class CreateGraduacao {
    
public GraduacaoAbstract getFormacao(String forma){
    if (forma.equalsIgnoreCase("Graduacao")){
            return new GraduacaoPresencial();
    }
        if (forma.equalsIgnoreCase("EAD"))
            return new GraduaçãoEAD();


              if (forma.equalsIgnoreCase("Pos"))
            return new PosGraduacao();
            return null;



      
}


}
