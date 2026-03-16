import com.gla.college.student.Student;
import com.gla.college.faculty.Faculty;
import com.gla.library.books.Book;
import com.gla.library.members.Members;
import com.gla.library.tramsactions.transactions;
import com.gla.bank.util.Interest;
public class Runner {
    public static void main(String[] args) {

        Student s = new Student("Anshika",101);
        Faculty f = new Faculty("Dr Sharma","Java");
        s.display();
        f.display();

        /// ////////////library
        Book b = new Book();
        Members m = new Members();
        transactions t = new transactions();

        b.addBook();
        m.registerMember();
        t.issueBook();

        /// /////////////bank management
        Interest obj = new Interest();
        double si = obj.calculateSimpleInterest(1000,5,2);
        double ci = obj.calculateCompoundInterest(1000,5,2);
        System.out.println("/////BANKING SYSTEM/////");
        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }

}

