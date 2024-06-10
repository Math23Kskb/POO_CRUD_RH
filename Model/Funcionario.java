    package Model;

    import java.util.Date;

    public class Funcionario {

        private int codFunc;
        private String cpf;
        private String primeiroNome;
        private String ultimoNome;
        private String endereco;
        private Date dataNasc;
        private int ddd;
        private int telefone;
        private Departamento departamento;

        // Construtor
        public Funcionario() {
        }

        public Funcionario(String cpf, String primeiroNome, String ultimoNome, String endereco, Date dataNasc,
                           int ddd, int telefone, Departamento departamento) {
            this.cpf = cpf;
            this.primeiroNome = primeiroNome;
            this.ultimoNome = ultimoNome;
            this.endereco = endereco;
            this.dataNasc = dataNasc;
            this.ddd = ddd;
            this.telefone = telefone;
            this.departamento = departamento;
        }

        public Funcionario(int codFunc, String cpf, String primeiroNome, String ultimoNome, String endereco, Date dataNasc,
                           int ddd, int telefone, Departamento departamento) {
            this.codFunc = codFunc;
            this.cpf = cpf;
            this.primeiroNome = primeiroNome;
            this.ultimoNome = ultimoNome;
            this.endereco = endereco;
            this.dataNasc = dataNasc;
            this.ddd = ddd;
            this.telefone = telefone;
            this.departamento = departamento;
        }

        // Getters e Setters
        public int getCodFunc() {
            return codFunc;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getPrimeiroNome() {
            return primeiroNome;
        }

        public void setPrimeiroNome(String primeiroNome) {
            this.primeiroNome = primeiroNome;
        }

        public String getUltimoNome() {
            return ultimoNome;
        }

        public void setUltimoNome(String ultimoNome) {
            this.ultimoNome = ultimoNome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public Date getDataNasc() {
            return dataNasc;
        }

        public void setDataNasc(Date dataNasc) {
            this.dataNasc = dataNasc;
        }

        public int getDdd() {
            return ddd;
        }

        public void setDdd(int ddd) {
            this.ddd = ddd;
        }

        public int getTelefone() {
            return telefone;
        }

        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }

        public Departamento getDepartamento() {
            return departamento;
        }

        public void setDepartamento(Departamento departamento) {
            this.departamento = departamento;
        }

        @Override
        public String toString() {
            return "Funcionario{" +
                    "codFunc=" + codFunc +
                    ", cpf='" + cpf + '\'' +
                    ", primeiroNome='" + primeiroNome + '\'' +
                    ", ultimoNome='" + ultimoNome + '\'' +
                    ", endereco='" + endereco + '\'' +
                    ", dataNasc=" + dataNasc +
                    ", ddd=" + ddd +
                    ", telefone=" + telefone +
                    ", departamento=" + departamento +
                    '}';
        }
    }
