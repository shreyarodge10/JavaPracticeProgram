import java.util.ArrayList;
import java.util.Iterator;
public class arrayiloop {
  public static void main(String args[]){
ArrayList <String> names =new ArrayList<>();
   names.add("allice");
   names.add("chsrlie");
   names.add("lucifer");
Iterator<String> itr=names.iterator();
while(itr.hasNext()){
    System.out.println(itr.next());
}
   
  }  
}
