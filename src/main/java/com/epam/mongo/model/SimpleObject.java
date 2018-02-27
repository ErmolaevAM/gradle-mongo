package com.epam.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "simple_objects")
public class SimpleObject {

    @Id
    private String id;

    @Indexed(unique = true)
    private String item;

    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SimpleObject{" +
                "id=" + id +
                ", item=" + item +
                ", title=" + title + '}';
    }
}
