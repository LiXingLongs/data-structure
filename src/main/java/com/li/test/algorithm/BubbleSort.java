package com.li.test.algorithm;

import java.util.Arrays;

/**
 *  冒泡排序
 * @Author lixinglong
 * @Date 2020/1/19
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 10, 5, 9, 6, 5, 3, 4, 5};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr){
		for (int i = 1; i < arr.length ; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	/**
	 * 冒泡优化
	 * @param arr
	 */
	public static void bubbleSort1(int[] arr){
		// 结束标识
		boolean end_flag = true;
		for (int i = 1; i < arr.length ; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				end_flag = true;
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					end_flag = false;
				}
			}
			if (end_flag) {
				return;
			}
		}
	}
}
