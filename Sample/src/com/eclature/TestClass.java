package com.eclature;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestClass {

public static void main(String[] args) {
/*		final DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
	
		final ZonedDateTime input = ZonedDateTime.now();
		final ZonedDateTime startOfLastWeek = input.minusWeeks(1).with(DayOfWeek.MONDAY);
		final ZonedDateTime endOfLastWeek = startOfLastWeek.plusDays(4);
		
		String startOfLastWeek1 = dtf1.format(startOfLastWeek);
		String endOfLastWeek2 = dtf1.format(endOfLastWeek);
		
	
		System.out.println(startOfLastWeek1 + " - "+ endOfLastWeek2);*/
		
	Student s =new Student();
	s.setId(1);
		List<Student> s2 = new ArrayList<>();
		s2.add(s);
	
	EventNot e = new EventNot();
	e.setStu(s2);
		Map<String, EventNot> map = new HashMap<>();
		map.put("1", null);
		map.put("2", null);
		map.put(null, new EventNot());
		map.put(null, e);
		map.put("9", null);
		map.put("5", null);
		map.put("6", null);
		map.put(null, new EventNot());
		map.put(null, e);
		map.put("7", null);
		//System.out.println(map.get(2));
		
		for(Map.Entry<String, EventNot> en : map.entrySet()) {
			System.out.println(en.getKey() + " "+  en.getValue());
		}
		
		
		
		Student s1 =new Student();
		s1.setId(2);
		
		/*Student1 s2 =new Student1();
		s2.setId(3);
		*/
		/*for(int i=0; i<2; i++) {
			
			if(map.get(i) == null) {
				map.put(i , new EventNot());
			}
			
			map.get(i).getStu().add(s);
			map.get(i).getStu().add(s1);
			//System.out.println(map.get(i).getStu());
		}
		
		for(int j=5; j<8; j++) {
			if(map.get(j) == null) {
				map.put(j, new EventNot());
			}
			map.get(j).getStu1().add(s2);
			//System.out.println(map.get(j).getStu1());
		}
		
	for(Map.Entry<Integer, EventNot> entry : map.entrySet()) {
		Integer key = entry.getKey();
		System.out.println("key : "+key);
		List<Student> stu = entry.getValue().getStu();
		System.out.println(stu.get(key));
		List<Student1> stu1 = entry.getValue().getStu1();
		System.out.println(stu1.get(key));
		break;
	}*/
	
/*		Integer[] arr = null;
		
		arr = new Integer[] {1,2,3};
		arr = new Integer[] {4,5,6};
		
		for(Integer i : arr) {
			//System.out.println(i);
		}*/
		
/*		List<Integer> li = new ArrayList<>();
		li.add(12);
		List<Integer> li1 = new ArrayList<>();
li1.add(2);


li.addAll(li1);

for(int i=0; i<li.size(); i++) {
	System.out.println(li.get(i));
}*/
		
	}

}
