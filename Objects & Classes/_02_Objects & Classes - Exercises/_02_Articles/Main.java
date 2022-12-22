package ObjectsAndClasses._02_ObjectsAndClasses_Exercises._02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] articleData = scan.nextLine().split(", ");
        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];
        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandLine = scan.nextLine().split(": ");
            String command = commandLine[0];
            switch (command){
                case "Edit":
                    String newContent = commandLine[1];
                    article.setContent(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = commandLine[1];
                    article.setAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = commandLine[1];
                    article.setTitle(newTitle);
                    break;
            }
        }
        System.out.println(article);
    }
}
