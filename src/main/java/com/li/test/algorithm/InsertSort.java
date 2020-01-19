package com.li.test.algorithm;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @Author lixinglong
 * @Date 2020/1/19
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 10, 5, 9, 6, 5, 3, 4, 5};
		insertSortByTranslation(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertSortBySwap(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}

	public static void insertSortByTranslation(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i; j > 0; j--) {
				if (temp < arr[j-1]){
					arr[j] =  arr[j-1];
				} else {
					arr[j] = temp;
					break;
				}
			}
		}
	}
}
