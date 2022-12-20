import java.util.Scanner;

public class Teste {

	public static void main(String args[]) { 
		
		String nome, endereco, telefone, cnpj, cpf, nomefantasia;
	
		Cliente c;
		
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite seu nome: ");
	nome = leia.nextLine();
	System.out.println("Digite seu endereco: ");
	endereco = leia.nextLine();
	System.out.println("Digite seu telefone: ");
	telefone = leia.nextLine();
	
	c = new Cliente(nome,endereco,telefone);
	System.out.println("  ");
	System.out.println("--Cliente--");
	System.out.println("  ");
	c.exibedados();
	
	//------//
	System.out.println("  ");
	System.out.println("--Pessoa Fisica--");
	System.out.println("  ");
	
	System.out.print("Digite seu nome: ");
	nome = leia.nextLine();
	System.out.print("Digite seu endereco: ");
	endereco = leia.nextLine();
	System.out.print("Digite seu telefone: ");
	telefone = leia.nextLine();
	System.out.print("Digite seu cpf: ");
	cpf = leia.nextLine();

	c =  new PessoaFisica (nome,endereco,telefone,cpf);
	System.out.println("  ");
	System.out.println("--Pessoa Fisica--");
	System.out.println("  ");
	c.exibedados();
	
	//--------//
	System.out.println("  ");
	System.out.println("--Pessoa Juridica--");
	System.out.println("  ");
	
	System.out.println("Digite seu nome: ");
	nome = leia.nextLine();
	System.out.println("Digite seu endereco: ");
	endereco = leia.nextLine();
	System.out.println("Digite seu telefone: ");
	telefone = leia.nextLine();
	System.out.println("Digite seu cnpj: ");
	cnpj = leia.nextLine();
	System.out.println("Digite seu nome fantasia: ");
	nomefantasia = leia.nextLine();
	
	c =  new PessoaJuridica (nome,endereco,telefone,cnpj,nomefantasia);
	System.out.println("  ");
	System.out.println("--Pessoa Fisica--");
	System.out.println("  ");
	((PessoaJuridica)c).exibedados(3);
	
	
	
	
	
	


}

}
