package Labeleddowhile;

public class Labeledforloop {

	public static void main(String[] args) {
		System.out.println("START.....");
		rajini:for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.println("KODNEST");
				j++;
				break rajini;
			}
			System.out.println();
			i++;
		}

	}

}
