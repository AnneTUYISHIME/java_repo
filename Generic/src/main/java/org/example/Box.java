package org.example;

public class Box <U>{
    U value;

    public void set(U value) {
        this.value = value;
    }
    public void get(){
        System.out.println(value);
    }
    public boolean isPresent(){
        //String Box= " ";
        if(value==null){
            //System.out.println("Box is null");
            return false;
        }else{
            //System.out.println("Box is present");
            return true;
        }
    }
}
