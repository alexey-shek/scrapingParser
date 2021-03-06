package Main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Auto a1 = new Auto();
        // Dokument von URL laden
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.pe-gr.de/portfolio.htm").get();
            String title = doc.title();
            String stretchbox1 = doc.getElementById("stretchbox1").outerHtml();

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
