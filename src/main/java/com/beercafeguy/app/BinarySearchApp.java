package com.beercafeguy.app;

public class BinarySearchApp {

    public static void main(String[] args) {

        int[] ars={1,2,5,9,10,12,36,67,100} ;
        System.out.println(find(ars,200));
        System.out.println(binarySearch(ars,36));
    }

    public static int find(int[] arr,int key){
        int curser;
        int lower=0;
        int upper=arr.length-1;

        while(true){
            curser=(lower+upper)/2;
            if(arr[curser]==key){
                return curser;
            }else if (lower > upper){
                return arr.length;
            }else{
                if(key > arr[curser]){
                    lower=curser+1;
                }else{
                    upper=curser-1;
                }
            }
        }
    }

    public static int binarySearch(int arr[],int key){
        return findRec(arr,0,arr.length-1,key);
    }
    public static int findRec(int arr[],int lower,int upper, int key){
        int curser=(lower+upper)/2;
        if(arr[curser] == key){
            return curser;
        }else if(lower > upper){
            return arr.length;
        }else{
            if(key > arr[curser]){
                return findRec(arr,curser+1,upper,key);
            }else{
                return findRec(arr,lower,curser-1,key);
            }
        }
    }
}
