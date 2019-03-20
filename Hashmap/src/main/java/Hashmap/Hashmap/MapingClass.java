package Hashmap.Hashmap;

import java.util.*;

public class MapingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating map of Students
		Map<Integer,Student> map = new HashMap<Integer,Student>();
		//creating student lists
		Student st1 = new Student("Pritam","101","cse","pritamewu@gmail.com");
		Student st2 = new Student("Sakib","102","cse","sakibhasan077@gmail.com");
		Student st3 = new Student("Rubel","103","cse","rubel@gmail.com");
		//Adding Students to the map
		
		ArrayList list = new ArrayList();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		HashMap<Integer, Student> hm = new HashMap<Integer, Student>(); 

		// Adding object in HashMap 
		hm.put(1, st1); 
		hm.put(2, st2); 
		hm.put(3, st3);
		
		System.out.println("Array List:");
		System.out.println(list);
		System.out.println("Hashmap:");
		System.out.println(hm);
	}

}
