package Main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dokument von URL laden
        Document doc = null;
        try {
            doc = Jsoup.connect("https://www.l3x4.de").get();
            String title = doc.title();
            System.out.println("Title: "+title);

            Elements links = doc.select("a[href]");

            for (Element link : links){
                System.out.println("URL: "+link.attr("href"));
                System.out.println("Text: "+link.text());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
