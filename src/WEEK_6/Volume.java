package WEEK_6;

public class Volume {
    public static void main(String[] args) {
        Box box = new Box();
        Volume vol = new Volume();
        box.height = 10;
        box.length = 5;
        box.width = 1;

        System.out.printf("Height:%d\nLength:%d\nWidth:%d\n",box.height,box.length,box.width);

        vol.VolumeCalculator(box.height,box.length,box.width);
    }

    public void VolumeCalculator(int height,int length,int width){
        int volume = height * length * width;
        System.out.println("Volume : " + volume);
    }

}