package com.full.school;

// adding element dynamically

public class Problem {
    private int count ;
    private int array[];
    private int sizeofArray;

    public Problem(){
        array=new int[1];
        count=0;
        sizeofArray=1;
    }

    public  void addElement(int i) {
        if(count == sizeofArray){
            grow();
        }
        array[count]=i;
        count++;
    }
    public void addElement(int index,int a){
        if(count == sizeofArray){
            grow();
        }
        for (int i = count-1; i >= index; i--) {
            array[i+1]=array[i];
        }
        array[index]=a;
        count++;
    }

    public  void grow() {
        int temp[] =null;
        if(count == sizeofArray){
            temp= new int[sizeofArray*2];
            for (int i = 0; i < sizeofArray; i++) {
                    temp[i]=array[i];
            }
        }
        array=temp;
        sizeofArray=sizeofArray *2;
    }

    public static void main(String[] args) {
        Problem da= new Problem();
        da.addElement(4);
        da.addElement(5);
        da.addElement(7);
        da.addElement(8);
        da.addElement(2,6);
        for (int k:da.array) {
            System.out.println(k);
        }
    }
}
