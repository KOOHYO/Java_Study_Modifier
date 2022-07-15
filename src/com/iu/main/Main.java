package com.iu.main;

import java.util.Scanner;

import com.iu.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		//test data set
		int [] nums = {1,2,3};
		Scanner scanner = new Scanner(System.in);
		

		//1. com.iu.util.CollectionStack
		// add 메서드 - 입력받은 숫자를 추가 새로운 숫자 추가 무조건 0번에 추가
		// remove 메서드 - 0번 인덱스 삭제
		//collectionStack.add ->{4,1,2,3}
		//collectionStack.remove ->{2,3}
	
		//2. com.iu.util.CollectionQue
		// add - 새로운 숫자 추가 무조건 0번에 추가
		// remove - 마지막 인덱스 번호 삭제
		//collectionStack.add ->{4,1,2,3}
		//collectionStack.remove ->{1,2}
	
		//3. com.iu.util.CollectionSet
		// add - 새로운 숫자 추가 마지막에 추가
		//		 단, 중복되지 않는 숫자만 추가
		// remove - 삭제할 숫자를 입력받아서 일치하는 숫자를 삭제
		//collectionStack.add ->{1,2,3,4}
		//collectionStack.remove ->{2,3}
		
	}

}
