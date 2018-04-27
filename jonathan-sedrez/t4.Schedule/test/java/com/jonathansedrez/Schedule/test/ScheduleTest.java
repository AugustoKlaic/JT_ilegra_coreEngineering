package com.jonathansedrez.Schedule.test;

import org.junit.Test;
import com.jonathansedrez.Schedule.*;

public class ScheduleTest {
	Schedule user = new Schedule();

	@Test
	public void testAdd() {
		user.add(new Contact(1, "a", "a", "a"));
	}
	
	@Test
	public void testRemove() {
		user.add(new Contact(1, "a", "a", "a"));
		user.remove(1);
	}
	
	@Test	
	public void testEmpityRemove() {
		user.remove(1);
	}
	
	@Test
	public void testList() {
		user.add(new Contact(1, "a", "a", "a"));
		user.add(new Contact(2, "b", "b", "b"));
		user.add(new Contact(3, "c", "c", "c"));
		user.list();
	}
	
	@Test
	public void testEmpityList() {
		user.list();
	}
	
	@Test
	public void testSearchId() {
		user.add(new Contact(1, "a", "a", "a"));
		user.searchId(1);
	}
	
	@Test
	public void testSearchIdEmpity() {
		user.searchId(3);
	}

	@Test
	public void testSearchName() {
		user.add(new Contact(1, "a", "a", "a"));
		user.add(new Contact(2, "b", "b", "b"));
		user.add(new Contact(3, "c", "c", "c"));
		user.searchName("a");		
	}
}