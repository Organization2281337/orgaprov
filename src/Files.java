
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Files {
//    private static String text = "";
//    private static String fileName = "C:\\Users\\Student\\Desktop\\File/a.txt";
//    private static File file = new File(fileName);
    public static void savefile(String fileName, String text) {
        File file = new File(fileName);
    
        //Определяем файл
        

        //проверяем, что если файл не существует то создаем его
        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}
//
//    public static String getFileName() {
//        return fileName;
//    }
//
//    public static String getText() {
//        return text;
//    }
//
//    public static void setText(String text) {
//        Files.text = text;
//    }
//
//    public static File getFile() {
//        return file;
//    }
//
//    public static void setFile(File file) {
//        Files.file = file;
//    }
//    public static String read(String fileName) throws FileNotFoundException {
//        //Этот спец. объект для построения строки
//        StringBuilder sb = new StringBuilder();
//
//        exists(fileName);
//
//        try {
//            //Объект для чтения файла в буфер
//            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
//            try {
//                //В цикле построчно считываем файл
//                String s;
//                while ((s = in.readLine()) != null) {
//                    sb.append(s);
//                    sb.append("\n");
//                }
//            } finally {
//                //Также не забываем закрыть файл
//                in.close();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        //Возвращаем полученный текст с файла
//        return sb.toString();
//    }

//    public static void main(String[] args) throws FileNotFoundException {
//        Files.read("no_file.txt");
//        //Запись в файл
//        Files.write(fileName, text);
//        System.out.println(text);
//    }
//    private static void exists(String fileName) throws FileNotFoundException {
//        if (!file.exists()) {
//            throw new FileNotFoundException(file.getName());
//        }
//
//    }
//}

