package com.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.data.api.TodoService;
import com.data.api.TodoServiceStub;

public class TodoBusinessStudTest {

	@Test
	public void testretrieveTodoRelatedToSpring_usingAStud() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(1, filteredTodos.size());
	}


}
