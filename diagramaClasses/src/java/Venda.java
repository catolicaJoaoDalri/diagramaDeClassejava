package java;
import java.util.Date;

public class Venda {
    private float valor;
    private Date data;

    public Venda(float valor, Date data) {
        this.valor = valor;
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void realizarVenda() {
        // Lógica para realizar venda
    }

    public void emitirAvisoSaldoInsuficiente() {
        // Lógica para avisar saldo insuficiente
    }
}
