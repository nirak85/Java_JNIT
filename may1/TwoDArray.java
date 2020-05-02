class TwoDArray{
public static void main(String args[]){
String[][] array= {
	{"a", "b", "c", "d"},
	{"e", "f", "g", "h"},
	{"i", "j", "k", "l"},

};
System.out.println(array[1][0]);
System.out.println(array[2][3]);

for(int i=0; i<3; i++){
for(int j=0; j<=3; j++){
System.out.print(array[i][j]);
}
System.out.println();
}

}
}