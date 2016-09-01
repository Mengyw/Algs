package algs.codingExercise;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MergeCoding {
	
	private static boolean isSort(Comparable[] a){
		for(int i=0;i<a.length;i++)
			if(less(a,i,i-1)) return false;
		return true;
	}
	
	private static boolean isSort(Comparable[] a,int lo,int hi){
		for(int i=lo;i<hi;i++)
			if(less(a,i,i-1)) return false;
		return true;
	}
	private static void merge(Comparable[] a,int lo,int mid,int hi){
		assert isSort(a,lo,mid);
		assert isSort(a,mid+1,hi);
		Comparable[] aux = null;
		int i = lo,j=mid+1;
		for(int k=lo;k<=hi;k++)
			aux[k] = a[k];
		for(int k=lo;k<=hi;k++){
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(less(aux,j,i)) a[k]=aux[j++];
			else a[k]=aux[i++];
		}
		assert isSort(a,lo,hi);
	}
	
	public static void sort(Comparable[] a){
		Comparable[] aux = new Comparable[a.length];
		sort(a,0,a.length-1);
	}
	private static void sort(Comparable[] a,int lo,int hi){
		if(lo>hi) return;
		int mid = lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}
	private static boolean less(Comparable[] a,int v,int w){
		return a[v].compareTo(a[w]) < 0;
	}
	
	private static void show(Comparable[] a){
		for(int k=0;k<a.length;k++)
			StdOut.print(a[k] + "");
		StdOut.println();
	}
	public static void main(String[] args){
		String[] a =StdIn.readAllStrings();
		sort(a);
		assert isSort(a);
		show(a);
	}
}




