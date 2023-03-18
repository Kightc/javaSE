/*
语法格式：
switch(表达式){
    case 常量1:
        执行语句1
        break
    case 常量2:
        执行语句2
        break
    ....
    default:
        执行语句other
        break
}

执行过程：
根据表达式中的值，一次比对各个case中的常量，一旦与其中一个case中的常量相等，则执行此case的执行语句
    执行完此语句后
        情况1：遇到break，执行完break后跳出switch-case结构。
        情况2：没有遇到break，则继续执行之后的case，直到遇到break或者执行完所有的case和default中的语句。

说明：
①switch中的表达式只能是特定的数据类型（byte  short  char  int  枚举  String）
②case后跟的是常量，不能进行范围的比对
③开发中使用switch—case结构时，case匹配的情况有限且不宜过多
④default类似于if-else中的else
    其是可选的，并且位置是灵活的

 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;  //跳出当前的switch-case结构
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
