package main.java.allelementsfromtwobts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllElementsFrom2BTS {
       private final List<Integer> result = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return result;

            traversBTSWithValuesAdded(root1);
            traversBTSWithValuesAdded(root2);

        return result.stream().sorted().collect(Collectors.toList());
    }

    private void traversBTSWithValuesAdded (TreeNode root) {
        if(root == null) return;

        result.add(root.val);
        traversBTSWithValuesAdded(root.left);
        traversBTSWithValuesAdded(root.right);
    }
}
