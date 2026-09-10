@Deprecated("Для проверки предупреждений")
fun printAge() {
    println("Введите ваше имя:")
    val name = readln()

    println("Введите ваш возраст: ")
    val age = readln().toInt()

    println("Пользователю, $name $age лет.")
}

fun main() {
    printAge()
}

