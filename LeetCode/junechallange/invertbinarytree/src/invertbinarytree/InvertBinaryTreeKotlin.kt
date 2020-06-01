package invertbinarytree

class TreeNode(var `val`: Int){
    var left: TreeNode? = null
    var right: TreeNode? = null
}
fun main(){
}

fun invertTree(root: TreeNode?): TreeNode? {
    if(root == null) return root

    val leftTmp:TreeNode? = root.left
    root.left = invertTree(root.right)
    root.right = invertTree(leftTmp)

    return root
}