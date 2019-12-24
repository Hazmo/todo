package co.uk.harryabaker.todo.domain.todolist.port;

import co.uk.harryabaker.todo.domain.todolist.model.TodoList;

public interface TodoListPort {

   TodoList createList(TodoList todoList);
}