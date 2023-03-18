

public class AccountSystem {

    public static void main(String[] args) {
        boolean flag = true;//控制循环结束
        int balance = 10000;//初始金额
        String info = ""; //记录收支信息
        while (flag) {
            System.out.println("-------记账系统-------");
            System.out.println("1      收支明细");
            System.out.println("2      登记收入");
            System.out.println("3      登记支出");
            System.out.println("4      退   出");
            System.out.println("请输入1-4：");

            switch (CountIn.readMenuSelection()) {
                case '1':
                    System.out.println("--------当前收支明细记录--------");
                    System.out.println("收支\t账户金额\t收支金额\t说明\n");
                    System.out.println(info);
                    System.out.println("-----------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int inMoney = CountIn.readNumber();//从键盘读取数据
                    if (inMoney > 0)
                        balance += inMoney;
                    System.out.println("收入说明：");
                    String inDescription = CountIn.readString();//从键盘读取数据
                    //修改收支信息
                    info += "收入\t" + balance + "\t" + inMoney + "\t\t" + inDescription + "\n";
                    System.out.println("----------登记完成！------------");
                    break;
                case '3':
                    System.out.print("本次支出的金额：");
                    int outMoney = CountIn.readNumber();
                    if (outMoney > 0 && balance > outMoney)
                        balance -= outMoney;
                    System.out.println("支出说明：");
                    String outDescription = CountIn.readString();
                    //修改收支信息
                    info += "支出\t" + balance + "\t" + outMoney + "\t\t" + outDescription + "\n";
                    System.out.println("----------登记完成！------------");
                    break;
                case '4':
                    System.out.print("您是否确定退出(Y/N)");
                    if (CountIn.readConfirmSelection() == 'Y')
                        flag = false;//用来跳出while循环
                    break;
                default:
            }
        }
        System.out.println("退出成功!");
    }
}
