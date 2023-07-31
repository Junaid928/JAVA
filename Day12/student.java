package Project18;
import java.io.Serializable;
public class student implements Serializable{
    int id;
    String Name;
    public student(int id, String Name){
        this.id = id;
        this.Name = Name;
    }
}
