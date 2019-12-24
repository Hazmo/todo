package co.uk.harryabaker.todo.integration.graphql.mutations;

import co.uk.harryabaker.todo.domain.todolist.model.TodoList;
import co.uk.harryabaker.todo.domain.todolist.service.TodoListService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TodoListMutation implements GraphQLMutationResolver {

    private final TodoListService todoListService;

    public TodoList createTodoList() {
        return todoListService.createTodoList();
    }
}
