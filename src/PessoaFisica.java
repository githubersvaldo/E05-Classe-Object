import java.util.Date;

public class PessoaFisica extends Cliente {

    private String cpf;

    private int idade;

    private char genero;

    public PessoaFisica(String nome, String endereco, Date data, String cpf, int idade, char genero) {
        super(nome, endereco, data);
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return this.getNome() + this.getData() + this.getEndereco() + cpf + idade + genero;
    }
    @Override
    public boolean equals(Object obj) {
        return this.cpf.equals(((PessoaFisica) obj).cpf);
    }

}
