import java.util.ArrayList;
import java.util.Comparator;

class School {
    private ArrayList<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        if (person != null) {
            members.add(person);
        } else {
            throw new IllegalArgumentException("Member cannot be null.");
        }
    }

    public String toString() {
        members.sort(Comparator.comparing(p -> p.toString()));
        StringBuilder result = new StringBuilder();
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}

