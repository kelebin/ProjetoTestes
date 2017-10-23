package br.Kevin.Lista;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuboTeste {
	Cubo cubo;
	 @Before
	 public void makeCubo(){
		 cubo = new Cubo();
	 }
	 
	 @SuppressWarnings("static-access")
	 	@Test
	 	public void executaCubo(){	 
		 	assertTrue(cubo.cubos("153"));
	}
	
	 @SuppressWarnings("static-access")
		@Test
		 public void executaCuboAlt(){	 
			assertTrue(cubo.cubos("1"));
		}
	
	 @SuppressWarnings("static-access")
		@Test
		 public void executaCuboExe(){	 
			assertFalse(cubo.cubos("999"));
		}

	 @SuppressWarnings("static-access")
		@Test
		 public void executaCuboExe2(){	 
			assertFalse(cubo.cubos("145"));
		}

}
