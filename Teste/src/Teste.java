import java.util.Scanner;

public class Teste {
	public static void main(String[] args){
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		int opcao = 0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Escolha uma op��o: 1 - soma; 2 - subtra��o; 3 - divis�o; 4- multiplica��o");
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
		
		leitor.close();
		
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
		
		System.out.print("resultado = " + resultado);
	}
}
