/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var node = root

        val pVal = p!!.`val`

        val qVal = q!!.`val`

        while(true){
            var parentVal = node!!.`val`

            if(pVal < parentVal && qVal < parentVal){
                node = node?.left
            } else if(pVal > parentVal && qVal > parentVal){
                node = node?.right
            } else {
                break
            }
        }

        return node
    }
}