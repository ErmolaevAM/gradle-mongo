package com.epam.mongo;

import com.epam.mongo.model.AdvancedSimpleObject;
import com.epam.mongo.model.SimpleObject;
import com.epam.mongo.repositories.SimpleObjectsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(SimpleObjectsRepository simpleObjectsRepository) {

        return args -> {

            SimpleObject obj = simpleObjectsRepository.findByTitle("gibson");
            System.out.println(obj);

            List<SimpleObject> all = simpleObjectsRepository.findAll();
            all.forEach(System.out::println);

            SimpleObject object = new SimpleObject();
            object.setId("3");
            object.setItem("cup");
            object.setTitle("epam");
            simpleObjectsRepository.save(object);

            AdvancedSimpleObject advancedSimpleObject = new AdvancedSimpleObject();
            advancedSimpleObject.setId("12");
            advancedSimpleObject.setItem("pen");
            advancedSimpleObject.setTitle("monblah");
            advancedSimpleObject.setCost("28110");
            simpleObjectsRepository.save(advancedSimpleObject);

        };

    }
}
