package thirdcourse;
public class ThirdCourse {
    String name; /*JVN給定初始值=null*/
    char type;   /*JVN給定初始值=空字元*/
    boolean sex; /*JVN給定初始值=false*/
    int score;   /*JVN給定初始值=0*/
    double temp; /*JVN給定初始值=0.0*/
    static int newScore; //宣告newScore為類別變數
    public static void main(String[] args) {
       char a='A';
       char b=65;
       char c='\ucdef'; /**/
       char d=20013;
       char e='\"';    /* escape character(跳脫字元) */
       boolean g=true;
       char asd=5;
       char $d=6;
       char _f=7;
       System.out.println("a="+a+",b="+b+",c="+c+",d="+d+",e="+e+"這是\"雙引號\""+",g="+g);
       ThirdCourse initTest=new ThirdCourse();
       ThirdCourse initTest2=new ThirdCourse();
       System.out.println("String name="+initTest.name);
       System.out.println("char type="+initTest.type);
       System.out.println("boolean sex="+initTest.sex);
       System.out.println("int score="+initTest.score);
       System.out.println("double temp="+initTest.temp);
       initTest.score=100;
       initTest.newScore=50;
       initTest2.score=90;
       initTest2.newScore=10;
       System.out.println("initTest.score="+initTest.score);
       System.out.println("initTest.newScore="+initTest.newScore);
       System.out.println("initTest2.score="+initTest2.score);
       System.out.println("initTest2.newScore="+initTest2.newScore);
        }
    
}
