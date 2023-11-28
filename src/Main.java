import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");

        placesToVisit.add(0, "Canberra");

        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

        gettingElements(placesToVisit);



    }

    private static void addMoreElements(LinkedList<String> list){

        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowooba");

        //Stack
        list.push("Alice Springs");


    }

    private static void removeElements(LinkedList<String> list){

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");


        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");


        System.out.println(list);

        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed");
    }

    private static void gettingElements(LinkedList<String> list){

        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = "+ list.getFirst());

        System.out.println("Last Element = "+ list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: "+ list.lastIndexOf("Melbourne"));

        //Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        //Stack retrieval method
        System.out.println("Element from peek() = "+ list.peek());

    }

    
}