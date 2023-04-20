package com.hainiu;

public class Demo6 {
    public static void main(String[] args) {
        int x= 1543;
        int count = 0;

        while(x>0){
            if  (x%2 ==1 ) {
                x--;
                count++;
            }
            x/=2;

        }
        System.out.println(count);


//        for (int i = 0; i < 1543; i++) {
//            if (x % 2 ==0){
//                x /=2;
//            }else if  (x%2 !=0 &&x!=1) {
//                x =(x-1)/2;
//                count++;
//            }

//        }System.out.println(count);




//        if (x % 2 ==0){
//            x /=2;
//        }else if  (x%2 !=0 &&x!=1) {
//            x =(x-1)/2;
//            count++;
//        }
////        else if (x==1){
////            x -=1;
////            count++;
////        }
//        System.out.println(count);
    }
}
