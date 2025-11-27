public class StringBuilderDemo   {
   public static void main (String[] args) {
   
   StringBuilder nameString = new StringBuilder ("Barbara");
     System.out.println("(StringBuilder 1) nameString is: " + nameString);
     System.out.println("Capacity of stringName is: " + nameString.capacity());
     
     StringBuilder addString = new StringBuilder ("6311 Hickory Nut Grove Road"); 
      System.out.println("StringBuilder 2) addString is: " + addString);
      System.out.println("Capacity of addString is: " + addString.capacity());
      
      nameString.setLength(20);
      addString.setLength(20);
      
      System.out.println("Length set to 20 for StringBuilder 1) The name is " + nameString + "end");
      System.out.println("Length set to 20 for StringBuilder 2) The name is " + addString);
      
      }
      }
   