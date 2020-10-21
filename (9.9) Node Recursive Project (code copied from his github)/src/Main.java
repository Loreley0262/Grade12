import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Node> nodes = new ArrayList<>();

    public static Node getNode(int n){
        for(Node node : nodes){
            if(node.id == n){
                return node;
            }
        }
        return null;
    }

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

    public static void setup() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Tree.txt"));
        while(scan.hasNextLine()){
            String[] temp = scan.nextLine().split(" ");
            int id = Integer.parseInt(temp[0]);
            int left = Integer.parseInt(temp[1]);
            int right = Integer.parseInt(temp[2]);
            nodes.add(new Node(id,left,right));
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        setup();
        getLeafNodes(nodes.get(0));
    }
}
//ANS: 13 14 12 11 4 17 19 20
/*
                                1
                            /       \
                           2         3
                         /  \       / \
                       6     7    (4)  5
                      /      /\         \
                     8      10 (11)     15
                    /      /              \
                   9     (12)              16
                  / \                     /   \
                (13)(14)                (17)  18
                                              / \
                                           (19)(20)
*/