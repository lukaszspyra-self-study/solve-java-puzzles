package epam;

import epam.inherintaceinpackages.A;

class X {

}

class Y {
    private Y field1;
    private X field2;
    public void foo() throws Exception {
        Object o1 = this.clone();      // legal
        Object o2 = field1.clone();    // legal
        //Object o3 = field2.clone();    // illegal - tylko dla klass w pakiecie java.lang.Object - chyba że nadpiszemy w klasie X (nawet z protected dostanie acccess bo pakiet ten sam)
        String s1 = field2.toString(); // legal since toString() is "public" in Object
    }
}
