package java;
import java.util.List;


public class ContaFinanceira {
    private float saldo;
    private List<String> transacoes;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public List<String> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<String> transacoes) {
        this.transacoes = transacoes;
    }

    public void receberDeposito(float valor) {
        saldo += valor;
    }

    public void registrarCompra(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            // Aviso de saldo insuficiente
        }
    }

    public void sacarSaldo(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            // Aviso de saldo insuficiente
        }
    }
}
