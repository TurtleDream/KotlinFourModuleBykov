// 19: Авиакомпания 3. Наследование
// Создадим наследника класса Aircraft с названием Boeing747 и добавим ему свойство, обозначающее вместимость пассажиров
fun main(){
    Boeing747("Боинг 747-800", 50000f, 200, 100).getInfo()
}

class Boeing747 (number: String, maxFlightDistance: Float, tankCapacity: Int, private var passengerCapacity: Int) : AircraftThirdVersion(number, maxFlightDistance, tankCapacity) {
    override fun getInfo(){
        super.getInfo()
        println("Вместимость пассажиров - $passengerCapacity человек")
    }
}

open class AircraftThirdVersion(private val number: String, private val maxFlightDistance: Float, private val tankCapacity: Int) {
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