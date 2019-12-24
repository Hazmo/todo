package co.uk.harryabaker.todo.domain.todo.model;

import lombok.Value;
import lombok.With;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;

@With
@Value
@Builder
@Document
public class Todo {

    @Id
    private String id;
    private String description;
    private boolean complete;

    public boolean hasId(String id) {
        return StringUtils.equals(this.id, id);
    }
}