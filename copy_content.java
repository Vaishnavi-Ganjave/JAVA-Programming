import java.io.*;
class FileDemo
{
    public static void main(String args[])
  {
      try
      {
        FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1]);
        int ch;
        while((ch = fin.read() != -1))
        fout.write(ch);
        System.out.println("file content copy......");
        fin.close();
        fout.close();
      }
     catch(Exception e)
      {
          System.out.println(e);
      }
  }
}