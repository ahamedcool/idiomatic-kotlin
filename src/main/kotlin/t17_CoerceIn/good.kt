package t17_CoerceIn.good

fun updateProgress(value: Int) {
    val actualValue = value.coerceIn(0, 100)
}
