package Creational;

import java.io.*;
import java.util.*;
public class singleton {

	
	private static singleton single_instance = null; 
		private singleton() {}
		
		public static singleton getObjectMethod() {
			if(single_instance==null) {
			single_instance=new singleton();
			
			
			}return single_instance;
		}
		
		public void display() {System.out.println("Hello am created singleton class");}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			singleton instance=singleton.getObjectMethod();
			instance.display();
			
			singleton instance1=singleton.getObjectMethod();
			instance1.display();
			System.out.println(instance.hashCode());
			System.out.println(instance1.hashCode());
		}

}
