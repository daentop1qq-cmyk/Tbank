
    public static void main() {
//        IO.println("Виктор");
//        IO.println("10Т");
//        IO.println("Фафик");

//        IO.println("  *  ");
//        IO.println(" *** ");
//        IO.println("*****");


//        String name = "Any";
//        int age =  16;
//        IO.println(name + " ychitsa v 10 klasse");
//        double price = 34.4;
//        char frDE = 'A';


//        String Name = IO.readln("Как тебя зовут?");
//        int Age = Integer.parseInt(IO.readln("Какой у тебя год рождения?"));
//        IO.println(Name + ", тебе " + (2026 - Age) + " лет");


//        int cost = Integer.parseInt(IO.readln("Цена билета?"));
//        int num = Integer.parseInt(IO.readln("Количество билетов?"));
//        int sk = Integer.parseInt(IO.readln("Какая скидка?"));
//        IO.println( cost * num * (100 - sk) / 100);


//        double c = Integer.parseInt(IO.readln("Сколько градусов?"));
//        IO.println((c*9/5)+32)


        cost(31,15);
        sum(-9345);
        peramide(5);
        palindrom(12321);
        for(int k = 0;k<100;k++){
            prost(k);
        }
        hello();
        test1();
        test2();
        test3();
        test4();
        for(int i = 1;i<500;i++) {
            if (palindromm(i)) {IO.print("True"); IO.print(' '); IO.println(i);}
        }
        koren(1,4,-5);
    }





public static void cost (double prise,int age){
    if (age <= 7)  IO.println(0);
    else if (age <= 17)  IO.println(prise*0.5);
    else if (age >= 65) IO.println(prise*0.7);
    else  IO.println(prise);
}


public static void palindrom(int chisl){
    int check = chisl;
    int len = -1;
    while(check != 0){
        len+=1;
        check/=10;
    }
    for(int i = 0; i < len/2; i++){
        int left = pow(10,len-i*2);
        int right = 10;
        if(chisl/left != chisl%right)  check+=1;
        chisl%=left;
        chisl/=right;
    }
    if (check == 0)  IO.println("Yes");
    else  IO.println("No");
}


public static void sum(int chisl){
    int anser = 0;
    while (chisl != 0){
        if (chisl%10 >= 0)  anser += chisl%10;
        else  anser += -1*chisl%10;
        chisl/=10;
    }
    IO.println(anser);
}


public static void peramide(int wid) {
    int len = 2 * (wid - 1) + 1;
    for (int i = 0; i < wid; i++) {
        for (int j = 0; j < len / 2 - i; j++)  IO.print(" ");
        for (int j = 0; j < i * 2 + 1; j++)  IO.print("*");
        for (int j = 0; j < len / 2 - i; j++)  IO.print(" ");
        IO.println("");
    }
}


public static void prost(int chisl){
    if (chisl != 0 && chisl != 1) {
        int check = 0;
        for (int i = 2; i < chisl; i++) {
            if (chisl % i == 0)  check += 1;
        }
        if (check == 0)  IO.println(chisl);
    }
}

public static int pow(int chisl,int stepen){
    int new_chisl = 1;
    for (int i = 0; i<stepen; i++) new_chisl*=chisl;
    return new_chisl;
}
    public static void test1(){
        IO.println("Public");
    }

    private static void test2(){
        IO.println("Private");
    }

    protected static void test3(){
        IO.println("Protected");
    }

    static void test4(){
        IO.println("Default");
    }
    public static boolean palindromm(int chis1){
        int check = chis1;
        int answer = 0;
        int sum = 0;

        while (check != 0){
            sum += check%10;
            answer = answer*10+check%10;
            check /= 10;
        }

        if (answer == chis1 && sum > 10) return true;
        else return false;
    }
    public static void hello(){
        IO.println("Привет");
    }
    public static void koren(double a, double b, double c) {
        double d = b*b - 4*a*c;

        if (a == 0) IO.println(-c / b);
        else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2*a);
            double x2 = (-b - Math.sqrt(d)) / (2*a);
            IO.println(x1);
            IO.println(x2);
        } else if (d == 0) IO.println(-b / (2*a));
    else IO.println("Нет корней");
    }