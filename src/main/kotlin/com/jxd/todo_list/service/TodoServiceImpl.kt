package com.jxd.todo_list.service

import com.jxd.todo_list.dto.Todo
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl : ITodoService {
    private val tmp = mutableListOf(
        Todo(id = 0, state = 0, content = "AAA"),
        Todo(id = 1, state = 0, content = "BBB"),
        Todo(id = 2, state = 0, content = "CCC"),
        Todo(id = 3, state = 0, content = "DDD"),
    )

    override fun queryAll(): List<Todo> {
        return tmp
    }

    override fun findById(id: Int): Todo? {
        return tmp.find { f -> f.id == id }
    }

    override fun insert(todo: Todo): Boolean {
        tmp += todo
        return true
    }

}