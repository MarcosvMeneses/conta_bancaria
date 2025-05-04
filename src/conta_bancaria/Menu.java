package conta_bancaria;

import java.io.IOException;
import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		int numero, agencia, tipo, opcao;
		String titular;
		float saldo;
		Scanner scanner = new Scanner(System.in);
		
		//Criar (instancias) o objeto da classe
		Conta c1 = new Conta(1, 4815, 1, "Marcos", 10);
		c1.visualizar(); //mostrar o objeto criado
		
		//Sacar
		c1.sacar(100);
		c1.visualizar();

		//Depositar
		c1.depositar(1000);
		c1.visualizar();
		
		//Alterar a propriedade titular
		c1.setTitular("Marcos Meneses");
		c1.visualizar();
		
		while(true) {
			
			System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("\t\tBANCO DO BRAZIL COM Z\t\t");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = scanner.nextInt();
			
			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
                scanner.close();
				System.exit(0);
			}
		

		switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
				keyPress();
				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");
				keyPress();
				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");
				keyPress();
				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");
				keyPress();
				break;
			case 6:
				System.out.println("Saque\n\n");
				keyPress();
				break;
			case 7:
				System.out.println("Depósito\n\n");
				keyPress();
				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
		}
	}
}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

//		System.out.println(Cores.TEXT_BLACK + Cores.ANSI_BLACK_BACKGROUND + "Olá mundo!           ");
//		// Se não existir outro comando de cor ela se mantem
//		System.out.println("Texte de cor");
//		
//		System.out.println(Cores.TEXT_RESET + "Cores resetadas");

public static void sobre() {
	System.out.println(Cores.TEXT_RESET+ "\n*********************************************************");
	System.out.println("Projeto Desenvolvido por: ");
	System.out.println("Marcos Vinicius Nogueira Meneses - Marcosvnm1@hotmail.com");
	System.out.println("https://github.com/MarcosvMeneses");
	System.out.println("*********************************************************");
}

public static void keyPress() {
	 
	try {

		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
		System.in.read();

	} catch (IOException e) {

		System.err.println("Ocorreu um erro ao tentar ler o teclado");

	}
}

}	
