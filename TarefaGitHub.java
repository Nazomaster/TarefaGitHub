/**
 *
 * @author A18DavidCB
 */
import java.util.Scanner;

public class TarefaGitHub {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce o teu nome:");
		String nome = sc.nextLine();
		char[] nomeArr = nome.toCharArray();
		int valor = 0;
		for (int i = 0; i < nomeArr.length; i++) {
			valor+=nomeArr[i]*i;
		}
		System.out.println("O valor das letras do nome é: "+valor);
	}

}
