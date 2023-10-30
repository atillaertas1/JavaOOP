package WEEK_6;

public class PlayerCreator {
    public static void main(String[] args) {
        PlayerCreator pc = new PlayerCreator();
        Player player = new Player("atilla",10, (byte) 100);
        pc.playerViewer(player.username, player.level, player.score);
    }
    public void playerViewer(String username,int level,byte score){
        System.out.printf("Username:%s\nLevel:%d\nScore:%d",username,level,score);
    }
}