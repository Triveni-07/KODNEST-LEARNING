package Labeleddowhile;

public class LabeledWhileloop {

	public static void main(String[] args) {
		System.out.println("START.....");
		int i=1;
		rajini:while(i<=5) {
			int j=1;
			while(j<=5) {
				System.out.println("KODNEST");
				j++;
				break rajini;
			}
			System.out.println();
			i++;
		}

	}

}
