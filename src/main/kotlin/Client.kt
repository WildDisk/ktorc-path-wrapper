package ru.wilddisk

/**
 * Обёртка над сконфигурированным ktor клиентом
 * @property ktor сконфигурированный ktor клиент
 * @property url адрес к которому будет обращение
 */
class Client(val ktor: Ktor.Configure, val url: String) {
    /**
     * Путь до ендпоинта
     */
    fun withPath(): Path = Path(this)
    /**
     * Метод запроса
     */
    fun method(): Method = Method(this)
}