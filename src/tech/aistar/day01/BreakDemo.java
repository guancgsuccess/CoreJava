package tech.aistar.day01;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/28 0028
 */
public class BreakDemo {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        label:{
            for (int i = 0; i < 10; i++) {
                for (int j = 65; j < 91; j++) {
                    System.out.print(i+":"+(char)(j)+"\t");
                    if(i == 3){
                        break label;
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("====");
    }
}
