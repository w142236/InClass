import java.util.Comparator;

public class LastFirstName implements Comparator<Student>{
	public int compare(Student first, Student last){
			String firstName = first.getFirstName();
			String lastName = first.getLastName();
			//How do we compare two string?
			//We need to make a second student
			String firstNameLast = last.getFirstName();
			String lastNameLast = last.getLastName();
			
			if (firstName.compareTo(firstNameLast) < 0) {
				return -1;
			}else if (firstName.compareTo(firstNameLast)==0) {
				if(lastName.compareTo(lastNameLast) < 0) {
					return -1;
				}else if (lastName.compareTo(lastNameLast) == 0) {
					return 0;
				}else {
					return -1;//an iffy statement
				}
			}else {
				return 1;
			}
		}
}

