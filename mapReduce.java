package javaLearning;

import java.util.Objects;

public class mapReduce {
    public static void returnCount(String[] listProduct, int num, int k){
        if(k == 0){
            return;
        }
        for(int i = 1; i <= listProduct.length; i++){
            if(Objects.equals(listProduct[i], listProduct[i + 1])){
                num++;
            }

        }
        returnCount(listProduct, num, k-1);

    }
    public static void main(String[] args){
        String[] listProduct = {"shoes", "laptop", "shoes", "phone", "laptop"};
        int k = listProduct.length;
        returnCount(listProduct, 0, k);

    }
}
