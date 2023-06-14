package academy.devdojo.maratonajava.introducao;

public class ArryasMultdimen02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];

        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
