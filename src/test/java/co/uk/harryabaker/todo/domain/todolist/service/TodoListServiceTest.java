package co.uk.harryabaker.todo.domain.todolist.service;

import co.uk.harryabaker.todo.domain.todolist.port.TodoListPort;
import org.hashids.Hashids;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

@Disabled
class TodoListServiceTest {

    private TodoListService todoListService;

    @BeforeEach
    public void setUp() {
        Hashids hashids = new Hashids("", 6);
        TodoListPort todoListPort = mock(TodoListPort.class);

         todoListService = new TodoListService(hashids, todoListPort);
    }

    @Test
    void createList() {
        todoListService.createList();
    }
}