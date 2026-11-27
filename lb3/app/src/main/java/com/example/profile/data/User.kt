package com.example.profile.data

/**
 * Исходные данные профиля, как в заготовке лабораторной.
 * @property name Имя пользователя.
 * @property surname Фамилия пользователя.
 * @property status Краткое описание пользователя.
 * @property followers Количество подписчиков.
 * @property isSubscribed Начальное состояние подписки.
 */
data class User(
    val name: String = "Никита",
    val surname: String = "Ковальчук",
    val status: String = "Пытаюсь заниматься мобильной разработкой 📱",
    val followers: Int = 123,
    val isSubscribed: Boolean = false
)
