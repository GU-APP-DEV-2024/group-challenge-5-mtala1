package com.zybooks.workingwithdata

data class NasaApiData(
    val natural: String,
    val naturalDate: String,
    val naturalAll: List<String>,
    val naturalAvailable: List<String>,
    val enhanced: String,
    val enhancedDate: String,
    val enhancedAll: List<String>,
    val enhancedAvailable: List<String>,
    val apiKey: String

)

object MockNasaApiData {
    fun getMockData(): NasaApiData {
        return NasaApiData(
            natural = "2024-11-14",
            naturalDate = "2024-11-14",
            naturalAll = listOf("2024-11-10", "2024-11-12", "2024-11-14"),
            naturalAvailable = listOf("2024-11-10", "2024-11-12", "2024-11-14"),
            enhanced = "2024-11-14",
            enhancedDate = "2024-11-14",
            enhancedAll = listOf("2024-11-08", "2024-11-10", "2024-11-14"),
            enhancedAvailable = listOf("2024-11-08", "2024-11-10", "2024-11-14"),
            apiKey = "DEMO_KEY"
        )
    }
}
