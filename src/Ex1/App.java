package Ex1;

public class App {
    public static void main(String[] args) throws Exception {
      Diretoria setor = new Diretoria();
      Diretoria empresa = new Diretoria() ;
      DepartamentCoposite rh = new Departamento("rh",50);

      setor.adicionar(rh);
      empresa.adicionar(setor);


      System.out.println(empresa);



        
      };
      


        }
        
    
    


