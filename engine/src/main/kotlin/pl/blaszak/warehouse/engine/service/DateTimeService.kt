package pl.blaszak.warehouse.engine.service

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class DateTimeService {

    companion object {
        val TIME_FORMATTER: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")
        val DATE_FORMATTER: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd")
    }

    private var currentDate: LocalDate? = LocalDate.now()
    private var currentTime: LocalTime? = LocalTime.now()
    fun now(): LocalDateTime = LocalDateTime.of(currentDate, currentTime)
    fun currentTime() = currentTime?.format(TIME_FORMATTER)
    fun currentDate() = currentDate?.format(DATE_FORMATTER)
    fun setDate(date: LocalDate) {
        currentDate = date
    }
    fun setTime(time: LocalTime) {
        currentTime = time
    }
    fun increaseDay() {
        currentDate = currentDate?.plusDays(1)
    }

    fun increaseHour() {
        currentTime = currentTime?.plusHours(1)
    }
}