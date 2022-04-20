package dto;

public class Descendente extends Thread{
	@Override
	public void run() {
		int n;
		
		for(n=10; n>=1; n--) {
				System.out.println(n);
		}
	}

}
