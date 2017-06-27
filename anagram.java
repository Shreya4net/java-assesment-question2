import java.util.*;
public class anagram {

	int c= 0;
	void input() throws Exception{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter word");
		String s=sc.next();
		System.out.println("anagrams are");
		display("",s);
		System.out.println(" total anagrams are");
	}void display(String s1,String s2){
		if(s2.length()<=1){
			c++;
			System.out.println(s1+s2);
		}
		else{
			for(int i=0; i<=s2.length();i++){
				String x=s2.substring(i,i+1);
				String y=s2.substring(0,i+1);
				String z=s2.substring(i+1);
				display(s1+x,y+z);
			}}
			}
			public static void main(String args[]) throws Exception{
				anagram a=new anagram();
				a.input();
			}
		}
	
				
	
	
	
	
		
		
	