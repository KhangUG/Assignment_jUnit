import java.util.Scanner;

public class PhuongTrinhBac3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        System.out.println("Nhập hệ số d: ");
        double d = scanner.nextDouble();

        double x0; // Giả định nghiệm ban đầu
        double x1 = 0; // Nghiệm gần đúng
        double epsilon = 0.0001; // Độ chính xác mong muốn
        int maxIterations = 1000; // Số lần lặp tối đa
        int iterations = 0; // Số lần lặp đã thực hiện

        // Chọn một nghiệm ban đầu bất kỳ
        x0 = -100;

        // Sử dụng phương pháp Newton-Raphson để tính gần đúng nghiệm
        while (Math.abs(x1 - x0) > epsilon && iterations < maxIterations) {
            x0 = x1;
            double f = a * x0 * x0 * x0 + b * x0 * x0 + c * x0 + d;
            double fPrime = 3 * a * x0 * x0 + 2 * b * x0 + c;

            // Xem x1 là gần đúng hơn nghiệm thực
            x1 = x0 - f / fPrime;
            iterations++;
        }

        // Kiểm tra nghiệm có hội tụ hay không
        if (iterations < maxIterations) {
            System.out.println("Nghiệm gần đúng của phương trình là: " + x1);
        } else {
            System.out.println("Không tìm thấy nghiệm sau số lần lặp tối đa.");
        }
    }
}
