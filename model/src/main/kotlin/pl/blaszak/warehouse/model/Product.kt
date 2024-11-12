package pl.blaszak.warehouse.model

import java.time.LocalDate
import java.time.LocalDateTime

data class Product(
    var id: Long?,
    var productType: ProductType,
    var amount: Double,
    var startAmount: Double,
    var deliveryDate: LocalDateTime,
    var expirationDate: LocalDate
) {
}