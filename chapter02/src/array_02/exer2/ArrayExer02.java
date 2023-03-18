package array_02.exer2;

public class ArrayExer02 {
    public static void main(String[] args) {
//        String[] catalog = {"员工类型", "编号", "姓名", "年龄", "薪资", "奖金", "股票"};
        String[][] employees = {
                {"10", "1", "段 誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"12", "3", "周芷若", "28", "10000", "5000"},
                {"11", "4", "张三丰", "24 ", "7300"},
        };//其中"10"代表普通职员, "11"代表程序员, "12"代表设计师, "13"代表架构师
        for (int i = 0; i < employees.length; i++) {
            switch(employees[i][0]){
                case "10":
                    employees[i][0] = "普通职员";
                    break;
                case "11":
                    employees[i][0] = "程序员";
                    break;
                case "12":
                    employees[i][0] = "设计师";
                    break;
                case "13":
                    employees[i][0] = "架构师";
                    break;
                default:
            }

        }
        System.out.println("员工类型\t\t编号\t\t姓名\t\t\t年龄\t\t薪资\t\t\t奖金\t\t\t股票");
        //强化for循环  是使用格式：想要遍历的变量的名.for
        for (String[] single : employees) {// :相当于 in 即前者在后者中遍历 注意类型要相同
            for (String detail : single) {
                System.out.printf("%s\t\t", detail);//  "%s"表示占位符 s表示String类型 相当于把后面的detail的值拉到双引号中
//                System.out.print(detail + "\t\t");
            }
            System.out.println();
        }
    }



}
