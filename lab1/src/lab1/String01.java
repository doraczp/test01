package lab1;

import java.io.*;
import java.util.ArrayList;
public class String01 {
	String input;
	ArrayList<String>outputLine=new ArrayList<String>(36);
	public void setInput(){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			input=br.readLine();
		}catch(IOException e){
			System.out.println("IOException: "+e);
		}
	}
	public void go(){
		int n=input.length();
		for(int i=0;i<n;i++){
			if(('9'<input.charAt(i)&&input.charAt(i)<'a')||input.charAt(i)<'0'||input.charAt(1)>'z'){
				System.out.println("ÊäÈë×Ö·û´®·Ç·¨");
				return;
			}
		}
		
		for(int i=0;i<36;i++){
			outputLine.add("");
		}
		
		for(int i=0;i<n;i++){
			if(input.charAt(i)>='0'&&input.charAt(i)<='9')
				addChar(input.charAt(i),input.charAt(i)-'0');
			else
				addChar(input.charAt(i),input.charAt(i)-'a'+10);
			
		}
		
		
		
		for(int i=0;i<100;i++){
			for(int j=0;j<36;j++){
				if(i>=outputLine.get(j).length())
					continue;
				System.out.print(outputLine.get(j).charAt(i));
			}
		}
	}
	
	public void addChar(char c,int index){
		if(outputLine.get(index)==""){
			outputLine.remove(index);
			outputLine.add(index,c+"");
		}else{
			String temp=outputLine.get(index);
			temp=temp.concat(c+"");
			outputLine.remove(index);
			outputLine.add(index,temp);
		}
	}

	public static void main(String[] args) {
		String01 str=new String01();
		str.setInput();
		str.go();// TODO Auto-generated method stub

	}

}
