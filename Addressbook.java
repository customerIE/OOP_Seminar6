import java.util.ArrayList;

public class Addressbook {

    public ArrayList<Phonebook> pb = new ArrayList<>();
    public void addressBook(){
        pb.add(new Phonebook("Сафонов Игорь Сергеевич", "9189775563", "Воронеж"));
        pb.add(new Phonebook("Соболев Игорь Аркадьевич", "9997775522", "Пермь"));
    }

    public void showAddressBook(){
        for(Phonebook i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
    }
}
