public class Compare {

    public static void main(String[] args) {
        long start1 = System.nanoTime();
        new Bubble_sort();
        long end1 = System.nanoTime();
        System.out.println("Bubble Sort: " + (end1-start1));

        long start2 = System.nanoTime();
        new Quick_sort();
        long end2 = System.nanoTime();
        System.out.println("Quick Sort: " + (end2-start2));
    }
}
