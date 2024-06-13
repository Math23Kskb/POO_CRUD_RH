package Model;

import java.time.LocalDate;

public class Projeto {
    private int codProj;
    private String nomeProj;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Projeto() {
    }

    public Projeto(int codProj, String nomeProj, String dataInicio, String dataFim) {
        this.codProj = codProj;
        this.nomeProj = nomeProj;
        this.dataInicio = LocalDate.parse(dataInicio);
        this.dataFim = LocalDate.parse(dataFim);
    }

    public int getCodProj() {
        return codProj;
    }

    public void setCodProj(int codProj) {
        this.codProj = codProj;
    }

    public String getNomeProj() {
        return nomeProj;
    }

    public void setNomeProj(String nome) {
        this.nomeProj = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Projeto:\n" +
                "\ncodProj: " + codProj +
                "\nNome: " + nomeProj +
                "\nData Inicial: " + dataInicio +
                "\nData Final: " + dataFim;
    }
}
