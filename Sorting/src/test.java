public class test {

    public static void main(String[] args) {
        int min = -9;
        int max = 9;

        for ( int i = 0; i < 10; i++ ) {
            System.out.println((int)Math.floor(Math.random()*(max-min+1)+min));
        }
    }
}
