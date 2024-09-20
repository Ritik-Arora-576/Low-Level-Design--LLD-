public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("Good Morning");
        Caretaker caretaker = new Caretaker();

        // change state and store momento in caretaker
        originator.setContent("Good Afternoon");
        caretaker.addMomento(originator.createMomento());

        // change state and store momento in caretaker
        originator.setContent("Good Evening");
        caretaker.addMomento(originator.createMomento());

        // change state and store momento in caretaker
        originator.setContent("Good Night");
        caretaker.addMomento(originator.createMomento());

        // print states
        System.out.println(originator.restoreFromMomento(caretaker.restoreMomento(0)));
        System.out.println(originator.restoreFromMomento(caretaker.restoreMomento(1)));
        System.out.println(originator.restoreFromMomento(caretaker.restoreMomento(2)));
    }
}
