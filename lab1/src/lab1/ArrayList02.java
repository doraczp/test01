package lab1;

import java.util.*;

public class ArrayList02 {
	ArrayList<Integer> a=new ArrayList<Integer>();
	ArrayList<Integer> b=new ArrayList<Integer>();
	ArrayList<Integer> c=new ArrayList<Integer>();
	
	public void initial(){
		a.add(3);
		a.add(8);
		a.add(11);
		a.add(17);
		a.add(23);
		a.add(55);
		b.add(2);
		b.add(7);
		b.add(9);
		b.add(22);
		b.add(24);
		b.add(89);
		for(int i=0;i<100;i++){
			c.add(0);
		}
	}
	
	public void sort(){
		int n1=a.size();
		int n2=b.size();
		for(int i=0;i<n1;i++){
			c.remove(a.get(i));
			c.add(a.get(i),1);
		}
		
		for(int i=0;i<n2;i++){
			c.remove(b.get(i));
			c.add(b.get(i),1);
		}
		
		for(int i=0;i<100;i++){
			if(c.get(i)!=0){
				int n=c.get(i);
				while(n>0){
			       System.out.print(i+" ");
			       n--;
				}
			}
			
		}
		
	
	}

	public static void main(String[] args) {
		ArrayList02 arr2=new ArrayList02();
		arr2.initial();
		arr2.sort();// TODO Auto-generated method stub

	}

}
