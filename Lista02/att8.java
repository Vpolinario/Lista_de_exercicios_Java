package Lista02;


public class att8 {
	public static void main(String args[]) {
		
		int cont = 0;
		while(cont <=1000) {
			if(cont % 2 ==0 && cont % 3 ==0 && cont % 5 ==0) {
				System.out.println(cont);
				
			}
			cont ++;
		}
		
		
	}

}
