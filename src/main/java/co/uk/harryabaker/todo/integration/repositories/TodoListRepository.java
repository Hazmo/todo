package co.uk.harryabaker.todo.integration.repositories;

import co.uk.harryabaker.todo.domain.todolist.model.TodoList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface TodoListRepository extends MongoRepository<TodoList, String> {

    @Query("{todos: {$elemMatch: { _id: ?0}}}")
    Optional<TodoList> findByTodoId(String todoId);
}
