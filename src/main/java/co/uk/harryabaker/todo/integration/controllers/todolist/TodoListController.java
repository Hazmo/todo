package co.uk.harryabaker.todo.integration.controllers.todolist;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.uk.harryabaker.todo.domain.todolist.service.TodoListService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/list")
@RequiredArgsConstructor
public class TodoListController {

    private final TodoListService todoListService;

    @PostMapping
    public String createList() {
        return todoListService.createList();
    }

}