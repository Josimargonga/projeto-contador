import java.util.Scanner;

import contador.Contador.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		 try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem de erro personalizada
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro." + exception);
        }
        
        terminal.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem

        for(int i = 0; i < contagem; i ++){
            System.out.println(i+1);
        }
	}
}
