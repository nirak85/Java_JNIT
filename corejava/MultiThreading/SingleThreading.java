
public class SingleThreading {

	public static void main(String[] args) {
		SingleThreading st= new SingleThreading();
		st.printNumbers();
		for(int a=0; a<=50; a++){
		
			System.out.print("a: "+a+"\t");
		}
	}
		void printNumbers(){
			for(int i=0; i<=50; i++){
				System.out.print(i+"\t");
				
			}
		}

	}

//first take or print i value and print main value i.e j
