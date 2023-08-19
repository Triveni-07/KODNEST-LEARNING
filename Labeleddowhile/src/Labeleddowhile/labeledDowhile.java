package Labeleddowhile;

public class labeledDowhile {

	public static void main(String[] args) {
		int i=1;
		punith:do {
			int j=1;
			do {
				System.out.print("KODNEST ");
				j++;
				break punith;
			}while(j<=5);
		}while(i<=5);

	}

}
