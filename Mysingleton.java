
 
 final public class Mysingleton {
     
    
    private Mysingleton(){
         
    }
    public static Mysingleton getInstance(){
        if(myObj == null){
            myObj = new Mysingleton();
        }
        return myObj;
    }
     
    public void getSomeThing(){
        
        System.out.println("I am here....");
    }
     
    public static void main(String a[]){
        Mysingleton st = Mysingleton.getInstance();
        st.getSomeThing();
    }
}
