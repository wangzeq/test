package com.hainiu.lambda;

public class EatableDemo {
    public static void main(String[] args) {
//        Eatable a = new EatableImp1();
//        useEatable(a);


//        useEatable(new Eatable(){
//            @Override
//            public void eat() {
//                System.out.println("一天一苹果，医生远离我");
//            }
//        });

        useEatable(()-> System.out.println("一天一苹果，医生远离我"));




    }


    public static void useEatable(Eatable a){
        a.eat();
    }
}
