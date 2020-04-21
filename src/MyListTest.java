public class MyListTest {

    public static void main(String[] args) {


        MyList<String > stringMyList = new MyList<>();
        for (int i=0;i<4;i++){
            stringMyList.add("Element "+i);
        }
        System.out.println(stringMyList.get(2));
        System.out.println(stringMyList.indexOf("Element 1"));
        stringMyList.add("hi");
        stringMyList.add("hello");
        System.out.println(stringMyList.get(6));

    }
}
