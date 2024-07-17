package eu.thesoftwarelab.cert.datatypes;

public class TestPrimitiveTypes {

  public static void main(String[] args) {
    char c = 65;
    System.out.println("character Latin Capital letter A printed:" + c);
    char cMax = 65535; // max numeric value for char (0 to 2^16-1)

    int i = (int) 10.5;
    System.out.println("casting the floating point value 10.5 to an int: " + i);

    /**
     * byte 8 bits, range -2^7 to 2^7-1
     * char 16 bits, range 0 to 2^16-1
     * short 16 bits, range -2^15 to 2^15-1
     * int 32 bits, range -2^31 to 2^31-1
     * long 64 bits, range -2^63 to 2^63-1
     * float 32 bits
     * double 64 bits
     * boolean 1 bit
     */
  }

}
