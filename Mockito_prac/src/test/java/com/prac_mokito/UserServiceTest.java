package com.prac_mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import mokito_prac.Calculator;
import mokito_prac.MathService;
import mokito_prac.UserService;
import mokito_prac.UsersDao;

public class UserServiceTest {
	
	@Test
	public void testGetTypeOfCustomer() {
		UsersDao userdao = new UsersDao();
		UserService userService = new UserService(userdao);
		String actualRes = userService.typeOfCustomer(1);
		assertEquals("regular user", actualRes);
	}
	
	@Test
	public void testDoubleAddition() {
		Calculator calmock = mock(Calculator.class);
		when(calmock.add(5, 5)).thenReturn(20);
		MathService service = new MathService(calmock);
		int res = service.doubleAddition(5, 5);
		assertEquals(-1, res);
	}

}
