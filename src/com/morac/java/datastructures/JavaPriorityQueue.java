package com.morac.java.datastructures;

import java.util.*;

class Student implements Comparable{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    @Override
    public int compareTo(Object o) {
        Student that = (Student)o;
        int cgpaEqual = Double.compare(this.cgpa, that.getCGPA());
        if(cgpaEqual == 0){
            int nameEqual = this.name.compareTo(that.getName());
            if (nameEqual == 0 ){
                return this.id - that.getID();
            }
            return nameEqual;
        }
        return -cgpaEqual;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        Queue<Student> students = new PriorityQueue<>(events.size());
        Scanner scanner;
        String[] texts;
        for (String event : events) {
            texts = event.split(" ");
            if ("ENTER".equals(texts[0])) {
                students.add(new Student(Integer.parseInt(texts[3]),texts[1],Double.parseDouble(texts[2])));
            } else {
                if(!students.isEmpty()){
                    students.poll();
                }
            }
        }
        List<Student> list = new ArrayList<>(students.size());
        while (!students.isEmpty()){
            list.add(students.poll());
        }
        return list;
    }

}

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
