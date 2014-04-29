package lab1;

import java.util.ArrayList;

public class ArrayList01 {
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	public void initial(){
		for(long i=0;i<1000000;i++){
			list.add((int)(Math.random()*100));
		}
	}
	
	public void iteratorSearch(){
		Integer value=null;
		java.util.Iterator<Integer> iter=list.iterator();
		while(iter.hasNext()){
			value=(Integer)iter.next();
		}
	}
	
	public void randomSearch(){
		Integer value=null;
		int size=list.size();
		for(int i=0;i<size;i++){
			value=(Integer)list.get(i);
		}
	}
	
	public void forSearch(){
		Integer value=null;
		for(Integer cells:list){
			value=cells;
		}
	}

	public static void main(String[] args) {
		ArrayList01 arr01=new ArrayList01();
		arr01.initial();
		long time1=System.currentTimeMillis();
		arr01.iteratorSearch();
		long time2=System.currentTimeMillis();
		arr01.randomSearch();
		long time3=System.currentTimeMillis();
		arr01.forSearch();
		long time4=System.currentTimeMillis();
		System.out.println("迭代器访问："+(time2-time1)+" ms");
		System.out.println("随机访问："+(time3-time2)+" ms");
		System.out.println("for循环访问："+(time4-time3)+" ms");// TODO Auto-generated method stub

	}

}
