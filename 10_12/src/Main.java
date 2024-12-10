//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        sum(1,2);




    }

    public static void sum (int a, int b){
        int rez = a+b;
        System.out.println("Skaitļu summa ir "+rez);
    }
    public static void sum (int a, int b, int c){
        int rez = a+b+c;
        System.out.println("Skaitļu summa ir "+rez);
    }

    //       1	Make the cookie batter.
    public static void better() {
        System.out.println("Mix the dry ingredients.");
        System.out.println("Cream the butter and sugar.");
        System.out.println("Beat in the eggs.");
        System.out.println("Stir in the dry ingredients.");
//        2	Bake the cookies.
    }

    public static void better1() {
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");
//        3	Add frosting and sprinkles.
    }

    public static void better2() {
        System.out.println("Mix ingredients for frosting.");
        System.out.println("Spread frosting and sprinkles.");
    }
}

