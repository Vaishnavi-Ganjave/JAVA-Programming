import java.io.*;
class FileDemo
{
public static void main(String args[])
{
    try
    {
        FileInputStream fin = new FileInputStream("Index.txt");
        int ch, wc=0,cc=0,lc=0;
        while((ch=fin.read())!= -1)
        {
            if(ch ==" " || ch== "\n" || ch=="\t")
            wc++;
            else
            cc++;
            if(ch=="\n")
            lc++;
        }wc++; lc++; fin.close();
        System.out.println("word count: "+wc);
        System.out.println("character count: "+cc);
        System.out.println("line count: "+lc);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}