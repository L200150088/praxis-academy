package Crud_MongoDB;
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 

import org.bson.Document;  
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  

public class InsertingDocument { 
   
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

      // Retrieving a collection
      MongoCollection<Document> collection = database.getCollection("Percobaan"); 
      System.out.println("Data Berhasil Masuk");

      Document document = new Document("title", "MongoDB") 
      .append("id", 1)
      .append("Nama", "Prayogo") 
      .append("likes", 100) 
      .append("Alamat", "Pml") 
      .append("by", "L200150088");  
      collection.insertOne(document); 
      System.out.println("Dokumen Masuk...");     
   } 
}