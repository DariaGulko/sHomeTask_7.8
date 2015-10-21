/**
 * Created by Dariya on 21.10.2015.
 * Создайте микротест для вычисления скорости умножения посредством операторов * и >>.
 * Для получения текущего времени используйте long System.currentTimeMillis().
 * Для достоверности теста нужна статистика, поэтому вычисления лучше прогнать несколько раз для получения достоверного результата.
 */
public class Main {
    public static void main(String[] args) {
        final long start1 = System.currentTimeMillis();
        int number = 856405484;
        byte a[] = new byte[4];
        a[3] = (byte) (number >> 24);
        a[2] = (byte) (number >> 16);
        a[1] = (byte) (number >> 8);
        a[0] = (byte) (number >> 0);
        final long end1 = System.currentTimeMillis();
        System.out.println(">> took: " + (end1 - start1) + " ms");
        final long start2 = System.currentTimeMillis();
        byte b[] = new byte[4];
        b[3] = (byte) (number *16777216);
        b[2] = (byte) (number *65536);
        b[1] = (byte) (number* 256);
        b[0] = (byte) (number);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        final long end2 = System.currentTimeMillis();
        System.out.println("\r\n* took: " + (end2 - start2) + " ms");



    }
}
