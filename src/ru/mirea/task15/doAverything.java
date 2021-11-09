package ru.mirea.task15;

import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class doAverything {
    public static void main(String[]args)
    {
        //запишем что-нибудь

        try(FileWriter writer = new FileWriter("src/ru/mirea/task15/text"))
        {
            Scanner scn = new Scanner(System.in);
            writer.write(scn.nextLine());
            writer.flush();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }

        // а сейчас мы считаем то что записали

        try(FileReader reader = new FileReader("src/ru/mirea/task15/text"))
        {
            int data;
            while((data = reader.read()) != -1)
                System.out.print((char) data);
            System.out.println("\n");
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }

        // а теперь допишем в файл без удаления того что было

        try(FileWriter writer = new FileWriter("src/ru/mirea/task15/text",true))
        {
            Scanner sc=new Scanner(System.in);
            writer.write("\n");
            writer.write(sc.nextLine());
            writer.flush();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }

        // и снова прочитаем...

        try(FileReader reader = new FileReader("src/ru/mirea/task15/text"))
        {
            int data;
            while((data = reader.read()) != -1)
                System.out.print((char) data);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }
    }
}
