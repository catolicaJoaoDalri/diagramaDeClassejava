package java;
import java.util.Date;

public class ControleEntradaSaida {
    private Date dataHoraEntrada;
    private Date dataHoraSaida;
    private boolean dentroSede;

    public Date getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(Date dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public Date getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Date dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public boolean isDentroSede() {
        return dentroSede;
    }

    public void setDentroSede(boolean dentroSede) {
        this.dentroSede = dentroSede;
    }

    public void registrarEntrada() {
        // Lógica para registrar entrada
    }

    public void registrarSaida() {
        // Lógica para registrar saída
    }

    public void verificarStatus() {
        // Lógica para verificar o status
    }
}
