package br.Kevin.Lista;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PilhaTeste {
	Pilha pilha;

	 @Before
	 public void makeCubo(){
		 pilha = new Pilha();
		 pilha.inicializa();
	 }
	 
	
	 	@Test
	 	public void DeveVerificarPilhaVazia(){	 
		 	assertTrue(pilha.isEmpety());
	}
	
	 	@Test
	 	public void DeveAddElementoPilha(){	 
		 	assertTrue(pilha.push("janio"));
		
	}
	
	
		@Test
		 public void DeveRemoverElementoPilha(){	 
		 	pilha.push("janio");	
		 	assertTrue(pilha.pop());
		}
	
	
		@Test
		 public void NaoDeveRemoverElementoPilhaVazia(){	 
			assertFalse(pilha.pop());
		}
	
	
		@Test
		 public void NaoDeveAddElementoPilhaCheia(){	 
			
			for(int i = 1; i<=10 ; i++){
				pilha.push("janio");
			}
			System.out.println(pilha.topo);
		 	assertFalse(pilha.push("janio"));
		}
}
