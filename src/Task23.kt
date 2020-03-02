// Задание 23: Data class
// Создайте data класс для автомобилей. Он должен содержать марку автомобиля, цвет и номер.
// Выведите информацию об автомобилях в консоль.
fun main(){
    var car = Car("Tesla Cybertrack","Хаки", "М444СК")

    println("""
        |Марка автомобиля - '${car.brand}'
        |Цвет автомобиля - '${car.color}'
        |Номер автомобиля - '${car.number}'
    """.trimMargin())
}

data class Car(val brand: String, val color: String, val number: String)