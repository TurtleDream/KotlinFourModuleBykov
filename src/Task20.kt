// Задание 20: Авиакомпания 4. Интерфейс
// Изменим реализацию пассажирских самолетов.
// Создадим Интерфейс с названием Passenger со свойством, обозначающим вместимость пассажиров.
// Уберем это свойство у класса Boeing747 и реализуем в нем новый интерфейс.
// Пусть свойство наследуемое от интерфейса, переопределяется в конструкторе.
fun main(){
    Boeing747SecondVersion("Боинг 747-800", 50000f, 200, 100).getInfo()
}

class Boeing747SecondVersion (number: String, maxFlightDistance: Float, tankCapacity: Int, override var passengerCapacity: Int)
    : AircraftThirdVersion(number, maxFlightDistance, tankCapacity), Passenger {
    override fun getInfo(){
        super.getInfo()
        println("Вместимость пассажиров - $passengerCapacity человек")
    }
}

interface Passenger{
    var passengerCapacity: Int
}