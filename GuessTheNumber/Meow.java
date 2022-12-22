import java.util.Random;
public class Meow {
	public static void main (String[] args) {
		Random random = new Random();
		for (int i = 0; i<10; i++ ) {
			System.out.println(random.nextInt(5));
		}
		/*int i,j;
		j=4;
		i=10 * 8+2;
		j=j+i;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		if (i == 80) {
			System.out.println ("i equal 16");	
		} else {
			System.out.println("i Not equal 16");
		}*/
	}
}