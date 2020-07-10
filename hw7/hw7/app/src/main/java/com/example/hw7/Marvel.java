package com.example.hw7;


import java.io.Serializable;

public class Marvel implements Serializable {
        private String name;
        private int image;
        private int power;
        private int speed;
        private int strength;

        public Marvel(String name, int image, int power, int speed, int strength) {
            this.name = name;
            this.image = image;
            this.power = power;
            this.speed = speed;
            this.strength = strength;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }
    }
