package interfaceexample;

public class MammalInt implements Animal {
    MammalInt(){     
    //x=67;//final
    }
    public int noOfLegs() {
        return 10;
    }
    public static void main(String args[]) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
        System.out.println(m.noOfLegs());
        
        System.out.println(Animal.x);//static
    }

    @Override
    public void eat() {
        System.out.println("Mamal eats");
        System.out.println(x);//static
    }
    @Override
    public void travel() {
        System.out.println("Mamal tavels");
    }    

    
}
