package com.lecture94;

public class GenericClass<T> {
	T obj;  
	void addItem(T obj){
		this.obj = obj;
	}  
	T getItem(){
		return obj;
	}  
}
