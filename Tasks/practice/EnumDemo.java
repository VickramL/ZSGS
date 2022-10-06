package practise;

public class EnumDemo {
    enum Fruits{
        ORANGE,
        APPLE,
        BANANA,
        WATERMELON
    }

    public static void main(String[] args) {

        Fruits fruit = Fruits.APPLE;
        switch (fruit){
            case APPLE:
                System.out.println(fruit);
                break;

            case BANANA :
                System.out.println(fruit);
                break;

            case ORANGE:
                System.out.println(fruit);
                break;
            case WATERMELON:
                System.out.println(fruit);
                break;
        }
        for(Fruits fruits:Fruits.values()){
            System.out.println(fruits);
        }
    }
}
