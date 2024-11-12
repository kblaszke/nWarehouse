package pl.blaszak.warehouse.engine.configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfiguration {

    @Bean
    fun openApi(): OpenAPI = OpenAPI().info(Info().title("Warehouse Open Api"))

    @Bean
    fun holderApi(): GroupedOpenApi = GroupedOpenApi.builder()
        .group("Holder")
        .pathsToMatch("/api/holder/**")
        .build()

    @Bean
    fun productTypeApi(): GroupedOpenApi = GroupedOpenApi.builder()
        .group("Product Type")
        .pathsToMatch("/api/productType/**")
        .build()
}