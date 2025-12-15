package Array.Questions;

public class first {
    public static void main(String[] args) {
        System.out.println(find(new int[]{1,2,3}));
    }
    public static boolean find(int arr[])
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

}
