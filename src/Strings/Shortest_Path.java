package Strings;

public class Shortest_Path {
    public static float getShortestPath(String path){
    int x = 0;
    int y = 0;
    for(int i=0; i<path.length(); i++){
        int dir = path.charAt(i);
        //South
        if(dir == 'S'){
            y--;
        }
        else if(dir == 'N'){
            y++;
        }
        else if(dir == 'W'){
            x--;
        }
        else {
            x++;
        }
    }
    int x2 = x*x;
    int y2 = y*y;
    return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "NS";
        System.out.println(getShortestPath(path));
    }

}
