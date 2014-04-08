import java.util.*;
public class quickSort{

    public static Integer[] QuickSort(Integer[] L, int low, int high){
	if (L.length <= 1){
	    return L;
	}else{
	    Random rand = new Random();
	    int pivoter = L[low + rand.nextInt(high+low)];
	    Integer pivot = (Integer)pivot;
	    ArrayList<Integer> left = new ArrayList<Integer>(L.length);
	    ArrayList<Integer> right = new ArrayList<Integer>(L.length);
	    int term = 0;
	    for (int a = 0; a < L.length; a++){
		if (L[a] < pivot){
		    left.add(L[a]);
		}else if (L[a] > pivot){
		    right.add(L[a]);
		}else{
		    term = L[a];
	}
    }

    public static int partition(int[] L, int left, int right){


