package com.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.awt.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void test()
	{
		List listMock = mock(List.class);
		
		when(listMock.getSize()).thenReturn(null);
		assertEquals(2, listMock.getSize());
	}
}
