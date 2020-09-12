package com.mizan;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.EnumMap;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Map<Priority, ArrayDeque> taskMap = new EnumMap(Priority.class);
        for (Priority p : Priority.values()) {
            taskMap.put(p, new ArrayDeque());
        }

        taskMap.get(Priority.HIGH).add(new Task("Birthday party", LocalDate.parse("2019-11-02"), Priority.HIGH));

        taskMap.get(Priority.MEDIUM).add(new Task("Doctor appointment", LocalDate.parse("2019-11-18"), Priority.MEDIUM));

        taskMap.get(Priority.HIGH).add(new Task("Book hotel", LocalDate.parse("2019-12-25"), Priority.MEDIUM));

        Queue highPriorityTaskList = taskMap.get(Priority.HIGH);
        System.out.println("Next high priority task: " + highPriorityTaskList.peek());
        // ==> Next high priority task: Birthday party
    }
}
