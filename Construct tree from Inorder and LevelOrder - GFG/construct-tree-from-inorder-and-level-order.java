// { Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }    
        public void setLeft(Node left) 
    {
        this.left = left;
    }
  
    public void setRight(Node right) 
    {
        this.right = right;
    }
        
    
}


class ConstructBT
{
    Node root;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        
	        int inord[] = new int[n];
	        int level[] = new int[n];
	        for(int i = 0; i < n; i++)
	            inord[i] = sc.nextInt();
	            
	        for(int i = 0; i < n; i++)
	             level[i] = sc.nextInt();
	             
	        GfG g = new GfG();
	        Node node =  g.buildTree(inord, level);
	        printPreOrder(node);
	        System.out.println();
	        
	        
	    }
    }
    
   static void printPreOrder(Node node)
   {
       if(node == null)
          return;
          
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
   }
}
// } Driver Code Ends


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{
    HashMap<Integer,Integer> map; // element vs index in inorder
    Node buildTree(int inorder[], int level[])
    {
        map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return construct(inorder,level,0,level.length-1);
    }
    
    Node construct(int inorder[], int level[],int is,int ie){
        
        if(is>ie){
            return null;
        }
        
        Node root = new Node(level[0]);
        int idx = map.get(root.data);
        int colse = idx-is;
        int corse = ie-idx;
        
        int[] llo = new int[colse];
        int[] rlo = new int[corse];
        
        segregeteLevelOrder(llo,rlo,level,idx);
        
        root.left = construct(inorder,llo,is,idx-1);
        root.right = construct(inorder,rlo,idx+1,ie);
        
        return root;
    }
    
    void segregeteLevelOrder(int[] llo,int[] rlo,int[] level,int idx){
        int j = 0;
        int k = 0;
        
        for(int i=1;i<level.length;i++){
            if(map.get(level[i])<idx){
                llo[j++] = level[i];
            }
            else{
                rlo[k++] = level[i];
            }
        }
    }
   
}


