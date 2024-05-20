import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountBank sourceaccountbank = new AccountBank();
        System.out.println("Nhập tên chủ tài khoản: ");
        sourceaccountbank.setAccountHolderName(sc.nextLine());
        System.out.println("Nhập số tài khoản: ");
        sourceaccountbank.setAccountNumber(sc.nextLine());
        System.out.println("Nhập số dư tài khoản: ");
        sourceaccountbank.setBalance(sc.nextDouble());
        System.out.println("Vui lòng chọn dịch vụ giao dịch:\n1.Rút tiền\n2.Nạp tài khoản\n3.Chuyển khoản");
        System.out.println("Lựa chọn của bạn:");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Nhập số tiền cần rút: ");
                double amount = sc.nextDouble();
                sourceaccountbank.withdraw(amount);
                sourceaccountbank.displayAccountInfor();
                break;
            case 2:
                System.out.println("Nhập số tiền nạp vào: ");
                amount = sc.nextDouble();
                sourceaccountbank.deposit(amount);
                sourceaccountbank.displayAccountInfor();
                break;
            case 3:
                AccountBank destinationaccountbank = new AccountBank();
                System.out.println("Vui lòng nhập số tiền cần chuyển: ");
                amount = sc.nextDouble();
                sourceaccountbank.transfer(amount,destinationaccountbank);
                sourceaccountbank.displayAccountInfor();
                break;
            default:
                System.out.println("Không có dịch vụ");
                break;
        }
    }
}