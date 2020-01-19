package com.li.test.algorithm;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @Author lixinglong
 * @Date 2020/1/6
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 10, 5, 9, 6, 5, 3, 4, 5};
//		int[] arr = new int[]{6, 4, 5, 3, 7, 2};
		quickSortByMid(arr, 0, arr.length - 1);
		System.out.println("快速排序结果:" + Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int left, int right) {
		if (left>right) {
			return;
		}
		int l = left;
		int r = right;
		int base = arr[left];
		while (l < r) {
			// 找到比中间数小的
			while (arr[r] >= base && l < r) {
				r--;
			}

			// 找到比中间数大的
			while (arr[l] <= base && l < r) {
				l++;
			}
			if (l < r) {
				swap(arr, l, r);
			}
		}

		arr[left] = arr[l];
		arr[l] = base;

		quickSort(arr, left, r-1);
		quickSort(arr, r+1, right);
	}

	public static void swap(int[] arr, int l, int r) {
		int temp;
		temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}

	public static void quickSortByMid(int[] arr, int left, int right) {
		if (left>right) {
			return;
		}
		int l = left;
		int r = right;
		int mid = (left + right) / 2;
		int base = arr[mid];
		while (l < r) {
			// 找到比中间数小的
			while (arr[r] >= base && l < r) {
				r--;
			}

			// 找到比中间数大的
			while (arr[l] <= base && l < r) {
				l++;
			}
			if (l < r) {
				swap(arr, l, r);
			}
		}

		arr[mid] = arr[l];
		arr[l] = base;

		quickSortByMid(arr, left, r-1);
		quickSortByMid(arr, r+1, right);
	}

}
