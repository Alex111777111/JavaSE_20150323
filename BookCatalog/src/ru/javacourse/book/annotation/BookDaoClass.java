package ru.javacourse.book.annotation;

import java.lang.annotation.Retention;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface BookDaoClass {
    // �������� ��������� ��� ��������� - ����� ��� String
    String name();
}

