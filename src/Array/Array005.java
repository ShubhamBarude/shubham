package Array;

public class Array005 {
  //  int Char=256;
  public static void main(String[] args) {


      String str = "Geeks for Geeks";

      int count[] = new int[500];
      for (int i=0;i<str.length();i++) {
          count[str.charAt(i)]++;
      }
          char [] ch=new char[str.length()];
          for(int i=0;i<str.length();i++){
             ch[i]=str.charAt(i);
              int count1=0;
              for(int j=0;j<str.length();j++)
              {
                  if(ch[j]==str.charAt(i)&&ch[j]!=' ')
                  {
                     // int c;
                      count1++;
                  }}
                  if(count1==1)
                  {
                      System.out.println(str.charAt(i)+" "+count[str.charAt(i)]);
                  }
              }
          }
      }

