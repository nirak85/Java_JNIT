class covid19{
   void Case(){
    System.out.println("Million of people are suffer from this viruses worldwide");
 }
}
class US extends covid19{
    void Case(){
        System.out.println("3 Million population of USA have seen positive of covid19.");
        super.Case();
    }
    void death(){
     System.out.println("More than 50,000 people from USA are death.");   
     
    }
   
}

class SuperClass{
    public static void main (String[] args) {
        US we= new US();
        we.Case();
        we.death();
          }
}