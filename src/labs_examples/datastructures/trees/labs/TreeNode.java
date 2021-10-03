package labs_examples.datastructures.trees.labs;

public class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;
    TreeNode root;


    public TreeNode(int data){

        this.data = data;
    }

    public TreeNode search (int data){

        if (data == this.data){

            return this;
        }
        else if (data < this.data){

            if(left != null){
                return left.search(data);
            }
            else{
                return null;
            }
        }
        else{

            if(right != null){

                return right.search(data);
            }
            else{

                return null;
            }
        }
    }

    public void insert(int data){

        if(data < this.data){

            if(left !=null){

                left.insert(data);
            }
            else{

                left = new TreeNode(data);
            }
        }
        else{

            if(right != null){

                right.insert(data);
            }
            else{

                right = new TreeNode(data);
            }
        }
    }

    public void pre_order(){

        System.out.println(this.data);

        if (left != null){

            left.pre_order();
        }

        if(right != null){

            right.pre_order();
        }
    }

    public void in_order(){

        if (left != null){

            left.in_order();
        }

        System.out.println(this.data);

        if(right != null){

            right.in_order();
        }
    }

    public void post_order(){

        if (left != null){

            left.post_order();
        }

        if(right != null){

            right.post_order();
        }

        System.out.println(this.data);
    }


}
