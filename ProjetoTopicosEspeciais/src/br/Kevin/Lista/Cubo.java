package br.Kevin.Lista;

import java.util.Scanner;

public class Cubo {

		public static boolean cubos(String a){
			
			int b = 0;
			int soma = 0;
			for (int i = 0; i < a.length(); i++){
				char c = a.charAt(i);
				String d = ""+c;			
				b =  Integer.parseInt(d);				
				b = b*b*b;
			
				soma+=b;
				
				
			}
				
			int condicao = Integer.parseInt(a);
			if(soma == condicao ){
			//	System.out.println("True");
				return true;
			
			}
			else{
			//	System.out.println("False");
				return false; 
			}
			}
	
	
				
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			String numCube;
			Scanner tec = new Scanner(System.in);	
			System.out.println("Informe o numero ---->");
			numCube = tec.nextLine();
			cubos(numCube);
					
			
		}
		

}
