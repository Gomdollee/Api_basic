package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bear {

    private String name;

    @JsonProperty("bear_number")
    private String bearNumber;

    @JsonProperty("TYPE")
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBearNumber() {
        return bearNumber;
    }

    public void setBearNumber(String bearNumber) {
        this.bearNumber = bearNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "name='" + name + '\'' +
                ", bearNumber='" + bearNumber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
