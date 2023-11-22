package org.suhun;

public class BubbleSort {
    int[] sortNums;
    public BubbleSort(){

    }

    public int[] bubble_sort(int[] nums){
        this.sortNums = nums;
        if(this.sortNums.length <= 1) return this.sortNums;

        for(int round=this.sortNums.length; round>0; round--){
            for(int i_round = 1; i_round<round; i_round++){
                if(this.sortNums[i_round-1] > this.sortNums[i_round]){
                    swap(i_round-1, i_round);
                }
            }
            System.out.println("End "+ round);
        }
        return this.sortNums;
    }

    private void swap(int leftIndex, int rightIndex){
        int tempNum = this.sortNums[rightIndex];
        this.sortNums[rightIndex] = this.sortNums[leftIndex];
        this.sortNums[leftIndex] = tempNum;

    }

    public void printResult(){
        for(int num:this.sortNums){
            System.out.println(num);
        }
    }
}
