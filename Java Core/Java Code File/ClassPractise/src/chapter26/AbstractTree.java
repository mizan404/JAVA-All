
package chapter26;


public abstract class AbstractTree<E> implements Tree<E> {
    @Override 
    public void inorder(){
    
    }
    @Override
    public void postorder(){
    
    
    }
    public void preorder(){
    
    }
    @Override
    public boolean isEmpty(){
    return getSize()==0; 
    }
}
