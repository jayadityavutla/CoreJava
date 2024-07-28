package com.scaler.advancejava.designPatterns.prototype;

public class Client {
    public static void setValues(StudentRegistry studentRegistry){
        Student july = new Student();
        july.setBatch("July batch");
        july.setAvgPsp(60.0);
        july.setInstructorName("Dheeraj");
        studentRegistry.register("july", july);

        IntelligentStudent july24 = new IntelligentStudent();
        july24.setBatch("July 24 batch");
        july24.setAvgPsp(65.0);
        july24.setInstructorName("Priyanshi");
        studentRegistry.register("july24", july24);
    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        setValues(registry);

        Student st = registry.get("july").clone();
        st.setName("Sujit");
        st.setCity("Chennai");
        st.setAge(25);

        Student is = registry.get("july24").clone();
        is.setName("Jay");
        is.setCity("Bangalore");
        is.setAge(24);

        System.out.println("Debug here");
    }
}
