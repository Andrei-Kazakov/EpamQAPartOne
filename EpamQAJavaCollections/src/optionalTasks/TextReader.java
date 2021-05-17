package optionalTasks;
//1.Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
//2.Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
//3.Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.

import java.io.*;
import java.util.*;

public class TextReader {
    public static void main(String[] args) throws IOException {
        //task 1
        Stack<String> stack = new Stack<>();
        try (Scanner scan = new Scanner(new File("input.txt"));
             FileWriter writer = new FileWriter("output.txt")) {
            while (scan.hasNextLine()) {
                stack.push(scan.nextLine());
            }
            int lim = stack.size();
            for (int i = 0; i < lim; i++) {
                writer.write(stack.pop() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // task 2
        System.out.println("Task 2" + "\n");
        final String verse =
                """
                        Two roads diverged in a yellow wood,
                        And sorry I could not travel both
                        And be one traveler, long I stood
                        And looked down one as far as I could
                        To where it bent in the undergrowth.
                        Then took the other, as just as fair,
                        And having perhaps the better claim,
                        Because it was grassy and wanted wear;
                        Though as for that the passing there
                        Had worn them really about the same.
                        And both that morning equally lay
                        In leaves no step had trodden black.
                        Oh, I kept the first for another day!
                        Yet knowing how way leads on to way,
                        I doubted if I should ever come back.
                        I shall be telling this with a sigh
                        Somewhere ages and ages hence:
                        Two roads diverged in a wood, and I—
                        I took the one less traveled by,
                        And that has made all the difference.
                        """;

        Comparator<String> LineLengthComparator = Comparator.comparingInt(String::length);
        List<String> lines = Arrays.asList(verse.split("\n"));

        lines.sort(LineLengthComparator);
        for (String line : lines) System.out.println(line);

        //task 3
        System.out.println("\n" + "Task 3" + "\n");
        Scanner scan = new Scanner(new File("The Road Not Taken - Robert Frost.txt"));
        ArrayList<String> arrayList = new ArrayList<>();

        while (scan.hasNext()) {
            arrayList.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(arrayList);

        for (String line : arrayList) {
            System.out.println(line);
        }
    }
}
