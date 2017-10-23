package br.Kevin.Lista;

public interface StackExercise {

	 public boolean push(String v);
	 public boolean pop() throws StackEmptyException ;
	 public boolean top() throws StackEmptyException ;
	 public boolean isEmpety();
}
