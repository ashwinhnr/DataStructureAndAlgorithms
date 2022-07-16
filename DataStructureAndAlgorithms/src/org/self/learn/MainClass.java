package org.self.learn;

public class MainClass {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
//		System.out.println(linkedList);
//		System.out.println("Size: "+linkedList.getSize());
//		System.out.println("Size: "+linkedList.size());

		linkedList.addFront(1);
		linkedList.addFront(2);
		linkedList.addFront(3);
		System.out.println(linkedList);
//		System.out.println("Size: "+linkedList.getSize());
//		System.out.println("Size: "+linkedList.size());

//		linkedList.addBack(4);
//		System.out.println(linkedList);
//		System.out.println("Size: "+linkedList.getSize());
//		System.out.println("Size: "+linkedList.size());
		
		linkedList.deleteByValue(3);
		System.out.println(linkedList);
		System.out.println("Size: "+linkedList.size());

		linkedList.deleteByValue(2);
		System.out.println(linkedList);
		System.out.println("Size: "+linkedList.size());
		
		linkedList.deleteByValue(1);
		System.out.println(linkedList);
		System.out.println("Size: "+linkedList.size());
		linkedList.deleteByValue(4);
//		linkedList.clear();
//		System.out.println(linkedList);
//		
		
		

	}
	
	

}


