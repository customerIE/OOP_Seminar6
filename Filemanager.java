import java.io.*;
import java.util.ArrayList;

public class Filemanager {

    String FILE_PATH = "./Seminar6/";
    String FILE_NAME_EXPORT = "export.csv";
    String FILE_PATH_FULL = FILE_PATH+FILE_NAME_EXPORT;

    public void fileExport(ArrayList <Phonebook> pb){
        try(FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false))
        {
            for(Phonebook i: pb){
                String text = i.getName()+";"+i.getPhone()+";"+i.getCity();
                writer.write(text);
                writer.append('\n');
            }
            writer.flush();    
        }
        catch(IOException ex) {System.out.println(ex.getMessage());}
    }

    public void fileImport(ArrayList<Phonebook> pb){
        try {
            File file = new File(FILE_PATH_FULL);
            //создаем объект FileReader для объекта file
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] tmp = line.split(";");
                pb.add(new Phonebook(tmp[0], tmp[1], tmp[2]));
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
            reader.close();
        } 
        catch (FileNotFoundException e) {e.printStackTrace();} 
        catch (IOException e) {e.printStackTrace();}
    }
}
