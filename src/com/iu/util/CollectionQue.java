package com.iu.util;

public class CollectionQue implements Collection{
	
	//2. com.iu.util.CollectionQue
	// add - 새로운 숫자 추가 무조건 0번에 추가
	// remove - 마지막 인덱스 번호 삭제
	
	//2. com.iu.util.CollectionQue
	// add - 새로운 숫자 추가 무조건 0번에 추가

	@Override
	public int[] add(int[] numbers) {
		int num = 4;
		int [] newNumbers = new int[numbers.length+1];
		newNumbers[0] = num;
		for(int i=0; i<numbers.length; i++) {
			newNumbers[i+1]=numbers[i];
		}
		
		return newNumbers;
	}

	// remove - 마지막 인덱스 번호 삭제
	@Override
	public int[] remove(int[] numbers) {
		int [] newNumbers = new int[numbers.length-1];
		for(int i=0; i<numbers.length-1; i++) {
			newNumbers[i]=numbers[i];
		}
		
		return newNumbers;
	}
	
}
