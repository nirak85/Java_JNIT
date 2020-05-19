class StringDemo{
public static void main(String args[]){
String a= "Java";
String b= a.concat(" is a independent programming language");
String c= "JAVA";
String d= "Python";
String e= " programming language ";
System.out.println(a.isEmpty());
System.out.println(a.equals(c));
System.out.println(a.equalsIgnoreCase(c));
System.out.println(a.compareTo(d));
System.out.println(e.substring(2,13));
System.out.println(d.toUpperCase());
System.out.println(c.toLowerCase());
System.out.println(e.length());
System.out.println(b.indexOf('m'));
System.out.println(e.trim());
System.out.println(e.contains("programming"));
System.out.println(c.replace('A','a'));
System.out.println(c.replace('A','a'));
char f=c.charAt(2);
System.out.println(f);
}
}