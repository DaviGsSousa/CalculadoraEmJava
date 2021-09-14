import java.util.Scanner;

public class Teste {
	public static void main(String[] args){
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		int opcao = 0;
		boolean repeat = true;
		int continuarC = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Deseja executar alguma operação? yes = 1/no = 2" );
		continuarC = leitor.nextInt();
		
		if(continuarC == 1) {
			repeat = true;
		} else {
			System.out.println("vish kk");
			repeat = false;
		}
		while(repeat == true) {
			System.out.println("+-------------------+");
			System.out.println("|Escolha uma opção: |");
			System.out.println("|1 - Soma           |");
			System.out.println("|2 - Subtração      |");
			System.out.println("|3 - Divisão        |");
			System.out.println("|4 - Multiplicação  |");
			System.out.println("+-------------------+");
			opcao = leitor.nextInt();
			
			while (opcao > 4 || opcao < 1) {
				System.out.println("Você digitou um número de opção inválido");
				System.out.print("Escolha uma opção: 1 - soma; 2 - subtração; 3 - divisão; 4- multiplicação");
				opcao = leitor.nextInt();
			}
			
			System.out.print("Digite o primeiro número: ");
			num1 = leitor.nextDouble();
			System.out.print("Digite o segundo número: ");
			num2 = leitor.nextDouble();
				
			switch (opcao) {
			case 1:
				resultado = num1 + num2;
				break;
				
			case 2:
				resultado = num1 - num2;
				break;
				
			case 3:
				resultado = num1 / num2;
				break;
				
			case 4:
				resultado = num1 * num2;
				break;
			}
			System.out.println("resultado =" + resultado );		
			System.out.println("Deseja executar outra operação? yes = 1/no = 2" );
			continuarC = leitor.nextInt();
			
			if(continuarC == 1) {
				repeat = true;
			} else {
				System.out.println("obrigado pela preferencia");
				repeat = false;
			}
		}
			
			leitor.close();
	}
}
