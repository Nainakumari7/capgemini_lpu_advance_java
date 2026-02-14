 package com.mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import mokito.User;
import mokito.UserDao;
import mokito.UserService;

public class UserServiceTest {
	public void typeOfUser() {
		UserDao daomock = mock(UserDao.class);
		
		User fakeObject = new User();
		fakeObject.setId(1);
		fakeObject.setBalance(2000);
		fakeObject.setName("Allen");
		
		when(daomock.findById(1)).thenReturn(fakeObject);
		
		User user1 = new User();
		user1.setId(2);
		user1.setBalance(1000);
		user1.setName("Miller");
		when(daomock.findById(2)).thenReturn(fakeObject);
		UserService service = new UserService(daomock);
		
		String res = service.typeOfUser(2);
		assertEquals("regular user", res);

		
	}

}
