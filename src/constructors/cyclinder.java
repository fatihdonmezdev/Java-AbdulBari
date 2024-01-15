package constructors;

public class cyclinder {
    private int radius;
    private int height;

    public int getHeight() {
        return height;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int rad){
        if(rad > 0){
            radius = rad;
        }else{
            System.out.println("You must enter a positive number");
        }
    }
    public void setHeight(int h){
        if(h > 0){
            height = h;
        }else{
            System.out.println("You must enter a positive number.");
        }
    }
    public void setDimension(int rad, int hei){
        if(rad>0 && hei>0){
            height = hei;
            radius= rad;
        }else{
            System.out.println("You must enter a positive number.");
        }
    }
    public cyclinder(){
            height = 0;
            radius= 0;
    }
    public cyclinder(int rad, int hei) {
        if (rad > 0 && hei > 0) {
            height = hei;
            radius = rad;
        } else {
            System.out.println("You must enter a positive number.");
        }
    }
}
