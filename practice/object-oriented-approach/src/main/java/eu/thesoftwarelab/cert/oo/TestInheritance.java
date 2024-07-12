package eu.thesoftwarelab.cert.oo;

/**
 * This class shows how method overriding and instance fields hiding works.
 * @author Manolis Georgopoulos
 */
class TestInheritance {

    public static void main(String[] args) {
        Animal tiger1 = new Tiger("Tiger 1");
        tiger1.size = 5;
        tiger1.printSize();

        Tiger tiger2 = new Tiger("Tiger 2");
        tiger2.size = 5;
        tiger2.printSize();
    }
}

class Animal {
    int size;

    void printSize() {
        System.out.println("Animal printSize()");
        System.out.println(size);
    }
}

/**
 * Tiger class declares a field with name "size".
 * The declaration of that field hides (not overrides) the declaration of field with the same name in superclass.
 */
class Tiger extends Animal {
    int size;
    String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    void printSize() {
        System.out.println(name + " Tiger printSize()");
        System.out.println(name + " Tiger size = " + this.size);
        System.out.println(name + " Animal size = " + super.size);
    }
}
