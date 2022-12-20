
public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String nomeFantasia;

public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
	super(nome,endereco,telefone);
	this.cnpj = cnpj;
	this.nomeFantasia = nomeFantasia;
}
public String getcnpj() {
	return cnpj;
}

public String getnomeFantasia() {
	return nomeFantasia;
}

public void setcnpj(String cnpj) {
	this.cnpj = cnpj;
}

public void setnomeFantasia(String nomeFantasia) {
	this.nomeFantasia = nomeFantasia;
}

public void exibedados(int f) {
	super.exibedados();
	if(f == 1) {
		System.out.println("CNPJ: "+cnpj);
	} else if(f == 2){
		System.out.println("Nome Fantasia: "+nomeFantasia);
	} else if(f ==3 ) {
		System.out.println("CNPJ: "+cnpj);
		System.out.println("Nome Fantasia: "+nomeFantasia);
	} else {
		System.out.println("Opcao Invalida!");
	}
}

}
