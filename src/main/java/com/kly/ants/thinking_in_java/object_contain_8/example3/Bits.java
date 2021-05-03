package com.kly.ants.thinking_in_java.object_contain_8.example3;

import java.util.BitSet;
import java.util.Random;

/**
 * <p>Description:
 * BitSet是“位图”数据结构，根据“位图”的语义，数据的存在性可以使用bit位上的1或0来表示,表示对应位置上的数字是存在的
 * 1:BitSet申请的位都是以64为倍数的，就是说你申请不超过一个64的就按64算，超过一个不超过2个的就按128算
 * 2:BitSet可以存true/false:1/0
 * 3:BitSet只面向数字比较，比如set(int a,boolean value)方法，将数字a在bitSet中设定为true或者false；
 *   此后可以通过get(int a)方法检测结果。对于string类型的数据，如果像使用BitSet，那么可以将其hashcode值映射在bitset中
 * 4:比如有一堆数字，需要存储，source=[3,5,6,9],BitSet [0,0,0,1,0,1,1,0,0,1]
                                                         3,  5,6,    9
   5:计算机中一个字节（byte）占8位（bit），我们java中数据至少按字节存储的，比如一个int占4个字节。如果遇到大的数据量，这样必然会需要很大存储空间和内存。
     如何减少数据占用存储空间和内存可以用算法解决,BitSet就提供了这样的算法
 * </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/1/23 17:40
 * @see
 */
public class Bits {

    public static void main(String[] args) {
        Random rand = new Random();
        // Take the LSB of nextInt():
        byte bt = (byte)rand.nextInt();
        BitSet bb = new BitSet();
        for(int i = 7; i >=0; i--) {
            if(((1 << i) & bt) != 0)
                bb.set(i);//将指定索引处的位设置为true,表示存在
            else
                bb.clear(i);//将此BitSet中指定的位置设置为false，默认初始化的都为false
        }
        System.out.println("byte value: " + bt);
        printBitSet(bb);

        short st = (short)rand.nextInt();
        BitSet bs = new BitSet();
        for(int i = 15; i >=0; i--){
            if(((1 << i) & st) != 0)
                bs.set(i);
            else
                bs.clear(i);
        }
        System.out.println("short value: " + st);
        printBitSet(bs);


        int it = rand.nextInt();
        BitSet bi = new BitSet();
        for(int i = 31; i >=0; i--) {
            if(((1 << i) & it) != 0)
                bi.set(i);
            else
                bi.clear(i);
        }
        System.out.println("int value: " + it);
        printBitSet(bi);


        // Test bitsets >= 64 bits:
        BitSet b127 = new BitSet();
        b127.set(127);
        System.out.println("set bit 127: " + b127 + ",size=" + b127.size());


        BitSet b255 = new BitSet(65);
        b255.set(255);
        System.out.println("set bit 255: " + b255+ ",size=" + b255.size());


        BitSet b1023 = new BitSet(512);
        b1023.set(1024);
        System.out.println("set bit 1023: " + b1023 + ",size=" + b1023.size());
    }
    static void printBitSet(BitSet b) {
        System.out.println("bits: " + b + ",size=" + b.size());
        String bbits = new String();
        for(int j = 0; j < b.size() ; j++) {
            bbits += (b.get(j) ? "1" : "0");
        }
        System.out.println("bit pattern: " + bbits);
    }
}
