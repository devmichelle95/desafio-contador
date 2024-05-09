import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
        
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			
			contar(parametroUm, parametroDois);
         
		}catch (ParametrosInvalidosExceptions e ) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
	
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExceptions {

		int contagem = parametroDois - parametroUm;
        if( parametroUm > parametroDois){
            throw new ParametrosInvalidosExceptions();

        } else 
		 for ( int numerais = 1 ; numerais <= contagem ; numerais ++ )  {
            System.out.println("A quantidade de números contados entre " + parametroUm + " e " + parametroDois + " são de " + numerais + " números.");
        }
        
	}
}
