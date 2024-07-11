//compile-time polymorphism

import java.util.ArrayList;

class basics {
    public static void print(ArrayList<Integer> arrCopy){
        int size=arrCopy.size();
        for(int i=0;i<size;i++){
            System.out.println(arrCopy.get(i));
        }
    }
    public static void print(int poly, ArrayList<Integer> arrCopy){
        int size=arrCopy.size();
        for(int i=0;i<size;i++){
            String str = arrCopy.get(i) + "x^" + poly;
            System.out.println(str);
        }
    }
    public static void main(String args[]) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0; i<10; i++){
            arr.add(i);
        }
        print(arr);
        print(53, arr);
    }
}