package com.yobuligo.timeTracker.model.subject;

import java.util.ArrayList;

public class SubjectList implements ISubjectList {

    private ArrayList<ISubject> subjects = new ArrayList<>();

    public ArrayList<ISubject> getSubjects() {
        return subjects;
    }

    public void AddSubject(ISubject subject) {
        subjects.add(subject);
    }

}
