import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;


public class JavaCodes {
	
		public static void main(String[] args){
			Scanner s = new Scanner(System.in);
			Integer t;
			t=s.nextInt();
			while(t>0) {
				Integer q=s.nextInt();
				TreeSet<Integer> st = new TreeSet<Integer>();
				Integer cnt=0;
				for(Integer i=0;i<q;i++) {
					Integer x=s.nextInt();
					Vector<Integer> v = new Vector<Integer>();
					if(st.size()==0) {
						st.add(x);
						Integer temp=x;
						Integer oneBits=0;
						while(temp>0) {
							oneBits++;
							temp=(temp&(temp-1));
						}
						if((oneBits&1)==1)cnt++;
						System.out.println((st.size()-1) + " "+cnt);
						continue;
					}
					
					if(!(st.contains(x))) {
						for(Integer val:st) {
							v.add(x^val);
						}
						v.add(x);
						
						for(Integer val:v) {
							Integer temp=val;
							Integer oneBits=0;
							while(temp>0) {
								oneBits++;
								temp=(temp&(temp-1));
							}
							if((oneBits&1)==1)cnt++;
							st.add(val);
						}
					}
					
					System.out.println((st.size()-cnt)+" "+cnt);
				}
				
				t--;
			}
			s.close();
		}
			
			
		
}
