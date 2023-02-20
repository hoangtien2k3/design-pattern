package Creational_Pattern.Factory_Method.crs;

public class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        /*
        * Phương thức equalsIgnoreCase() trong Java được sử dụng để so sánh chuỗi (String)
        * bằng cách bỏ qua sự khác biệt về chữ hoa chữ thường giữa hai chuỗi.
        * */
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
