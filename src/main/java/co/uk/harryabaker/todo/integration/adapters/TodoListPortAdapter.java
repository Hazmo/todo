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
    public TodoList getTodoList(String id) {
        // TODO: 24/12/2019 create a proper runtime exception for this
        return todoListRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    @Override
    public TodoList createTodoList(TodoList todoList) {
        return todoListRepository.save(todoList);
    }
}
