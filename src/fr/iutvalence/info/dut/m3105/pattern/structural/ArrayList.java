package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<E> implements List<E> {

	public static final STACK_SIZE = 10;
	
	private Object[] array;
	private int size;
	
	
	public ArrayList(){
		this.array = (E[]) new Object[10];
		this.size = 0;
	}
	
	@Override
	public void add(int position, E element) {
		this.array[position] = element;

	}

	@Override
	public E remove(int integer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int integer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
