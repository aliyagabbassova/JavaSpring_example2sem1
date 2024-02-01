package ru.geekbrain;
import com.google.gson.Gson;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Person person = new Person();
        person.setFirstName("Alice");
        person.setLastName("Johnson");
        person.setAge(20);

        // Сериализация в JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("JSON: " + json);

        // Десериализация из JSON
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Deserialized Person: " + deserializedPerson);
    }
}
