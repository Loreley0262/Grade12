public class Main {
    public static void getLeafNodes(Node n){
        //base case
        if (n.left == 0 && n.right == 0){
            System.out.println(n);
        }
        //recursive step
        else{
            if (n.left !=0 && n.right !=0){
                getLeafNodes(getNode(n.left));
                getLeafNodes(getNode(n.right));
            }
            if (n.right == 0){
                getLeafNodes(getNode(n.left));
            }
            if (n.left == 0){
                getLeafNodes(getNode(n.right));
            }
        }

    }
    int[] ay = new int[8];



}