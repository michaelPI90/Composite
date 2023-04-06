package Ex2.BatalhaTanques.src.batalhatanques.Tanque;



public class TanqueSPFC implements TanqueAbstract{

    private double posicaoX = 5.52;
    public double posicaoY = 4.3;
    private String corCanhao = "Brnaco";


   




    @Override
    public String toString() {
        return "TanqueSPFC [posicaoX=" + posicaoX + ", posicaoY=" + posicaoY + ", corCanhao=" + corCanhao + "]";
    }

    public TanqueSPFC(String corCanhao) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.corCanhao = corCanhao;
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



    public void setCorCanhao(String corCanhao) {
        this.corCanhao = corCanhao;
    }

    

    
}
