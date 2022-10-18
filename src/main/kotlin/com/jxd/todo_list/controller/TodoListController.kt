package com.jxd.todo_list.controller

import com.jxd.todo_list.dto.BaseResult
import com.jxd.todo_list.dto.Todo
import com.jxd.todo_list.service.ITodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoListController {
    @Autowired
    private lateinit var todoService: ITodoService

    @GetMapping("/todos")
    fun queryAll(): BaseResult<List<Todo>> {
        return BaseResult(
            code = 200,
            message = "",
            data = todoService.queryAll()
        )
    }

    @GetMapping("/todo")
    fun findById(id: Int): BaseResult<Todo> {
        return BaseResult(
            code = 200,
            message = "",
            data = todoService.findById(id)
        )
    }

    @PostMapping("/insert")
    fun insertOne(@RequestBody todo: Todo): BaseResult<Todo> {
        todoService.insert(todo)
        return BaseResult(
            code = 200,
            message = "",
            data = todo
        )
    }
}