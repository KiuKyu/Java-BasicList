import java.util.Arrays;

public class MyList<E> { // E là Generic
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10; // sức chứa
    private Object[] elements;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY]; // mảng chứa 10 phần tử
    }

    private void ensureCapacity() {
//        int newCapacity = DEFAULT_CAPACITY * 2;
//          => Không dùng DEFAULT_CAPACITY do chỉ đúng cho lần đầu khởi tạo mảng do đây là 1 hằng số
//          nên về sau thì nó sẽ luôn chỉ là 10 * 2
        int newCapacity = elements.length * 2; // khai báo 1 biến newCapacity = x2 sức chứa mảng cũ
        this.elements = Arrays.copyOf(this.elements, newCapacity); // hàm Arrays.copyOf truyền vào 2 tham số
//        tham số thứ 1 : mảng cũ (để copy phần tử), tham số thứ 2 = capacity mới
    }

    public void add(E e) {
        if (size == elements.length) { // nếu size (số lượng phần tử trong mảng = sức chứa thì ...)
            ensureCapacity();
        }
        this.elements[this.size++] = e; // sau khi thêm e vào mảng thì this.size ++
    }

    public E get(int index) { // Lấy ra giá trị của 1 phần tử trong mảng theo vị trí tương ứng
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size" + size);
                // Nếu vị trí k hợp lệ thì ném ra lỗi
        }
        return (E) this.elements[index];
    }
}