package co.uk.harryabaker.todo.integration.graphql.resolvers;

import co.uk.harryabaker.todo.domain.todolist.model.TodoList;
import co.uk.harryabaker.todo.domain.todolist.service.TodoListService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TodoListResolver implements GraphQLQueryResolver {

    private final TodoListService todoListService;

    public TodoList getTodoList(String id) {
        return todoListService.getTodoList(id);
    }
}
