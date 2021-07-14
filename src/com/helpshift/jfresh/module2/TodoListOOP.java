package com.helpshift.jfresh.module2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javafx.concurrent.Task;

public class TodoListOOP {

  // How do I represent a TodoList as a Class Type whose objects will be actual TodoLists ?
  static class TodoList {
    // state ?
    List<Task> taskList = new ArrayList<>();

    // behaviours
    void addTask(String title) {
      taskList.add(new Task(title));
    }

    void addTask(String title, String desc, Date dueDate) {
      taskList.add(new Task(title,desc,dueDate));
    }

  }

  // How do I model a TodoList Task or Item's Class Type ?
  static class Task {
    // state ?
    String title;
    String desc;
    Date dueDate;
    boolean isComplete;

    // create a constructor
    /*
     * What is a Constructor
     *
     * A constructor is a "special method" in a class that must be called for an "Object of that Class" to be created
     * -> The name must match the class name
     * -> Has no return type
     * -> Can have zero (empty or default constructor) or more arguments
     */

    public Task(){}

    public Task(String title) {
      this.title = title;
    }

    public Task(String title, String desc, Date dueDate) {
      this.title = title;
      this.desc = desc;
      this.dueDate = dueDate;
    }

    // behavior ?
    void markComplete() {
      isComplete = true;
    }
  }

  
  public static void main(String[] args) {

  }

}
