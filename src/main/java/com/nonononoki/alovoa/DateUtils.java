package com.nonononoki.alovoa;

import com.nonononoki.alovoa.entity.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    private DateUtils() {
    }

    public static Date ageToDate(int age) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = currentDate.minusYears(age);
        return Date.from(birthDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static Date localDateToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate dateToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDateTime dateToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static int calcUserAge(User user) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = dateToLocalDate(user.getDates().getDateOfBirth());
        return Period.between(birthDate, currentDate).getYears();
    }

    public static int calcUserAge(Date dateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = dateToLocalDate(dateOfBirth);
        return Period.between(birthDate, currentDate).getYears();
    }

}
