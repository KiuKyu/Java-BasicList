public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        MyList<String> listString = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(1, 4);
        listInteger.add(3);
        listString.add("6");
        // Không thực sự đúng nếu k có hàm add lại giá trị phía sau
        // hàm add kiểu này sẽ thay thế tất cả các value của nhưng object đứng sau index đều = index + 1
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }

        // Remove
        System.out.println("Sau xóa");
        listInteger.remove(0);
        for (int i = 0; i < listInteger.size(); i++) {

            System.out.println(listInteger.get(i));
        }
    }
}
