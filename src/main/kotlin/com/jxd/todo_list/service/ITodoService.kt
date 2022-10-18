package com.jxd.todo_list.service

import com.jxd.todo_list.dto.Todo

interface ITodoService {
    fun queryAll(): List<Todo>
    fun findById(id: Int): Todo?
    fun insert(todo: Todo): Boolean
}