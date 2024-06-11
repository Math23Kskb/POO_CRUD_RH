public class FuncionarioHasProjeto{
    private int funcionarioCodFunc;
    private int funcionarioDepartamentoCodDep;
    private int projetoCodProjeto;

    public FuncionarioHasProjeto(int funcionarioCodFunc,
                                int funcionarioDepartamentoCodDep,
                                int projetoCodProjeto)
    {
        this.funcionarioCodFunc = funcionarioCodFunc;
        this.funcionarioDepartamentoCodDep = funcionarioDepartamentoCodDep;
        this.projetoCodProjeto = projetoCodProjeto;
    
    }

    public int getFuncionarioCodFunc(){
        return funcionarioCodFunc;
    }

    public int getFuncionarioDepartamentoCodDep(){
        return funcionarioDepartamentoCodDep;
    }

    public int getProjetoCodProjeto(){
        return projetoCodProjeto;
    }

    
}