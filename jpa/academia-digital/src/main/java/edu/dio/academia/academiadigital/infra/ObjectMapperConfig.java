package edu.dio.academia.academiadigital.infra;

import com.fasterxml.jackson.databind.SerializationFeature;
import edu.dio.academia.academiadigital.infra.jackson.deser.LocalDateDeserializer;
import edu.dio.academia.academiadigital.infra.jackson.deser.LocalDateTimeDeserializer;
import edu.dio.academia.academiadigital.infra.jackson.ser.LocalDateSerializer;
import edu.dio.academia.academiadigital.infra.jackson.ser.LocalDateTimeSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Venilton Falvo Jr
 */
@Configuration
public class ObjectMapperConfig implements Jackson2ObjectMapperBuilderCustomizer {

    @Override
    public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
        jacksonObjectMapperBuilder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .serializerByType(LocalDate.class, new LocalDateSerializer())
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializer())
                .deserializerByType(LocalDate.class, new LocalDateDeserializer())
                .deserializerByType(LocalDateTime.class, new LocalDateTimeDeserializer());
    }
}