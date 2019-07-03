package Crud_MongoDB;
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 

import org.bson.Document; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  

public class selectingCollection { 
   
   public static void main( String args[] ) {  
      
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
     
      // Creating Credentials 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("nama", "myDb", 
         "password".toCharArray()); 
      System.out.println("Koneksi Berhasil \n");  
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase("myDb");  
      
      // Creating a collection 
      System.out.println("Dokumen Berhasil Masuk"); 

      // Retieving a collection
      MongoCollection<Document> collection = database.getCollection("Percobaan"); 
      System.out.println("Tabel Berhasil Masuk"); 
   }
}