import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chào mừng bạn đến với chương trình nhập thông tin học sinh ");
        String continues = "";
        String name;
        String address;
        int age;

        do {
            System.out.println("Mời bạn nhâp tên học sinh: ");
             name = sc.nextLine();

            System.out.println("Mời bạn nhập địa chỉ : ");
             address = sc.nextLine();

            System.out.println("Mời bạn nhập tuổi : ");
             age = Integer.parseInt(sc.nextLine());

            System.out.println(" Bạn vừa nhập thêm học sinh :" +
                    "\n Tên: "+name+
                    "\n  địa chỉ: "+address+
                    "\n  "+age+" tuổi.");
            System.out.println("Bạn có muốn tiếp tục nhập (Y/N) ");
            continues =sc.nextLine();

        }while (continues.equalsIgnoreCase("y"));
        System.out.println(" Bạn vừa nhập thêm học sinh :" +
                "\n Tên: "+name+
                "\n  địa chỉ "+address+
                "\n  "+age+" tuổi.");

    }
}
