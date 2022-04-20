package dto;

public class Ascendente extends Thread{
		@Override
		public void run() {
			int n;
			
			for(n=1; n<=10; n++) {
					System.out.println(n);
			}
		}

}
