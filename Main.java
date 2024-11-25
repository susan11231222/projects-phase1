
public class Main{
    public static void main(String[] args) {
        //declaring an array
        int[] myNum={1,2,3,4,5,6};
        //accessing an array
        System.out.println(myNum[3]);
        // changing an array element
        myNum[2]=400;
        System.out.println(myNum[2]);
        myNum[0]=100;
        System.out.println(myNum[0]);
        myNum[1]=200;
        System.out.println(myNum[1]);
        //array length
        System.out.println(myNum.length);
    }
}