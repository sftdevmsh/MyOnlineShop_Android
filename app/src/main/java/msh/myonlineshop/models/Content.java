package msh.myonlineshop.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Content implements Serializable {
    private long id;
    @SerializedName(value = "key1")
    private String key;
    private String value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
