package com.hainiu.reflectdemo;




public class JosephRing {
    public static void main(String[] args) {
//        测试一下，看一下构造环形链表，遍历是否正确
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        //创建41个节点
        circleSingleLinkedList.addBoy(41);
        circleSingleLinkedList.showBoy();

//        测试数据出圈是否正确
        //2-->4--->1---->5---->3
        circleSingleLinkedList.countBoy(1,3,41);
    }
}


  //创建一个单向的环形链表
class CircleSingleLinkedList {
    //    创建一个first节点，目前先不赋值，当前没有编号
    private Boy first = null;

    //    添加数据节点，构成一个环形的链表
    public void addBoy(int nums) {
//        nums 做一个简单的数据校验
        if (nums < 1) {
            System.out.println("nums的值不正确");
            return;
        }

        Boy curBoy = null;//辅助指针，帮助构建环形链表

//        使用for循环来创建我们的环形链表
        for (int i = 1; i <= nums; i++) {
//            根据编号，创建数据节点
            Boy boy = new Boy(i);
//            如果是第一个节点
            if (i == 1) {
                first = boy;
//                表示将first的下一个节点指向first---等价于first.next=first
                first.setNext(first);//自己构成环状
                curBoy = first;//让curBoy指向第一个节点
            } else {//不只一个节点
                curBoy.setNext(boy);//将倒数第二个节点指向倒数第一个节点
                boy.setNext(first);//将最后一个节点的next指向first
                curBoy = boy;//将curBoy指向最后一个节点
            }
        }
    }


    //    遍历当前的环形链表
    public void showBoy() {
//        判断链表是否为空
        if (first==null) {
            System.out.println("链表为空，没有任何数据");
            return;
        }

//        因为first不能动，因此仍然使用一个辅助指针，完成遍历
        Boy curBoy = first;//定义一个变量，直接指向第一个节点
        while (true) {
            System.out.printf("数据的编号为：%d\n", curBoy.getNo());
            if (curBoy.getNext() == first) {//说明已经遍历完毕
                break;
            }

            curBoy = curBoy.getNext();//curBoy后移
        }

    }


    /**
     * @param startNo:表示从第几个数据开始
     * @param countNum：表示每数到几的人自杀
     * @param nums：表示最初有几个数据在圈内
     */
    //    根据用户的输入，计算出数据出圈的顺序
    public void countBoy(int startNo, int countNum, int nums) {
//        先对数据进行校验
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("参数输入有误，请重新输入");
            return;
        }

//        创建要给辅助指针，帮助完成数据出圈
        Boy helper = first;
//        需求创建一个辅助指针（变量）helper，事先应该指向环形链表的最后这个节点
        while (true) {
            if (helper.getNext() == first) {//说明helper指向最后一个节点
                break;
            }
            helper = helper.getNext();//让helper指向下一个节点
        }

//        数据报数前，先让first和helper移动k-1次
        for(int j=0;j<startNo-1;j++){
            first=first.getNext();//使得first指向下一个节点
            helper=helper.getNext();//使得helper指向下一个节点
        }

//        当数据报数的时候，让first和helper 指针同时的移动m-1次 然后出圈
//        这里是一个循环操作，知道圈中只有一个节点
        while (true){
            if(helper==first){//说明圈中只有一个节点
                break;
            }
//            让first和helper指针同时的移动countNum-1
            for(int j=0;j<countNum-1;j++){
                first=first.getNext();
                helper=helper.getNext();
            }
//            这时first指向的节点，就是出圈的数据节点
            System.out.printf("数据%d被处决\n",first.getNo());

//            这时将first指向的数据节点出圈
            first=first.getNext();//让first指向目前first指向的下一个节点
            helper.setNext(first);//等级与helper.next=first----helper不动的
        }

        System.out.printf("最后留下的数据编号为%d\n",first.getNo());
    }
}


//创建一个Boy类，表示一个节点
class Boy {
    private int no;//编号
    private Boy next;//指向下一个节点,默认为空

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}