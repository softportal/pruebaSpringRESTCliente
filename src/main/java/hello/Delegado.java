package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Delegado {

    private int id;
    private String content;


    public Delegado() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String c) {
        this.content = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    @Override
    public String toString() {
        return "Greetings{" +
                "content='" + content + '\'' +
                ", id=" + id +
                '}';
    }
}
