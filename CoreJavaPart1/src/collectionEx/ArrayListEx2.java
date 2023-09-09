package collectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<String> sample_list = new ArrayList<String>();
		 
        sample_list.add("Practise");
        sample_list.add("solve");
        sample_list.add("Interview");

       
        System.out.println("The initial list is : "
                           + sample_list);

      
        List<String>
            read_only_list = Collections
                                .unmodifiableList(sample_list);

    
        System.out.println("The ReadOnly ArrayList is : "
                           + read_only_list);

        
        System.out.println("Trying to modify the ReadOnly ArrayList.");                       
        read_only_list.add("job");
    }

	}


