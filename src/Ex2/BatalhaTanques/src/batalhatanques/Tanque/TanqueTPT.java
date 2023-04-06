package Ex2.BatalhaTanques.src.batalhatanques.Tanque;

public class TanqueTPT implements TanqueAbstract {
    private double posicaoX = 5.52;
    public double posicaoY = 4.3;
    private String corCanhao = "Rosa";


    public TanqueTPT(String tanque) {
    }

   

    @Override
    public String getCorCanhao() {
        return this.corCanhao;
    }

    @Override
    public void atirar() {
      System.out.println("sai da frente estou atirando");
    }

    @Override
    public double getposicaoX() {
       return  this.posicaoX;
    }

    @Override
    public double getposicaoY() {
        return this.posicaoY;
    }



    @Override
    public String toString() {
        return "TanqueTPT [posicaoX=" + posicaoX + ", posicaoY=" + posicaoY + ", corCanhao=" + corCanhao + "]";
    }



   

 
}
