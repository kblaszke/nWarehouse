package pl.blaszak.warehouse.engine.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import pl.blaszak.warehouse.db.service.DeliveryDbService
import pl.blaszak.warehouse.db.service.ProductDbService
import pl.blaszak.warehouse.db.service.ProductTypeDbService
import pl.blaszak.warehouse.engine.service.DateTimeService
import pl.blaszak.warehouse.engine.service.ProductService
import pl.blaszak.warehouse.engine.service.ProductTypeService

@Configuration
class ServicesConfiguration {

    @Bean
    fun dateTimeService() = DateTimeService()

    @Bean
    fun productTypeService(productTypeDbService: ProductTypeDbService) = ProductTypeService(productTypeDbService)

    @Bean
    fun productService(dateTimeService: DateTimeService, productDbService: ProductDbService, deliveryDbService: DeliveryDbService) = ProductService(productDbService, deliveryDbService, dateTimeService)

}