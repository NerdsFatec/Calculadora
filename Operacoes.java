/*
 * instanciar uma classe significa criar um objeto dela
 * ex: Livro livro = new Livro ();
 * 
 * */

import java.util.Scanner;

public class Operacoes {
	
	int a, b, result = 0;	
	public String esc;
	
	Scanner SC = new Scanner(System.in);
	
	/*criacao dos métodos somar, subtrair, multiplicar e dividir*/	
	public void somar () {
		System.out.println("informe o primeiro numero: ");
		a = SC.nextInt();
		System.out.println("informe o segundo numero: ");
		b = SC.nextInt();
		result = (a + b);
		System.out.println("O resultado da soma e " + result);
	}
	public void subtrair () {
		System.out.println("informe o primeiro numero: ");
		a = SC.nextInt();
		System.out.println("informe o segundo numero: ");
		b = SC.nextInt();
		result = (a - b);
		System.out.println("O resultado da subtracao e " + result);
	}
	public void multiplicar () {
		System.out.println("informe o primeiro numero: ");
		System.out.println("informe o segundo numero: ");
		result = (a * b);
		System.out.println("O resultado da multiplicacao e " + result);
	}
	public void dividir () {
		System.out.println("informe o primeiro numero: ");
		System.out.println("informe o segundo numero: ");
		result = (a / b);
		System.out.println("O resultado da divisao e " + result);
	}
	
	
	
	
	public static void main (String [] args) {
		/* Instancia da classe Operacoes */
		Operacoes o = new Operacoes ();
		
		
		Scanner SC = new Scanner(System.in);
		
		while (o.esc != "sair") {
			
		
		System.out.println("Qual operacao voce deseja realizar ");
		o.esc = SC.nextLine();
		
		/* Verificacao do atributo esc */
		switch (o.esc) {
            case ("somar"):
                o.somar ();
                break;

            case ("subtrair"):
                o.subtrair ();
                break;

            case ("multiplicar"):
                o.multiplicar ();
                break;

            case ("dividir"):
                o.dividir ();
                break;
            
         }
		System.out.println("fim do jogo");
	  }		
		
   }	

}







