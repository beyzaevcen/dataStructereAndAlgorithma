package trees;

public class test {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst=new BinarySearchTree<>();
        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insertRecurisively(5);
        bst.insert(15);
        bst.insertRecurisively(25);

        System.out.println(bst.searchRecursively(5));
        System.out.println(bst.searchRecursively(55));


    }
}
