package HW8.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class {
    String classNumber;
    Teacher classTeacher;
    List<Pupil> classList = new ArrayList<>();
    List<Subject> subjects = new ArrayList<>();
    Map<String, Map<String, Integer>> journal = new HashMap<>();
}
