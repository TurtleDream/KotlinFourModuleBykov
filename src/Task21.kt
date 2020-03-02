// Задание 21: Авиакомпания 5. Абстрактный класс
// Усовершенствуем программу так, чтобы нельзя было создать неопределенный тип самолета: сделайте класс Aircraft абстрактным.
fun main(){
    Boeing747ThirdVersion("Боинг 747-800", 50000f, 200, 100).getInfo()
}

class Boeing747ThirdVersion (number: String, maxFlightDistance: Float, tankCapacity: Int, override var passengerCapacity: Int)
    : AircraftThirdVersion(number, maxFlightDistance, tankCapacity), Passenger {
    override fun getInfo(){
        super.getInfo()
        println("Вместимость пассажиров - $passengerCapacity человек")
    }
}

abstract class AircraftFourVersion(private val number: String, private val maxFlightDistance: Float, private val tankCapacity: Int) {
    private val fuelConsumptionPer100Km: Float
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
