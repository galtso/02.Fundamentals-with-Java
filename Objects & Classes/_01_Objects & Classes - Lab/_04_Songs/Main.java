package ObjectsAndClasses._01_ObjectsAndClasses_Lab._04_Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] songInfo = scan.nextLine().split("_");
            Song currentSong = new Song(songInfo[0], songInfo[1], songInfo[2]);
            songList.add(currentSong);
        }
       String command = scan.nextLine();
        printTheSongList(command, songList);
    }

    private static void printTheSongList(String command, List<Song> list) {
        if (command.equals("all")){
            for (Song song : list) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song : list) {
                if (song.getTypeList().equals(command)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
