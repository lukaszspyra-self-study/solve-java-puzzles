package epam;

public record CarRecord(String brand, Integer year) {


    public static void main(String[] args) {
        System.out.println(new CarRecord("test", 29).brand);
    }
}
