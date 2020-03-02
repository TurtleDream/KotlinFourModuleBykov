// Задание 22: Авиакомпания 6. Вывод информации
// 1. Создайте в классе Aircraft функцию для вывода характеристик самолетов в консоль.
// 2. Переопределите данную функцию в классе Boeing747, так чтобы еще выводилась информация о пассажирах
// 3. Сделайте свойства обоих классов видимыми только внутри этих классов и их наследниках, кроме свойства наследуемого от интерфейса.
//    Свойства и функции интерфейсов не поддерживают модификатор protected и internal
fun main(){
    Boeing747FourVersion("Боинг 747-800", 50000f, 200, 100).getInfo()
}

class Boeing747FourVersion (number: String, maxFlightDistance: Float, tankCapacity: Int, override var passengerCapacity: Int)
    : AircraftFifthVersion(number, maxFlightDistance, tankCapacity), Passenger {
    override fun getInfo(){
        super.getInfo()
        println("Вместимость пассажиров - $passengerCapacity человек")
    }
}

abstract class AircraftFifthVersion(protected val number: String, protected val maxFlightDistance: Float, protected val tankCapacity: Int) {
    protected val fuelConsumptionPer100Km: Float
        get() {
            return (100 * tankCapacity) / maxFlightDistance
        }

    open fun getInfo(){
        println("""
            |Номер судна - '$number'
            |Максимальная длительность полета - $maxFlightDistance км
            |Вместимость бака - $tankCapacity л
            |Расход топлива на 100 км - $fuelConsumptionPer100Km л/100км
        """.trimMargin())
    }
}