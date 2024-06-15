package Chapter4;

public class Chapter4 {
    public static void main(String[] args) {
        Item item1 = new Item("item", 100);
        DiscountedItem discountedItem1 = new DiscountedItem("item", 100, 10);
        DiscountedItem discountedItem2 = new DiscountedItem("item", 100, 20);

        // Symmetry
        System.out.println(item1.equals(discountedItem1)); // true
        System.out.println(discountedItem1.equals(item1)); // true

        // Transitivity failure example
        System.out.println(item1.equals(discountedItem1)); // true
        System.out.println(discountedItem1.equals(discountedItem2)); // false
        System.out.println(item1.equals(discountedItem2)); // true

        StringList emptyList = new EmptyStringList();
        StringList list1 = new NonEmptyStringList("Hello", emptyList);
        StringList list2 = new NonEmptyStringList("World", list1);

        System.out.println("List1: " + list1);
        System.out.println("List1 size: " + list1.size());

        System.out.println("List2: " + list2);
        System.out.println("List2 size: " + list2.size());

        StringList appendedList = list1.append(list2);
        System.out.println("Appended List: " + appendedList);
        System.out.println("Appended List size: " + appendedList.size());
    }
}
