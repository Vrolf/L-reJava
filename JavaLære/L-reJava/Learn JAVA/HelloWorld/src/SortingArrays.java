import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		int[] sortering = {1,200,3,4,1,300,120};
		Arrays.sort(sortering); // could also use Arrays.paralellSort(sortering);
		System.out.println(Arrays.toString(sortering));
		
	}

}
