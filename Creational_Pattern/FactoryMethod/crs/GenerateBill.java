package Creational_Pattern.FactoryMethod.crs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Nhập tên của plan để tạo hóa đơn: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String planName = bufferedReader.readLine();

        System.out.println("Nhập số lượng đơn vị cho hóa đơn: ");
        int unit = Integer.parseInt(bufferedReader.readLine());

        Plan p = planFactory.getPlan(planName);

        System.out.println("Hóa đơn: " + planName + " của " + unit + " đơn vị là: ");
        p.getRate();
        p.calculateBill(unit);
    }
}
