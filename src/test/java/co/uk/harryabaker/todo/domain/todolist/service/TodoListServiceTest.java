package co.uk.harryabaker.todo.domain.todolist.service;

import co.uk.harryabaker.todo.domain.todolist.port.TodoListPort;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.hashids.Hashids;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
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