package Ex2.BatalhaTanques.src.batalhatanques.Tanque;

public class TanqueAbstractCreator {

    public TanqueAbstract getTanque(String corCanhao) {
        if (corCanhao.equals("Branco"))
            return new TanqueSPFC(corCanhao);
        if (corCanhao.equals("Rosa"))
            return new TanqueTPT(corCanhao);
        return null;

    }

    @Override
    public String toString() {
        return "TanqueAbstractCreator []";
    }

}