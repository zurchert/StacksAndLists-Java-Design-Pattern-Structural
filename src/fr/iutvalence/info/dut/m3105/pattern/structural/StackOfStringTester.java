package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester{

	private Stack<String> stack; 
	
	public StackOfStringTester(Stack<String> stack){
		this.stack = new ArrayStack<>();
	}
	

	public void testStack() {
		
		System.out.println(this.stack.size());
		this.stack.push("a"); 
		System.out.println("le a est plac� en haut de la pile");
		System.out.println(this.stack.size());
		this.stack.push("b"); 
		System.out.println("le b est plac� en haut de la pile");
		System.out.println(this.stack.size());
		System.out.println("l'�l�ment du haut de la pile est " + this.stack.peek());
		System.out.println(this.stack.size());
		System.out.println("l'�l�ment du haut de la pile est " + this.stack.pop());
		System.out.println(this.stack.size());
		System.out.println("l'�l�ment du haut de la pile est " + this.stack.pop());
		System.out.println(this.stack.size());
		
	}
}