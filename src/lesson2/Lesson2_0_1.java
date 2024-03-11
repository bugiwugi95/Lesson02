package lesson2;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Lesson2_0_1 {
    public static void main(String[] args) throws IOException {
        // https://ru.wikipedia.org/wiki/Проблема_2000_года
        String strPage = downloadWebPage("https://en.wikipedia.org/wiki/Donald_Knuth");
        writeToFile(strPage.replaceAll("Knuth","Пряник").toUpperCase());

    }


    private static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();


        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            while ((line = br.readLine()) != null) {
                result.append(line);
            }

        }

        return result.toString();

    }

    private static void writeToFile(String str) throws IOException {
        BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\Desktop\\wiki.html3"));
        write.write(str);
        write.close();
    }
}
