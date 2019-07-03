package Crud_MongoDB;
import com.mongodb.ErrorCategory;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
public class MongoJava {
	
	 public static void main(String[] args) {
	        try {
	            // Connect to MongoDB Server on localhost, port 27017 (default)
	            final MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	            // Connect to Database "cartoon"
	            final MongoDatabase database = mongoClient.getDatabase("myDb");
	            System.out.println("Koneksi Berhasil");

	        } catch (Exception exception) {
	            System.err.println(exception.getClass().getName() + ": " + exception.getMessage());
	        }
	    }
	 
	 

}
