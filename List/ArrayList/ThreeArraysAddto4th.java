package ArrayList;

import java.util.HashSet;
import java.util.Set;

public class ThreeArraysAddto4th {

	public static void main(String[] args) {
		 int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8};
	        int arr2[] = {9, 10, 11, 12, 13, 14,8};
	        int arr3[] = {3, 9, 15, 16, 17, 18,8};



	Set<Integer>s1=new HashSet<>();

	for(int j:arr1){
	s1.add(j);
	}

	Set<Integer>s2=new HashSet<>();

	for(int k:arr2){
	s2.add(k);
	}
	Set<Integer>s3=new HashSet<>();

	for(int l:arr3){
	s3.add(l);
	}

	s2.retainAll(s1);

	//s2.retainAll(s3);		
	
	
	for(int kkk:s2) {
		System.out.println(kkk);
	}

	}

}
