package Crud_MongoDB;
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  

public class ListOfCollection { 
   
   public static void main( String args[] ) {  
      
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 

      // Creating Credentials 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("nama", "myDb", 
         "password".toCharArray()); 

      System.out.println("Koneksi Berhasil");  
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase("myDb"); 
      System.out.println("Dapat..."); 
      for (String name : database.listCollectionNames()) { 
         System.out.println(name); 
      } 
   }
} 