package vinoth.interviews;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadFactory;

public class TaskAssigner {
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable)
                return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<String> s = new ArrayList<>();
        String ss = "";

//        int[]nums={2,0,0};
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
//        int m=nums.length/2;
//        Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().filter((v)->v.getValue()>m).findFirst().get().getKey();
//
//        List<User> shiftScheduler = Executors.newSingleThreadScheduledExecutor().schedule(TaskAssigner::getAvailableStaffs, 8, TimeUnit.HOURS).get();
//        ExecutorService availableStaffPool = Executors.newFixedThreadPool(shiftScheduler.size());
//        getAvailableTasks().forEach(task -> availableStaffPool.submit(task::perform));
    }

    public static List<User> getAvailableStaffs() {
        return List.of();
    }

    public static List<Task> getAvailableTasks() {
        return List.of();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return ans.values().stream().toList();
    }

    public static class THF implements ThreadFactory {

        @Override
        public Thread newThread(Runnable r) {
            return null;
        }
    }

    public static class User extends Thread {
        User(String name) {
            super(name);
        }


    }

    public static class Task {
        void perform() {
        }
    }
}
