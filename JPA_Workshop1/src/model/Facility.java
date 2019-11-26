package model;

import java.io.PrintWriter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Facility {
   public Facility() {}
   
   @Id
   private String id;
   private String name;
   private String description;

   public Facility(String name) {
      this(name, null);
   }

   public Facility(String name, String description) {
      this.name = name;
      this.description = description;
   }

   public String getName() {
      return name;
   }

   public String getDescription() {
      return description;
   }

   public String toString() {
      String fullName = name;
      if (description != null) {
         fullName += " (" + description + ")";
      }
      return (fullName);
   }

   public void show() {
      System.out.println(this);
   }

   public void show(PrintWriter pw) {
      pw.println(this);
   }
}
