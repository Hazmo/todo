package co.uk.harryabaker.todo.domain.todolist.model;

import java.util.Collections;
import java.util.List;

import lombok.Value;
import org.springframework.data.mongodb.core.mapping.Document;

import co.uk.harryabaker.todo.domain.todo.model.Todo;
import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@Value
@Document
public class TodoList {
   
   @MongoId
   private String id;

   @Builder.Default
   private List<Todo> todos = Collections.emptyList();

}