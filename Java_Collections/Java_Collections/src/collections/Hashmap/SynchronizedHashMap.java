package collections.Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class SynchronizedHashMap {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> cricketTeamScore = Collections.synchronizedMap(new HashMap<>());
        cricketTeamScore.put("Zanzibar", 349);
        cricketTeamScore.put("Togo", 250);

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable task = () -> {
            incrementTeamScore(cricketTeamScore, "Togo");
        };

        for(int i = 0; i < 100; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final Score of Team Togo : " + cricketTeamScore.get("Togo"));
    }

    private static void incrementTeamScore(Map<String, Integer> cricketTeamScore, String team) {
        synchronized (cricketTeamScore) {
            Integer score = cricketTeamScore.get(team);
            cricketTeamScore.put(team, score + 1);
        }
    }
}