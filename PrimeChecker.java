public class PrimeChecker {
    // Phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        // Trường hợp số nhỏ hơn 2 không phải là số nguyên tố
        if (number < 2) {
            return false;
        }
        // Lặp qua các số từ 2 đến căn bậc hai của số đó
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // Nếu số chia hết cho một số nào đó từ 2 đến căn bậc hai của số đó, không phải là số nguyên tố
            if (number % i == 0) {
                return false;
            }
        }
        // Nếu không, là số nguyên tố
        return true;
    }

    // Phương thức main để kiểm tra chương trình
    public static void main(String[] args) {
        int numberToCheck = 17; // Số cần kiểm tra

        // Kiểm tra xem số đó có phải là số nguyên tố hay không và in ra kết quả tương ứng
        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " là số nguyên tố.");
        } else {
            System.out.println(numberToCheck + " không là số nguyên tố.");
        }
    }
}
