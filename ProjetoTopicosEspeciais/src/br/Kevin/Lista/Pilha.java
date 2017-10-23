package br.Kevin.Lista;

public class Pilha implements StackExercise {
	

	    String [] p = new String[10];

	    int topo;

	    public void inicializa(){
	        this.topo=-1;
	    }

	    public boolean push(String v){
	        if(topo >= 9){
	            System.out.println("Pilha cheia");
	            return false;
	        }else{
	        topo++;
	        p[topo] = v;
	        return true;
	        }
	    }

	    public boolean pull(String v){
	        if(isEmpety()){
	            //System.out.println("A pilha esta vazia");
	            return false;
	        }
	        else{
	            p[topo]=v;
	            return true;
	        }
	    }

	    public boolean pop(){
	        if(topo==-1){
	            System.out.println("A pilha já esta vazia!");
	            return false;
	        }
	        else{
	            topo--;
	            return true;
	        }
	    }

	    public boolean top(){
	        if(topo<0){
	            return false;
	        }
	        else{
	            System.out.println(p[topo]);
	            return true;
	        }
	    }

	    public boolean isEmpety(){
	        if(topo<0){
	            System.out.println("Pilha vazia");
	            return true;
	        }
	        else{
	            System.out.println("Pilha não esta vazia");
	            return false;
	        }
	    }

	    public boolean isFull(){
	        if(topo>9){
	            System.out.println("Pilha cheia:");
	            return true;
	        }
	        else{
	            System.out.println("Pilha não cheia:");
	            return false;
	        }
	    }

	    public static void main(String[] args) {
				String a = "Janio";
				String b = "kevin";
			/*	String c = "lorpa";
				String d = "bodao";
				String e = "tengod";
	   */
			
				Pilha pilha = new Pilha();
				pilha.inicializa();
					if(pilha.isEmpety()){
						pilha.push(a);
						pilha.push(b);
						pilha.pop();
						System.out.println("ronaldo");
					}
					System.out.println(pilha.top());
	    }
}
