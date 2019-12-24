package co.uk.harryabaker.todo.domain.todolist.service;

import co.uk.harryabaker.todo.domain.todolist.model.TodoList;
import co.uk.harryabaker.todo.domain.todolist.port.TodoListPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static co.uk.harryabaker.todo.domain.utils.HashIdUtils.getId;

@Service
@RequiredArgsConstructor
public class TodoListService {

    private final TodoListPort todoListPort;

    public TodoList getTodoList(String id) {
        return todoListPort.getTodoList(id);
    }

    public TodoList getTodoListFromTodo(String todoId) {
        return todoListPort.getTodoListFromTodo(todoId);
    }

    public TodoList createTodoList() {

        return todoListPort.createTodoList(TodoList.builder()
                .id(getId())
                .build());
    }

    public TodoList saveTodoList(TodoList todoList) {
        return todoListPort.save(todoList);
    }

    @Deprecated
    public String createList() {
        TodoList todoList = todoListPort.createTodoList(TodoList.builder()
                .id(getId())
                .build());

        return todoList.getId();
    }

}