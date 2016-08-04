import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Find the kth smallest value in an array
 */
public class TestRunner {


    private static int[] generateArray(int size, int maxValue) {
        int[] array = new int[size];
        int randomInt;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomInt = random.nextInt(maxValue);
            array[i] = randomInt;
        }
        return array;
    }

    private static int findKth(int kth, int[] array) {
        int largest = -1;
        PriorityQueue<Integer> queue = new PriorityQueue<>(kth, new intComparator());
        for (int i = 0; i < array.length; i++) {
            if (queue.size() < kth) {
                queue.add(array[i]);
                if (array[i] > largest) largest = array[i];
            } else if (array[i] < largest) {
                queue.remove();
                queue.add(array[i]);
                largest = queue.peek();
            }
        }
        return largest;
    }

    public static void main(String[] arrrrgs) {
        int[] array = generateArray(100, 1000);
        int kth = findKth(2, array);
    }

}

class intComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2, o1);
    }
}
