package lesson2;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Lesson2_2_3 {

    public static void main(String[] args) throws IOException {
        String wikiHttps = "https://ru.wikipedia.org/wiki/";
        String randomPublic = "%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%A1%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0";

        String strPage = downloadWebPage(wikiHttps + randomPublic);
        writeToFile(strPage.toUpperCase());


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
        for (int i = 0; i <= 50; i++) {
            BufferedWriter write = new BufferedWriter(
                    new FileWriter("C:\\Users\\lenovo\\Desktop\\dzsyjava\\" + "Сучайные статьи из википедии.html" + i));

            write.write(str);
            write.close();
        }


    }
}
