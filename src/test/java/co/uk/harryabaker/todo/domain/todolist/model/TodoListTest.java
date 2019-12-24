package co.uk.harryabaker.todo.domain.todolist.model;

import co.uk.harryabaker.todo.domain.todo.model.Todo;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {


    @Test
    public void shouldGetTodoCorrectly() {
        Todo expectedTodo = Todo.builder()
                .id("hello").build();
        Todo unexpectedTodo = Todo.builder()
                .id("goodbye")
                .build();


        TodoList todoList = TodoList.builder()
                .id("1")
                .todos(newArrayList(expectedTodo, unexpectedTodo))
                .build();

        Todo actualTodo = todoList.getTodo("hello");
        assertEquals(expectedTodo, actualTodo);
    }

    @Test
    public void shouldThrowExceptionIfTodoCantBeFound() {
        Todo unexpectedTodo = Todo.builder()
                .id("goodbye")
                .build();

        TodoList todoList = TodoList.builder()
                .id("1")
                .todos(newArrayList(unexpectedTodo))
                .build();


        assertThrows(NoSuchElementException.class, () -> todoList.getTodo("hello"));
    }

}