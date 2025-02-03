public class ObjectCountsdynamically {
    static int objectCount = 0;
    ObjectCountsdynamically(){
        objectCount++;
    }
    public static void main(String[] args) {
        ObjectCountsdynamically obj = new ObjectCountsdynamically();
        ObjectCountsdynamically obj2 = new ObjectCountsdynamically();
        System.out.println("The object count is:  " + objectCount);
    }
}
