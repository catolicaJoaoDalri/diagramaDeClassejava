package java;
import java.util.Date;

public class Mensalidade {
    private float valor;
    private Date dataVencimento;
    private Date dataReferencia;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataReferencia() {
        return dataReferencia;
    }

    public void setDataReferencia(Date dataReferencia) {
        this.dataReferencia = dataReferencia;
    }

    public void gerarMensalidade() {
        // Lógica para gerar mensalidade
    }

    public void emitirBoleto() {
        // Lógica para emitir boleto
    }

    public void registrarPagamento() {
        // Lógica para registrar pagamento
    }
}
