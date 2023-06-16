package ferlopezcarr.websitebackend.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class ApiPrefixConfiguration implements WebMvcConfigurer {

    private static final String API_PREFIX = "/api/";

    @Value("${api.version}")
    private String apiVersion = "v1";

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        final String apiPrefix = API_PREFIX + apiVersion;
        configurer.addPathPrefix(apiPrefix, c -> c.isAnnotationPresent(RestController.class));
    }
}