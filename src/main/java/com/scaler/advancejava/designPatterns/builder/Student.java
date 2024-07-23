package com.scaler.advancejava.designPatterns.builder;

public class Student {
    String name;
    int age;
    String batch;
    String university;
    double psp;
    int gradYear;
    String phoneNumber;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
        this.university = builder.university;
        this.psp = builder.psp;
        this.gradYear = builder.gradYear;
        //this.phoneNumber = builder.phoneNumber;
    }

    public static class Builder{
        String name;
        int age;
        String batch;
        String university;
        double psp;
        int gradYear;
        String phoneNumber;

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getUniversity() {
            return university;
        }

        public String getBatch() {
            return batch;
        }

        public double getPsp() {
            return psp;
        }

        public int getGradYear() {
            return gradYear;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Student build(){
            //Validations
            if(psp < 80){
                throw new RuntimeException("psp is less than 80");
            }
            if(gradYear < 2010){
                throw new RuntimeException("gradYear is less than 2010");
            }
            return new Student(this);
        }
    }
}
