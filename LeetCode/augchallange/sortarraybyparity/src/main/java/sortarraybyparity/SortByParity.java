package main.java.sortarraybyparity;

public class SortByParity {
    public int[] sortArrayByParity(int[] A) {
        if(A == null) return null;
        int ptr = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0){
                int tmp = A[ptr];
                A[ptr++] = A[i];
                A[i] = tmp;
            }
        }
        return A;
    }
}
