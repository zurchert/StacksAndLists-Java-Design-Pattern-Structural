package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E> {

	
	private Object[] array;
	private int size;
	
	public ArrayStack(){
		this.array = (E[]) new Object[10];
		this.size= 0;
	}
	@Override
	public void push(E element) {
		this.array[this.size] = element;
		this.size ++;

	}

	@Override
	public E pop() {
		this.size--;
		
		return (E) this.array[this.size];
	}

	@Override
	public E peek() {
		
		return (E) this.array[this.size];
	}

	@Override
	public int size() {
		
		return this.size;
	}

}
