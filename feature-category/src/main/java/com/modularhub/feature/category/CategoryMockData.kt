package com.modularhub.feature.category

data class CategoryItem(val id: String, val name: String, val count: Int)

object CategoryMockData {
    fun categories(): List<CategoryItem> = listOf(
        CategoryItem("1", "数码电器", 128),
        CategoryItem("2", "服饰鞋包", 256),
        CategoryItem("3", "食品生鲜", 89),
        CategoryItem("4", "家居家装", 64),
        CategoryItem("5", "图书文娱", 42),
        CategoryItem("6", "运动户外", 73),
    )
}
