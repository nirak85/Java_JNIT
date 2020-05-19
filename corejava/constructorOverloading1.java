class Student
{
   private int s_ID;
   private String s_Name;
   private int s_Age;
   Student()
   {
       //Default constructor
       s_ID = 1024;
       s_Name = "Anil";
       s_Age = 18;
   }
   Student(int num1, String str, int num2)
   {
       //Parameterized constructor
       s_ID = num1;
       s_Name = str;
       s_Age = num2;
   }
   //Getter and setter methods
   public int getS_ID() {
       return s_ID;
   }
   public void setS_ID(int s_ID) {
       this.s_ID = s_ID;
   }
   public String getS_Name() {
       return s_Name;
   }
   public void setS_Name(String s_Name) {
       this.s_Name = s_Name;
   }
   public int getS_Age() {
       return s_Age;
   }
   public void setStuAge(int s_Age) {
       this.s_Age = s_Age;
   }
}

class constructorOverloading1{
   public static void main(String args[])
   {
       //object call default constructor
       Student s1 = new Student();
       System.out.println("Student Name is: "+s1.getS_Name());
       System.out.println("Student Age is: "+s1.getS_Age());
       System.out.println("Student ID is: "+s1.getS_ID());

       //object call parameterized
        
       Student s2 = new Student(1023, "Amy", 22);
       System.out.println("Student Name is: "+s2.getS_Name());
       System.out.println("Student Age is: "+s2.getS_Age());
       System.out.println("Student ID is: "+s2.getS_ID()); 
  
}
}