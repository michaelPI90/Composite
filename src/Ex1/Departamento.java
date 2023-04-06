package Ex1;

public class Departamento implements DepartamentCoposite {


        public int qntdFuncionario;
        public String nome;
    



        
    public Departamento(String nome ,int qntdFuncionario) {
            this.qntdFuncionario = qntdFuncionario;
            this.nome = nome;
        }




     @Override
     public String toString() {
        return "Departamento qntdFuncionario=" + qntdFuncionario + ", nome=" + nome + "]";
     }




    @Override
    public int getFuncionarios() {
         
        return  this.qntdFuncionario;
    }
    
}
