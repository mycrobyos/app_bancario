package br.com.ada.fila;

public class FilaColega {

	private int begin;
	private int end;
	private Integer[] fila;

	public FilaColega(Integer size){
		this.fila = new Integer[size];
		this.begin = 0;
		this.end = 0;
	}

	public void add(int value){
		this.fila[end] = value;
		this.end++;
		if(this.end >= this.fila.length){
			this.end = 0;
		}
	}

	public void delete(){
		this.fila[begin] = null;
		this.begin++;
		if(this.begin >= this.fila.length){
			this.begin = 0;
		}
	}

	public Integer[] get(){
		return this.fila;
	}

}
