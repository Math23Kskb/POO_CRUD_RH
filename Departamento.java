package Model;

public class Departamento{
    private int codDep;
    private String cnpj;
    private String nome;
    private String endereco;
    private int ddd;
    private int telefone;

    public Departamento(int codDep, String cnpj, String nome, String endereco, int ddd, int telefone){
        this.codDep = codDep;
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    public int getCodDep(){
        return codDep;
    }

    public String getCnpj(){
        return cnpj;
    }

    public String getEndereco(){
        return endereco;
    }

    public int getDdd(){
        return ddd;
    }

    public int getTelefone(){
        return telefone;
    }

    @Override
    public String toString(){
        return "Departamento:\n"+
                "\ncodDep:"+codDep+
                "\nCNPJ:"+cnpj+
                "\nNome:"+nome+
                "\nEndereço"+endereco+
                "\nDDD:"+ddd+
                "\nTelefone:"+telefone;
    }


}

