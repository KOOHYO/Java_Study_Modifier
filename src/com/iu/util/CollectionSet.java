package com.iu.util;

public class CollectionSet implements Collection{


	//3. com.iu.util.CollectionSet
	// add - 새로운 숫자 추가 마지막에 추가
	//		 단, 중복되지 않는 숫자만 추가
	//collectionStack.add ->{1,2,3,4}
	@Override
	public int[] add(int[] numbers) {
		int [] newNumbers = new int [numbers.length+1];
		int num = 4;
		newNumbers[numbers.length+1] = num;
		for(int i=0; i<numbers.length; i++) {
			if(num==newNumbers[i]) {
				//중복!
				break;
			}
		}
		
		
		for (int i=0; i<numbers.length; i++) {
			newNumbers[i]=numbers[i];
		}
		return newNumbers;
	}
	
	// remove - 삭제할 숫자를 입력받아서 일치하는 숫자를 삭제
	//collectionStack.remove ->{2,3}
	@Override
	public int[] remove(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

}
