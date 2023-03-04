package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationTest {
    @Test
    public void testGetTeacher() {
        Teacher teacher = new Teacher("Jan Kowalski");
        Student student = new Student("Anna Nowak", teacher);
        Optional<Teacher> optionalTeacher = student.getTeacher();
        assertTrue(optionalTeacher.isPresent());
        assertEquals(teacher, optionalTeacher.get());
    }

    @Test
    public void testGetTeacherWhenNull() {
        Student student = new Student("Anna Nowak", null);
        Optional<Teacher> optionalTeacher = student.getTeacher();
        assertFalse(optionalTeacher.isPresent());
    }
}