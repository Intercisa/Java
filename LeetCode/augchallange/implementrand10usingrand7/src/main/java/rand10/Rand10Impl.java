package main.java.rand10;

public class Rand10Impl extends SolBase {
    public int rand10() {
        int rand40 = 40;
        while (rand40 >= 40)
            // explanation:
            // https://leetcode.com/problems/implement-rand10-using-rand7/discuss/150301/Three-line-Java-solution-the-idea-can-be-generalized-to-%22Implement-RandM()-Using-RandN()%22
            rand40 =  7 * (rand7() - 1) + (rand7() - 1);

        return rand40 % 10 + 1;
    }
}
