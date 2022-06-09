package ua.ithillel.homework.hw10.map;

public class Main {

    public static void main(String[] args) {

        FileNavigator fileNavigator = new FileNavigator();

        FileData game = new FileData("game", 2000, "user/games");
        FileData app = new FileData("app", 50, "user/Artem");
        FileData fileData = new FileData("file.txt", 10, "user/desktop");
        FileData app2 = new FileData("app2", 40, "user/Artem");

        fileNavigator.add(game.getPath(), game);
        fileNavigator.add(app.getPath(), app);
        fileNavigator.add(fileData.getPath(), fileData);
        fileNavigator.add(app2.getPath(), app2);
        //System.out.println(fileNavigator.find("user/Artem"));
        //System.out.println(fileNavigator.filterBySize(100));

        //fileNavigator.draw();
        System.out.println(fileNavigator.sortBySize());
    }
}
