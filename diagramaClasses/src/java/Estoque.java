package java;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    private List<Entrada> entradas;
    private List<Saida> saidas;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public List<Saida> getSaidas() {
        return saidas;
    }

    public void setSaidas(List<Saida> saidas) {
        this.saidas = saidas;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void registrarEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public void registrarSaida(Saida saida) {
        saidas.add(saida);
    }
}
