package puzzles.main;

import java.util.Objects;

class RunYouCodeExtends extends RunYourCode {

private String name;
private String surnname;
private int age;

    public static void main(String[] args) {

        System.out.println(new Double(0d).equals(new Integer(0)));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RunYouCodeExtends that = (RunYouCodeExtends) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return surnname != null ? surnname.equals(that.surnname) : that.surnname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surnname != null ? surnname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }


}
