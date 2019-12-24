package co.uk.harryabaker.todo.domain.todolist.port;

import co.uk.harryabaker.todo.domain.todolist.model.TodoList;

public interface TodoListPort {

   TodoList getTodoList(String id);

   TodoList getTodoListFromTodo(String todoId);

   TodoList createTodoList(TodoList todoList);

   TodoList save(TodoList todoList);
}