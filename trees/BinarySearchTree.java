package trees;

public class BinarySearchTree<T extends Comparable> {
    private TNode<T> root;

    public void insert(T val){
        if(root==null){
            root=new TNode<T>(val);
        }else{
            TNode<T> iterator=root;
            while (iterator!=null){
                if(iterator.value.compareTo(val)==1){
                    if(iterator.left==null) {
                        iterator.left = new TNode<T>(val);
                        return;
                    }else{
                            iterator = iterator.left;
                        }
                    }
                else{
                        if(iterator.right==null){
                            iterator.right=new TNode<T>(val);
                            return;
                        }else{
                            iterator=iterator.right;

                        }
                    }

            }
         }
    }
    public void inorder(){
        inorder(root);
    }
    public void preorder(){
        preorder(root);
    }
    public void postorder(){
        postorder(root);
    }
    public void inorder(TNode<T> currentRoot){
    if(currentRoot!=null){
        inorder(currentRoot.left);
        System.out.println(currentRoot+"");
        inorder(currentRoot.right);
    }
    }
    public void preorder(TNode<T> currentRoot){
        if(currentRoot!=null){
            System.out.println(currentRoot+" ");
            inorder(currentRoot.left);
            inorder(currentRoot.right);
        }
    }
    public void postorder(TNode<T> currentRoot){
        if(currentRoot!=null){
            inorder(currentRoot.left);
            inorder(currentRoot.right);
            System.out.print(currentRoot +" ");

        }
    }

    public void insertRecurisively(T val){
        root=insertRecurisively(root,val);
    }

    public TNode<T> insertRecurisively(TNode<T> currentRoot,T val){
        if(currentRoot ==null){
            return new TNode<>(val);
        }else if(currentRoot.value.compareTo(val)==1){
            currentRoot.left=insertRecurisively(currentRoot.left,val);

        }else{
currentRoot.right=insertRecurisively(currentRoot.right,val);
        }
        return currentRoot;
    }
    public boolean search(T val){
        TNode<T> iterator=root;
        while(iterator!=null){
            if(iterator.value.compareTo(val)==0){
                return true;
            }else if(iterator.value.compareTo(val)==1){
                iterator=iterator.left;
            }else{
                iterator=iterator.right;
            }
        }
        return false;
    }
    public boolean searchRecursively(T val){
        return searchRecursively(root,val);
    }
    public boolean searchRecursively(TNode<T> currentroot,T val){
        if(currentroot==null){
            return false;
        }else if(currentroot.value.compareTo(val)==0){
            return true;
        }else if(currentroot.value.compareTo(val)==1){
            return searchRecursively(currentroot.left,val);
        }else{
            return searchRecursively(currentroot.right,val);

        }
    }




}










