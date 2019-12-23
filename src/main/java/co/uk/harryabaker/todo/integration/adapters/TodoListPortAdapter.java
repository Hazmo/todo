package co.uk.harryabaker.todo.integration.adapters;

import co.uk.harryabaker.todo.domain.todolist.model.TodoList;
import co.uk.harryabaker.todo.domain.todolist.port.TodoListPort;
import co.uk.harryabaker.todo.integration.repositories.TodoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TodoListPortAdapter implements TodoListPort {

    private final TodoListRepository todoListRepository;

    @Override
    public TodoList createList(TodoList todoList) {
        return todoListRepository.save(todoList);
    }
}
