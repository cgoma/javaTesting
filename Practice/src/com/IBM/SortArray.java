package com.IBM;

public class SortArray {

	public static void main(String[] args) {
		int a[] = { 2, 6, 1, 8, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j <a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.print("Sorted no : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
	}
}