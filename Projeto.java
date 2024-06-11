package Model;

import java.time.LocalDate;

public class Projeto {
    private int codProj;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Projeto(int codProj,String nome,String dataInicio, String dataFim){
        this.codProj = codProj;
        this.nome = nome;
        this.dataInicio = LocalDate.parse(dataInicio);
        this.dataFim = LocalDate.parse(dataFim);
    }

    
    @Override
    public String toString(){
        return "Projeto:\n"+
                "\ncodProj: "+codProj+
                "\nNome: "+nome+
                "\nData Inicial: "+dataInicio+
                "\nData Final: "+dataFim;
    }
    
}
