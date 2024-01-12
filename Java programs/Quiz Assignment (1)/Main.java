import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Quiz[] arr=new Quiz[5];
        Quiz q=new Quiz();
        //boolean is given so that when traversing in the reverse order the previous answer count will get decremented if it is correct or else the count will remain the same

        arr[0]=new Quiz("1.Which of the following for loop declaration is not valid","for ( int i = 99; i >= 0; i / 9 );","for ( int i = 7; i <= 77; i += 7 ));","for ( int i = 20; i >= 2; - -i ));","for ( int i = 2; i <= 20; i = 2* i ));",3,false);
        arr[1]=new Quiz("2.The ______ keyword is used to call the constructor of the parent class)","this","parent class name","super","parent",3,false);
        arr[2]=new Quiz("3.Java permits a class to extend only one other class directly. This is called __________","Hierarchical inheritance","single inheritance","multilevel inheritance","hybrid inheritance",2,false);
        arr[3]=new Quiz("4.Which of the following options is a valid class identifier in Java","creditcard","creditCard","CreditCard","1creditCard",3,false);
        arr[4]=new Quiz("5.Which of the following import statements is used by default in all the Java applications?","import java.lang.*;","import java.util.*;","import java.awt.*;","Import java.net.*;",1,false);

        int anscount=0;
        Scanner sc=new Scanner(System.in);

        int i=0;
        System.out.println(arr[i]);
        System.out.print("Enter your option : ");
        int asnswer =sc.nextInt();
        if (asnswer==arr[i].getAns()){
            arr[i].setFlag(true);
            anscount++;
        }



        for (int j=1; j< arr.length;j++){

            //int ret=1;
            System.out.println("1 for Next Question or 2 for Previous  Question :");
            int ret=sc.nextInt();
            if (ret==1){

                System.out.println(arr[j]);
                System.out.print("Enter your option : ");
                int answer =sc.nextInt();
                if (answer==arr[j].getAns()){
                    arr[j].setFlag(true);
                    anscount++;
                }
                //System.out.println("1 for Next Question or 2 for previous Question :");
                //ret=sc.nextInt();
            }

            else{
                j-=2;
                System.out.println(arr[j]);
                System.out.print("Enter your opt:");
                int answer=sc.nextInt();
                if (arr[j].isFlag()==true){anscount--;}
                if (answer==arr[j].getAns()){
                    anscount++;
                }
                if (j== arr.length-1){
                    System.out.println("1 for Next Question or 2 for Previous  Question :");
                    int re=sc.nextInt();
                    ret=re;
                }
                j++;

            }

        }
        System.out.println("*******************************");
        System.out.println("Your total Score is ; "+anscount);
    }
}