package maiorNome;
import java.util.*;
public class MaiorIdade {
	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		int i=0;
		double anoAtual,anoNasc,resposta;
		do {
			System.out.println("digite o ano atual");
			anoAtual= in.nextDouble();
			System.out.println("digite ano de nascimento");
			anoNasc= in.nextDouble();
			 if (anoAtual-anoNasc<=17) {
					System.out.println("menor idade");
			 }
			 else{
						System.out.println("maior de idade");
						
					}
			 System.out.println(" deseja continuar? 1-sim 2-não ");
			 resposta=in.nextDouble();

			 }while(resposta==1);
				
		}
	}

