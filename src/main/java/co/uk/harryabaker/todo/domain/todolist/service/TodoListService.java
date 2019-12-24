package co.uk.harryabaker.todo.domain.todolist.service;

import co.uk.harryabaker.todo.domain.todolist.model.TodoList;
import co.uk.harryabaker.todo.domain.todolist.port.TodoListPort;
import lombok.RequiredArgsConstructor;
import org.hashids.Hashids;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class TodoListService {

    private static final long BOUND = 1000000L;
    private final Hashids hashids;

    private final TodoListPort todoListPort;

    public TodoList getTodoList(String id) {
        return todoListPort.getTodoList(id);
    }

    public TodoList createTodoList() {
        String encode = hashids.encode(ThreadLocalRandom.current().nextLong(BOUND)).toUpperCase();
        TodoList todoList = todoListPort.createTodoList(TodoList.builder()
                .id(encode)
                .build());

        return todoList;
    }

    @Deprecated
    public String createList() {
        String encode = hashids.encode(ThreadLocalRandom.current().nextLong(BOUND)).toUpperCase();
        TodoList todoList = todoListPort.createTodoList(TodoList.builder()
                .id(encode)
                .build());

        return todoList.getId();
    }
}