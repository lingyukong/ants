package com.kly.ants.tools;

import javafx.scene.effect.Bloom;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.LockSupport;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/3/3 12:39
 */
public class Test {

    public static synchronized void helloA() {
        System.out.println("HELLO A");
    }

    public static synchronized void helloB() {
        System.out.println("HELLO B");
        helloA();
    }

    public static void collectionTest() {
        TreeSet set = new TreeSet<>();
        set.add(1);
        Vector vector = new Vector();
        vector.get(2);
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.get(2);
        list.set(1, "test");
        Collections.synchronizedList(list);

        Hashtable table = new Hashtable();
        table.get(11);
        CopyOnWriteArraySet setC = new CopyOnWriteArraySet();

        HashSet hashSet = new HashSet();
        hashSet.add(34);

    }

    public static void mapTest() {

        HashMap<String, String> map = new HashMap<String, String>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }


        System.out.println(5 % 5);
        HashMap map1 = new HashMap();
        map1.put(1, "test");
        map1.get("1");
        map1.remove("1");
        ConcurrentHashMap cmap = new ConcurrentHashMap();
        cmap.put("1", 2);

    }


    public static void LockTest() {
        LockSupport.park();
    }


    public static String getSpsn(Long orderId, int len, String year) {
        if (len < 16) {
            throw new IllegalArgumentException("order no too short!");
        }

        if (orderId <= 0) {
            throw new IllegalArgumentException("illegal id!");
        }
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
        String sd = sdf.format(d);
        String ids = String.valueOf(orderId);
        String no = sd + year;
        StringBuffer sb = new StringBuffer();
        for (int i = 0, n = len - 16; i < n; i++) {
            sb.append('0');
        }
        sb.append(no);
        for (int i = 0, n = len - ids.length() - year.length() - sd.length(); i < n; i++) {
            sb.append('0');
        }
        sb.append(ids);
        return sb.toString();
    }


    public static void inputStream() throws FileNotFoundException {

        String fileName = File.separator + "home" + File.separator + "webadmin" + File.separator + "bind20191217.txt";
        FileInputStream fIns = new FileInputStream(fileName);
        DataInputStream in = new DataInputStream(new BufferedInputStream(fIns));


//        String line = "";
//        while (null != (line = in.readLine())) {
//            System.out.println(in.readLine());
//        }


//        BufferedReader br = new BufferedReader(new FileReader(fileName));
//        String line = "";
//        while (null != (line = br.readLine())) {
//            System.out.println(line.trim());
//        }
//
//        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

    }

    public static void BlockingQueue() {
        BlockingQueue queue = new ArrayBlockingQueue(20);
        queue.offer(1);

        BlockingQueue linkedQueue = new LinkedBlockingQueue();
        BlockingQueue synQueue = new SynchronousQueue();

    }

    public static void Redis() {
        Bloom filter = new Bloom();
    }

    public static void threadTest() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
    }


    public static void main(String[] args) throws Exception {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);

        System.out.println(getSpsn(104253L,16,"2020"));
//        a.equals(1);
//
//        AtomicInteger intes = new AtomicInteger(10);
//        intes.compareAndSet(10,11);
//        intes.incrementAndGet();

//        helloB();


//        Runtime.getRuntime().exec("");
//        System.getSecurityManager().checkRead("");

        int[] arr = new int[5];
        int[] arr1 = new int[]{};


//        LinkedHashMap lmap = new LinkedHashMap<>();
        HashMap lmap = new HashMap();
        for (int i=0;i<20;i++){
            lmap.put(i,i);
        }
        Iterator it = lmap.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }


    }
}
