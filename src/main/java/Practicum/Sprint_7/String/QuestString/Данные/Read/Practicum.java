package Practicum.Sprint_7.String.QuestString.Данные.Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.

        // выведите результат в формате "<буква>: <количество>".
        while (br.ready()) {
            String line = br.readLine();
            frequencyMap.put(line, frequencyMap.getOrDefault(line, 0) + 1);
        }

        System.out.println("A:" + frequencyMap.get("A"));
        System.out.println("B:" + frequencyMap.get("B"));
        System.out.println("C:" + frequencyMap.get("C"));
        System.out.println("D:" + frequencyMap.get("D"));

        br.close();
    }
}