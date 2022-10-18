package com.jxd.todo_list.dto

data class BaseResult<T>(
    val code: Int,
    val message: String?,
    val data: T?
)
