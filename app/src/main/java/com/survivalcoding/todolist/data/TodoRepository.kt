package com.survivalcoding.todolist.data

import com.survivalcoding.todolist.model.Todo

class TodoRepository {
    // 변경 안되는 리스트
    private var todos = (0..30).map { num ->
        Todo(
            id = num.toLong(),
            title = "청소 $num",
        )
    }.toMutableList()

    fun getTodos(): List<Todo> {
        return todos
    }

    fun insert(todo: Todo) {
        todos.add(todo)
    }

    fun update(todo: Todo) {
        todos = todos.map { if (it.id == todo.id) todo else it }.toMutableList()
    }

    fun delete(todo: Todo) {
        todos.remove(todo)
    }
}