package com.itesm.komorebi.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;
import java.util.Set;

@DynamoDBTable(tableName = "Recording")
public class Recording {
    private List<String> customer;
    private List<Integer> configuration;
    private Set<String> keystrokes;
    private boolean successful_outcome;
    private List<String> notes;
    private Set<String> tags;
    private Set<String> category;
    private String timestamp;
    private Integer agent_id;
    private Integer duration;
    private Integer video_id;

    @DynamoDBAttribute
    public List<String> getCustomer() {
        return customer;
    }

    public void setCustomer(List<String> customer) {
        this.customer = customer;
    }
    @DynamoDBAttribute
    public List<Integer> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(List<Integer> configuration) {
        this.configuration = configuration;
    }
    @DynamoDBAttribute
    public Set<String> getKeystrokes() {
        return keystrokes;
    }

    public void setKeystrokes(Set<String> keystrokes) {
        this.keystrokes = keystrokes;
    }
    @DynamoDBAttribute
    public boolean isSuccessful_outcome() {
        return successful_outcome;
    }

    public void setSuccessful_outcome(boolean successful_outcome) {
        this.successful_outcome = successful_outcome;
    }

    @DynamoDBAttribute
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @DynamoDBAttribute
    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }
    @DynamoDBAttribute
    public Set<String> getCategory() {
        return category;
    }

    public void setCategory(Set<String> category) {
        this.category = category;
    }
    @DynamoDBAttribute
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    @DynamoDBAttribute
    public Integer getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(Integer agent_id) {
        this.agent_id = agent_id;
    }
    @DynamoDBHashKey
    public Integer getVideo_id() {
        return video_id;
    }

    public void setVideo_id(Integer video_id) {
        this.video_id = video_id;
    }

    @DynamoDBAttribute
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}