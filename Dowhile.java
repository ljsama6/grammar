package grammar;

public class Dowhile {
    public static void main(String[] args){
        int i = 1;
        do {
            System.out.println("你好"+i);
            i++;
        } while (i <= 10);
        System.out.println("退出do...while循环");
    }
}
