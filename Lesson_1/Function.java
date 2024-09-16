package Lesson_1;

public class Function {
    public int a = 6;
    public int b = 9;
    public int c = 11;
    public int d = 18;



    public void printThreeWords(){
        System.out.println("Orange"+"\n"+"Banana"+"\n"+"Apple");
    }
    public void checkSumSign() {
        int sam = a + b;
        if (sam >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }

    }
    public void printColor(){
        int value = 10;
        if (value <= 0){
            System.out.println("Красный");
        }if ((value <= 100)){
            {
                System.out.println("Желтый");
            }
        }else {
            System.out.println("Зеленый");
        }
    }
    public void compareNumbers(){
        if (a>=b){
            System.out.println("а>=d");
        }else {
            System.out.println("a<b");
        }
    }
    public void comparisonNumber(int c, int b){
        int summ = c + b;
        boolean flag;
        if (10<summ) {
                if (summ<=20){
                    flag = true;
                    System.out.println(summ+" "+flag);

            }else {
                    flag= false;
                    System.out.println(summ+" "+flag);
                }
        }else {
            flag= false;
            System.out.println(summ+" "+flag);
        }

    }
    public void printWor(int add){
        if (0<=add) {
            if (add<0){
                System.out.println(add+" ");

            }else {
                System.out.println(add+" Введено положительное число ");
            }
        }else {
            System.out.println(add + " Введено отрицательное число ");

        }
    }
    public void printWorBoolean(int bool){

        boolean flag;
        if (0<=bool) {
            if (bool<=0){
                flag = true;
                System.out.println(bool+"  "+flag);

            }else {
                flag= true;
                System.out.println(bool+"  "+flag);
            }
        }else {
            flag= false;
            System.out.println(bool+"  "+flag);
        }

    }
    public void printString(String st, int nam){
        for (int i = 0; i <= nam; i++){
            System.out.println(st + " " + i);
        }
    }
    public void isLeapYear(int year){
        boolean flag;
        if (year % 400 ==0){
            if (year % 4 == 0){
                flag = true;
                System.out.println(flag);
            }if (year % 100 == 0){
                flag = false;
                System.out.println(flag);
            }else {
                flag= false;
                System.out.println(flag);
            }

        }
    }

}

