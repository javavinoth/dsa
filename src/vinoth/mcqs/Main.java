package vinoth.mcqs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static Date getCurrentPHTime() {
        TimeZone phTimeZone = TimeZone.getTimeZone("Asia/Manila");
        return new Date(System.currentTimeMillis() + phTimeZone.getRawOffset());
    }



    public static void main(String[] args) {
        Date phTime = getCurrentPHTime();
        System.out.println("Current PH Time: " + phTime);
//        OptimizedCache optimizedCache=new OptimizedCache();
//        Cache cache=(Cache) optimizedCache;

//        MemoryCache memoryCache=new MemoryCache();
//        Cache cache=(Cache) memoryCache;
//        DiskCache diskCache=(DiskCache) cache;

//        DiskCache diskCache = new DiskCache();
//        OptimizedCache optimizedCache=(OptimizedCache) diskCache;

//        OptimizedCache optimizedCache=new OptimizedCache();
//        DiskCache diskCache=(DiskCache) optimizedCache;

//        OptimizedCache optimizedCache=new OptimizedCache();
//        Cache cache=(Cache)optimizedCache;
//        DiskCache diskCache=(DiskCache) cache;
//        LastCache lastCache=(LastCache)diskCache;
//
//        System.out.println("");
    }


//    public static void main(String[] args) {
//        Sstatic sstatic1=new Sstatic(5);
//        System.out.println(Sstatic.i);
//        Sstatic sstatic2=new Sstatic(6);
//        System.out.println(Sstatic.i);
//        String[] names = { "Alice", "Bob", "Charlie", "Dave" };
//
//        // Sort the array by the length of the names using Java 8
////        Arrays.sort(names, Comparator.comparingInt(String::length).reversed());
//        Arrays.sort(names,(s1,s2)->s2.length()-s1.length());
//
//        // Print the sorted array
//        System.out.println(Arrays.toString(names));        MyThread t = new MyThread();
//        t.start();
////        for (int i = 1; i <= 5; i++) {
////            System.out.println("Main Thread " + i);
////        }
//    }
}
