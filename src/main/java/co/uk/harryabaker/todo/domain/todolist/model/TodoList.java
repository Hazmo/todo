package co.uk.harryabaker.todo.domain.todolist.model;

import java.util.Collections;
import java.util.List;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import co.uk.harryabaker.todo.domain.todo.model.Todo;
import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Builder
@Document
public class TodoList {
   
   @MongoId
   private String id;

   @Builder.Default
   private List<Todo> todos = Collections.emptyList();

   public void addTodo(Todo todo) {
      todos.add(todo);
   }

   public void completeTodo(String todoId) {
      Todo todo = getTodo(todoId);

      updateComplete(todo, true);
   }

   public void uncompleteTodo(String todoId) {
      Todo todo = getTodo(todoId);

      updateComplete(todo, false);
   }

   public Todo getTodo(String todoId) {
      return todos.stream()
                .filter(t -> t.hasId(todoId))
                .findFirst()
                .orElseThrow();
   }

   private void updateComplete(Todo todo, boolean complete) {
      todos.remove(todo);
      todos.add(todo.withComplete(complete));
   }
}
