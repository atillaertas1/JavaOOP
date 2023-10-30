package WEEK_6;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Box box = new Box();
        box.height = 10;
        box.length = 5;
        box.width = 1;

        System.out.printf("Height:%d\nLength:%d\nWidth:%d\n",box.height,box.length,box.width);

        main.VolumeCalculator(box.height,box.length,box.width);

        Player player = new Player("atilla",10, (byte) 100);
        main.playerViewer(player.username, player.level, player.score);

        Rectangle rectangle = new Rectangle(10,20);
        System.out.println(rectangle.area);
    }

    public void VolumeCalculator(int height,int length,int width){
        int volume = height * length * width;
        System.out.println("Volume : " + volume);
    }

    public void playerViewer(String username,int level,byte score){
        System.out.printf("Username:%s\nLevel:%d\nScore:%d",username,level,score);
    }
}