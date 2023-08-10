package E_ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int n = Integer.parseInt(scan.nextLine());

        Article article = new Article(input[0], input[1], input[2]);

        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split(": ");
            String curCommand = command[0];
            String parameter = command[1];

            switch (curCommand) {
                case "Edit": article.edit(parameter);
                    break;

                case "ChangeAuthor": article.changeAuthor(parameter);
                    break;

                case "Rename": article.rename(parameter);
                    break;
            }
        }
       // System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
        System.out.println(article.toString());
    }

    public static class Article {
        private String title;
        private String content;
        private String author;

        public Article (String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return this.title;
        }

        public String getContent() {
            return this.content;
        }

        public String getAuthor() {
            return this.author;
        }

        public void edit(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }

        //all methods above can be replaced with simple setters

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }
}
