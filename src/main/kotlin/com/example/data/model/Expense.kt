package com.example.data.model

import kotlinx.serialization.Serializable

val expenses = mutableListOf(
    Expense(id = 1, amount = 10.2, categoryName = "SNACKS", description = "Homies"),
    Expense(id = 2, amount = 21000.0, categoryName = "CAR", description = "Audi A1"),
    Expense(id = 3, amount = 15.0, categoryName = "COFFEE", description = "Beans and cream"),
    Expense(id = 4, amount = 25.0, categoryName = "PARTY", description = "Weekend party"),
    Expense(id = 5, amount = 120.0, categoryName = "HOUSE", description = "Expenses"),
    Expense(id = 6, amount = 25.0, categoryName = "OTHER", description = "CLEANING"),
    Expense(id = 7, amount = 70.0, categoryName = "GROCERIES", description = "Weekly buy")
)


@Serializable
data class Expense(
    val id: Long = -1,
    val amount: Double,
    val categoryName: String,
    val description: String

)