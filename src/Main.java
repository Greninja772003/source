import java.util.ArrayList;
import java.util.Scanner;
class Main {
    static boolean number(int n){
        if (n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        // start coding here
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), divide;
        ArrayList list = new ArrayList();
        if (number(n)){
            list.add(n);
           do {
              n = n / 2;
               list.add(n);
            }while (n>1);
            System.out.println(list);
        }else {
            list.add(n);
            n = (n * 3) + 1;
            list.add(n);
            do {
                n = n / 2;
                list.add(n);
            }while (n>1);
                System.out.println(list);

            }
        }


        }

