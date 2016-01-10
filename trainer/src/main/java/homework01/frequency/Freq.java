package homework01.frequency;

import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.util.*;

/**
 * Created by Admin on 22.12.2015.
 Написать класс для вычисления частоты слов в тексте с методами:
 - String setTextFromConsole()
 - String setTextFromFile(String fileName)
 - String generateRandomText(int textLength)
 - Set<String> getWordsByFrequency(int frequency)
 - Set<String> getWordsByFrequencyLessThan(int frequency)
 - Set<String> getWordsByFrequencyMoreThan(int frequency)
 - void printAcs() - вывести все слова + частота по возрастанию частоты
 - void printDesc() - вывести все слова + частота по убыванию частоты

 Класс задания hw2.frequency.Freq
 */
public class Freq {
    private static final char[] symbols = {' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'a', 'N', 'n', 'B', 'b', 'O', 'o', 'C', 'c', 'P', 'p', 'D', 'd', 'Q', 'q', 'E', 'e', 'R', 'r',
            'F', 'f', 'S', 's', 'G', 'g', 'T', 't', 'H', 'h', 'U', 'u', 'I', 'i', 'V', 'v', 'J', 'j', 'W', 'w',
            'K', 'k', 'X', 'x', 'L', 'l', 'Y', 'y', 'M', 'm', 'Z', 'z'};

    private static TreeMap<Integer, HashSet<String>> treeMapFreq = new TreeMap<>();

    public Freq() {
    }

    public static void main(String[] args){
        generateRandomText(5000);

        printAcs();
        printDesc();
    }

    public String setTextFromConsole(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text:");
        try{
            return br.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        parse(br.toString());
        return br.toString();
    }

    public String setTextFromFile(String fileName){
        FileInputStream fileInputStream;
        StringBuilder sb = new StringBuilder();
        try {
            byte[] buffer = new byte[1000];
            fileInputStream = new FileInputStream(fileName);
            while (fileInputStream.read(buffer) != -1){
                sb.append(new String(buffer));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        parse(sb.toString());
        return sb.toString();
    }

    public static String generateRandomText(int textLength){
        StringBuilder sb = new StringBuilder();
        int lenWord = 0;
        for (int i = 1; i <= textLength; i++){
            if (Math.random() < (lenWord / 40 )) {
                sb.append("\n");
                lenWord = 0;
            }
            lenWord++;
            sb.append(symbols[(int)(Math.random() * (symbols.length + 1) - 1)]);
        }
        parse(sb.toString());

        return sb.toString();
    }

    public Set<String> getWordsByFrequency(int frequency){
        return treeMapFreq.get(frequency);
    }

    public Set<String> getWordsByFrequencyLessThan(int frequency){
        return getWordsByFrequencyThan(frequency, true);
    }

    public Set<String> getWordsByFrequencyMoreThan(int frequency){
        return getWordsByFrequencyThan(frequency, false);
    }

    private Set<String> getWordsByFrequencyThan(int frequency, boolean lessThan){
        Set<String> stringSet = new HashSet<>();
        int entryFreq;
        for (Map.Entry<Integer, HashSet<String>> entry : treeMapFreq.entrySet()){
            entryFreq = entry.getKey();
            if (lessThan) {
                if (entryFreq < frequency) {
                    stringSet.addAll(entry.getValue());
                }
            } else {
                if (entryFreq > frequency) {
                    stringSet.addAll(entry.getValue());
                }
            }
        }
        return stringSet;
    }

    public static void parse(String text){
        Map<String, Integer> mapFreq = new HashMap<>();
        String[] words = text.split("[,;:.!?\\s]+");
        int freq;
        for (int i = 0; i < words.length; i++){
            freq = mapFreq.containsKey(words[i]) ? mapFreq.get(words[i]) : 0;
            mapFreq.put(words[i], ++freq);
        }



        HashSet<String> hashSet;
        for (Map.Entry<String, Integer> entry : mapFreq.entrySet()){
            if (treeMapFreq.containsKey(entry.getValue())){
                hashSet = treeMapFreq.get(entry.getValue());
            } else {
                hashSet = new HashSet<>();
            }
            hashSet.add(entry.getKey());
            treeMapFreq.put(entry.getValue(), hashSet);
        }

    }

    public static void printAcs(){
        printSorted(getSortedMap(true));
    }

    public static void printDesc(){
        printSorted(getSortedMap(false));
    }

    public static void printSorted(TreeMap<Integer, HashSet<String>> treeMap){
        treeMap.putAll(treeMapFreq);
        Iterator<Integer> integerIterator = treeMap.keySet().iterator();
        int frequency;
        StringBuilder sb;
        while (integerIterator.hasNext()){
            frequency = integerIterator.next();
            sb = new StringBuilder(frequency + ".");
//            treeMapFreq.get(frequency).toArray()
            sb.append("(size " + treeMapFreq.get(frequency).size() + ") :");
            sb.append(Arrays.toString(treeMapFreq.get(frequency).toArray()));
            System.out.println(sb.toString());
        }
    }

    public static TreeMap<Integer, HashSet<String>> getSortedMap(boolean asc){
        return new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (asc){
                    return Integer.compare(o1, o2);
                } else {
                    return Integer.compare(o2, o1);
                }

            }
        });
    }

    public int findSeparator(String text){

        return 0;
    }
}
