package com.jackson.daggertest.utils; /**
 * User1  2018-03-22
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

/**
 * class description here
 *
 * @author Jackson
 * @version 1.0.0
 *          since 2018 03 22
 */
public class User1 {

    private int id;
    private String name;
    private int score;
    private String address;

    /**
     * 构造方法私有化
     *
     * @param builder
     */
    private User1(Builder builder) {
        this.id = builder.id;
        this.name=builder.name;
        this.score=builder.score;
        this.address=builder.address;

    }

    public static class Builder {

        private int id;
        private String name;
        private int score;
        private String address;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setScore(int score) {
            this.score = score;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User1 build() {
            return new User1(this);
        }

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

