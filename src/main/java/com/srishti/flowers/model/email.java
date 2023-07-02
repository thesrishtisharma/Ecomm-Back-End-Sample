package com.srishti.flowers.model;

public class email {

    private String to;
    private String body;
    private String topic;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "email{" +
                "to='" + to + '\'' +
                ", body='" + body + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
