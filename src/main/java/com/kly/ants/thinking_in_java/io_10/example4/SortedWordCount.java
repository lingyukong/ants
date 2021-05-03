package com.kly.ants.thinking_in_java.io_10.example4;



import com.kly.ants.thinking_in_java.object_contain_8.example7.StrSortVector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *  StreamTokenizer 类获取输入流并将其解析为“标记”，允许一次读取一个标记
 * @author kly
 * @Date 2018/4/12 14:54
 * @see
 */
public class SortedWordCount {
    private FileInputStream file;
    private StreamTokenizer st;
    private Hashtable counts = new Hashtable();

    SortedWordCount(String filename) throws FileNotFoundException {
        try {
            file = new FileInputStream(filename);
            st = new StreamTokenizer(file);
            //指定字符参数在此标记生成器中是“普通”字符

            st.ordinaryChar(',');
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + filename);
            throw e;
        }
    }

    void cleanup() {
        try {
            file.close();
        } catch (IOException e) {
            System.out.println(
                    "file.close() unsuccessful");
        }
    }

    void countWords() {
        try {
            while (st.nextToken() != StreamTokenizer.TT_EOF) { //指示已读到流末尾的常量。
                String s;
                switch (st.ttype) { //在调用 nextToken 方法之后，此字段将包含刚读取的标记的类型
                    case StreamTokenizer.TT_EOL: //指示已读到行末尾的常量。
                        s = new String("EOL");
                        break;
                    case StreamTokenizer.TT_NUMBER: //指示已读到一个数字标记的常量。
                        s = Double.toString(st.nval); //如果当前标记是一个数字，则此字段将包含该数字的值。
                        break;
                    case StreamTokenizer.TT_WORD: //指示已读到一个文字标记的常量。
                        s = st.sval; //如果当前标记是一个文字标记，则此字段包含一个给出该文字标记的字符的字符串
                        break;
                    default: // single character in ttype
                        s = String.valueOf((char) st.ttype);
                }
                if (counts.containsKey(s))
                    ((Counter) counts.get(s)).increment();
                else
                    counts.put(s, new Counter());
            }
        } catch (IOException e) {
            System.out.println(
                    "st.nextToken() unsuccessful");
        }
    }

    Enumeration values() {
        return counts.elements();
    }

    Enumeration keys() {
        return counts.keys();
    }

    Counter getCounter(String s) {
        return (Counter) counts.get(s);
    }

    Enumeration sortedKeys() {
        Enumeration e = counts.keys();
        StrSortVector sv = new StrSortVector();
        while (e.hasMoreElements())
            sv.addElement((String) e.nextElement());
        // This call forces a sort:
        return sv.elements();
    }

    public static void main(String[] args) {
        try {
            SortedWordCount wc =
                    new SortedWordCount(args[0]);
            wc.countWords();
            Enumeration keys = wc.sortedKeys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                System.out.println(key + ": "
                        + wc.getCounter(key).read());
            }
            wc.cleanup();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
