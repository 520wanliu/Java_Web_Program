package demo1;

class Project1 {
    public static void main(String[] args) {

        boolean flag = true;//定义一个变量flag，用于结束循环退出程序
        int balance = 0;
        String details = "收支\t\t账户余额\t\t收支金额\t\t说   明\n";

        while (flag) {
            System.out.println("-------------------------家庭收支记账软件-------------------------");
            System.out.println("                           1 收支明细");
            System.out.println("                           2 登记收入");
            System.out.println("                           3 登记支出");
            System.out.println("                           4  退出\n");
            System.out.print("                         请选择1-4输入：");

            //获取用户选择：1-4
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("-------------------------当前收支明细记录-------------------------");
                    System.out.println(details);
                    System.out.println("---------------------------------------------------------------");
                    break;
                case '2':
                    System.out.println("-----------------------------登记收入----------------------------");
                    System.out.print("请输入本次收入金额：");
                    int addmoney = Utility.readNumber();
                    //处理balance
                    balance += addmoney;

                    System.out.print("请输入本次收入说明：");
                    String addinfo = Utility.readString();

                    //处理details
                    details += ("收入\t\t" + balance + "\t\t" + addmoney + "\t\t" + addinfo + "\n");
                    System.out.println("-----------------------------登记完成----------------------------");
                    break;
                case '3':
                    System.out.println("-----------------------------登记支出----------------------------");
                    System.out.print("请输入本次支出金额：");
                    int minusmoney = Utility.readNumber();
                    if (minusmoney > balance) {
                        System.out.println("支出超过余额，破产");
                        break;
                    } else {
                        balance -= minusmoney;  //处理balance
                    }
                    System.out.print("请输入本次支出说明：");
                    String minusinfo = Utility.readString();
                    details += ("支出\t\t" + balance + "\t\t" + minusmoney+ "\t\t" + minusinfo + "\n");
                    System.out.println("-----------------------------登记完成----------------------------");
                    break;
                case '4':
                    System.out.println("即将退出程序，请确认是否退出（Y/N）");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        flag = false;
                    }
                    break;
            }
        }

    }
}