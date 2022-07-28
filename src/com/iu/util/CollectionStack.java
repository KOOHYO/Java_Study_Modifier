package com.iu.util;


public class CollectionStack implements Collection {

	//1. com.iu.util.CollectionStack
	// add 메서드 - 입력받은 숫자를 추가 새로운 숫자 추가 무조건 0번에 추가
	// remove 메서드 - 0번 인덱스 삭제
	
	
	//test data set
//	int [] nums = {1,2,3};
//	Scanner scanner = new Scanner(System.in);
//	String name = "test";
//	char ch = name.charAt(4);
//	System.out.println(ch);
	

	//1. com.iu.util.CollectionStack
	// add 메서드 - 입력받은 숫자를 추가 새로운 숫자 추가 무조건 0번에 추가
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
	
	// remove 메서드 - 0번 인덱스 삭제
	//collectionStack.add ->{4,1,2,3}
	//collectionStack.remove ->{2,3}
	@Override
	public int[] remove(int[] numbers) {
		
		int[] newNumbers = new int[numbers.length-1];
		for(int i=1; i<numbers.length; i++) {
			newNumbers[i-1] = numbers[i];
		}
		
		return newNumbers;
		
	}
	
}
