object PerfoMeter {

    private const val LOG_TAG = "PerfoMeter"

    private val perfoMeterItems = mutableMapOf<String, Long>()

    fun start(tag: String) {
        perfoMeterItems[tag] = System.nanoTime()
    }

    fun stopAndPrint(tag: String, unit: PerfoUnit = PerfoUnit.MILLI) {

        val start = perfoMeterItems[tag]
        if(start != null) {
            val nanoDuration = System.nanoTime() - start
            val unitDuration = nanoDuration / unit.nanoMultiplier
            Log.d(LOG_TAG, "$tag took $unitDuration ${unit.logName}")
            perfoMeterItems.remove(tag)
        }
    }
}
enum class PerfoUnit(val nanoMultiplier: Long, val logName:String) {
    NANO(1, "nano"),
    MILLI(1000000, "ms"),
    SEC(1000000000, "sec")
}
