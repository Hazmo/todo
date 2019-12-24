package co.uk.harryabaker.todo.domain.todolist.port;

import co.uk.harryabaker.todo.domain.todolist.model.TodoList;

public interface TodoListPort {

   TodoList getTodoList(String id);

   TodoList createTodoList(TodoList todoList);
}