package es.at.migration.minhafp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;


@Configuration
public class Swagger {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    @Bean
    public UiConfiguration uiConfig() {
        return UiConfiguration.DEFAULT;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring REST Sample with Swagger")
                .description("Spring REST Sample with Swagger")
                .version("2.0")
                .build();
    }

}