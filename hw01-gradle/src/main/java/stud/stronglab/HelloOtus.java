package stud.stronglab;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

public class HelloOtus {
    public static void main(String[] args) {
        Range<Integer> range = Range.closed(100, 120);
        for (int grade : ContiguousSet.create(range, DiscreteDomain.integers())) {
            System.out.print(grade + "\n");
        }
    }
}
