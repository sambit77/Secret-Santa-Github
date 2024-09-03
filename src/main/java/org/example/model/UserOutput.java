package org.example.model;

public class UserOutput {
    private int giver_id;
    private String giver_name;
    private String giver_email;
    private int receiver_id;
    private String receiver_name;
    private String receiver_email;

    public UserOutput() {
    }

    public UserOutput(int giver_id, String giver_name, String giver_email, int receiver_id, String receiver_name, String receiver_email) {
        this.giver_id = giver_id;
        this.giver_name = giver_name;
        this.giver_email = giver_email;
        this.receiver_id = receiver_id;
        this.receiver_name = receiver_name;
        this.receiver_email = receiver_email;
    }

    public int getGiver_id() {
        return giver_id;
    }

    public void setGiver_id(int giver_id) {
        this.giver_id = giver_id;
    }

    public String getGiver_name() {
        return giver_name;
    }

    public void setGiver_name(String giver_name) {
        this.giver_name = giver_name;
    }

    public String getGiver_email() {
        return giver_email;
    }

    public void setGiver_email(String giver_email) {
        this.giver_email = giver_email;
    }

    public int getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(int receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_email() {
        return receiver_email;
    }

    public void setReceiver_email(String receiver_email) {
        this.receiver_email = receiver_email;
    }

    @Override
    public String toString() {
        return  giver_id +
                "," + giver_name +
                "," + giver_email +
                "," + receiver_id +
                "," + receiver_name +
                "," + receiver_email ;
    }
}
