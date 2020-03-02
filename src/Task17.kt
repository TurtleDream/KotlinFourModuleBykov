// Задание 17: Авиакомпания 1
// Поможем авиакомпании в создании программы для учета авиапарка.
// Создайте класс Aircraft и реализуйте в нем свойства, содержащие следующее: номер воздушного судна, максимальная дальность полета, вместимость бака, расход топлива на 100 км.
// Установите значения по своему усмотрению.
// Переопределите геттер свойства содержащего расход топлива, чтобы он самостоятельно рассчитывался из свойств дальности полета и вместимости бака.
fun main(){
    AircraftFirstVersion("Боинг 737-800", 50000f, 200).getInfo()
}

class AircraftFirstVersion() {
    constructor(number: String, maxFlightDistance: Float,tankCapacity: Int): this(){
        this.number = number
        this.maxFlightDistance = maxFlightDistance
        this.tankCapacity = tankCapacity
    }

    private var number: String = "Ту-50"
    private var maxFlightDistance: Float = 100000f
    private var tankCapacity: Int = 500

    private val fuelConsumptionPer100Km: Float
    get() {
        return (100 * tankCapacity) / maxFlightDistance
    }

    fun getInfo(){
        println("""
            |Номер судна - '$number'
            |Максимальная длительность полета - $maxFlightDistance км
            |Вместимость бака - $tankCapacity л
            |Расход топлива на 100 км - $fuelConsumptionPer100Km л/100км
        """.trimMargin())
    }
}