package co.uk.harryabaker.todo.integration.graphql.mutations;

import co.uk.harryabaker.todo.domain.todo.model.Todo;
import co.uk.harryabaker.todo.domain.todolist.model.TodoList;
import co.uk.harryabaker.todo.domain.todolist.service.TodoListService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static co.uk.harryabaker.todo.domain.utils.HashIdUtils.getId;

@Component
@RequiredArgsConstructor
public class TodoMutation implements GraphQLMutationResolver {

    private final TodoListService todoListService;

    public Todo createTodo(String todoListId, String description) {
        Todo todo = Todo.builder().id(getId()).description(description).build();

        TodoList todoList = todoListService.getTodoList(todoListId);

        todoList.addTodo(todo);
        todoListService.saveTodoList(todoList);

        return todo;
    }

    public Todo completeTodo(String id) {
        TodoList todoList = todoListService.getTodoListFromTodo(id);

        todoList.completeTodo(id);

        return saveTodoListAndGetTodo(id, todoList);
    }

    public Todo uncompleteTodo(String id) {
        TodoList todoList = todoListService.getTodoListFromTodo(id);

        todoList.uncompleteTodo(id);

        return saveTodoListAndGetTodo(id, todoList);
    }

    private Todo saveTodoListAndGetTodo(String id, TodoList todoList) {
        todoListService.saveTodoList(todoList);
        return todoList.getTodo(id);
    }

}
