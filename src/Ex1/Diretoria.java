package Ex1;
import java.util.ArrayList;
import java.util.List;

public class Diretoria implements DepartamentCoposite {
    private List<DepartamentCoposite> lista;

    public String contratado;
    public int qntdFuncionario;

    public Diretoria(String contratado, int qntdFuncionario) {
        this.contratado = contratado;
        this.qntdFuncionario = qntdFuncionario;
    }

    public Diretoria(List<DepartamentCoposite> lista) {
        this.lista = lista;
    }

    public Diretoria() {
        lista = new ArrayList<>();
    }

    public void adicionar(DepartamentCoposite funionario) {
        lista.add(funionario);
    }

    @Override
    public String toString() {
        return "" + lista + ", nome" + contratado + ", qntdFuncionario=" + qntdFuncionario + "]";
    }

    @Override
    public int getFuncionarios() {
        int total = 0;
        for (DepartamentCoposite c : lista) {
            total += c.getFuncionarios();
        }
        return total;
    }

}
