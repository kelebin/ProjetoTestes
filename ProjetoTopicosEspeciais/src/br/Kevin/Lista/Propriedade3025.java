package br.Kevin.Lista;


public class Propriedade3025 {
	
	protected int valor;
	
	public Propriedade3025() {}

	public boolean  propriedade3025(int valor){
		if((valor>1000) && (valor<10000)){
			int primeiraMetade = valor/100, 
					segundaMetade = valor%100,
					soma = primeiraMetade + segundaMetade,
					quadrado = soma * soma;
			
			if(quadrado == valor)
				return true;
			else
				return false;
			
		}
		return false;
	}
}
