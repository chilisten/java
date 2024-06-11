package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1239 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(translateToHTML(line));
        }
    }

    public static String translateToHTML(String text) {
        StringBuilder html = new StringBuilder();
        boolean italic = false;
        boolean bold = false;

        for (char c : text.toCharArray()) {
            if (c == '_') {
                if (italic) {
                    html.append("</i>");
                } else {
                    html.append("<i>");
                }
                italic = !italic;
            } else if (c == '*') {
                if (bold) {
                    html.append("</b>");
                } else {
                    html.append("<b>");
                }
                bold = !bold;
            } else {
                html.append(c);
            }
        }

        if (italic) {
            html.append("</i>");
        }
        if (bold) {
            html.append("</b>");
        }

        return html.toString();
    }
}