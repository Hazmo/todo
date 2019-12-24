package co.uk.harryabaker.todo.domain.todo.model;

import lombok.Value;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;

@Builder
@Value
@Document
public class Todo {

    private String description;
    private boolean complete;
   
}