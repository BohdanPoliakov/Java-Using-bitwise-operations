import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("231RDB415 Poliakov Bohdan 11");
        Scanner sc = new Scanner(System.in);
        System.out.print("input number: ");
        byte n = sc.nextByte();
        sc.close();

        int result = countSetBits(n);
        
        System.out.println("result:");
        System.out.println(result);
    }

    private static int countSetBits(byte num) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            // Pārbauda vai attiecīgais bits ir 1
            if ((num & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }
}