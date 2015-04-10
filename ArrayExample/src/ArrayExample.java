public class ArrayExample
{
    public static void main(String[] args) {
        int COUNT = 5;

        String[] tvz = new String[COUNT];

        for(int i=0;i<tvz.length; i++) {
            tvz[i] = new String("__" + i);
        }

        for(String s : tvz) {
            s = new String("12312321");
        }

        for(String s : tvz) {
            System.out.println(s);
        }


    }
}
