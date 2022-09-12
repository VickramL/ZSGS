public class UniqueElementUsingXor {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,1,2,3,4};
        int unique=0;
        for(int n: arr)
            unique ^= n;

        System.out.println(unique);
    }
}
