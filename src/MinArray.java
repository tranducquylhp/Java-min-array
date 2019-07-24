import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            System.out.print("Nhap phan tu thu "+i+" = ");
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for (int i=1; i<size; i++){
            if (min<arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la: "+min);
    }
}
