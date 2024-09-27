package vinoth.interviews;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MostRecentlyUsedApps {
    private Map<String, Integer> MOST_RECENTLY_USED = new ConcurrentHashMap<>();

    public void mru() throws InterruptedException {
        List<String> apps = new ArrayList<>(List.of("Amazon", "Flipkart", "Gmail", "Zomato", "Linkedin", "Whatsapp", "SMS", "Phone", "Album", "Camera", "Swiggy"));
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        IntStream.rangeClosed(0, 5).forEach(i -> {
                    executorService.submit(() -> {
                        Collections.shuffle(apps);
                        String app = apps.stream().findAny().get();
                        MOST_RECENTLY_USED.put(app, MOST_RECENTLY_USED.getOrDefault(app, 0) + 1);
                    });
                }
        );
        Thread.sleep(2000);
        LinkedHashMap<String, Integer> cache = MOST_RECENTLY_USED.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        cache.forEach((k, v) -> System.out.println(k));
    }

    public static void main(String[] args) throws InterruptedException {
        MostRecentlyUsedApps mostRecentlyUsedApps = new MostRecentlyUsedApps();
        mostRecentlyUsedApps.mru();
    }
}
