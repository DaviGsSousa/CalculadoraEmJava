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
		
		System.out.println("Deseja executar alguma opera��o? yes = 1/no = 2" );
		continuarC = leitor.nextInt();
		
		if(continuarC == 1) {
			repeat = true;
		} else {
			System.out.println("vish kk");
			repeat = false;
		}
		while(repeat == true) {
			System.out.println("+-------------------+");
			System.out.println("|Escolha uma op��o: |");
			System.out.println("|1 - Soma           |");
			System.out.println("|2 - Subtra��o      |");
			System.out.println("|3 - Divis�o        |");
			System.out.println("|4 - Multiplica��o  |");
			System.out.println("+-------------------+");
			opcao = leitor.nextInt();
			
			while (opcao > 4 || opcao < 1) {
				System.out.println("Voc� digitou um n�mero de op��o inv�lido");
				System.out.print("Escolha uma op��o: 1 - soma; 2 - subtra��o; 3 - divis�o; 4- multiplica��o");
				opcao = leitor.nextInt();
			}
			
			System.out.print("Digite o primeiro n�mero: ");
			num1 = leitor.nextDouble();
			System.out.print("Digite o segundo n�mero: ");
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
			System.out.println("Deseja executar outra opera��o? yes = 1/no = 2" );
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
