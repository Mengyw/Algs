package algs.codingExercise;


public class Shell{
	public void sort(Comparable[] a ){    //此处会出现泛型转换警告；
		int N = a.length;
		int h = 1;
		while(h <= N) h = N*3+1;
		while(h>=1){
			for(int i=h;i<N;i++){
				for(int j=i;j>=h && less(a[j],a[j-h]);j=j-h)
					exch(a,j,j-h);
			}
			h = h/3;
		}
	}
	
	private static void exch(Comparable[] a,int i,int j){
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w) < 0;
	}
	
}
