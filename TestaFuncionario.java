package Aulajava9;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando um objeto da classe Funcionario.

		Funcionario funcionario1 = new Funcionario("Helena Cavalari","Consultora de Vendas",27,34567,"Femino","Pamela");
		
		funcionario1.visualizar();
		System.out.println("\n\n\n");
		
	System.out.println("\nAtualizando cargo : ");	
	funcionario1.setCargo("Analista de Sistemas ");
	funcionario1.visualizar();
	System.out.println("\n\n\n");


    System.out.println("\nAtualizando Supervisor imediato : ");
    funcionario1.setGerente("Beatriz");
    funcionario1.visualizar();
}

}
