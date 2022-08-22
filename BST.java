class Node{
int nodeValue;
Node left;
Node right;

public Node(int value){
nodeValue=value;
left=null;
right=null;
}


class BST{
Node root;

public BST(int value){
root = new Node(value);
}

public Node insertNode(Node root, int key){
if (root == null)
{
root = new Node(key);
return root;
}
if (root.nodeValue > key){
root.left= insertNode(root, key);
}
else{
root.right= insertNode(root, key);


}
public void inorder(Node root){
if (root != null){
inorder(root.left);
System.out.println(root.nodeValue);
inorder(root.right);
}

//driver code
