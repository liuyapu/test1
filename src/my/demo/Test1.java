package my.demo;

import java.io.*;

//文件输入输出流
public class Test1{
    public static void main(String[]args) throws IOException {
        Test1 test1 = new Test1();
        //test1.writeTest();
        //test1.writeTest2();
        //test1.readTest1();
        test1.readTest2();
    }
    public void writeTest()  throws IOException{
        String fileName = "C:/Users/lyp/Desktop/output.txt";
        //第二个参数没写，默认将原文件里的对象覆盖重写
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        fileOutputStream.write(97);
        fileOutputStream.close();
    }
    public void writeTest2()  throws IOException{
        String fileName = "C:/Users/lyp/Desktop/output.txt";
        //第二个参数设置为true，则表示不会覆盖之前的内容，而是在文件末追加
        FileOutputStream fileOutputStream = new FileOutputStream(fileName,true);
        byte[] bytes = {97,98,99,100,101,102,103};

        fileOutputStream.write(bytes);

        fileOutputStream.write(bytes,1,2);
        fileOutputStream.close();
    }
    public void writeTest3()  throws IOException{
        String fileName = "C:/Users/lyp/Desktop/output2.txt";

        //第二个参数设置为true，则表示不会覆盖之前的内容，而是在文件末追加
        FileWriter fileWriter = new FileWriter(fileName,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        char[] chars = {'m','n','o','p','q','r','s'};

        bufferedWriter.write("b");

        bufferedWriter.newLine();
        bufferedWriter.write(chars,3,4);
        bufferedWriter.flush();         //将缓存区内容压入内存
        bufferedWriter.close();         //将文件关闭
    }

    public void readTest1(){
        String filename = "C:/Users/lyp/Desktop/input1.txt";
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new FileReader(filename));
            String line = null;
            while((line = bufferedReader.readLine())!= null){
                //一行一行的读入数据
                System.out.println(line);
            }

            bufferedReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    //字节流输入
    public void readTest2(){
        String filename = "C:/Users/lyp/Desktop/output.txt";
        BufferedInputStream bufferedInputStream = null;
        try{
            bufferedInputStream = new BufferedInputStream(new FileInputStream(filename));
            byte[] bytes = new byte[5];
            int read = bufferedInputStream.read(bytes,0,5 );
            System.out.println("字节流前五个字节为："+new String(bytes));
            System.out.println("读取后的字符个数为："+read);
            bufferedInputStream.close();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
