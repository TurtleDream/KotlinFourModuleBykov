// Задание 18: Авиакомпания 2. Конструктор
// Усовершенствуйте программу для авиакомпании.
// Пусть свойства: номер воздушного судна, максимальная дальность полета и вместимость бака определяются через конструктор.
// Для этих свойств значения определять не надо.
fun main(){
    Aircraft2("Боинг 737-800", 50000f, 200).getInfo()
}

class Aircraft2(private val number: String, private val maxFlightDistance: Float, private val tankCapacity: Int) {
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