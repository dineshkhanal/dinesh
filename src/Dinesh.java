import java.util.Arrays;

public class Dinesh {
	public static void main(String[] args) {
		System.out.println("Dinesh says hello.");
		System.out.println("K cha bro");
		System.out.println(Arrays.toString(populateArray(100)));
	}

	public static int[] populateArray(int n){
		int[] toReturn = new int[n+1];
		for(int i=0; i <= n; i++){
			toReturn[i] = i;
		}
		return toReturn;
	}
}
