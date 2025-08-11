public class AIOB_Exception {
    public static void main(String[] args) {
       int[] a = {1,2,3,4,5,6};
       try{
        System.out.println(a[10]=100);
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception message: " + e.getMessage());
       }
    }
}
