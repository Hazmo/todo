package co.uk.harryabaker.todo.integration.repositories;

import co.uk.harryabaker.todo.domain.todolist.model.TodoList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoListRepository extends MongoRepository<TodoList, String> {
}
