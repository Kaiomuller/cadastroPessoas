
public class PessoaFisica extends Cliente{
private String cpf;

public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
	super(nome,endereco,telefone);
	this.cpf = cpf;
}
public String getcpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public void exibedados() {
	super.exibedados();
	System.out.println("CPF: "+cpf);
}

}
