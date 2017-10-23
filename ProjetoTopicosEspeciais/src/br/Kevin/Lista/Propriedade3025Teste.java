package br.Kevin.Lista;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Propriedade3025Teste  {
	
	 Propriedade3025 propriedade;
	 
	 @Before
	 public void makePropriedade(){
		 propriedade = new Propriedade3025();
	 }
	 
	 @Test
	 public void executaPropriedade(){	 
		assertTrue(propriedade.propriedade3025(2025));
	}
	 
	 @Test
	 public void executaPropriedade2(){	 
		assertTrue(propriedade.propriedade3025(3025));
	}
	 
	 @Test
	 public void executaPropriedade3(){	 
		assertTrue(propriedade.propriedade3025(9801));
	}
	 
	 @Test
	 public void executaPropriedadeComNegativo(){	 
		assertFalse(propriedade.propriedade3025(-2025));
	}
	 
	 @Test
	 public void executaPropriedadeMenor1000(){	 
		assertFalse(propriedade.propriedade3025(999));	
	}
	 
	 @Test
	 public void executaPropriedadeMaior9999(){	 
		assertFalse(propriedade.propriedade3025(10000));
	}
	 @Test
	 public void executaPropriedadeNumeroQuebrado(){	 
		assertFalse(propriedade.propriedade3025(44));
	}
}
