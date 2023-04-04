import javax.swing.*;
import java.awt.*;
public class stu_homework{
public static void main(String[]args){

int num;
String s;
String name,tempname;
int myan=0,eng=0,math=0,total=0;
int temp,tempmyan=0,tempeng=0,tempmath=0;
int rank=1;

s=JOptionPane.showInputDialog("Enter numbers of student");
num=Integer.parseInt(s);
System.out.println("\nNumbers of student: "+num);
String []name_arr = new String [num];
int []mark_arr = new int [num];
int []myan_arr = new int [num];
int []eng_arr = new int[num];
int []math_arr = new int [num];

for(int i=0; i<num; i++){
name=JOptionPane.showInputDialog("Enter Roll no "+i+"'s student name");
System.out.println("\n"+"Roll no "+i+". name : "+name);
s=JOptionPane.showInputDialog("Enter "+name+"'s myan mark");
myan=Integer.parseInt(s);
s=JOptionPane.showInputDialog("Enter "+name+"'s eng mark");
eng=Integer.parseInt(s);
s=JOptionPane.showInputDialog("Enter "+name+"'s math mark");
math=Integer.parseInt(s);
System.out.println("Three marks are : "+myan+" , "+eng+" , "+math);

total=myan+eng+math;
System.out.println("Total of hree marks are : "+total+"\n");

if(myan>=40 && eng>=40 && math>=40){
   if((myan>=80 && myan<=100) || (eng>=80 && eng<=100) || (math>=80 && math<=100)){
      System.out.println(name+" is passed with D."+"\n");
     }
else { System.out.println(name+" is passed normal."+"\n");}

    } 
 else { System.out.println(name+" is failed."+"\n");
}
 for(int j=i; j<num; j++){
mark_arr[j] =total ;
myan_arr[j] =myan;
name_arr[j] =name;
eng_arr[j] =eng;
math_arr[j] =math;
}

}

for(int k=0; k<num-1; k++){
 for(int v=0; v<num; v++){
if(mark_arr[k]<mark_arr[v]){
temp=mark_arr[k];
mark_arr[k]=mark_arr[v];
mark_arr[v]=temp;

tempname = name_arr[k];
name_arr[k] = name_arr[v];
name_arr[v] = tempname;

tempmyan = myan_arr[k];
myan_arr[k] = myan_arr[v];
myan_arr[v] = tempmyan;

tempeng = eng_arr[k];
eng_arr[k] = eng_arr[v];
eng_arr[v] = tempeng;

tempmath = math_arr[k];
math_arr[k] = math_arr[v];
math_arr[v] = tempmath;
}
}
}

System.out.println("\nStudent ranking lists: \n");
System.out.println("\tName\tMyan\tEng\tMath\tTotal_Marks\tRank");
for(int y=0; y<num; y++){
System.out.println("\t"+name_arr[y]+"\t"+myan_arr[y]+"\t"+eng_arr[y]+"\t"+math_arr[y]+"\t"+mark_arr[y]+"\t\t"+rank);
rank++;
}










}
}
